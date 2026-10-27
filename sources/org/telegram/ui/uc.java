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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uc extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final zo0 a;
    public final tc b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ bd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(bd bdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var2;
        this.h = bdVar;
        Context context = getContext();
        u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        zo0 zo0Var = new zo0(context, u6Var);
        this.a = zo0Var;
        zo0Var.setProgressToGradient(1.0f);
        zo0Var.F = true;
        addView(zo0Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
        long j10 = bdVar.a;
        u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        tc tcVar = new tc(this, context2, i10, j10, u6Var2);
        this.b = tcVar;
        boolean z10 = bdVar.d;
        addView(tcVar, org.telegram.ui.Components.kb1.h(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (bdVar instanceof g60) {
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
            this.c = b6Var;
            b6Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.y6.A8;
            b6Var.setTextColor(bdVar.getThemedColor(i11));
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            b6Var.setAlpha(0.0f);
            a();
            addView(b6Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.y6.h0(org.telegram.ui.ActionBar.y6.o1(0.065f, -16777216), -16777216));
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
            linearLayout.addView(textView2, org.telegram.ui.Components.kb1.o(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, org.telegram.ui.Components.kb1.i(-1, -2, 80));
        }
    }

    public final void a() {
        float f7;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        b6Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            f7 = z10 ? 4 : 0;
        }
        b6Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (b6Var != null) {
            bd bdVar = this.h;
            int i10 = -1;
            b6Var.setTextColor((!bdVar.d || bdVar.s == -1) ? bdVar.getThemedColor(org.telegram.ui.ActionBar.y6.A8) : -1);
            if (bdVar.d && bdVar.s == -1) {
                i10 = bdVar.getThemedColor(org.telegram.ui.ActionBar.y6.A8);
            }
            this.e.setTextColor(i10);
        }
    }
}
