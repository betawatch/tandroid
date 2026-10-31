package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.messenger.jj c;

    public /* synthetic */ ue(un unVar, org.telegram.messenger.jj jjVar, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i10 = this.a;
        un unVar = this.b;
        org.telegram.messenger.jj jjVar = this.c;
        switch (i10) {
            case 0:
                TLRPC.MessageMedia messageMedia = jjVar.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(jjVar) == null) {
                        unVar.createArticleViewer(false).L(jjVar, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                unVar.getClass();
                TLRPC.Message message = jjVar.k;
                int i11 = message.ttl;
                boolean z10 = i11 != Integer.MAX_VALUE;
                int i12 = i11 == Integer.MAX_VALUE ? 0 : i11;
                message.destroyTime = unVar.getConnectionsManager().getCurrentTime() + i12;
                jjVar.k.destroyTimeMillis = unVar.getConnectionsManager().getCurrentTimeMillis() + (i12 * 1000);
                if (unVar.h == null) {
                    unVar.getMessagesController().n3(unVar.j6, jjVar.f1(), null, i12, 0L, z10);
                    break;
                } else {
                    unVar.getMessagesController().m3(unVar.j6, i12, jjVar.k.random_id);
                    break;
                }
            case 2:
                int f12 = jjVar.f1();
                un unVar2 = this.b;
                unVar2.nb(f12, 0, true, 0, true, 0, null, null, new lg(unVar2, 13));
                if (unVar2.x6.isEmpty()) {
                    unVar2.ec(false);
                    break;
                }
                break;
            case 3:
                un unVar3 = this.b;
                unVar3.getClass();
                int O1 = jjVar.O1();
                TLRPC.Message message2 = jjVar.k;
                unVar3.nb(O1, message2.id, true, org.telegram.messenger.jj.B0(message2) == unVar3.b7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) jjVar.k.action).answer.option, null);
                break;
            case 4:
                un unVar4 = this.b;
                unVar4.getClass();
                int O12 = jjVar.O1();
                TLRPC.Message message3 = jjVar.k;
                unVar4.nb(O12, message3.id, true, org.telegram.messenger.jj.B0(message3) == unVar4.b7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                un unVar5 = this.b;
                unVar5.getClass();
                int O13 = jjVar.O1();
                TLRPC.Message message4 = jjVar.k;
                unVar5.k(O13, message4.id, true, org.telegram.messenger.jj.B0(message4) == unVar5.b7 ? 1 : 0, false, 0);
                break;
            case 6:
                if (!org.telegram.messenger.jj.L4(jjVar.k)) {
                    MediaController.B().S(jjVar);
                    break;
                } else {
                    unVar.xa(null, jjVar);
                    break;
                }
            case 7:
                unVar.getMessagesController().z3(unVar.e, unVar.f, jjVar.f1(), true, false, false);
                unVar.O3 = null;
                break;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                break;
        }
    }
}
