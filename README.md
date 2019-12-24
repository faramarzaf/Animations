# Animations  
<p align="center">
  <img src="https://developer.android.com/images/guide/topics/graphics/targetchange_oa.gif" height="300" width="200" />
  <img src="https://developer.android.com/images/guide/topics/graphics/targetchange_pba.gif"  height="300" width="200" /> 
</p>

Animation is the process of creating motion and shape change. Animation in android is possible from many ways.  

**Tween Animation**  
Tween Animation takes some parameters such as `startValue` , `endValue`, `size` , `time duration` , `rotation angle` e.t.c and perform the required animation on that object. It can be applied to any type of object. So in order to use this , android has provided us a class called `Animation`.  

```java 
Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
```

| Method  | Description |
| ------------- | ------------- |
|start()| This method starts the animation |
|setDuration(long duration)|This method sets the duration of an animation |
|getDuration()|This method gets the duration which is set by above method |
|end()|This method ends the animation |
|cancel()|This method cancels the animation |  	


**Property animation**  
An animation defined in XML that modifies properties of the target object, such as background color or alpha value, over a set amount of time.  

**file location**: res/animator/`filename.xml`  

 ```xml
 <set android:ordering="sequentially">
        <set>
            <objectAnimator
                android:propertyName="x"
                android:duration="500"
                android:valueTo="400"
                android:valueType="intType"/>
            <objectAnimator
                android:propertyName="y"
                android:duration="500"
                android:valueTo="300"
                android:valueType="intType"/>
        </set>
        <objectAnimator
            android:propertyName="alpha"
            android:duration="500"
            android:valueTo="1f"/>
    </set>
```


A container that holds other animation elements (`objectAnimator`, `valueAnimator`, or other `<set>` elements). Represents an AnimatorSet. 
You can specify nested `<set>` tags to further group animations together. Each <set> can define its own ordering attribute.

