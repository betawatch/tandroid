package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xu0 extends org.telegram.ui.Components.y50 {
    public final /* synthetic */ yu0 d;

    public xu0(yu0 yu0Var) {
        this.d = yu0Var;
    }

    @Override // org.telegram.ui.Components.co0
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

    @Override // org.telegram.ui.Components.y50
    public final int i() {
        return Math.max(0, this.d.s.Z7 - 1);
    }

    @Override // org.telegram.ui.Components.y50
    public final int j() {
        return this.d.s.Y7;
    }

    @Override // org.telegram.ui.Components.y50
    public final void k(int i10) {
        int max;
        if (this.d.s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.s.Z7 - 1, i10))) != this.d.s.Y7) {
            yu0 yu0Var = this.d;
            yu0Var.r = yu0Var.s.Y7;
            this.d.s.Y7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.Y7;
            yu0 yu0Var2 = this.d;
            if (i11 != yu0Var2.r) {
                yu0Var2.s.o2(1);
            }
        }
    }
}
