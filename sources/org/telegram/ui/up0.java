package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class up0 extends LinearLayout {
    public final org.telegram.ui.Components.l90 a;
    public final org.telegram.ui.Components.l90 b;
    public final /* synthetic */ wp0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(wp0 wp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.c = wp0Var;
        setOrientation(1);
        cq0 cq0Var = wp0Var.p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.y5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        e6Var = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
        org.telegram.ui.Components.l90 a2 = w7.c6.a(context2, 14.0f, i10, false, e6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(LocaleController.getString(wp0Var.m0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(a2, w7.y5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        e6Var2 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
        org.telegram.ui.Components.l90 a10 = w7.c6.a(context3, 14.0f, i11, false, e6Var2);
        this.b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new sl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.y5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        cq0 cq0Var = this.c.p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.a.setTextColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        int themedColor = cq0Var.getThemedColor(i10);
        org.telegram.ui.Components.l90 l90Var = this.b;
        l90Var.setTextColor(themedColor);
        l90Var.setLinkTextColor(cq0Var.getThemedColor(i10));
    }
}
