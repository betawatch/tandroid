package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ti extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ sn g;

    public /* synthetic */ ti(sn snVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = snVar;
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
                sn snVar = this.g;
                snVar.wb = i10;
                snVar.xb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                sn snVar2 = this.g;
                snVar2.wb = i11;
                snVar2.xb = 5;
                snVar2.zb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                sn snVar3 = this.g;
                snVar3.wb = i12;
                snVar3.xb = 7;
                this.f.invalidate();
                break;
        }
    }
}
