package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v81 extends r11 {
    public boolean f2;
    public final /* synthetic */ w81 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v81(w81 w81Var, w81 w81Var2, Activity activity) {
        super(w81Var2, activity, false, null, 3, null);
        this.g2 = w81Var;
        this.f2 = true;
    }

    @Override // org.telegram.ui.r11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f2) {
            this.f2 = false;
            this.g2.f.s(null);
        }
    }

    @Override // org.telegram.ui.r11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        w81 w81Var = this.g2;
        i7 = ((org.telegram.ui.ActionBar.h2) w81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.j10.i(i7).f0)) {
            org.telegram.messenger.ri mediaDataController = w81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.h2) w81Var).currentAccount;
            TLRPC.TL_messages_stickerSet p02 = mediaDataController.p0(org.telegram.messenger.j10.i(i10).f0);
            if ((p02 == null ? 0L : p02.set.id) == org.telegram.messenger.ri.s0(document)) {
                z10 = true;
            }
        }
        w81Var.g0(l10, z10);
    }
}
