package com.developers.coolprogressviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Amanjeet Singh on 16-Feb-17.
 */

public class StaticCircleProgress extends View {

    private Paint paint=new Paint();
    int startAngle=120;
    int sweepAngle=220;
    private RectF oval=new RectF();

    private float movingArcRadius;
    private int movingArcColor;
    private float innerCirclerad;
    private int innerCircleColor;
    public StaticCircleProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setStyle(Paint.Style.STROKE);
        TypedArray array=context.getTheme().obtainStyledAttributes(attrs,R.styleable.StaticCircleProgress,0,0);
        try{
            movingArcRadius=array.getDimension(R.styleable.StaticCircleProgress_movingArcRadius,50);
            movingArcColor=array.getColor(R.styleable.StaticCircleProgress_movinArcColor,Color.parseColor("#99009688"));
            innerCirclerad=array.getDimension(R.styleable.StaticCircleProgress_innerCircleRadius,5);
            innerCircleColor=array.getColor(R.styleable.StaticCircleProgress_innerCircleColor,Color.parseColor("#009688"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            array.recycle();
        }
        post(animate);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(movingArcColor);
        paint.setStrokeWidth(7);
        oval.set(getWidth()/2-movingArcRadius,getHeight()/2-movingArcRadius,getWidth()/2+movingArcRadius,getHeight()/2+movingArcRadius);
        canvas.drawArc(oval,startAngle,sweepAngle,false,paint);

        paint.setColor(innerCircleColor);
        paint.setStrokeWidth(12);
        canvas.drawCircle(getWidth()/2,getHeight()/2,innerCirclerad,paint);
    }

    private Runnable animate=new Runnable() {
        @Override
        public void run() {
          if(startAngle<=360){
              startAngle+=10;
          }
            else{
              startAngle=0;
          }
            invalidate();
            postDelayed(this,30);
        }
    };
}
