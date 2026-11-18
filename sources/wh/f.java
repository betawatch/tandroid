package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        c = h.i(new DecelerateInterpolator(), 0, ks.P3, ks.P3, false);
        d = h.i(linearInterpolator, 0, ks.P3, ks.P3, false);
        e = h.i(new DecelerateInterpolator(), ks.x3, ks.P3, ks.P3, false);
        f = h.i(new lr(0.7f, -0.6f, 0.4f, 1.0f), 0, ks.e3, 560, false);
        g = h.i(new lr(0.7f, -0.6f, 0.4f, 1.0f), ks.e3, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, ks.g2, 560, false);
        i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        lr lrVar = lr.h;
        j = h.i(lrVar, 0, ks.r5, 560, false);
        k = h.i(lrVar, 40, ks.r5, 560, false);
        l = h.i(new DecelerateInterpolator(), 0, ks.Z3, 560, false);
        m = h.i(lrVar, 0, 460, 560, false);
        n = h.i(lrVar, 0, ks.w5, 560, false);
        o = h.i(new DecelerateInterpolator(), ks.g2, ks.Z3, 560, false);
        p = h.i(new DecelerateInterpolator(), ks.e3, 480, 560, false);
        q = h.i(lrVar, 60, ks.r5, 560, false);
        r = h.i(lrVar, 90, 380, 560, false);
        s = h.i(lrVar, ks.v1, 440, 560, false);
        t = h.i(new DecelerateInterpolator(), ks.e3, 460, 560, false);
    }
}
