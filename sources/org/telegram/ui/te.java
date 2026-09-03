package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ te(zn znVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = znVar;
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
                    LaunchActivity launchActivity = LaunchActivity.D1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                        this.b.createArticleViewer(false).N(messageObject, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                zn znVar = this.b;
                znVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z4 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = znVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = znVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (znVar.h == null) {
                    znVar.getMessagesController().markMessageAsRead2(znVar.Q5, messageObject2.getId(), null, i11, 0L, z4);
                    break;
                } else {
                    znVar.getMessagesController().markMessageAsRead(znVar.Q5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                zn znVar2 = this.b;
                znVar2.Xa(id2, 0, true, 0, true, 0, null, null, new pg(znVar2, 13));
                if (znVar2.e6.isEmpty()) {
                    znVar2.Lb(false);
                    break;
                }
                break;
            case 3:
                zn znVar3 = this.b;
                znVar3.getClass();
                MessageObject messageObject3 = this.c;
                znVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == znVar3.I6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                zn znVar4 = this.b;
                znVar4.getClass();
                MessageObject messageObject4 = this.c;
                znVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == znVar4.I6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                zn znVar5 = this.b;
                znVar5.getClass();
                MessageObject messageObject5 = this.c;
                znVar5.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == znVar5.I6 ? 1 : 0, false, 0);
                break;
            case 6:
                zn znVar6 = this.b;
                znVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    znVar6.ha(null, messageObject6);
                    break;
                }
            case 7:
                zn znVar7 = this.b;
                znVar7.getMessagesController().pinMessage(znVar7.e, znVar7.f, this.c.getId(), true, false, false);
                znVar7.x3 = null;
                break;
            default:
                zn znVar8 = this.b;
                org.telegram.ui.Components.qc.a0(znVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                znVar8.Fa(messageObject7);
                znVar8.Ha(messageObject7);
                break;
        }
    }
}
