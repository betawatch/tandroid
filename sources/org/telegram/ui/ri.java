package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ri extends ye.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ tn g;

    public /* synthetic */ ri(tn tnVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.g = tnVar;
        this.e = i10;
        this.f = s1Var;
    }

    @Override // ye.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, this.e, 22), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, this.e, 24), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.f(this, this.e, 25), 240L);
                    break;
                }
                break;
        }
    }

    @Override // ye.c
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                tn tnVar = this.g;
                tnVar.sb = i10;
                tnVar.tb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                tn tnVar2 = this.g;
                tnVar2.sb = i11;
                tnVar2.tb = 5;
                tnVar2.vb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                tn tnVar3 = this.g;
                tnVar3.sb = i12;
                tnVar3.tb = 7;
                this.f.invalidate();
                break;
        }
    }
}
