package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x41 extends org.telegram.ui.Components.k31 {
    public final /* synthetic */ StickersActivity b;

    public x41(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // org.telegram.ui.Components.k31
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i3;
        StickersActivity stickersActivity = this.b;
        i3 = ((org.telegram.ui.ActionBar.d2) stickersActivity).currentAccount;
        org.telegram.messenger.li.b0(i3).f2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override // org.telegram.ui.Components.k31
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i3;
        StickersActivity stickersActivity = this.b;
        i3 = ((org.telegram.ui.ActionBar.d2) stickersActivity).currentAccount;
        org.telegram.messenger.li.b0(i3).f2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
