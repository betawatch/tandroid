package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g implements ud.l {
    public final /* synthetic */ CancellationSignal a;

    public g(CancellationSignal cancellationSignal) {
        this.a = cancellationSignal;
    }

    @Override // ud.l
    public final Object invoke(Object obj) {
        this.a.cancel();
        return jd.i.a;
    }
}
