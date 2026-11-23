package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xc1 {
    public org.telegram.ui.Cells.d2 a;
    public org.telegram.ui.ActionBar.t1 b;
    public TextView c;

    public static void a(Context context, org.telegram.messenger.w10 w10Var, Runnable runnable) {
        xc1 xc1Var = new xc1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String N0 = org.telegram.messenger.gd.N0(2131743950, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
        textView.setTextSize(1, 14.0f);
        g10.addView(textView, c8.na.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, null);
        xc1Var.a = d2Var;
        d2Var.getTextView().getLayoutParams().width = -1;
        xc1Var.a.getTextView().setTextSize(1, 14.0f);
        g10.addView(xc1Var.a, c8.na.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131752907, null)));
        xc1Var.a.e(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752908, null), new eu(context, 8)), "", false, false, false);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new org.telegram.ui.Components.a3(1, w10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new l60(21));
        xc1Var.b = t1Var;
        t1Var.show();
        TextView textView2 = (TextView) xc1Var.b.d(-1);
        xc1Var.c = textView2;
        textView2.setEnabled(false);
        xc1Var.c.setAlpha(0.5f);
        xc1Var.a.setOnClickListener(new ny0(xc1Var, 11));
        xc1Var.a.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i6, false), 7, -1));
        xc1Var.b.setOnDismissListener(new org.telegram.ui.Components.h2(zArr, runnable));
    }
}
