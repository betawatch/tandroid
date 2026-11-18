package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vq {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final LinearLayout b;
    public final qn0 c;

    public vq(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.if0 if0Var, qn0 qn0Var) {
        this.c = qn0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.gd.M0(2131753754, null), false, null);
        c10.setOnClickListener(new uq(if0Var, 0));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View p2Var = new bi.p2(contextThemeWrapper, 12);
        p2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        p2Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p2Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) p2Var.getLayoutParams();
        if (org.telegram.messenger.gd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        p2Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}
