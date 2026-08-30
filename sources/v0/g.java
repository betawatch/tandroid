package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g implements dd.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // dd.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return sc.i.a;
    }
}
