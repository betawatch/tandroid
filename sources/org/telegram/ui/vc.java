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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class vc extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final po0 a;
    public final uc b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ dd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(dd ddVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.h = ddVar;
        Context context = getContext();
        d6Var = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        po0 po0Var = new po0(context, d6Var);
        this.a = po0Var;
        po0Var.setProgressToGradient(1.0f);
        po0Var.F = true;
        addView(po0Var, w7.z5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
        long j10 = ddVar.a;
        d6Var2 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        uc ucVar = new uc(this, context2, i10, j10, d6Var2);
        this.b = ucVar;
        boolean z10 = ddVar.d;
        addView(ucVar, w7.z5.a(z10 ? 230.0f : 190.0f, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f, -1, 80));
        if (ddVar instanceof b60) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            this.c = j5Var;
            j5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.h6.A8;
            j5Var.setTextColor(ddVar.getThemedColor(i11));
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            j5Var.setAlpha(0.0f);
            a();
            addView(j5Var, w7.z5.a(-2.0f, 72.0f, 0.0f, 0.0f, 16.0f, -1, 80));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.m1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ucVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((ddVar.d && ddVar.s == -1) ? ddVar.getThemedColor(i11) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ddVar.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.z5.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.z5.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f7;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        j5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            f7 = z10 ? 4 : 0;
        }
        j5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        if (j5Var != null) {
            dd ddVar = this.h;
            int i10 = -1;
            j5Var.setTextColor((!ddVar.d || ddVar.s == -1) ? ddVar.getThemedColor(org.telegram.ui.ActionBar.h6.A8) : -1);
            if (ddVar.d && ddVar.s == -1) {
                i10 = ddVar.getThemedColor(org.telegram.ui.ActionBar.h6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
