package zf;

import org.telegram.ui.zx;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ e(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                for (zx zxVar : this.b.R.e0) {
                    ((s4.a0) zxVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.K();
                break;
        }
    }
}
