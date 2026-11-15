package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wc1 {
    public org.telegram.ui.Cells.c2 a;
    public org.telegram.ui.ActionBar.t1 b;
    public TextView c;

    public static void a(Context context, org.telegram.messenger.z10 z10Var, Runnable runnable) {
        wc1 wc1Var = new wc1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = org.telegram.messenger.hd.M0(2131744195, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, null);
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, c8.ja.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, null);
        wc1Var.a = c2Var;
        c2Var.getTextView().getLayoutParams().width = -1;
        wc1Var.a.getTextView().setTextSize(1, 14.0f);
        f10.addView(wc1Var.a, c8.ja.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752919, null)));
        wc1Var.a.e(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752920, null), new du(context, 8)), "", false, false, false);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new org.telegram.ui.Components.s2(1, z10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(20));
        wc1Var.b = t1Var;
        t1Var.show();
        TextView textView2 = (TextView) wc1Var.b.d(-1);
        wc1Var.c = textView2;
        textView2.setEnabled(false);
        wc1Var.c.setAlpha(0.5f);
        wc1Var.a.setOnClickListener(new ky0(wc1Var, 11));
        wc1Var.a.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i6, false), 7, -1));
        wc1Var.b.setOnDismissListener(new org.telegram.ui.Components.x1(zArr, runnable));
    }
}
