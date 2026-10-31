package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tq0 extends org.telegram.ui.Components.b71 {
    public final /* synthetic */ PhotoViewer h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(PhotoViewer photoViewer, Context context, yo0 yo0Var) {
        super(context, yo0Var);
        this.h0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.Y(this.h0);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.Y(this.h0);
        }
    }
}
