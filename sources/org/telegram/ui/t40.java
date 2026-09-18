package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.uc0 b;
    public final /* synthetic */ p40 c;
    public final /* synthetic */ q40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(LaunchActivity launchActivity, org.telegram.ui.Components.uc0 uc0Var, p40 p40Var, q40 q40Var) {
        super(launchActivity);
        this.b = uc0Var;
        this.c = p40Var;
        this.d = q40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.uc0 uc0Var = this.b;
        uc0Var.setItemCount(5);
        p40 p40Var = this.c;
        p40Var.setItemCount(5);
        q40 q40Var = this.d;
        q40Var.setItemCount(5);
        uc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        p40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        q40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.a = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
