package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class to0 extends LinearLayout {
    public final org.telegram.ui.Components.p80 a;
    public final org.telegram.ui.Components.p80 b;
    public final /* synthetic */ vo0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to0(vo0 vo0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.c = vo0Var;
        setOrientation(1);
        ap0 ap0Var = vo0Var.f0;
        setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getContext());
        n9Var.setImageDrawable(new org.telegram.ui.Components.oi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), "utyan_draw", AndroidUtilities.dp(120.0f)));
        addView(n9Var, h7.z5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.g6.y6;
        c6Var = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
        org.telegram.ui.Components.p80 a2 = h7.d6.a(context2, 14.0f, i10, false, c6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(LocaleController.getString(vo0Var.c0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(a2, h7.z5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.g6.gc;
        c6Var2 = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
        org.telegram.ui.Components.p80 a3 = h7.d6.a(context3, 14.0f, i11, false, c6Var2);
        this.b = a3;
        a3.setGravity(17);
        a3.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new zk0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a3, h7.z5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        ap0 ap0Var = this.c.f0;
        setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        this.a.setTextColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        int themedColor = ap0Var.getThemedColor(i10);
        org.telegram.ui.Components.p80 p80Var = this.b;
        p80Var.setTextColor(themedColor);
        p80Var.setLinkTextColor(ap0Var.getThemedColor(i10));
    }
}
