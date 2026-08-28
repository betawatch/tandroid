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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wu extends org.telegram.ui.Components.kx0 {
    public final /* synthetic */ g5.b E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(Context context, long j10, g5.b bVar) {
        super(context);
        this.E = bVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.r = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, false, false);
        this.s = i6Var2;
        i6Var.setCallback(this);
        i6Var2.setCallback(this);
        this.n = Long.valueOf(j10);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            z8Var.g(14);
            imageReceiver.setForUserOrChat(null, z8Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, z8Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.kx0
    public final void b() {
        g5.b bVar = this.E;
        y6 y6Var = (y6) bVar.c;
        y6Var.P.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((r6) bVar.b).a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
