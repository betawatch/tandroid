package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
