package zf;

import org.telegram.ui.iv;
import org.telegram.ui.q00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ r(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = this.b;
                q00 q00Var = zVar.A0;
                if (q00Var != null) {
                    ((iv) q00Var).k(false, null, zVar.y0, zVar.z0);
                    break;
                }
                break;
            default:
                w wVar = w.d;
                z zVar2 = this.b;
                zVar2.c = wVar;
                zVar2.I.clear();
                int i10 = zVar2.F0;
                if (i10 >= 0 && i10 < zVar2.b()) {
                    zVar2.g(zVar2.F0);
                }
                zVar2.P();
                break;
        }
    }
}
