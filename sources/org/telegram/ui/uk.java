package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class uk extends org.telegram.ui.Components.pd {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ fo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(fo foVar, Context context, boolean z10) {
        super(context);
        this.f = foVar;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.pd
    public final void d() {
        int dp = this.e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.g6.ve;
        fo foVar = this.f;
        setBackground(org.telegram.ui.ActionBar.g6.X(AndroidUtilities.dp(19.0f), 436207615 & foVar.getThemedColor(i10), dp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(foVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(foVar.getThemedColor(i10));
    }

    @Override // org.telegram.ui.Components.pd
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
