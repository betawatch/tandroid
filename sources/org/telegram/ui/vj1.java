package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class vj1 {
    public org.telegram.ui.Cells.a2 a;
    public org.telegram.ui.ActionBar.a2 b;
    public TextView c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        vj1 vj1Var = new vj1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e = org.telegram.messenger.yh.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
        textView.setTextSize(1, 14.0f);
        e.addView(textView, w7.a6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        vj1Var.a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        vj1Var.a.getTextView().setTextSize(1, 14.0f);
        e.addView(vj1Var.a, w7.a6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.q.o(R.string.BotWebAppDisclaimerSubtitle, textView);
        vj1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new tv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.d3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ul0(14));
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
        vj1Var.b = a2Var2;
        a2Var2.show();
        TextView textView2 = (TextView) vj1Var.b.d(-1);
        vj1Var.c = textView2;
        textView2.setEnabled(false);
        vj1Var.c.setAlpha(0.5f);
        vj1Var.a.setOnClickListener(new v41(vj1Var, 8));
        vj1Var.a.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), 7, -1));
        vj1Var.b.setOnDismissListener(new org.telegram.ui.Components.p2(zArr, runnable));
    }
}
