package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.ud0 b;
    public final /* synthetic */ r40 c;
    public final /* synthetic */ s40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v40(LaunchActivity launchActivity, org.telegram.ui.Components.ud0 ud0Var, r40 r40Var, s40 s40Var) {
        super(launchActivity);
        this.b = ud0Var;
        this.c = r40Var;
        this.d = s40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.ud0 ud0Var = this.b;
        ud0Var.setItemCount(5);
        r40 r40Var = this.c;
        r40Var.setItemCount(5);
        s40 s40Var = this.d;
        s40Var.setItemCount(5);
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        r40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        s40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
