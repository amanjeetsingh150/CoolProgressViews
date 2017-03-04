package com.developers.coolprogressviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Amanjeet Singh on 16-Feb-17.
 */

public class ColorfulProgress extends View {

    Paint paint=new Paint();
    private int i=0;
    private int j=0;
    private int k=0;

    Point circle1=new Point();
    Point circle2=new Point();
    Point circle3=new Point();
    Point circle4=new Point();

    private int InsideCircleColor1;
    private int InsideCircleColor2;
    private int OutsideCircleColor1;
    private int OutsideCircleColor2;

    public ColorfulProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array=context.getTheme().obtainStyledAttributes(attrs,R.styleable.ColorfulProgress,0,0);
        try{
            InsideCircleColor1=array.getColor(R.styleable.ColorfulProgress_circleColor1,Color.parseColor("#84c6b5"));
            InsideCircleColor2=array.getColor(R.styleable.ColorfulProgress_circleColor2,Color.parseColor("#efbd63"));
            OutsideCircleColor1=array.getColor(R.styleable.ColorfulProgress_circleColor3,Color.parseColor("#9cd6e7"));
            OutsideCircleColor2=array.getColor(R.styleable.ColorfulProgress_circleColor4,Color.parseColor("#ef5a84"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            array.recycle();
        }
        paint.setStyle(Paint.Style.FILL);
        post(animator);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(InsideCircleColor1);
        canvas.drawCircle(circle1.x,circle1.y,8,paint);

        paint.setColor(OutsideCircleColor1);
        canvas.drawCircle(circle3.x,circle3.y,8,paint);

        paint.setColor(OutsideCircleColor2);
        canvas.drawCircle(circle4.x,circle4.y,8,paint);

        paint.setColor(InsideCircleColor2);
        canvas.drawCircle(circle2.x,circle2.y,8,paint);
    }

    Runnable animator=new Runnable() {
        @Override
        public void run() {
              if(i<=360){
                  circle1.x= (int) (getWidth()/2+40*Math.cos(i));
                  circle1.y= (int) (getHeight()/2+40*Math.sin(i));
                  circle2.x= (int) (getWidth()/2+40*Math.cos(i+180));
                  circle2.y= (int) (getHeight()/2+40*Math.sin(i+180));
                  i+=1;
              }
                else {
                  i=0;
              }
            if(j<=360){
                circle3.x= (int) (getWidth()/2+20*Math.cos(j));
                circle3.y=(int) (getHeight()/2+20*Math.sin(j));
                circle4.x=(int) (getWidth()/2+20*Math.cos(j+180));
                circle4.y=(int) (getHeight()/2+20*Math.sin(j+180));
                j+=1;
            }
            else {
                j=0;
            }
                invalidate();
                postDelayed(this,25);
            }
    };
}
