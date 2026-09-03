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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final to0 a;
    public final vc b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ dd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(dd ddVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.h = ddVar;
        Context context = getContext();
        f6Var = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
        to0 to0Var = new to0(context, f6Var);
        this.a = to0Var;
        to0Var.setProgressToGradient(1.0f);
        to0Var.C = true;
        addView(to0Var, k7.b6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
        long j10 = ddVar.a;
        f6Var2 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
        vc vcVar = new vc(this, context2, i10, j10, f6Var2);
        this.b = vcVar;
        boolean z4 = ddVar.d;
        addView(vcVar, k7.b6.d(-1, z4 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z4 ? 24.0f : 0.0f));
        if (ddVar instanceof o60) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            this.c = k5Var;
            k5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.j6.A8;
            k5Var.setTextColor(ddVar.getThemedColor(i11));
            k5Var.setTypeface(AndroidUtilities.bold());
            k5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            k5Var.setAlpha(0.0f);
            a();
            addView(k5Var, k7.b6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(vcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((ddVar.d && ddVar.s == -1) ? ddVar.getThemedColor(i11) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ddVar.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, k7.b6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, k7.b6.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f10;
        boolean z4 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z4) ? 20 : 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        k5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f10 = -2.0f;
        } else {
            f10 = z4 ? 4 : 0;
        }
        k5Var.setTranslationY(AndroidUtilities.dp(f10));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (k5Var != null) {
            dd ddVar = this.h;
            int i10 = -1;
            k5Var.setTextColor((!ddVar.d || ddVar.s == -1) ? ddVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8) : -1);
            if (ddVar.d && ddVar.s == -1) {
                i10 = ddVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
