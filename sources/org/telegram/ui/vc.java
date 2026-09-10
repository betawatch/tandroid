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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final gp0 a;
    public final uc b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ cd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(cd cdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.h = cdVar;
        Context context = getContext();
        f6Var = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
        gp0 gp0Var = new gp0(context, f6Var);
        this.a = gp0Var;
        gp0Var.setProgressToGradient(1.0f);
        gp0Var.F = true;
        addView(gp0Var, w7.a6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
        long j3 = cdVar.a;
        f6Var2 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
        uc ucVar = new uc(this, context2, i10, j3, f6Var2);
        this.b = ucVar;
        boolean z10 = cdVar.d;
        addView(ucVar, w7.a6.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (cdVar instanceof s60) {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            this.c = l5Var;
            l5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.j6.A8;
            l5Var.setTextColor(cdVar.getThemedColor(i11));
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            l5Var.setAlpha(0.0f);
            a();
            addView(l5Var, w7.a6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ucVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((cdVar.d && cdVar.s == -1) ? cdVar.getThemedColor(i11) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = cdVar.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.a6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.a6.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f7;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        l5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            f7 = z10 ? 4 : 0;
        }
        l5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        if (l5Var != null) {
            cd cdVar = this.h;
            int i10 = -1;
            l5Var.setTextColor((!cdVar.d || cdVar.s == -1) ? cdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8) : -1);
            if (cdVar.d && cdVar.s == -1) {
                i10 = cdVar.getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
