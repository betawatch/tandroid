package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final o oVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                o oVar2 = oVar;
                                oVar2.getClass();
                                oVar2.j = new ArrayList();
                                oVar2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                                        oVar2.j.add((TLRPC.User) vector.objects.get(i11));
                                    }
                                    MessagesController.getInstance(oVar2.a).putUsers(oVar2.j, false);
                                    break;
                                }
                                break;
                            default:
                                o oVar3 = oVar;
                                int i12 = oVar3.a;
                                oVar3.l = new ArrayList();
                                oVar3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    oVar3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final o oVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                o oVar22 = oVar2;
                                oVar22.getClass();
                                oVar22.j = new ArrayList();
                                oVar22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i112 = 0; i112 < vector.objects.size(); i112++) {
                                        oVar22.j.add((TLRPC.User) vector.objects.get(i112));
                                    }
                                    MessagesController.getInstance(oVar22.a).putUsers(oVar22.j, false);
                                    break;
                                }
                                break;
                            default:
                                o oVar3 = oVar2;
                                int i12 = oVar3.a;
                                oVar3.l = new ArrayList();
                                oVar3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    oVar3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
