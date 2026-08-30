package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rs0 extends org.telegram.ui.Components.p71 {
    public final /* synthetic */ PhotoViewer e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(PhotoViewer photoViewer, Context context, uq0 uq0Var) {
        super(context, uq0Var);
        this.e0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        PhotoViewer.X(this.e0);
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.e0);
        }
    }
}
