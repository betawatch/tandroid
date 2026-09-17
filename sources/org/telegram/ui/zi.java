package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class zi extends of.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ co g;
    public final /* synthetic */ Object h;

    public /* synthetic */ zi(co coVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = coVar;
        this.e = i10;
        this.h = obj;
        this.f = t1Var;
    }

    @Override // of.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 21), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 23), 240L);
                    break;
                }
                break;
        }
    }

    @Override // of.e
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                co coVar = this.g;
                coVar.wb = i10;
                coVar.xb = 1;
                coVar.yb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                co coVar2 = this.g;
                coVar2.wb = i11;
                coVar2.xb = 3;
                coVar2.zb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
