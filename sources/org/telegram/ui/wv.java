package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ wv(gy gyVar, long j10, boolean z10, int i10) {
        this.a = i10;
        this.b = gyVar;
        this.c = j10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i10 = this.a;
        boolean z10 = this.d;
        long j10 = this.c;
        gy gyVar = this.b;
        switch (i10) {
            case 0:
                gy gyVar2 = this.b;
                jh.s6 storiesController = gyVar2.getMessagesController().getStoriesController();
                long j11 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                i6 i6Var = new i6(2);
                i6Var.b = new wv(gyVar2, j11, z11, 1);
                i6Var.c = new wv(gyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = gyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = gyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                gyVar2.O = org.telegram.ui.Components.mc.X().V(Collections.singletonList(chat), gyVar2.e4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, i6Var).j();
                break;
            case 1:
                gyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                break;
            default:
                gyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                break;
        }
    }
}
