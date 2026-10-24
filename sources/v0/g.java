package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class g implements td.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // td.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return id.i.a;
    }
}
