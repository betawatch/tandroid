package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.rw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ tr(ur urVar, int i10) {
        this.a = i10;
        this.b = urVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        yr yrVar = this.b.d;
        return yrVar.h0(yrVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.rw0
    public void f(int i10) {
        switch (this.a) {
            case 1:
                yr yrVar = this.b.d;
                if (yrVar.s != null) {
                    int i11 = yrVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    yrVar.p1 = i10;
                    if (z10) {
                        sr w02 = yrVar.w0();
                        yrVar.B0();
                        yrVar.A0(w02);
                    }
                    yrVar.a.m(yrVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
