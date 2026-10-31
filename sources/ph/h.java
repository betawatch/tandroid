package ph;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.LaunchActivity;
import rh.v8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends v8 {
    public final /* synthetic */ m m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, p6 p6Var) {
        super(context, p6Var);
        this.m0 = mVar;
    }

    @Override // rh.v8
    public final boolean d(float f7) {
        boolean z10 = false;
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        m mVar = this.m0;
        Context context = mVar.getContext();
        Activity W = org.telegram.messenger.i0.W(context);
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, mVar.I0);
        String L0 = cd.L0(2131750352, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = cd.a0(null, null, 2131750351, Integer.valueOf(mVar.d2.d.gifts_per_round));
        ih.b bVar = new ih.b(context, mVar.I0, i0.a.f(context, R.drawable.star_small_inner));
        bVar.setTextSize(1, 18.0f);
        a7.V(bVar, t6.j5, mVar.I0);
        a7.m(bVar, 34, t6.Li, mVar.I0);
        bVar.setHintText(cd.L0(2131750350, null));
        bVar.setFocusable(true);
        bVar.setInputType(2);
        bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        a7.G(bVar, t6.k6, t6.l6, t6.p7, mVar.I0);
        bVar.setImeOptions(268435462);
        bVar.setBackgroundDrawable(null);
        bVar.k1 = org.telegram.messenger.i0.L(24.0f);
        bVar.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f));
        bVar.addTextChangedListener(new ag.u2(mVar, viewArr, z10, 10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(bVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        x1Var.a = org.telegram.messenger.i0.L(300.0f);
        alertDialog$Builder.k(cd.L0(2131750354, null), new org.telegram.ui.web.k0(2, mVar, bVar));
        alertDialog$Builder.h(cd.L0(2131752589, null), new org.telegram.utils.twidget.t(6));
        org.telegram.ui.ActionBar.x1[] x1VarArr = {x1Var};
        if (Q != null) {
            org.telegram.messenger.i0.Y2(W, Q.getClassGuid());
        }
        x1VarArr[0].setOnDismissListener(new org.telegram.ui.Components.z1(bVar, Q, W, 3));
        x1VarArr[0].setOnShowListener(new ag.d0(bVar, 2));
        x1VarArr[0].show();
        View d = x1VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        x1VarArr[0].j0 = false;
        bVar.setSelection(bVar.getText().length());
        return true;
    }

    @Override // rh.v8, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // rh.v8
    public final void e(int i10) {
        m.d1(this.m0, i10);
    }

    @Override // rh.v8
    public final void setValue(int i10) {
        super.setValue(i10);
        m.d1(this.m0, i10);
    }
}
