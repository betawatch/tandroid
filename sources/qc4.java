// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class qc4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xc4 b;
    public final /* synthetic */ TLRPC.TL_messages_sendMedia c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ qc4(xc4 xc4Var, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, byte b) {
        this.a = b;
        this.b = xc4Var;
        this.c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = this.d;
        xc4 xc4Var = this.b;
        switch (b) {
            case 0:
                xc4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (d7a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
            default:
                xc4Var.getSendMessagesHelper().O(this.c, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (d7a) objArr[4], ((Boolean) objArr[5]).booleanValue());
                break;
        }
    }
}
