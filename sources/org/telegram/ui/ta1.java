package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ta1 extends org.telegram.ui.Components.a51 {
    public final /* synthetic */ StickersActivity b;

    public ta1(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // org.telegram.ui.Components.a51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4) {
        int i10;
        StickersActivity stickersActivity = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override // org.telegram.ui.Components.a51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i10;
        StickersActivity stickersActivity = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
