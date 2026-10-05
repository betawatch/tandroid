package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class xi extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ yn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ xi(yn ynVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = ynVar;
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
                yn ynVar = this.g;
                ynVar.tb = i10;
                ynVar.ub = 1;
                ynVar.vb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                yn ynVar2 = this.g;
                ynVar2.tb = i11;
                ynVar2.ub = 3;
                ynVar2.wb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
