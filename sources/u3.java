// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class u3 {
    public static final u3 c;
    public static final u3 d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (b4.d) {
            d = null;
            c = null;
        } else {
            d = new u3(false, null);
            c = new u3(true, null);
        }
    }

    public u3(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
