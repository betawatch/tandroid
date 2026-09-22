package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ se(bo boVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = boVar;
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
                bo boVar = this.b;
                boVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = boVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = boVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (boVar.h == null) {
                    boVar.getMessagesController().markMessageAsRead2(boVar.T5, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    boVar.getMessagesController().markMessageAsRead(boVar.T5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                bo boVar2 = this.b;
                boVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ug(boVar2, 13));
                if (boVar2.h6.isEmpty()) {
                    boVar2.Lb(false);
                    break;
                }
                break;
            case 3:
                bo boVar3 = this.b;
                boVar3.getClass();
                MessageObject messageObject3 = this.c;
                boVar3.Xa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == boVar3.L6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                bo boVar4 = this.b;
                boVar4.getClass();
                MessageObject messageObject4 = this.c;
                boVar4.Xa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == boVar4.L6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                bo boVar5 = this.b;
                boVar5.getClass();
                MessageObject messageObject5 = this.c;
                boVar5.F(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, messageObject5.getDialogId() == boVar5.L6 ? 1 : 0, 0, true, false);
                break;
            case 6:
                bo boVar6 = this.b;
                boVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    boVar6.ha(null, messageObject6);
                    break;
                }
            case 7:
                bo boVar7 = this.b;
                boVar7.getMessagesController().pinMessage(boVar7.e, boVar7.f, this.c.getId(), true, false, false);
                boVar7.A3 = null;
                break;
            default:
                bo boVar8 = this.b;
                org.telegram.ui.Components.vc.a0(boVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                boVar8.Fa(messageObject7);
                boVar8.Ha(messageObject7);
                break;
        }
    }
}
