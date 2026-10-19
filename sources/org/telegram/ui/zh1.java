package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zh1 {
    public org.telegram.ui.Cells.a2 a;
    public org.telegram.ui.ActionBar.b2 b;
    public TextView c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        zh1 zh1Var = new zh1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e = org.telegram.messenger.kk.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false));
        textView.setTextSize(1, 14.0f);
        e.addView(textView, w7.z5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        zh1Var.a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        zh1Var.a.getTextView().setTextSize(1, 14.0f);
        e.addView(zh1Var.a, w7.z5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.g0.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        zh1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new bv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.c3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(16));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        zh1Var.b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) zh1Var.b.d(-1);
        zh1Var.c = textView2;
        textView2.setEnabled(false);
        zh1Var.c.setAlpha(0.5f);
        zh1Var.a.setOnClickListener(new c31(zh1Var, 8));
        zh1Var.a.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 7, -1));
        zh1Var.b.setOnDismissListener(new org.telegram.ui.Components.o2(zArr, runnable));
    }
}
