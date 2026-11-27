// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class p0b implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w1b b;

    public /* synthetic */ p0b(w1b w1bVar, byte b) {
        this.a = b;
        this.b = w1bVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        w1b w1bVar = this.b;
        switch (b) {
            case 0:
                w1bVar.h0(tLObject);
                break;
            default:
                w1bVar.i0(tLObject);
                break;
        }
    }
}
