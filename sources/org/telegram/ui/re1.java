package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class re1 extends z61 {
    public boolean d2;
    public final /* synthetic */ se1 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re1(se1 se1Var, se1 se1Var2, Activity activity) {
        super(se1Var2, activity, false, null, 3, null);
        this.e2 = se1Var;
        this.d2 = true;
    }

    @Override // org.telegram.ui.z61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d2) {
            this.d2 = false;
            this.e2.f.s(null);
        }
    }

    @Override // org.telegram.ui.z61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        se1 se1Var = this.e2;
        i10 = ((org.telegram.ui.ActionBar.n2) se1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = se1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.n2) se1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        se1Var.b0(l4, z10);
    }
}
