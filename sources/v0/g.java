package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
