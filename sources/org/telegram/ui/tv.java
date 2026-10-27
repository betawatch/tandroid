package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ tv(ey eyVar, long j10, boolean z10, int i10) {
        this.a = i10;
        this.b = eyVar;
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
        ey eyVar = this.b;
        switch (i10) {
            case 0:
                ey eyVar2 = this.b;
                di.h7 storiesController = eyVar2.getMessagesController().getStoriesController();
                long j11 = this.c;
                boolean z11 = this.d;
                storiesController.l0(j11, z11, false);
                m4.c cVar = new m4.c(9, false);
                cVar.b = new tv(eyVar2, j11, z11, 1);
                cVar.c = new tv(eyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = eyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = eyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                eyVar2.S = org.telegram.ui.Components.wc.Y().W(Collections.singletonList(chat), eyVar2.m4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, cVar).j();
                break;
            case 1:
                eyVar.getMessagesController().getStoriesController().l0(j10, !z10, false);
                break;
            default:
                eyVar.getMessagesController().getStoriesController().l0(j10, z10, true);
                break;
        }
    }
}
