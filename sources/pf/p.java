package pf;

import org.telegram.ui.mv;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ p(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = this.b;
                z00 z00Var = zVar.w0;
                if (z00Var != null) {
                    ((mv) z00Var).i(false, null, zVar.u0, zVar.v0);
                    break;
                }
                break;
            default:
                z zVar2 = this.b;
                zVar2.getClass();
                zVar2.c = w.d;
                zVar2.E.clear();
                int i10 = zVar2.B0;
                if (i10 >= 0 && i10 < zVar2.h()) {
                    zVar2.m(zVar2.B0);
                }
                zVar2.Q();
                break;
        }
    }
}
