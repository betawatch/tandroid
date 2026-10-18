package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xs extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ct o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs(ct ctVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = ctVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        gt gtVar = this.o.a;
        gtVar.k = null;
        gtVar.K = false;
        if (gtVar.R) {
            gtVar.n();
        }
    }
}
