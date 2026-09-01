package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class uc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ro0 a;
    public final tc b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ bd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.h = bdVar;
        Context context = getContext();
        g6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        ro0 ro0Var = new ro0(context, g6Var);
        this.a = ro0Var;
        ro0Var.setProgressToGradient(1.0f);
        ro0Var.B = true;
        addView(ro0Var, k7.c6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
        long j10 = bdVar.a;
        g6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        tc tcVar = new tc(this, context2, i10, j10, g6Var2);
        this.b = tcVar;
        boolean z4 = bdVar.d;
        addView(tcVar, k7.c6.d(-1, z4 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z4 ? 24.0f : 0.0f));
        if (bdVar instanceof n60) {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            this.c = l5Var;
            l5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.k6.A8;
            l5Var.setTextColor(bdVar.getThemedColor(i11));
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            l5Var.setAlpha(0.0f);
            a();
            addView(l5Var, k7.c6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(tcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((bdVar.d && bdVar.s == -1) ? bdVar.getThemedColor(i11) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, k7.c6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, k7.c6.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f10;
        boolean z4 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z4) ? 20 : 18;
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        l5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f10 = -2.0f;
        } else {
            f10 = z4 ? 4 : 0;
        }
        l5Var.setTranslationY(AndroidUtilities.dp(f10));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        if (l5Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            l5Var.setTextColor((!bdVar.d || bdVar.s == -1) ? bdVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8) : -1);
            if (bdVar.d && bdVar.s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
