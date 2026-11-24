// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t3 {
    public static final t3 c;
    public static final t3 d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (a4.d) {
            d = null;
            c = null;
        } else {
            d = new t3(false, null);
            c = new t3(true, null);
        }
    }

    public t3(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
