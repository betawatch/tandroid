package w7;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class z5 {
    public static void a(View view) {
        b(view, 0.1f, 1.5f);
    }

    public static void b(View view, float f7, float f10) {
        if (view == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        float f11 = 1.0f - f7;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f11);
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f11));
        animatorSet.setDuration(80L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f));
        animatorSet2.setInterpolator(new OvershootInterpolator(f10));
        animatorSet2.setDuration(350L);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{R.attr.state_pressed}, animatorSet);
        stateListAnimator.addState(new int[0], animatorSet2);
        view.setStateListAnimator(stateListAnimator);
    }
}
