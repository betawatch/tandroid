package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xi extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ xn g;

    public /* synthetic */ xi(xn xnVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = xnVar;
        this.e = i10;
        this.f = t1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 21), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 23), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 24), 240L);
                    break;
                }
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                xn xnVar = this.g;
                xnVar.vb = i10;
                xnVar.wb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                xn xnVar2 = this.g;
                xnVar2.vb = i11;
                xnVar2.wb = 5;
                xnVar2.yb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                xn xnVar3 = this.g;
                xnVar3.vb = i12;
                xnVar3.wb = 7;
                this.f.invalidate();
                break;
        }
    }
}
