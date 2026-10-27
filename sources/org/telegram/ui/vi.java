package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vi extends qf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ wn g;

    public /* synthetic */ vi(wn wnVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.g = wnVar;
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
                wn wnVar = this.g;
                wnVar.Wb = i10;
                wnVar.Xb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                wn wnVar2 = this.g;
                wnVar2.Wb = i11;
                wnVar2.Xb = 5;
                wnVar2.Zb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                wn wnVar3 = this.g;
                wnVar3.Wb = i12;
                wnVar3.Xb = 7;
                this.f.invalidate();
                break;
        }
    }
}
