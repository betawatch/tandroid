package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.dw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr b;

    public /* synthetic */ rr(sr srVar, int i10) {
        this.a = i10;
        this.b = srVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        wr wrVar = this.b.d;
        return wrVar.h0(wrVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        switch (this.a) {
            case 1:
                wr wrVar = this.b.d;
                if (wrVar.s != null) {
                    int i11 = wrVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    wrVar.p1 = i10;
                    if (z10) {
                        qr w02 = wrVar.w0();
                        wrVar.B0();
                        wrVar.A0(w02);
                    }
                    wrVar.a.m(wrVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
