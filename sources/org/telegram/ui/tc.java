package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class tc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ro0 a;
    public final sc b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ bd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.h = bdVar;
        Context context = getContext();
        g6Var = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        ro0 ro0Var = new ro0(context, g6Var);
        this.a = ro0Var;
        ro0Var.setProgressToGradient(1.0f);
        ro0Var.F = true;
        addView(ro0Var, w7.z5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
        long j10 = bdVar.a;
        g6Var2 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        sc scVar = new sc(this, context2, i10, j10, g6Var2);
        this.b = scVar;
        boolean z10 = bdVar.d;
        addView(scVar, w7.z5.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (bdVar instanceof d60) {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
            this.c = n5Var;
            n5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.k6.A8;
            n5Var.setTextColor(bdVar.getThemedColor(i11));
            n5Var.setTypeface(AndroidUtilities.bold());
            n5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            n5Var.setAlpha(0.0f);
            a();
            addView(n5Var, w7.z5.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.o1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(scVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((bdVar.d && bdVar.s == -1) ? bdVar.getThemedColor(i11) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.c;
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
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        n5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            f7 = z10 ? 4 : 0;
        }
        n5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        if (n5Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            n5Var.setTextColor((!bdVar.d || bdVar.s == -1) ? bdVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8) : -1);
            if (bdVar.d && bdVar.s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            this.e.setTextColor(i10);
        }
    }
}
