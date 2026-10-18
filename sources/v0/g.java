package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
