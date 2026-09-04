package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class tp0 extends LinearLayout {
    public final org.telegram.ui.Components.d90 a;
    public final org.telegram.ui.Components.d90 b;
    public final /* synthetic */ vp0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(vp0 vp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.c = vp0Var;
        setOrientation(1);
        bq0 bq0Var = vp0Var.p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(getContext());
        x9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(x9Var, w7.x5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        f6Var = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        org.telegram.ui.Components.d90 a2 = w7.b6.a(context2, 14.0f, i10, false, f6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(LocaleController.getString(vp0Var.m0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(a2, w7.x5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        f6Var2 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        org.telegram.ui.Components.d90 a10 = w7.b6.a(context3, 14.0f, i11, false, f6Var2);
        this.b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new rl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.x5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        bq0 bq0Var = this.c.p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.a.setTextColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        int themedColor = bq0Var.getThemedColor(i10);
        org.telegram.ui.Components.d90 d90Var = this.b;
        d90Var.setTextColor(themedColor);
        d90Var.setLinkTextColor(bq0Var.getThemedColor(i10));
    }
}
