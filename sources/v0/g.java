package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g implements sd.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // sd.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return hd.i.a;
    }
}
