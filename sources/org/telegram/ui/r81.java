package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r81 extends n11 {
    public boolean f2;
    public final /* synthetic */ s81 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(s81 s81Var, s81 s81Var2, Activity activity) {
        super(s81Var2, activity, false, null, 3, null);
        this.g2 = s81Var;
        this.f2 = true;
    }

    @Override // org.telegram.ui.n11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f2) {
            this.f2 = false;
            this.g2.f.s(null);
        }
    }

    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        s81 s81Var = this.g2;
        i7 = ((org.telegram.ui.ActionBar.e2) s81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.m10.i(i7).f0)) {
            org.telegram.messenger.si mediaDataController = s81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.e2) s81Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.m10.i(i10).f0);
            if ((n02 == null ? 0L : n02.set.id) == org.telegram.messenger.si.q0(document)) {
                z10 = true;
            }
        }
        s81Var.g0(l10, z10);
    }
}
