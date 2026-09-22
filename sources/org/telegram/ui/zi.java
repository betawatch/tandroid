package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class zi extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ bo g;
    public final /* synthetic */ Object h;

    public /* synthetic */ zi(bo boVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = boVar;
        this.e = i10;
        this.h = obj;
        this.f = t1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 20), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 22), 240L);
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
                bo boVar = this.g;
                boVar.vb = i10;
                boVar.wb = 1;
                boVar.xb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                bo boVar2 = this.g;
                boVar2.vb = i11;
                boVar2.wb = 3;
                boVar2.yb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
