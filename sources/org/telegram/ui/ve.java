package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ ve(yn ynVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = ynVar;
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
                yn ynVar = this.b;
                ynVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = ynVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = ynVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (ynVar.h == null) {
                    ynVar.getMessagesController().markMessageAsRead2(ynVar.R5, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    ynVar.getMessagesController().markMessageAsRead(ynVar.R5, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                yn ynVar2 = this.b;
                ynVar2.getClass();
                MessageObject messageObject3 = this.c;
                ynVar2.Wa(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == ynVar2.J6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 3:
                yn ynVar3 = this.b;
                ynVar3.getClass();
                MessageObject messageObject4 = this.c;
                ynVar3.Wa(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == ynVar3.J6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 4:
                yn ynVar4 = this.b;
                ynVar4.getClass();
                MessageObject messageObject5 = this.c;
                ynVar4.D(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, messageObject5.getDialogId() == ynVar4.J6 ? 1 : 0, 0, true, false);
                break;
            case 5:
                int id2 = this.c.getId();
                yn ynVar5 = this.b;
                ynVar5.Wa(id2, 0, true, 0, true, 0, null, null, new yf(ynVar5, 13));
                if (ynVar5.f6.isEmpty()) {
                    ynVar5.Kb(false);
                    break;
                }
                break;
            case 6:
                yn ynVar6 = this.b;
                ynVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    ynVar6.ga(null, messageObject6);
                    break;
                }
            case 7:
                yn ynVar7 = this.b;
                ynVar7.getMessagesController().pinMessage(ynVar7.e, ynVar7.f, this.c.getId(), true, false, false);
                ynVar7.y3 = null;
                break;
            default:
                yn ynVar8 = this.b;
                org.telegram.ui.Components.yc.a0(ynVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                ynVar8.Ea(messageObject7);
                ynVar8.Ga(messageObject7);
                break;
        }
    }
}
