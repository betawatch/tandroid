package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qs extends org.telegram.ui.Cells.r8 {
    public final /* synthetic */ int Q = 2;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(ss ssVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.R = ssVar;
    }

    @Override // org.telegram.ui.Cells.r8
    public int c(int i10) {
        switch (this.Q) {
            case 2:
                ((a11) this.R).e.getClass();
                break;
        }
        return i10;
    }

    @Override // org.telegram.ui.Cells.r8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.Q) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                ss ssVar = (ss) this.R;
                int measuredHeight2 = (measuredHeight - ssVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.x9 x9Var = ssVar.U;
                x9Var.layout(dp, measuredHeight2, x9Var.getMeasuredWidth() + dp, ssVar.U.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                zx0 zx0Var = (zx0) this.R;
                int measuredHeight4 = (measuredHeight3 - zx0Var.d.v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.x9 x9Var2 = zx0Var.d.v0;
                x9Var2.layout(dp2, measuredHeight4, x9Var2.getMeasuredWidth() + dp2, zx0Var.d.v0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.r8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.Q) {
            case 0:
                super.onMeasure(i10, i11);
                ss ssVar = (ss) this.R;
                ssVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                ssVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                zx0 zx0Var = (zx0) this.R;
                zx0Var.d.v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                zx0Var.d.v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(zx0 zx0Var, Activity activity) {
        super(activity);
        this.R = zx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(a11 a11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(18, context, f6Var, false, false);
        this.R = a11Var;
    }
}
