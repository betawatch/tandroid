// default package

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class ux8 {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final LinearInterpolator b;
    public static final tx8 c;
    public static final tx8 d;
    public static final tx8 e;
    public static final tx8 f;
    public static final tx8 g;
    public static final tx8 h;
    public static final tx8 i;
    public static final tx8 j;
    public static final tx8 k;
    public static final tx8 l;
    public static final tx8 m;
    public static final tx8 n;
    public static final tx8 o;
    public static final tx8 p;
    public static final tx8 q;
    public static final tx8 r;
    public static final tx8 s;
    public static final tx8 t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        b = linearInterpolator;
        c = vx8.i(new DecelerateInterpolator(), 0, kk7.O3, kk7.O3, false);
        d = vx8.i(linearInterpolator, 0, kk7.O3, kk7.O3, false);
        e = vx8.i(new DecelerateInterpolator(), kk7.w3, kk7.O3, kk7.O3, false);
        f = vx8.i(new s33(0.7f, -0.6f, 0.4f, 1.0f), 0, kk7.d3, 560, false);
        g = vx8.i(new s33(0.7f, -0.6f, 0.4f, 1.0f), kk7.d3, 400, 560, true);
        h = vx8.i(new DecelerateInterpolator(), 0, kk7.f2, 560, false);
        i = vx8.i(new DecelerateInterpolator(), 210, 425, 560, false);
        s33 s33Var = s33.h;
        j = vx8.i(s33Var, 0, kk7.q5, 560, false);
        k = vx8.i(s33Var, 40, kk7.q5, 560, false);
        l = vx8.i(new DecelerateInterpolator(), 0, kk7.Y3, 560, false);
        m = vx8.i(s33Var, 0, 460, 560, false);
        n = vx8.i(s33Var, 0, kk7.v5, 560, false);
        o = vx8.i(new DecelerateInterpolator(), kk7.f2, kk7.Y3, 560, false);
        p = vx8.i(new DecelerateInterpolator(), kk7.d3, 480, 560, false);
        q = vx8.i(s33Var, 60, kk7.q5, 560, false);
        r = vx8.i(s33Var, 90, 380, 560, false);
        s = vx8.i(s33Var, kk7.u1, 440, 560, false);
        t = vx8.i(new DecelerateInterpolator(), kk7.d3, 460, 560, false);
    }
}
