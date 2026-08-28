package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ tv(dy dyVar, long j10, boolean z10, int i9) {
        this.a = i9;
        this.b = dyVar;
        this.c = j10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i9 = this.a;
        boolean z10 = this.d;
        long j10 = this.c;
        dy dyVar = this.b;
        switch (i9) {
            case 0:
                dy dyVar2 = this.b;
                ih.v6 storiesController = dyVar2.getMessagesController().getStoriesController();
                long j11 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(1);
                e3Var.b = new tv(dyVar2, j11, z11, 1);
                e3Var.c = new tv(dyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = dyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = dyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                dyVar2.O = org.telegram.ui.Components.oc.X().V(Collections.singletonList(chat), dyVar2.e4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, e3Var).j();
                break;
            case 1:
                dyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                break;
            default:
                dyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                break;
        }
    }
}
