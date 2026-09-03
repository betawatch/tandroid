package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ru0 extends org.telegram.ui.Components.a60 {
    public final /* synthetic */ su0 d;

    public ru0(su0 su0Var) {
        this.d = su0Var;
    }

    @Override // org.telegram.ui.Components.ho0
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.s.V7 > 0) {
            sb.append(", ");
            sb.append(this.d.s.U7 + 1);
            sb.append(" / ");
            sb.append(this.d.s.V7);
        }
        sb.append(", ");
        sb.append(this.d.h);
        sb.append(" – ");
        sb.append(this.d.n);
        return sb.toString();
    }

    @Override // org.telegram.ui.Components.a60
    public final int i() {
        return Math.max(0, this.d.s.V7 - 1);
    }

    @Override // org.telegram.ui.Components.a60
    public final int j() {
        return this.d.s.U7;
    }

    @Override // org.telegram.ui.Components.a60
    public final void k(int i10) {
        int max;
        if (this.d.s.V7 > 0 && (max = Math.max(0, Math.min(this.d.s.V7 - 1, i10))) != this.d.s.U7) {
            su0 su0Var = this.d;
            su0Var.r = su0Var.s.U7;
            this.d.s.U7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.U7;
            su0 su0Var2 = this.d;
            if (i11 != su0Var2.r) {
                su0Var2.s.p2(1);
            }
        }
    }
}
