package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
