package jp.atsushitechacademy.kanamori.javalog;

import android.util.Log;

/**
 * Created by rakota on 2017/05/28.
 */

class Human extends Animal implements Thinkable {
    String hobby = "～～";
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void say() {}

    @Override
    public void think() {
        Log.d("javatest","「私は" + hobby + "について考える」");
    }
}
