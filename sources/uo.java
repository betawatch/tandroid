// default package

import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class uo {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();

    static {
        new DecelerateInterpolator(1.78f);
        new OvershootInterpolator(3.2f);
    }
}
