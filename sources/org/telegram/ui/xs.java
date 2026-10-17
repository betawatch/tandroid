package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
