package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vi1 {
    public org.telegram.ui.Cells.z1 a;
    public org.telegram.ui.ActionBar.d2 b;
    public TextView c;

    public static void a(Context context, h5.d dVar, Runnable runnable) {
        vi1 vi1Var = new vi1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false));
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, k7.c6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        vi1Var.a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        vi1Var.a.getTextView().setTextSize(1, 14.0f);
        f10.addView(vi1Var.a, k7.c6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.y3.q(R.string.BotWebAppDisclaimerSubtitle, textView);
        vi1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new mv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new vl0(29, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cl0(9));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        vi1Var.b = d2Var;
        d2Var.show();
        TextView textView2 = (TextView) vi1Var.b.d(-1);
        vi1Var.c = textView2;
        textView2.setEnabled(false);
        vi1Var.c.setAlpha(0.5f);
        vi1Var.a.setOnClickListener(new k31(vi1Var, 10));
        vi1Var.a.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), 7, -1));
        vi1Var.b.setOnDismissListener(new org.telegram.ui.Components.m2(zArr, runnable));
    }
}
