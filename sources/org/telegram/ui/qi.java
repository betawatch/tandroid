package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class qi extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ qn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qi(qn qnVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = qnVar;
        this.e = i10;
        this.h = obj;
        this.f = u1Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 22), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 25), 240L);
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
                qn qnVar = this.g;
                qnVar.wb = i10;
                qnVar.xb = 1;
                qnVar.yb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                qn qnVar2 = this.g;
                qnVar2.wb = i11;
                qnVar2.xb = 3;
                qnVar2.zb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
