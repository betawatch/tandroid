package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ ve(eo eoVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        switch (this.a) {
            case 0:
                MessageObject messageObject = this.c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.b.createArticleViewer(false).N(messageObject, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                eo eoVar = this.b;
                eoVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = eoVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = eoVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (eoVar.h == null) {
                    eoVar.getMessagesController().markMessageAsRead2(eoVar.T5, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    eoVar.getMessagesController().markMessageAsRead(eoVar.T5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                eo eoVar2 = this.b;
                eoVar2.Xa(id2, 0, true, 0, true, 0, null, null, new vg(eoVar2, 13));
                if (eoVar2.h6.isEmpty()) {
                    eoVar2.Lb(false);
                    break;
                }
                break;
            case 3:
                eo eoVar3 = this.b;
                eoVar3.getClass();
                MessageObject messageObject3 = this.c;
                eoVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == eoVar3.L6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                eo eoVar4 = this.b;
                eoVar4.getClass();
                MessageObject messageObject4 = this.c;
                eoVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == eoVar4.L6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                eo eoVar5 = this.b;
                eoVar5.getClass();
                MessageObject messageObject5 = this.c;
                eoVar5.E(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, messageObject5.getDialogId() == eoVar5.L6 ? 1 : 0, 0, true, false);
                break;
            case 6:
                eo eoVar6 = this.b;
                eoVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    eoVar6.ha(null, messageObject6);
                    break;
                }
            case 7:
                eo eoVar7 = this.b;
                eoVar7.getMessagesController().pinMessage(eoVar7.e, eoVar7.f, this.c.getId(), true, false, false);
                eoVar7.A3 = null;
                break;
            default:
                eo eoVar8 = this.b;
                org.telegram.ui.Components.wc.a0(eoVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                eoVar8.Fa(messageObject7);
                eoVar8.Ha(messageObject7);
                break;
        }
    }
}
