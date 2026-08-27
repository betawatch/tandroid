package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g implements ad.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // ad.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return pc.i.a;
    }
}
