package th;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class g {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final LinearInterpolator b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;
    public static final f i;
    public static final f j;
    public static final f k;
    public static final f l;
    public static final f m;
    public static final f n;
    public static final f o;
    public static final f p;
    public static final f q;
    public static final f r;
    public static final f s;
    public static final f t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        b = linearInterpolator;
        c = i.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = i.i(linearInterpolator, 0, 240, 240, false);
        e = i.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f = i.i(new wr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        g = i.i(new wr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = i.i(new DecelerateInterpolator(), 0, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 560, false);
        i = i.i(new DecelerateInterpolator(), 210, 425, 560, false);
        wr wrVar = wr.h;
        j = i.i(wrVar, 0, 320, 560, false);
        k = i.i(wrVar, 40, 320, 560, false);
        l = i.i(new DecelerateInterpolator(), 0, MediaDataController.MAX_LINKS_COUNT, 560, false);
        m = i.i(wrVar, 0, 460, 560, false);
        n = i.i(wrVar, 0, 325, 560, false);
        o = i.i(new DecelerateInterpolator(), ImageReceiver.DEFAULT_CROSSFADE_DURATION, MediaDataController.MAX_LINKS_COUNT, 560, false);
        p = i.i(new DecelerateInterpolator(), 200, 480, 560, false);
        q = i.i(wrVar, 60, 320, 560, false);
        r = i.i(wrVar, 90, 380, 560, false);
        s = i.i(wrVar, 110, 440, 560, false);
        t = i.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
