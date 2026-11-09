package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zc1 {
    public org.telegram.ui.Cells.c2 a;
    public org.telegram.ui.ActionBar.u1 b;
    public TextView c;

    public static void a(Context context, org.telegram.messenger.c20 c20Var, Runnable runnable) {
        zc1 zc1Var = new zc1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.id.M0(2131744195, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.j5, null);
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, c8.ha.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, null);
        zc1Var.a = c2Var;
        c2Var.getTextView().getLayoutParams().width = -1;
        zc1Var.a.getTextView().setTextSize(1, 14.0f);
        f10.addView(zc1Var.a, c8.ha.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131752919, null)));
        zc1Var.a.e(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752920, null), new du(context, 8)), "", false, false, false);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new org.telegram.ui.Components.u2(1, c20Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new io0(15));
        zc1Var.b = u1Var;
        u1Var.show();
        TextView textView2 = (TextView) zc1Var.b.d(-1);
        zc1Var.c = textView2;
        textView2.setEnabled(false);
        zc1Var.c.setAlpha(0.5f);
        zc1Var.a.setOnClickListener(new py0(zc1Var, 11));
        zc1Var.a.setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i6, false), 7, -1));
        zc1Var.b.setOnDismissListener(new org.telegram.ui.Components.z1(zArr, runnable));
    }
}
