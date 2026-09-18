package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ss extends org.telegram.ui.Cells.r8 {
    public final /* synthetic */ int Q = 1;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(us usVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.R = usVar;
    }

    @Override // org.telegram.ui.Cells.r8
    public int c(int i10) {
        switch (this.Q) {
            case 2:
                ((b11) this.R).e.getClass();
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
                us usVar = (us) this.R;
                int measuredHeight2 = (measuredHeight - usVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.u9 u9Var = usVar.U;
                u9Var.layout(dp, measuredHeight2, u9Var.getMeasuredWidth() + dp, usVar.U.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                ay0 ay0Var = (ay0) this.R;
                int measuredHeight4 = (measuredHeight3 - ay0Var.d.v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.u9 u9Var2 = ay0Var.d.v0;
                u9Var2.layout(dp2, measuredHeight4, u9Var2.getMeasuredWidth() + dp2, ay0Var.d.v0.getMeasuredHeight() + measuredHeight4);
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
                us usVar = (us) this.R;
                usVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                usVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                ay0 ay0Var = (ay0) this.R;
                ay0Var.d.v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                ay0Var.d.v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(ay0 ay0Var, Activity activity) {
        super(activity);
        this.R = ay0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(b11 b11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(18, context, f6Var, false, false);
        this.R = b11Var;
    }
}
