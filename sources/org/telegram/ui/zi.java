package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class zi extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ zn g;

    public /* synthetic */ zi(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = znVar;
        this.e = i10;
        this.f = u1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 21), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 23), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 24), 240L);
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
                zn znVar = this.g;
                znVar.vb = i10;
                znVar.wb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                zn znVar2 = this.g;
                znVar2.vb = i11;
                znVar2.wb = 5;
                znVar2.yb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                zn znVar3 = this.g;
                znVar3.vb = i12;
                znVar3.wb = 7;
                this.f.invalidate();
                break;
        }
    }
}
