package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        c = h.i(new DecelerateInterpolator(), 0, ls.P3, ls.P3, false);
        d = h.i(linearInterpolator, 0, ls.P3, ls.P3, false);
        e = h.i(new DecelerateInterpolator(), ls.x3, ls.P3, ls.P3, false);
        f = h.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 0, ls.e3, 560, false);
        g = h.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), ls.e3, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, ls.g2, 560, false);
        i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        nr nrVar = nr.h;
        j = h.i(nrVar, 0, ls.r5, 560, false);
        k = h.i(nrVar, 40, ls.r5, 560, false);
        l = h.i(new DecelerateInterpolator(), 0, ls.Z3, 560, false);
        m = h.i(nrVar, 0, 460, 560, false);
        n = h.i(nrVar, 0, ls.w5, 560, false);
        o = h.i(new DecelerateInterpolator(), ls.g2, ls.Z3, 560, false);
        p = h.i(new DecelerateInterpolator(), ls.e3, 480, 560, false);
        q = h.i(nrVar, 60, ls.r5, 560, false);
        r = h.i(nrVar, 90, 380, 560, false);
        s = h.i(nrVar, ls.v1, 440, 560, false);
        t = h.i(new DecelerateInterpolator(), ls.e3, 460, 560, false);
    }
}
