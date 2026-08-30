package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d3 extends org.telegram.ui.ActionBar.g3 {
    public final c3 b;
    public ValueAnimator c;
    public o1.j d;
    public Boolean e;
    public Utilities.Callback f;

    public d3(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, float f10) {
        super(context, f6Var, false, false);
        fixNavigationBar(-14737633);
        c3 c3Var = new c3(UserConfig.selectedAccount, context, new nh.b(), f10, str);
        this.b = c3Var;
        c3Var.D.setVisibility(8);
        c3Var.setMultipleOnClick(false);
        c3Var.setOnBackClickListener(new b3(this, 0));
        c3Var.setOnSelectListener(new vh.o2(this, 1));
        qv0 qv0Var = new qv0(context, null);
        this.containerView = qv0Var;
        int i10 = this.backgroundPaddingLeft;
        qv0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(c3Var);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        n(false, new b3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    public final void n(boolean z4, b3 b3Var) {
        c3 c3Var = this.b;
        float translationY = c3Var.getTranslationY();
        float height = z4 ? 0.0f : (this.containerView.getHeight() - c3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z4);
        if (z4) {
            o1.j jVar = new o1.j(c3Var, o1.h.n, height);
            this.d = jVar;
            jVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new org.telegram.messenger.q(this, height, b3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 15));
        this.c.addListener(new ex0(16, this, b3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(nr.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
