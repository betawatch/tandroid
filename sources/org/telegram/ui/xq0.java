package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xq0 extends org.telegram.ui.Components.t00 {
    public final /* synthetic */ int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xq0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = i10;
    }

    @Override // org.telegram.ui.Components.t00
    public int getColumnsCount() {
        switch (this.U) {
            case 0:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override // org.telegram.ui.Components.t00
    public int getViewType() {
        switch (this.U) {
            case 0:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override // org.telegram.ui.Components.t00, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.U) {
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(104.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
