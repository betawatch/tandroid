// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tc4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad4 b;
    public final /* synthetic */ TLRPC.TL_messages_sendMedia c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ tc4(ad4 ad4Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, byte b) {
        this.a = b;
        this.b = ad4Var;
        this.c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = this.d;
        ad4 ad4Var = this.b;
        switch (b) {
            case 0:
                ad4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (m5a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
            default:
                ad4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (m5a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
        }
    }
}
