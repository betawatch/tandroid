// default package

import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class un {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();

    static {
        new DecelerateInterpolator(1.78f);
        new OvershootInterpolator(3.2f);
    }
}
