package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qi extends we.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ rn g;

    public /* synthetic */ qi(rn rnVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.g = rnVar;
        this.e = i10;
        this.f = s1Var;
    }

    @Override // we.d
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.e, 19), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.e, 21), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new cg.w1(this, this.e, 22), 240L);
                    break;
                }
                break;
        }
    }

    @Override // we.d
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                rn rnVar = this.g;
                rnVar.sb = i10;
                rnVar.tb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                rn rnVar2 = this.g;
                rnVar2.sb = i11;
                rnVar2.tb = 5;
                rnVar2.vb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                rn rnVar3 = this.g;
                rnVar3.sb = i12;
                rnVar3.tb = 7;
                this.f.invalidate();
                break;
        }
    }
}
