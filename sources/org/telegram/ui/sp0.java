package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sp0 extends LinearLayout {
    public final org.telegram.ui.Components.m90 a;
    public final org.telegram.ui.Components.m90 b;
    public final /* synthetic */ up0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(up0 up0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.c = up0Var;
        setOrientation(1);
        bq0 bq0Var = up0Var.p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.hj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.a6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        f6Var = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
        org.telegram.ui.Components.m90 a2 = w7.e6.a(context2, 14.0f, i10, false, f6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(LocaleController.getString(up0Var.m0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(a2, w7.a6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        f6Var2 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
        org.telegram.ui.Components.m90 a10 = w7.e6.a(context3, 14.0f, i11, false, f6Var2);
        this.b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new ql0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.a6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        bq0 bq0Var = this.c.p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.a.setTextColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        int themedColor = bq0Var.getThemedColor(i10);
        org.telegram.ui.Components.m90 m90Var = this.b;
        m90Var.setTextColor(themedColor);
        m90Var.setLinkTextColor(bq0Var.getThemedColor(i10));
    }
}
