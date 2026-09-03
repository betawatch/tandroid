package tf;

import org.telegram.ui.l10;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                l10 l10Var = zVar.x0;
                if (l10Var != null) {
                    ((uv) l10Var).h(false, null, zVar.v0, zVar.w0);
                    break;
                }
                break;
            default:
                z zVar2 = this.b;
                zVar2.getClass();
                zVar2.c = w.d;
                zVar2.F.clear();
                int i10 = zVar2.C0;
                if (i10 >= 0 && i10 < zVar2.h()) {
                    zVar2.m(zVar2.C0);
                }
                zVar2.Q();
                break;
        }
    }
}
