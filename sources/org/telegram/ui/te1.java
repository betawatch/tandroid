package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class te1 {
    public org.telegram.ui.Cells.c2 a;
    public org.telegram.ui.ActionBar.x1 b;
    public TextView c;

    public static void a(Context context, org.telegram.messenger.q20 q20Var, Runnable runnable) {
        te1 te1Var = new te1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String L0 = org.telegram.messenger.cd.L0(2131744220, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.b6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, null);
        te1Var.a = c2Var;
        c2Var.getTextView().getLayoutParams().width = -1;
        te1Var.a.getTextView().setTextSize(1, 14.0f);
        f7.addView(te1Var.a, w7.b6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131752919, null)));
        te1Var.a.e(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752920, null), new ev(context, 8)), "", false, false, false);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new org.telegram.ui.Components.u2(1, q20Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new ra1(5));
        te1Var.b = x1Var;
        x1Var.show();
        TextView textView2 = (TextView) te1Var.b.d(-1);
        te1Var.c = textView2;
        textView2.setEnabled(false);
        te1Var.c.setAlpha(0.5f);
        te1Var.a.setOnClickListener(new a01(te1Var, 11));
        te1Var.a.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false), 7, -1));
        te1Var.b.setOnDismissListener(new org.telegram.ui.Components.y1(zArr, runnable));
    }
}
