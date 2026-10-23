package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class vs extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ at o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(at atVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = atVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        et etVar = this.o.a;
        etVar.k = null;
        etVar.K = false;
        if (etVar.R) {
            etVar.n();
        }
    }
}
