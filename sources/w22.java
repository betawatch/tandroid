// default package

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w22 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w22(int i, rp2 rp2Var) {
        this.a = (byte) 7;
        this.b = i;
        this.c = rp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        k47 k47Var;
        byte b = this.a;
        byte b2 = 9;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                gm.c3(new wc7(obj, (Object) tLObject, i, (byte) 14));
                break;
            case 1:
                gm.c3(new up6(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 17));
                break;
            case 2:
                gm.c3(new up6(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 0));
                break;
            case 3:
                gm.c3(new h65((nq1) obj, tLObject, i, b2));
                break;
            case 4:
                gm.c3(new v99((zga) obj, tLObject, i, b2));
                break;
            case 5:
                wsa wsaVar = (wsa) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                        TLRPC.Message message = messages_messages.messages.get(i2);
                        if (message != null && message.id == i) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                k47Var = new k47(wsaVar.a, message, false, false);
                                k47Var.K5();
                                if (k47Var == null) {
                                    gm.c3(new hw9((Object) wsaVar, (Object) tLObject, (Object) k47Var, (byte) 15));
                                    break;
                                }
                            }
                        }
                    }
                }
                k47Var = null;
                if (k47Var == null) {
                }
                break;
            case 6:
                gm.c3(new v99(obj, i, (Object) tLObject, (byte) 13));
                break;
            case 7:
                gm.c3(new v99((Object) tLObject, i, obj, (byte) 18));
                break;
            case 8:
                z3b z3bVar = (z3b) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                        arrayList.add(z3bVar.y(tL_stories_stories.stories.get(i3)));
                    }
                    gm.c3(new tda((Object) z3bVar, (Object) arrayList, (Object) tL_stories_stories, this.b, (byte) 5));
                    break;
                } else {
                    gm.c3(new w3b(z3bVar, (byte) 1));
                    break;
                }
            case 9:
                ((VoIPService) obj).lambda$startScreenCapture$63(i, tLObject, tL_error);
                break;
            default:
                gm.c3(new bnc((qtc) obj, i, tLObject, (byte) 5));
                break;
        }
    }

    public /* synthetic */ w22(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
