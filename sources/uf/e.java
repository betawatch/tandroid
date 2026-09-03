package uf;

import org.telegram.ui.oy;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ e(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                for (oy oyVar : this.b.O.b0) {
                    ((f2.j0) oyVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.J();
                break;
        }
    }
}
