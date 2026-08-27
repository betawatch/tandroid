package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rd1 extends a61 {
    public boolean Z1;
    public final /* synthetic */ sd1 a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd1(sd1 sd1Var, sd1 sd1Var2, Activity activity) {
        super(sd1Var2, activity, false, null, 3, null);
        this.a2 = sd1Var;
        this.Z1 = true;
    }

    @Override // org.telegram.ui.a61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f.s(null);
        }
    }

    @Override // org.telegram.ui.a61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        sd1 sd1Var = this.a2;
        i10 = ((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = sd1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        sd1Var.b0(l10, z10);
    }
}
