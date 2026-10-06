package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
