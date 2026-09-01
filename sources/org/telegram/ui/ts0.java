package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.Components.r71 {
    public final /* synthetic */ PhotoViewer e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(PhotoViewer photoViewer, Context context, wq0 wq0Var) {
        super(context, wq0Var);
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
