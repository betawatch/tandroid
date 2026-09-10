package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qj1 {
    public org.telegram.ui.Cells.z1 a;
    public org.telegram.ui.ActionBar.d2 b;
    public TextView c;

    public static void a(Context context, e2.h hVar, Runnable runnable) {
        qj1 qj1Var = new qj1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.a6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        qj1Var.a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        qj1Var.a.getTextView().setTextSize(1, 14.0f);
        f7.addView(qj1Var.a, w7.a6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.a2.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        qj1Var.a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new qv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new fz0(16, hVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new js0(6));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        qj1Var.b = d2Var;
        d2Var.show();
        TextView textView2 = (TextView) qj1Var.b.d(-1);
        qj1Var.c = textView2;
        textView2.setEnabled(false);
        qj1Var.c.setAlpha(0.5f);
        qj1Var.a.setOnClickListener(new m41(qj1Var, 9));
        qj1Var.a.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 7, -1));
        qj1Var.b.setOnDismissListener(new org.telegram.ui.Components.o2(zArr, runnable));
    }
}
