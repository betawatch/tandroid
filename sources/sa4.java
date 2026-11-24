// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class sa4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ab4 b;
    public final /* synthetic */ TLRPC.TL_messages_sendMultiMedia c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ sa4(ab4 ab4Var, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, byte b) {
        this.a = b;
        this.b = ab4Var;
        this.c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = this.d;
        ab4 ab4Var = this.b;
        switch (b) {
            case 0:
                ab4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (k3a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
            default:
                ab4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (k3a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
        }
    }
}
