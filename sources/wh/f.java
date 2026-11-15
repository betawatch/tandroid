package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        c = h.i(new DecelerateInterpolator(), 0, ns.P3, ns.P3, false);
        d = h.i(linearInterpolator, 0, ns.P3, ns.P3, false);
        e = h.i(new DecelerateInterpolator(), ns.x3, ns.P3, ns.P3, false);
        f = h.i(new er(0.7f, -0.6f, 0.4f, 1.0f), 0, ns.e3, 560, false);
        g = h.i(new er(0.7f, -0.6f, 0.4f, 1.0f), ns.e3, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, ns.g2, 560, false);
        i = h.i(new DecelerateInterpolator(), ns.n3, 425, 560, false);
        er erVar = er.h;
        j = h.i(erVar, 0, ns.r5, 560, false);
        k = h.i(erVar, 40, ns.r5, 560, false);
        l = h.i(new DecelerateInterpolator(), 0, ns.Z3, 560, false);
        m = h.i(erVar, 0, 460, 560, false);
        n = h.i(erVar, 0, ns.w5, 560, false);
        o = h.i(new DecelerateInterpolator(), ns.g2, ns.Z3, 560, false);
        p = h.i(new DecelerateInterpolator(), ns.e3, 480, 560, false);
        q = h.i(erVar, 60, ns.r5, 560, false);
        r = h.i(erVar, 90, 380, 560, false);
        s = h.i(erVar, ns.v1, 440, 560, false);
        t = h.i(new DecelerateInterpolator(), ns.e3, 460, 560, false);
    }
}
