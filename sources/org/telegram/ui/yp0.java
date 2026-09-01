package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yp0 implements org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ hq0 a;

    public yp0(hq0 hq0Var) {
        this.a = hq0Var;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void e() {
        hq0 hq0Var = this.a;
        hq0Var.N.setText(LocaleController.getString(hq0Var.V ? R.string.ShowAsGrid : R.string.ShowAsList));
        hq0Var.N.setIcon(hq0Var.V ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void c() {
    }
}
