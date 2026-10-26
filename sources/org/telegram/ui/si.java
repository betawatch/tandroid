package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class si extends qf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ un g;

    public /* synthetic */ si(un unVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.g = unVar;
        this.e = i10;
        this.f = s1Var;
    }

    @Override // qf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 23), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 26), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 27), 240L);
                    break;
                }
                break;
        }
    }

    @Override // qf.c
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                un unVar = this.g;
                unVar.Sb = i10;
                unVar.Tb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                un unVar2 = this.g;
                unVar2.Sb = i11;
                unVar2.Tb = 5;
                unVar2.Vb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                un unVar3 = this.g;
                unVar3.Sb = i12;
                unVar3.Tb = 7;
                this.f.invalidate();
                break;
        }
    }
}
