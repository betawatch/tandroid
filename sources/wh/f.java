package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        c = h.i(new DecelerateInterpolator(), 0, qs.P3, qs.P3, false);
        d = h.i(linearInterpolator, 0, qs.P3, qs.P3, false);
        e = h.i(new DecelerateInterpolator(), qs.x3, qs.P3, qs.P3, false);
        f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, qs.e3, 560, false);
        g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), qs.e3, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, qs.g2, 560, false);
        i = h.i(new DecelerateInterpolator(), qs.n3, 425, 560, false);
        xq xqVar = xq.h;
        j = h.i(xqVar, 0, qs.r5, 560, false);
        k = h.i(xqVar, 40, qs.r5, 560, false);
        l = h.i(new DecelerateInterpolator(), 0, qs.Z3, 560, false);
        m = h.i(xqVar, 0, 460, 560, false);
        n = h.i(xqVar, 0, qs.w5, 560, false);
        o = h.i(new DecelerateInterpolator(), qs.g2, qs.Z3, 560, false);
        p = h.i(new DecelerateInterpolator(), qs.e3, 480, 560, false);
        q = h.i(xqVar, 60, qs.r5, 560, false);
        r = h.i(xqVar, 90, 380, 560, false);
        s = h.i(xqVar, qs.v1, 440, 560, false);
        t = h.i(new DecelerateInterpolator(), qs.e3, 460, 560, false);
    }
}
