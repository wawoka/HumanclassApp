package jp.atsushitechacademy.kanamori.javalog;

import android.util.Log;

/**
 * Created by rakota on 2017/05/28.
 */

class Human extends Animal implements Thinkable {
    String hobby;
    public Human(String name, int age, String hobby ) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;


    }
    public void say() { Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」" );}

    @Override
    public void think() {
        Log.d("javatest","「私は" + hobby + "について考える」");
    }
}
