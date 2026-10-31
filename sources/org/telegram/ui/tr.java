package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tr {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final LinearLayout b;
    public final yo0 c;

    public tr(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.yf0 yf0Var, yo0 yo0Var) {
        this.c = yo0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.cd.L0(2131753756, null), false, null);
        c10.setOnClickListener(new sr(yf0Var, 0));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View a5Var = new org.telegram.ui.Cells.a5(contextThemeWrapper, 14);
        a5Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        a5Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a5Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a5Var.getLayoutParams();
        if (org.telegram.messenger.cd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(8.0f);
        a5Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}
