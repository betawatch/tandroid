package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ uv(fy fyVar, long j10, boolean z10, int i10) {
        this.a = i10;
        this.b = fyVar;
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
        fy fyVar = this.b;
        switch (i10) {
            case 0:
                fy fyVar2 = this.b;
                lh.s6 storiesController = fyVar2.getMessagesController().getStoriesController();
                long j11 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                oc.i iVar = new oc.i(4);
                iVar.b = new uv(fyVar2, j11, z11, 1);
                iVar.c = new uv(fyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = fyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = fyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                fyVar2.O = org.telegram.ui.Components.tc.X().V(Collections.singletonList(chat), fyVar2.e4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, iVar).j();
                break;
            case 1:
                fyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                break;
            default:
                fyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                break;
        }
    }
}
