package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ se(qn qnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = qnVar;
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
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                        this.b.createArticleViewer(false).N(messageObject, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                qn qnVar = this.b;
                qnVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = qnVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = qnVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (qnVar.h == null) {
                    qnVar.getMessagesController().markMessageAsRead2(qnVar.T5, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    qnVar.getMessagesController().markMessageAsRead(qnVar.T5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                MessageObject messageObject3 = this.c;
                qnVar2.bb(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == qnVar2.L6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 3:
                qn qnVar3 = this.b;
                qnVar3.getClass();
                MessageObject messageObject4 = this.c;
                qnVar3.bb(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == qnVar3.L6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 4:
                qn qnVar4 = this.b;
                qnVar4.getClass();
                MessageObject messageObject5 = this.c;
                qnVar4.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == qnVar4.L6 ? 1 : 0, false, 0);
                break;
            case 5:
                int id2 = this.c.getId();
                qn qnVar5 = this.b;
                qnVar5.bb(id2, 0, true, 0, true, 0, null, null, new kf(qnVar5, 23));
                if (qnVar5.h6.isEmpty()) {
                    qnVar5.Qb(false);
                    break;
                }
                break;
            case 6:
                qn qnVar6 = this.b;
                qnVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    qnVar6.ma(null, messageObject6);
                    break;
                }
            case 7:
                qn qnVar7 = this.b;
                qnVar7.getMessagesController().pinMessage(qnVar7.e, qnVar7.f, this.c.getId(), true, false, false);
                qnVar7.A3 = null;
                break;
            default:
                qn qnVar8 = this.b;
                org.telegram.ui.Components.xc.a0(qnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                qnVar8.Ja(messageObject7);
                qnVar8.La(messageObject7);
                break;
        }
    }
}
