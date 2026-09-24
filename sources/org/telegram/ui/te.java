package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ te(wn wnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = wnVar;
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
                wn wnVar = this.b;
                wnVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = wnVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = wnVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (wnVar.h == null) {
                    wnVar.getMessagesController().markMessageAsRead2(wnVar.T5, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    wnVar.getMessagesController().markMessageAsRead(wnVar.T5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                wn wnVar2 = this.b;
                wnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new rg(wnVar2, 13));
                if (wnVar2.h6.isEmpty()) {
                    wnVar2.Lb(false);
                    break;
                }
                break;
            case 3:
                wn wnVar3 = this.b;
                wnVar3.getClass();
                MessageObject messageObject3 = this.c;
                wnVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == wnVar3.L6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                wn wnVar4 = this.b;
                wnVar4.getClass();
                MessageObject messageObject4 = this.c;
                wnVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == wnVar4.L6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                wn wnVar5 = this.b;
                wnVar5.getClass();
                MessageObject messageObject5 = this.c;
                wnVar5.F(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, messageObject5.getDialogId() == wnVar5.L6 ? 1 : 0, 0, true, false);
                break;
            case 6:
                wn wnVar6 = this.b;
                wnVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    wnVar6.ha(null, messageObject6);
                    break;
                }
            case 7:
                wn wnVar7 = this.b;
                wnVar7.getMessagesController().pinMessage(wnVar7.e, wnVar7.f, this.c.getId(), true, false, false);
                wnVar7.A3 = null;
                break;
            default:
                wn wnVar8 = this.b;
                org.telegram.ui.Components.yc.a0(wnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                wnVar8.Fa(messageObject7);
                wnVar8.Ha(messageObject7);
                break;
        }
    }
}
