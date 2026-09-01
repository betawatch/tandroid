package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wi extends af.f {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ xn g;

    public /* synthetic */ wi(xn xnVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = xnVar;
        this.e = i10;
        this.f = t1Var;
    }

    @Override // af.f
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 19), 240L);
                    break;
                }
                break;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 21), 240L);
                    break;
                }
                break;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 22), 240L);
                    break;
                }
                break;
        }
    }

    @Override // af.f
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                xn xnVar = this.g;
                xnVar.tb = i10;
                xnVar.ub = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                xn xnVar2 = this.g;
                xnVar2.tb = i11;
                xnVar2.ub = 5;
                xnVar2.wb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                xn xnVar3 = this.g;
                xnVar3.tb = i12;
                xnVar3.ub = 7;
                this.f.invalidate();
                break;
        }
    }
}
