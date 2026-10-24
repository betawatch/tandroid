package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ri extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ sn g;

    public /* synthetic */ ri(sn snVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = snVar;
        this.e = i10;
        this.f = t1Var;
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
                sn snVar = this.g;
                snVar.Jb = i10;
                snVar.Kb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                sn snVar2 = this.g;
                snVar2.Jb = i11;
                snVar2.Kb = 5;
                snVar2.Mb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                sn snVar3 = this.g;
                snVar3.Jb = i12;
                snVar3.Kb = 7;
                this.f.invalidate();
                break;
        }
    }
}
