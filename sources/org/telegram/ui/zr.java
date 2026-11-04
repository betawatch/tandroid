package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zr extends org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ es o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr(es esVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = esVar;
    }

    @Override // org.telegram.ui.ActionBar.f1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        is isVar = this.o.a;
        isVar.k = null;
        isVar.K = false;
        if (isVar.R) {
            isVar.m();
        }
    }
}
