package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xd1 extends f61 {
    public boolean e2;
    public final /* synthetic */ yd1 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(yd1 yd1Var, yd1 yd1Var2, Activity activity) {
        super(yd1Var2, activity, false, null, 3, null);
        this.f2 = yd1Var;
        this.e2 = true;
    }

    @Override // org.telegram.ui.f61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.e2) {
            this.e2 = false;
            this.f2.f.s(null);
        }
    }

    @Override // org.telegram.ui.f61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        yd1 yd1Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = yd1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        yd1Var.c0(l4, z10);
    }
}
