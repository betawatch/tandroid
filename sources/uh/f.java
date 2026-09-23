package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        g = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 560, false);
        i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        rr rrVar = rr.h;
        j = h.i(rrVar, 0, 320, 560, false);
        k = h.i(rrVar, 40, 320, 560, false);
        l = h.i(new DecelerateInterpolator(), 0, MediaDataController.MAX_LINKS_COUNT, 560, false);
        m = h.i(rrVar, 0, 460, 560, false);
        n = h.i(rrVar, 0, 325, 560, false);
        o = h.i(new DecelerateInterpolator(), ImageReceiver.DEFAULT_CROSSFADE_DURATION, MediaDataController.MAX_LINKS_COUNT, 560, false);
        p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        q = h.i(rrVar, 60, 320, 560, false);
        r = h.i(rrVar, 90, 380, 560, false);
        s = h.i(rrVar, 110, 440, 560, false);
        t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
