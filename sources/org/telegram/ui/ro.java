package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo b;

    public /* synthetic */ ro(zo zoVar, int i10) {
        this.a = i10;
        this.b = zoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zo.V(this.b);
                break;
            case 1:
                zo.a0(this.b);
                break;
            case 2:
                zo zoVar = this.b;
                zoVar.b.dismiss();
                zoVar.finishFragment();
                break;
            case 3:
                zo zoVar2 = this.b;
                zoVar2.M.setChecked(zoVar2.x0.autotranslation);
                break;
            default:
                zo zoVar3 = this.b;
                zoVar3.e.setImageDrawable(zoVar3.r);
                zoVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = zoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    zoVar3.getMessagesController().putUser(zoVar3.D0, true);
                }
                zoVar3.O0 = true;
                if (zoVar3.R0 == null) {
                    zoVar3.R0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                zoVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                zoVar3.b0.e.setAnimation(zoVar3.R0);
                break;
        }
    }
}
