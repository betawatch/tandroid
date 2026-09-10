package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ j(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final p pVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                p pVar2 = pVar;
                                pVar2.getClass();
                                pVar2.j = new ArrayList();
                                pVar2.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                                        pVar2.j.add((TLRPC.User) vector.objects.get(i11));
                                    }
                                    MessagesController.getInstance(pVar2.a).putUsers(pVar2.j, false);
                                    break;
                                }
                                break;
                            default:
                                p pVar3 = pVar;
                                int i12 = pVar3.a;
                                pVar3.l = new ArrayList();
                                pVar3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    pVar3.l.addAll(messages_chats.chats);
                                }
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.adminedChannelsLoaded, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final p pVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                p pVar22 = pVar2;
                                pVar22.getClass();
                                pVar22.j = new ArrayList();
                                pVar22.i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i112 = 0; i112 < vector.objects.size(); i112++) {
                                        pVar22.j.add((TLRPC.User) vector.objects.get(i112));
                                    }
                                    MessagesController.getInstance(pVar22.a).putUsers(pVar22.j, false);
                                    break;
                                }
                                break;
                            default:
                                p pVar3 = pVar2;
                                int i12 = pVar3.a;
                                pVar3.l = new ArrayList();
                                pVar3.k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    MessagesController.getInstance(i12).putChats(messages_chats.chats, false);
                                    pVar3.l.addAll(messages_chats.chats);
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
