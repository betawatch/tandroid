package zf;

import org.telegram.ui.hv;
import org.telegram.ui.p00;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                p00 p00Var = zVar.A0;
                if (p00Var != null) {
                    ((hv) p00Var).k(false, null, zVar.y0, zVar.z0);
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
