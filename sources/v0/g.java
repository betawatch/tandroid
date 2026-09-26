package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
