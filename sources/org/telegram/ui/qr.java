package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.rv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ qr(rr rrVar, int i10) {
        this.a = i10;
        this.b = rrVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        vr vrVar = this.b.d;
        return vrVar.h0(vrVar.a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override // org.telegram.ui.Components.rv0
    public void i(int i10) {
        switch (this.a) {
            case 1:
                vr vrVar = this.b.d;
                if (vrVar.s != null) {
                    int i11 = vrVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    vrVar.p1 = i10;
                    if (z10) {
                        pr w02 = vrVar.w0();
                        vrVar.B0();
                        vrVar.A0(w02);
                    }
                    vrVar.a.m(vrVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.rv0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
