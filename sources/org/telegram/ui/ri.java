package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ri extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ qn g;

    public /* synthetic */ ri(qn qnVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = qnVar;
        this.e = i10;
        this.f = u1Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 23), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 26), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 27), 240L);
                    break;
                }
                break;
        }
    }

    @Override // pf.c
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                qn qnVar = this.g;
                qnVar.wb = i10;
                qnVar.xb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                qn qnVar2 = this.g;
                qnVar2.wb = i11;
                qnVar2.xb = 5;
                qnVar2.zb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                qn qnVar3 = this.g;
                qnVar3.wb = i12;
                qnVar3.xb = 7;
                this.f.invalidate();
                break;
        }
    }
}
