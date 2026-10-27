package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tu0 extends org.telegram.ui.Components.v60 {
    public final /* synthetic */ uu0 d;

    public tu0(uu0 uu0Var) {
        this.d = uu0Var;
    }

    @Override // org.telegram.ui.Components.kp0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.n);
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.v60
    public final int i() {
        return Math.max(0, this.d.s.Z7 - 1);
    }

    @Override // org.telegram.ui.Components.v60
    public final int j() {
        return this.d.s.Y7;
    }

    @Override // org.telegram.ui.Components.v60
    public final void k(int i10) {
        int max;
        if (this.d.s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.s.Z7 - 1, i10))) != this.d.s.Y7) {
            uu0 uu0Var = this.d;
            uu0Var.r = uu0Var.s.Y7;
            this.d.s.Y7 = max;
            this.d.s.S0();
            this.d.invalidate();
            int i11 = this.d.s.Y7;
            uu0 uu0Var2 = this.d;
            if (i11 != uu0Var2.r) {
                uu0Var2.s.s2(1);
            }
        }
    }
}
