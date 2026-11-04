package v0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements od.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((CancellationSignal) this.b).cancel();
                return dd.k.a;
            default:
                wd.m mVar = (wd.m) this.b;
                dd.k kVar = dd.k.a;
                mVar.resumeWith(kVar);
                return kVar;
        }
    }
}
