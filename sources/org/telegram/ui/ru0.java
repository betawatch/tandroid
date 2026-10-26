package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ru0 extends org.telegram.ui.Components.u60 {
    public final /* synthetic */ su0 d;

    public ru0(su0 su0Var) {
        this.d = su0Var;
    }

    @Override // org.telegram.ui.Components.jp0
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

    @Override // org.telegram.ui.Components.u60
    public final int i() {
        return Math.max(0, this.d.s.Z7 - 1);
    }

    @Override // org.telegram.ui.Components.u60
    public final int j() {
        return this.d.s.Y7;
    }

    @Override // org.telegram.ui.Components.u60
    public final void k(int i10) {
        int max;
        if (this.d.s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.s.Z7 - 1, i10))) != this.d.s.Y7) {
            su0 su0Var = this.d;
            su0Var.r = su0Var.s.Y7;
            this.d.s.Y7 = max;
            this.d.s.S0();
            this.d.invalidate();
            int i11 = this.d.s.Y7;
            su0 su0Var2 = this.d;
            if (i11 != su0Var2.r) {
                su0Var2.s.r2(1);
            }
        }
    }
}
