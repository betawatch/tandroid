package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ re(xn xnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = xnVar;
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
                xn xnVar = this.b;
                xnVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z4 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = xnVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = xnVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (xnVar.h == null) {
                    xnVar.getMessagesController().markMessageAsRead2(xnVar.Q5, messageObject2.getId(), null, i11, 0L, z4);
                    break;
                } else {
                    xnVar.getMessagesController().markMessageAsRead(xnVar.Q5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                xn xnVar2 = this.b;
                xnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ng(xnVar2, 13));
                if (xnVar2.e6.isEmpty()) {
                    xnVar2.Lb(false);
                    break;
                }
                break;
            case 3:
                xn xnVar3 = this.b;
                xnVar3.getClass();
                MessageObject messageObject3 = this.c;
                xnVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == xnVar3.I6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                xn xnVar4 = this.b;
                xnVar4.getClass();
                MessageObject messageObject4 = this.c;
                xnVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == xnVar4.I6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                xn xnVar5 = this.b;
                xnVar5.getClass();
                MessageObject messageObject5 = this.c;
                xnVar5.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == xnVar5.I6 ? 1 : 0, false, 0);
                break;
            case 6:
                xn xnVar6 = this.b;
                xnVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    xnVar6.ha(null, messageObject6);
                    break;
                }
            case 7:
                xn xnVar7 = this.b;
                xnVar7.getMessagesController().pinMessage(xnVar7.e, xnVar7.f, this.c.getId(), true, false, false);
                xnVar7.x3 = null;
                break;
            default:
                xn xnVar8 = this.b;
                org.telegram.ui.Components.qc.a0(xnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                xnVar8.Fa(messageObject7);
                xnVar8.Ha(messageObject7);
                break;
        }
    }
}
