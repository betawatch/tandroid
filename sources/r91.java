// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r91 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r91(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Poll poll;
        byte b = this.a;
        byte b2 = 11;
        byte b3 = 0;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ia1 ia1Var = (ia1) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    ia1Var.getMessagesController().T3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z;
                        ia1Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new r91(b3, ia1Var, z));
                        break;
                    }
                }
                break;
            case 1:
                gm.c3(new np6((iv1) obj, tLObject, z, b2));
                break;
            case 2:
                ba2 ba2Var = (ba2) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    ba2Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new y8c(b2, ba2Var, z));
                    break;
                } else {
                    gm.c3(new v92(ba2Var, (byte) 3));
                    break;
                }
            case 3:
                gm.c3(new rh(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 9));
                break;
            case 4:
                gm.c3(new np6(obj, (Object) tLObject, z, (byte) 23));
                break;
            case 5:
                gm.c3(new rh(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 21));
                break;
            case 6:
                oc7 oc7Var = (oc7) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (z) {
                        for (int i = 0; i < updates.updates.size(); i++) {
                            TLRPC.Update update = updates.updates.get(i);
                            if ((update instanceof TL_update.TL_updateMessagePoll) && (poll = ((TL_update.TL_updateMessagePoll) update).poll) != null && !poll.closed) {
                                oc7Var.D0 = System.currentTimeMillis() - 4000;
                            }
                        }
                    }
                    oc7Var.T3(updates, false);
                    break;
                }
                break;
            case 7:
                gm.c3(new eb7(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 5));
                break;
            case 8:
                p pVar = (p) obj;
                pVar.getClass();
                gm.c3(new eb7((Object) pVar, (Object) tL_error, (Object) tLObject, this.b, (byte) 8));
                break;
            case 9:
                gm.c3(new ud7((i58) obj, tL_error, tLObject, z));
                break;
            case 10:
                w78 w78Var = (w78) obj;
                if (tLObject != null) {
                    gm.c3(new yl6((Object) w78Var, (Object) tLObject, z, (byte) 12));
                    break;
                }
                break;
            case 11:
                p5c p5cVar = (p5c) obj;
                p5cVar.getClass();
                gm.c3(new eb7((Object) p5cVar, (Object) tL_error, (Object) tLObject, this.b, (byte) 18));
                break;
            case 12:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z, tLObject, tL_error);
                break;
            default:
                gm.c3(new yl6(obj, (Object) tLObject, z, (byte) 29));
                break;
        }
    }
}
