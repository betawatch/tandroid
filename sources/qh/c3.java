package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c3 extends org.telegram.ui.ActionBar.h3 {
    public final b3 b;
    public ValueAnimator c;
    public o1.j d;
    public Boolean e;
    public Utilities.Callback f;

    public c3(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, float f10) {
        super(context, g6Var, false, false);
        fixNavigationBar(-14737633);
        b3 b3Var = new b3(UserConfig.selectedAccount, context, new oh.b(), f10, str);
        this.b = b3Var;
        b3Var.D.setVisibility(8);
        b3Var.setMultipleOnClick(false);
        b3Var.setOnBackClickListener(new a3(this, 0));
        b3Var.setOnSelectListener(new wh.p2(this, 1));
        pv0 pv0Var = new pv0(context, null);
        this.containerView = pv0Var;
        int i10 = this.backgroundPaddingLeft;
        pv0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(b3Var);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return !this.b.w;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        n(false, new a3(this, 1));
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    public final void n(boolean z4, a3 a3Var) {
        b3 b3Var = this.b;
        float translationY = b3Var.getTranslationY();
        float height = z4 ? 0.0f : (this.containerView.getHeight() - b3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.e = Boolean.valueOf(z4);
        if (z4) {
            o1.j jVar = new o1.j(b3Var, o1.h.n, height);
            this.d = jVar;
            jVar.u.a(0.75f);
            this.d.u.b(350.0f);
            this.d.a(new org.telegram.messenger.q(this, height, a3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.c = ofFloat;
        ofFloat.addUpdateListener(new oh.f5(this, 15));
        this.c.addListener(new ex0(16, this, a3Var));
        this.c.setDuration(450L);
        this.c.setInterpolator(pr.h);
        this.c.start();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        n(true, null);
    }
}
