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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class uc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final hp0 a;
    public final tc b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ bd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.h = bdVar;
        Context context = getContext();
        f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        hp0 hp0Var = new hp0(context, f6Var);
        this.a = hp0Var;
        hp0Var.setProgressToGradient(1.0f);
        hp0Var.F = true;
        addView(hp0Var, w7.x5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
        long j3 = bdVar.a;
        f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        tc tcVar = new tc(this, context2, i10, j3, f6Var2);
        this.b = tcVar;
        boolean z10 = bdVar.d;
        addView(tcVar, w7.x5.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (bdVar instanceof t60) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            this.c = j5Var;
            j5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.j6.A8;
            j5Var.setTextColor(bdVar.getThemedColor(i11));
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            j5Var.setAlpha(0.0f);
            a();
            addView(j5Var, w7.x5.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.l1(0.065f, -16777216), -16777216));
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
            linearLayout.addView(textView2, w7.x5.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.x5.e(-1, -2, 80));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        if (j5Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            j5Var.setTextColor((!bdVar.d || bdVar.s == -1) ? bdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8) : -1);
            if (bdVar.d && bdVar.s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
