package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t81 extends q11 {
    public boolean f2;
    public final /* synthetic */ u81 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(u81 u81Var, u81 u81Var2, Activity activity) {
        super(u81Var2, activity, false, null, 3, null);
        this.g2 = u81Var;
        this.f2 = true;
    }

    @Override // org.telegram.ui.q11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f2) {
            this.f2 = false;
            this.g2.f.s(null);
        }
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        u81 u81Var = this.g2;
        i7 = ((org.telegram.ui.ActionBar.g2) u81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.i10.i(i7).f0)) {
            org.telegram.messenger.ri mediaDataController = u81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.g2) u81Var).currentAccount;
            TLRPC.TL_messages_stickerSet p02 = mediaDataController.p0(org.telegram.messenger.i10.i(i10).f0);
            if ((p02 == null ? 0L : p02.set.id) == org.telegram.messenger.ri.s0(document)) {
                z10 = true;
            }
        }
        u81Var.g0(l10, z10);
    }
}
