package uf;

import org.telegram.ui.k10;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                k10 k10Var = zVar.x0;
                if (k10Var != null) {
                    ((tv) k10Var).h(false, null, zVar.v0, zVar.w0);
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
