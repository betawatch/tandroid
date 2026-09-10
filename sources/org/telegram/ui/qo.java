package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;

    public /* synthetic */ qo(yo yoVar, int i10) {
        this.a = i10;
        this.b = yoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yo.V(this.b);
                break;
            case 1:
                yo.a0(this.b);
                break;
            case 2:
                yo yoVar = this.b;
                yoVar.b.dismiss();
                yoVar.finishFragment();
                break;
            case 3:
                yo yoVar2 = this.b;
                yoVar2.M.setChecked(yoVar2.x0.autotranslation);
                break;
            default:
                yo yoVar3 = this.b;
                yoVar3.e.setImageDrawable(yoVar3.r);
                yoVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = yoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    yoVar3.getMessagesController().putUser(yoVar3.D0, true);
                }
                yoVar3.O0 = true;
                if (yoVar3.R0 == null) {
                    yoVar3.R0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                yoVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                yoVar3.b0.e.setAnimation(yoVar3.R0);
                break;
        }
    }
}
