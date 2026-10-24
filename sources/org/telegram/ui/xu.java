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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xu extends org.telegram.ui.Components.az0 {
    public final /* synthetic */ mi.q I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(Context context, long j10, mi.q qVar) {
        super(context);
        this.I = qVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        this.r = p6Var;
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, true, false);
        this.s = p6Var2;
        p6Var.setCallback(this);
        p6Var2.setCallback(this);
        this.n = Long.valueOf(j10);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            h9Var.g(14);
            imageReceiver.setForUserOrChat(null, h9Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, h9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.az0
    public final void b() {
        mi.q qVar = this.I;
        c7 c7Var = (c7) qVar.c;
        c7Var.T.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((v6) qVar.b).a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        c7Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
