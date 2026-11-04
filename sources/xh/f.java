package xh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class f {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final LinearInterpolator b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public static final e l;
    public static final e m;
    public static final e n;
    public static final e o;
    public static final e p;
    public static final e q;
    public static final e r;
    public static final e s;
    public static final e t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        b = linearInterpolator;
        c = h.i(new DecelerateInterpolator(), 0, hs.P3, hs.P3, false);
        d = h.i(linearInterpolator, 0, hs.P3, hs.P3, false);
        e = h.i(new DecelerateInterpolator(), hs.x3, hs.P3, hs.P3, false);
        f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, hs.e3, 560, false);
        g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), hs.e3, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, hs.g2, 560, false);
        i = h.i(new DecelerateInterpolator(), hs.n3, 425, 560, false);
        xq xqVar = xq.h;
        j = h.i(xqVar, 0, hs.r5, 560, false);
        k = h.i(xqVar, 40, hs.r5, 560, false);
        l = h.i(new DecelerateInterpolator(), 0, hs.Z3, 560, false);
        m = h.i(xqVar, 0, 460, 560, false);
        n = h.i(xqVar, 0, hs.w5, 560, false);
        o = h.i(new DecelerateInterpolator(), hs.g2, hs.Z3, 560, false);
        p = h.i(new DecelerateInterpolator(), hs.e3, 480, 560, false);
        q = h.i(xqVar, 60, hs.r5, 560, false);
        r = h.i(xqVar, 90, 380, 560, false);
        s = h.i(xqVar, hs.v1, 440, 560, false);
        t = h.i(new DecelerateInterpolator(), hs.e3, 460, 560, false);
    }
}
