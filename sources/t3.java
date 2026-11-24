// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
