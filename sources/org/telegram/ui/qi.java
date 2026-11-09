package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qi extends gh.b {
    public final /* synthetic */ int s;
    public final /* synthetic */ cn w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(cn cnVar, org.telegram.ui.ActionBar.g6 g6Var, int i7, int i10) {
        super(i7, g6Var);
        this.s = i10;
        this.w = cnVar;
    }

    @Override // gh.b, gh.a
    public final int e1() {
        int i7;
        int i10;
        switch (this.s) {
            case 0:
                cn cnVar = this.w;
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                if (!c8.g0.c(i7, cnVar.za)) {
                    return i0.a.o(cnVar.getThemedColor(org.telegram.ui.ActionBar.l6.Ge), org.telegram.messenger.qs.e4);
                }
                an anVar = cnVar.za;
                if (anVar == null || anVar.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.qs.t3);
            case 1:
                return this.w.x.e1();
            default:
                cn cnVar2 = this.w;
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar2).currentAccount;
                if (!c8.g0.c(i10, cnVar2.za)) {
                    return i0.a.o(cnVar2.getThemedColor(org.telegram.ui.ActionBar.l6.d6), org.telegram.messenger.qs.e4);
                }
                an anVar2 = cnVar2.za;
                if (anVar2 == null || anVar2.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.a.o(this.d, org.telegram.messenger.qs.t3);
        }
    }
}
