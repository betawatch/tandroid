// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
