// default package

import android.widget.LinearLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v75 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ lp7 b;
    public final /* synthetic */ r75 c;
    public final /* synthetic */ s75 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v75(LaunchActivity launchActivity, lp7 lp7Var, r75 r75Var, s75 s75Var) {
        super(launchActivity);
        this.b = lp7Var;
        this.c = r75Var;
        this.d = s75Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.a = true;
        lp7 lp7Var = this.b;
        lp7Var.setItemCount(5);
        r75 r75Var = this.c;
        r75Var.setItemCount(5);
        s75 s75Var = this.d;
        s75Var.setItemCount(5);
        lp7Var.getLayoutParams().height = gm.L(54.0f) * 5;
        r75Var.getLayoutParams().height = gm.L(54.0f) * 5;
        s75Var.getLayoutParams().height = gm.L(54.0f) * 5;
        this.a = false;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
