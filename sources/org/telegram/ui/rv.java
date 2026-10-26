package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rv(cy cyVar, long j10, boolean z10, int i10) {
        this.a = i10;
        this.b = cyVar;
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
        cy cyVar = this.b;
        switch (i10) {
            case 0:
                cy cyVar2 = this.b;
                di.h7 storiesController = cyVar2.getMessagesController().getStoriesController();
                long j11 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                m4.c cVar = new m4.c(9, false);
                cVar.b = new rv(cyVar2, j11, z11, 1);
                cVar.c = new rv(cyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = cyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = cyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                cyVar2.S = org.telegram.ui.Components.wc.Y().W(Collections.singletonList(chat), cyVar2.m4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, cVar).j();
                break;
            case 1:
                cyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                break;
            default:
                cyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                break;
        }
    }
}
