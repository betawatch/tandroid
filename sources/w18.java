// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class w18 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ w18(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final p pVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() { // from class: d28
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b3) {
                            case 0:
                                pVar2.p0(tLObject2);
                                break;
                            default:
                                pVar2.r0(tLObject2);
                                break;
                        }
                    }
                });
                break;
            case 1:
                hl.c3(new c28(pVar, tL_error, tLObject, b2));
                break;
            case 2:
                hl.c3(new pl7(pVar, tL_error, (byte) 24));
                break;
            default:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: d28
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b32) {
                            case 0:
                                pVar2.p0(tLObject2);
                                break;
                            default:
                                pVar2.r0(tLObject2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
