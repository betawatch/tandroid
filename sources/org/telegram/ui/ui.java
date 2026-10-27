package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ui extends qf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ wn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ui(wn wnVar, int i10, Object obj, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.g = wnVar;
        this.e = i10;
        this.h = obj;
        this.f = s1Var;
    }

    @Override // qf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 22), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 25), 240L);
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
                wnVar.Xb = 1;
                wnVar.Yb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                wn wnVar2 = this.g;
                wnVar2.Wb = i11;
                wnVar2.Xb = 3;
                wnVar2.Zb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
