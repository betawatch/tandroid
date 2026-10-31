package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g implements ld.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // ld.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return ad.j.a;
    }
}
