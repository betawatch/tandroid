// default package

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class vz8 {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final LinearInterpolator b;
    public static final uz8 c;
    public static final uz8 d;
    public static final uz8 e;
    public static final uz8 f;
    public static final uz8 g;
    public static final uz8 h;
    public static final uz8 i;
    public static final uz8 j;
    public static final uz8 k;
    public static final uz8 l;
    public static final uz8 m;
    public static final uz8 n;
    public static final uz8 o;
    public static final uz8 p;
    public static final uz8 q;
    public static final uz8 r;
    public static final uz8 s;
    public static final uz8 t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        b = linearInterpolator;
        c = wz8.i(new DecelerateInterpolator(), 0, nm7.O3, nm7.O3, false);
        d = wz8.i(linearInterpolator, 0, nm7.O3, nm7.O3, false);
        e = wz8.i(new DecelerateInterpolator(), nm7.w3, nm7.O3, nm7.O3, false);
        f = wz8.i(new d53(0.7f, -0.6f, 0.4f, 1.0f), 0, nm7.d3, 560, false);
        g = wz8.i(new d53(0.7f, -0.6f, 0.4f, 1.0f), nm7.d3, 400, 560, true);
        h = wz8.i(new DecelerateInterpolator(), 0, nm7.f2, 560, false);
        i = wz8.i(new DecelerateInterpolator(), nm7.n3, 425, 560, false);
        d53 d53Var = d53.h;
        j = wz8.i(d53Var, 0, nm7.q5, 560, false);
        k = wz8.i(d53Var, 40, nm7.q5, 560, false);
        l = wz8.i(new DecelerateInterpolator(), 0, nm7.Y3, 560, false);
        m = wz8.i(d53Var, 0, 460, 560, false);
        n = wz8.i(d53Var, 0, nm7.v5, 560, false);
        o = wz8.i(new DecelerateInterpolator(), nm7.f2, nm7.Y3, 560, false);
        p = wz8.i(new DecelerateInterpolator(), nm7.d3, 480, 560, false);
        q = wz8.i(d53Var, 60, nm7.q5, 560, false);
        r = wz8.i(d53Var, 90, 380, 560, false);
        s = wz8.i(d53Var, nm7.u1, 440, 560, false);
        t = wz8.i(new DecelerateInterpolator(), nm7.d3, 460, 560, false);
    }
}
