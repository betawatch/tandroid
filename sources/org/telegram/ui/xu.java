package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xu extends org.telegram.ui.Components.vx0 {
    public final /* synthetic */ oc.i E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(Context context, long j10, oc.i iVar) {
        super(context);
        this.E = iVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.r = n6Var;
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, true, false, false);
        this.s = n6Var2;
        n6Var.setCallback(this);
        n6Var2.setCallback(this);
        this.n = Long.valueOf(j10);
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            e9Var.g(14);
            imageReceiver.setForUserOrChat(null, e9Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, e9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.vx0
    public final void b() {
        oc.i iVar = this.E;
        x6 x6Var = (x6) iVar.c;
        x6Var.P.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((q6) iVar.b).a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        x6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
