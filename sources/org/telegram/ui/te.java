package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ te(co coVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = coVar;
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
                co coVar = this.b;
                coVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = coVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = coVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (coVar.h == null) {
                    coVar.getMessagesController().markMessageAsRead2(coVar.T5, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    coVar.getMessagesController().markMessageAsRead(coVar.T5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                co coVar2 = this.b;
                coVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ug(coVar2, 13));
                if (coVar2.h6.isEmpty()) {
                    coVar2.Lb(false);
                    break;
                }
                break;
            case 3:
                co coVar3 = this.b;
                coVar3.getClass();
                MessageObject messageObject3 = this.c;
                coVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == coVar3.L6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                co coVar4 = this.b;
                coVar4.getClass();
                MessageObject messageObject4 = this.c;
                coVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == coVar4.L6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                co coVar5 = this.b;
                coVar5.getClass();
                MessageObject messageObject5 = this.c;
                coVar5.F(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, messageObject5.getDialogId() == coVar5.L6 ? 1 : 0, 0, true, false);
                break;
            case 6:
                co coVar6 = this.b;
                coVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    coVar6.ha(null, messageObject6);
                    break;
                }
            case 7:
                co coVar7 = this.b;
                coVar7.getMessagesController().pinMessage(coVar7.e, coVar7.f, this.c.getId(), true, false, false);
                coVar7.A3 = null;
                break;
            default:
                co coVar8 = this.b;
                org.telegram.ui.Components.yc.a0(coVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                coVar8.Fa(messageObject7);
                coVar8.Ha(messageObject7);
                break;
        }
    }
}
