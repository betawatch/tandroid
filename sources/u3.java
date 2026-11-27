// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
