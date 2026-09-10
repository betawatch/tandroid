package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.dd0 b;
    public final /* synthetic */ o40 c;
    public final /* synthetic */ p40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(LaunchActivity launchActivity, org.telegram.ui.Components.dd0 dd0Var, o40 o40Var, p40 p40Var) {
        super(launchActivity);
        this.b = dd0Var;
        this.c = o40Var;
        this.d = p40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.dd0 dd0Var = this.b;
        dd0Var.setItemCount(5);
        o40 o40Var = this.c;
        o40Var.setItemCount(5);
        p40 p40Var = this.d;
        p40Var.setItemCount(5);
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        o40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        p40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
