package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zu0 extends org.telegram.ui.Components.l60 {
    public final /* synthetic */ av0 d;

    public zu0(av0 av0Var) {
        this.d = av0Var;
    }

    @Override // org.telegram.ui.Components.wo0
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

    @Override // org.telegram.ui.Components.l60
    public final int i() {
        return Math.max(0, this.d.s.Z7 - 1);
    }

    @Override // org.telegram.ui.Components.l60
    public final int j() {
        return this.d.s.Y7;
    }

    @Override // org.telegram.ui.Components.l60
    public final void k(int i10) {
        int max;
        if (this.d.s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.s.Z7 - 1, i10))) != this.d.s.Y7) {
            av0 av0Var = this.d;
            av0Var.r = av0Var.s.Y7;
            this.d.s.Y7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.Y7;
            av0 av0Var2 = this.d;
            if (i11 != av0Var2.r) {
                av0Var2.s.p2(1);
            }
        }
    }
}
