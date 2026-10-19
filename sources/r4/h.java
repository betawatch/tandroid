package r4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class h {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
