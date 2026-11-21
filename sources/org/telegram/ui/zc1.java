package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class zc1 {
    public org.telegram.ui.Cells.d2 a;
    public org.telegram.ui.ActionBar.t1 b;
    public TextView c;

    public static void a(Context context, org.telegram.messenger.x10 x10Var, Runnable runnable) {
        zc1 zc1Var = new zc1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String N0 = org.telegram.messenger.gd.N0(2131743954, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, null);
        textView.setTextSize(1, 14.0f);
        g10.addView(textView, c8.ma.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context, null);
        zc1Var.a = d2Var;
        d2Var.getTextView().getLayoutParams().width = -1;
        zc1Var.a.getTextView().setTextSize(1, 14.0f);
        g10.addView(zc1Var.a, c8.ma.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131752907, null)));
        zc1Var.a.e(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752908, null), new fu(context, 8)), "", false, false, false);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new org.telegram.ui.Components.b3(1, x10Var, zArr));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new m60(21));
        zc1Var.b = t1Var;
        t1Var.show();
        TextView textView2 = (TextView) zc1Var.b.d(-1);
        zc1Var.c = textView2;
        textView2.setEnabled(false);
        zc1Var.c.setAlpha(0.5f);
        zc1Var.a.setOnClickListener(new oy0(zc1Var, 11));
        zc1Var.a.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false), 7, -1));
        zc1Var.b.setOnDismissListener(new org.telegram.ui.Components.i2(zArr, runnable));
    }
}
