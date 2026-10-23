package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ se(sn snVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = snVar;
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
                    LaunchActivity launchActivity = LaunchActivity.J1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.J1.P().l(messageObject) == null) {
                        this.b.createArticleViewer(false).N(messageObject, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                sn snVar = this.b;
                snVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = snVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = snVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (snVar.h == null) {
                    snVar.getMessagesController().markMessageAsRead2(snVar.f6, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    snVar.getMessagesController().markMessageAsRead(snVar.f6, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                sn snVar2 = this.b;
                snVar2.getClass();
                MessageObject messageObject3 = this.c;
                snVar2.bb(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == snVar2.X6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 3:
                sn snVar3 = this.b;
                snVar3.getClass();
                MessageObject messageObject4 = this.c;
                snVar3.bb(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == snVar3.X6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 4:
                sn snVar4 = this.b;
                snVar4.getClass();
                MessageObject messageObject5 = this.c;
                snVar4.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == snVar4.X6 ? 1 : 0, false, 0);
                break;
            case 5:
                int id2 = this.c.getId();
                sn snVar5 = this.b;
                snVar5.bb(id2, 0, true, 0, true, 0, null, null, new kf(snVar5, 24));
                if (snVar5.t6.isEmpty()) {
                    snVar5.Rb(false);
                    break;
                }
                break;
            case 6:
                sn snVar6 = this.b;
                snVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    snVar6.ma(null, messageObject6);
                    break;
                }
            case 7:
                sn snVar7 = this.b;
                snVar7.getMessagesController().pinMessage(snVar7.e, snVar7.f, this.c.getId(), true, false, false);
                snVar7.M3 = null;
                break;
            default:
                sn snVar8 = this.b;
                org.telegram.ui.Components.xc.a0(snVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                snVar8.Ja(messageObject7);
                snVar8.La(messageObject7);
                break;
        }
    }
}
