// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class x67 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ x67(oc7 oc7Var, long j, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                if (j == 0) {
                    oc7Var.getClass();
                    break;
                } else {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
            case 1:
                gm.c3(new u87(oc7Var, j, tLObject));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    oc7Var.N3(j, (TLRPC.TL_channels_channelParticipants) tLObject);
                    break;
                }
                break;
            case 3:
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 4:
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    oc7Var.R3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 6:
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 7:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    oc7Var.R3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 8:
                oc7Var.getMessagesStorage().n1(j);
                break;
            case 9:
                if (tL_error == null) {
                    gm.c3(new u87(oc7Var, tLObject, j));
                    break;
                }
                break;
            case 10:
                if (j == 0) {
                    oc7Var.getClass();
                    break;
                } else {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
            case 11:
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 12:
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 13:
                if (tLObject != null) {
                    TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
                    oc7 oc7Var2 = this.b;
                    cf7 messagesStorage = oc7Var2.getMessagesStorage();
                    int i = tL_chatOnlines.onlines;
                    mp3 mp3Var = messagesStorage.a;
                    long j2 = this.c;
                    mp3Var.c(new cd7(messagesStorage, i, j2, (byte) 7));
                    gm.c3(new hq6((Object) oc7Var2, j2, (Object) tL_chatOnlines, (byte) 2));
                    break;
                }
                break;
            case 14:
                if (tL_error == null) {
                    oc7Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    gm.d3(new r77(oc7Var, j, (byte) 21), 1000L);
                    break;
                }
                break;
            case 15:
                if (tL_error != null) {
                    oc7Var.getClass();
                    break;
                } else {
                    oc7Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    gm.d3(new r77(oc7Var, j, (byte) 20), 1000L);
                    break;
                }
            case 16:
                if (j != 0) {
                    oc7Var.getMessagesStorage().n1(j);
                }
                if (tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null && tL_error.code == 400) {
                        oc7Var.a3(0, -j, true);
                        break;
                    }
                } else {
                    long j3 = -j;
                    if (oc7Var.M0(j3) == null) {
                        oc7Var.a3(0, j3, true);
                        break;
                    }
                }
                break;
        }
    }
}
