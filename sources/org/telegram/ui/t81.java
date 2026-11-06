package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class t81 extends q11 {
    public boolean e2;
    public final /* synthetic */ u81 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(u81 u81Var, u81 u81Var2, Activity activity) {
        super(u81Var2, activity, false, null, 3, null);
        this.f2 = u81Var;
        this.e2 = true;
    }

    @Override // org.telegram.ui.q11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.e2) {
            this.e2 = false;
            this.f2.f.s(null);
        }
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        u81 u81Var = this.f2;
        i7 = ((org.telegram.ui.ActionBar.f2) u81Var).currentAccount;
        boolean z9 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.p10.i(i7).e0)) {
            org.telegram.messenger.ui mediaDataController = u81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.f2) u81Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.p10.i(i10).e0);
            if ((n02 == null ? 0L : n02.set.id) == org.telegram.messenger.ui.q0(document)) {
                z9 = true;
            }
        }
        u81Var.g0(l10, z9);
    }
}
