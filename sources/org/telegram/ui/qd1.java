package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qd1 extends b61 {
    public boolean Z1;
    public final /* synthetic */ rd1 a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd1(rd1 rd1Var, rd1 rd1Var2, Activity activity) {
        super(rd1Var2, activity, false, null, 3, null);
        this.a2 = rd1Var;
        this.Z1 = true;
    }

    @Override // org.telegram.ui.b61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f.s(null);
        }
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i9;
        int i10;
        rd1 rd1Var = this.a2;
        i9 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i9).defaultTopicIcons)) {
            MediaDataController mediaDataController = rd1Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i10).defaultTopicIcons);
            if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.id) == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        rd1Var.a0(l10, z10);
    }
}
