package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yi extends ze.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ zn g;

    public /* synthetic */ yi(zn znVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.g = znVar;
        this.e = i10;
        this.f = s1Var;
    }

    @Override // ze.c
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 18), 240L);
                    break;
                }
                break;
            case 1:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 20), 240L);
                    break;
                }
                break;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 21), 240L);
                    break;
                }
                break;
        }
    }

    @Override // ze.c
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                zn znVar = this.g;
                znVar.tb = i10;
                znVar.ub = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                zn znVar2 = this.g;
                znVar2.tb = i11;
                znVar2.ub = 5;
                znVar2.wb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                zn znVar3 = this.g;
                znVar3.tb = i12;
                znVar3.ub = 7;
                this.f.invalidate();
                break;
        }
    }
}
