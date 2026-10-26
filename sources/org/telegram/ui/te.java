package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ te(un unVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = unVar;
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
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                        this.b.createArticleViewer(false).N(messageObject, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                un unVar = this.b;
                unVar.getClass();
                MessageObject messageObject2 = this.c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i10 = message.ttl;
                boolean z10 = i10 != Integer.MAX_VALUE;
                int i11 = i10 == Integer.MAX_VALUE ? 0 : i10;
                message.destroyTime = unVar.getConnectionsManager().getCurrentTime() + i11;
                messageObject2.messageOwner.destroyTimeMillis = unVar.getConnectionsManager().getCurrentTimeMillis() + (i11 * 1000);
                if (unVar.h == null) {
                    unVar.getMessagesController().markMessageAsRead2(unVar.f6, messageObject2.getId(), null, i11, 0L, z10);
                    break;
                } else {
                    unVar.getMessagesController().markMessageAsRead(unVar.f6, messageObject2.messageOwner.random_id, i11);
                    break;
                }
            case 2:
                int id2 = this.c.getId();
                un unVar2 = this.b;
                unVar2.gb(id2, 0, true, 0, true, 0, null, null, new jg(unVar2, 15));
                if (unVar2.t6.isEmpty()) {
                    unVar2.Xb(false);
                    break;
                }
                break;
            case 3:
                un unVar3 = this.b;
                unVar3.getClass();
                MessageObject messageObject3 = this.c;
                unVar3.gb(messageObject3.getReplyMsgId(), messageObject3.messageOwner.id, true, messageObject3.getDialogId() == unVar3.X6 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                break;
            case 4:
                un unVar4 = this.b;
                unVar4.getClass();
                MessageObject messageObject4 = this.c;
                unVar4.gb(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == unVar4.X6 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                un unVar5 = this.b;
                unVar5.getClass();
                MessageObject messageObject5 = this.c;
                unVar5.j(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == unVar5.X6 ? 1 : 0, false, 0);
                break;
            case 6:
                un unVar6 = this.b;
                unVar6.getClass();
                MessageObject messageObject6 = this.c;
                if (!messageObject6.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject6);
                    break;
                } else {
                    unVar6.ra(null, messageObject6);
                    break;
                }
            case 7:
                un unVar7 = this.b;
                unVar7.getMessagesController().pinMessage(unVar7.e, unVar7.f, this.c.getId(), true, false, false);
                unVar7.M3 = null;
                break;
            default:
                un unVar8 = this.b;
                org.telegram.ui.Components.wc.b0(unVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.c;
                unVar8.Oa(messageObject7);
                unVar8.Qa(messageObject7);
                break;
        }
    }
}
