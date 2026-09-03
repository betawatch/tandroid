package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ys0 extends org.telegram.ui.Components.q71 {
    public final /* synthetic */ PhotoViewer e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(PhotoViewer photoViewer, Context context, br0 br0Var) {
        super(context, br0Var);
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
