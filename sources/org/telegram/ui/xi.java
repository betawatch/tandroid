package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class xi extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ wn g;

    public /* synthetic */ xi(wn wnVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = wnVar;
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
                wn wnVar = this.g;
                wnVar.vb = i10;
                wnVar.wb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                wn wnVar2 = this.g;
                wnVar2.vb = i11;
                wnVar2.wb = 5;
                wnVar2.yb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                wn wnVar3 = this.g;
                wnVar3.vb = i12;
                wnVar3.wb = 7;
                this.f.invalidate();
                break;
        }
    }
}
