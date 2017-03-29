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
 * Created by Amanjeet Singh on 03-Feb-17.
 */

public class DoubleArcProgress extends View {
    private RectF oval=new RectF();
    private Paint paint=new Paint();

    int sweepAngle1 = 220;
    int sweepAngle2 = 150;
    int startAngle1 = 120;
    int startAngle2 = 360;

    private float insideRadius;
    private float outsideRadius;
    private int insideArcColor;
    private int outsideArcColor;

    public DoubleArcProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setStyle(Paint.Style.STROKE);
        TypedArray array=context.getTheme().obtainStyledAttributes(attrs,R.styleable.DoubleArcProgress,0,0);
        try{
            insideRadius=array.getDimension(R.styleable.DoubleArcProgress_insideArcRadius,50);
            outsideRadius=array.getDimension(R.styleable.DoubleArcProgress_outsideArcRadius,100);
            insideArcColor=array.getColor(R.styleable.DoubleArcProgress_insideArcColor,Color.parseColor("#99009688"));
            outsideArcColor=array.getColor(R.styleable.DoubleArcProgress_outsideArcColor,Color.parseColor("#009688"));
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
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(outsideArcColor);
        paint.setStrokeWidth(12);
        oval.set(getWidth()/2-outsideRadius,getHeight()/2-outsideRadius,getWidth()/2+outsideRadius,getHeight()/2+outsideRadius);
        canvas.drawArc(oval,startAngle1,sweepAngle1,false,paint);

        paint.setColor(insideArcColor);
        paint.setStrokeWidth(7);
        oval.set(getWidth()/2-insideRadius,getHeight()/2-insideRadius,getWidth()/2+insideRadius,getHeight()/2+insideRadius);
        canvas.drawArc(oval,startAngle2,sweepAngle2,false,paint);

    }
    private Runnable animate=new Runnable() {
        @Override
        public void run() {
          if(startAngle1<=360){
              startAngle1+=10;
          }
            else {
              startAngle1=1;
          }
            if(startAngle2>=1){
                startAngle2-=10;
            }
            else {
                startAngle2=360;
            }
            invalidate();
            postDelayed(this,30);
        }
    };


}
