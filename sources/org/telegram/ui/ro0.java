package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ro0 extends LinearLayout {
    public final org.telegram.ui.Components.y80 a;
    public final org.telegram.ui.Components.y80 b;
    public final /* synthetic */ to0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro0(to0 to0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.c = to0Var;
        setOrientation(1);
        yo0 yo0Var = to0Var.f0;
        setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getContext());
        t9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), "utyan_draw", AndroidUtilities.dp(120.0f)));
        addView(t9Var, i7.f6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.g6.y6;
        c6Var = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
        org.telegram.ui.Components.y80 a2 = i7.j6.a(context2, 14.0f, i10, false, c6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(LocaleController.getString(to0Var.c0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(a2, i7.f6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.g6.gc;
        c6Var2 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
        org.telegram.ui.Components.y80 a10 = i7.j6.a(context3, 14.0f, i11, false, c6Var2);
        this.b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new vk0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, i7.f6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        yo0 yo0Var = this.c.f0;
        setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        this.a.setTextColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.y6));
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        int themedColor = yo0Var.getThemedColor(i10);
        org.telegram.ui.Components.y80 y80Var = this.b;
        y80Var.setTextColor(themedColor);
        y80Var.setLinkTextColor(yo0Var.getThemedColor(i10));
    }
}
