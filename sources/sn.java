// default package

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class sn {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final qn b = new qn("alpha", (byte) 0);
    public static final qm c;
    public static final qn d;
    public static final qn e;
    public static final qm f;
    public static final qm g;
    public static final qm h;

    static {
        new qn("color", (byte) 1);
        c = new qm("currentAlpha", (byte) 1);
        d = new qn("alpha", (byte) 2);
        e = new qn("alpha", (byte) 3);
        f = new qm("animationProgress", (byte) 2);
        g = new qm("animationValue", (byte) 3);
        h = new qm("clipProgress", (byte) 4);
    }
}
