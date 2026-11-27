// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class z6a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ e d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ z6a(r7a r7aVar, TLRPC.TL_error tL_error, e eVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = tL_error;
        this.d = eVar;
        this.e = tL_messages_editMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = this.e;
        e eVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                jj.c0(r7aVar.currentAccount, tL_error, eVar, tL_messages_editMessage, new Object[0]);
                break;
            default:
                jj.c0(r7aVar.currentAccount, tL_error, eVar, tL_messages_editMessage, new Object[0]);
                break;
        }
    }
}
