package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class wi extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ wn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ wi(wn wnVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = wnVar;
        this.e = i10;
        this.h = obj;
        this.f = u1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 20), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 22), 240L);
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
                wnVar.wb = 1;
                wnVar.xb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                wn wnVar2 = this.g;
                wnVar2.vb = i11;
                wnVar2.wb = 3;
                wnVar2.yb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
