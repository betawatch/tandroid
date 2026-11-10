package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w81 extends t11 {
    public boolean e2;
    public final /* synthetic */ x81 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(x81 x81Var, x81 x81Var2, Activity activity) {
        super(x81Var2, activity, false, null, 3, null);
        this.f2 = x81Var;
        this.e2 = true;
    }

    @Override // org.telegram.ui.t11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.e2) {
            this.e2 = false;
            this.f2.f.s(null);
        }
    }

    @Override // org.telegram.ui.t11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        x81 x81Var = this.f2;
        i7 = ((org.telegram.ui.ActionBar.f2) x81Var).currentAccount;
        boolean z9 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.p10.i(i7).e0)) {
            org.telegram.messenger.ui mediaDataController = x81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.f2) x81Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.p10.i(i10).e0);
            if ((n02 == null ? 0L : n02.set.id) == org.telegram.messenger.ui.q0(document)) {
                z9 = true;
            }
        }
        x81Var.g0(l10, z9);
    }
}
