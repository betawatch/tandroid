package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xi extends lg.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ qn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi(qn qnVar, org.telegram.ui.ActionBar.b6 b6Var, int i9, int i10) {
        super(i9, b6Var);
        this.n = i10;
        this.r = qnVar;
    }

    @Override // lg.b, lg.a
    public final int k() {
        int i9;
        int i10;
        switch (this.n) {
            case 0:
                qn qnVar = this.r;
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                if (!mg.c.c(i9, qnVar.aa)) {
                    break;
                } else if (qnVar.aa != null && !org.telegram.ui.ActionBar.f6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                qn qnVar2 = this.r;
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar2).currentAccount;
                if (!mg.c.c(i10, qnVar2.aa)) {
                    break;
                } else if (qnVar2.aa != null && !org.telegram.ui.ActionBar.f6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
