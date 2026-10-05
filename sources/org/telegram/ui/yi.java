package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class yi extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ yn g;

    public /* synthetic */ yi(yn ynVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = ynVar;
        this.e = i10;
        this.f = u1Var;
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
                yn ynVar = this.g;
                ynVar.tb = i10;
                ynVar.ub = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                yn ynVar2 = this.g;
                ynVar2.tb = i11;
                ynVar2.ub = 5;
                ynVar2.wb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                yn ynVar3 = this.g;
                ynVar3.tb = i12;
                ynVar3.ub = 7;
                this.f.invalidate();
                break;
        }
    }
}
