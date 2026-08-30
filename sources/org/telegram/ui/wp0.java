package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wp0 implements org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ fq0 a;

    public wp0(fq0 fq0Var) {
        this.a = fq0Var;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void e() {
        fq0 fq0Var = this.a;
        fq0Var.N.setText(LocaleController.getString(fq0Var.V ? R.string.ShowAsGrid : R.string.ShowAsList));
        fq0Var.N.setIcon(fq0Var.V ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void c() {
    }
}
