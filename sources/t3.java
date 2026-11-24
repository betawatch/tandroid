// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
