package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class g implements rd.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return gd.i.a;
    }
}
