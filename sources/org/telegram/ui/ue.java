package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.messenger.kj c;

    public /* synthetic */ ue(un unVar, org.telegram.messenger.kj kjVar, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = kjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i10 = this.a;
        un unVar = this.b;
        org.telegram.messenger.kj kjVar = this.c;
        switch (i10) {
            case 0:
                TLRPC.MessageMedia messageMedia = kjVar.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.I1.N().k(kjVar) == null) {
                        unVar.createArticleViewer(false).L(kjVar, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                unVar.getClass();
                TLRPC.Message message = kjVar.k;
                int i11 = message.ttl;
                boolean z10 = i11 != Integer.MAX_VALUE;
                int i12 = i11 == Integer.MAX_VALUE ? 0 : i11;
                message.destroyTime = unVar.getConnectionsManager().getCurrentTime() + i12;
                kjVar.k.destroyTimeMillis = unVar.getConnectionsManager().getCurrentTimeMillis() + (i12 * 1000);
                if (unVar.h == null) {
                    unVar.getMessagesController().n3(unVar.j6, kjVar.f1(), null, i12, 0L, z10);
                    break;
                } else {
                    unVar.getMessagesController().m3(unVar.j6, i12, kjVar.k.random_id);
                    break;
                }
            case 2:
                int f12 = kjVar.f1();
                un unVar2 = this.b;
                unVar2.sb(f12, 0, true, 0, true, 0, null, null, new ng(unVar2, 9));
                if (unVar2.x6.isEmpty()) {
                    unVar2.jc(false);
                    break;
                }
                break;
            case 3:
                un unVar3 = this.b;
                unVar3.getClass();
                int O1 = kjVar.O1();
                TLRPC.Message message2 = kjVar.k;
                unVar3.sb(O1, message2.id, true, org.telegram.messenger.kj.B0(message2) == unVar3.b7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) kjVar.k.action).answer.option, null);
                break;
            case 4:
                un unVar4 = this.b;
                unVar4.getClass();
                int O12 = kjVar.O1();
                TLRPC.Message message3 = kjVar.k;
                unVar4.sb(O12, message3.id, true, org.telegram.messenger.kj.B0(message3) == unVar4.b7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                un unVar5 = this.b;
                unVar5.getClass();
                int O13 = kjVar.O1();
                TLRPC.Message message4 = kjVar.k;
                unVar5.l(O13, message4.id, true, org.telegram.messenger.kj.B0(message4) == unVar5.b7 ? 1 : 0, false, 0);
                break;
            case 6:
                if (!org.telegram.messenger.kj.L4(kjVar.k)) {
                    MediaController.B().S(kjVar);
                    break;
                } else {
                    unVar.Ca(null, kjVar);
                    break;
                }
            case 7:
                unVar.getMessagesController().z3(unVar.e, unVar.f, kjVar.f1(), true, false, false);
                unVar.O3 = null;
                break;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                unVar.Za(kjVar);
                unVar.bb(kjVar);
                break;
        }
    }
}
