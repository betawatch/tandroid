package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g implements bd.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // bd.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return qc.i.a;
    }
}
