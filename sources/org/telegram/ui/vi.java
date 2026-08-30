package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vi extends af.f {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ xn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vi(xn xnVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = xnVar;
        this.e = i10;
        this.h = obj;
        this.f = t1Var;
    }

    @Override // af.f
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 18), 240L);
                    break;
                }
                break;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 20), 240L);
                    break;
                }
                break;
        }
    }

    @Override // af.f
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                xn xnVar = this.g;
                xnVar.tb = i10;
                xnVar.ub = 1;
                xnVar.vb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                xn xnVar2 = this.g;
                xnVar2.tb = i11;
                xnVar2.ub = 3;
                xnVar2.wb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
