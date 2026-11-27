// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q81 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q81(byte b, Object obj, boolean z) {
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
                i91 i91Var = (i91) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    i91Var.getMessagesController().Y3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z;
                        i91Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new q81(b3, i91Var, z));
                        break;
                    }
                }
                break;
            case 1:
                hl.c3(new ds6((ju1) obj, tLObject, z, b2));
                break;
            case 2:
                g92 g92Var = (g92) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    g92Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new xac(b2, g92Var, z));
                    break;
                } else {
                    hl.c3(new b92(g92Var, (byte) 3));
                    break;
                }
            case 3:
                hl.c3(new lg(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 9));
                break;
            case 4:
                hl.c3(new ds6(obj, (Object) tLObject, z, (byte) 22));
                break;
            case 5:
                hl.c3(new lg(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 21));
                break;
            case 6:
                uc7 uc7Var = (uc7) obj;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (z) {
                        for (int i = 0; i < updates.updates.size(); i++) {
                            TLRPC.Update update = updates.updates.get(i);
                            if ((update instanceof TL_update.TL_updateMessagePoll) && (poll = ((TL_update.TL_updateMessagePoll) update).poll) != null && !poll.closed) {
                                uc7Var.D0 = System.currentTimeMillis() - 4000;
                            }
                        }
                    }
                    uc7Var.Y3(updates, false);
                    break;
                }
                break;
            case 7:
                hl.c3(new lb7(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 6));
                break;
            case 8:
                p pVar = (p) obj;
                pVar.getClass();
                hl.c3(new lb7((Object) pVar, (Object) tL_error, (Object) tLObject, this.b, (byte) 8));
                break;
            case 9:
                hl.c3(new gd7((w68) obj, tL_error, tLObject, z));
                break;
            case 10:
                l98 l98Var = (l98) obj;
                if (tLObject != null) {
                    hl.c3(new yn6(l98Var, tLObject, z, b2));
                    break;
                }
                break;
            case 11:
                o7c o7cVar = (o7c) obj;
                o7cVar.getClass();
                hl.c3(new lb7((Object) o7cVar, (Object) tL_error, (Object) tLObject, this.b, (byte) 18));
                break;
            case 12:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z, tLObject, tL_error);
                break;
            default:
                hl.c3(new svc((WallpapersListActivity) obj, tLObject, z, b3));
                break;
        }
    }
}
