package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y91 extends org.telegram.ui.Components.e41 {
    public final /* synthetic */ StickersActivity b;

    public y91(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // org.telegram.ui.Components.e41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i9;
        StickersActivity stickersActivity = this.b;
        i9 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i9).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override // org.telegram.ui.Components.e41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i9;
        StickersActivity stickersActivity = this.b;
        i9 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i9).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
