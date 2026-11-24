// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qy7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ qy7(p pVar, byte b) {
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
                gl.c3(new Runnable() { // from class: ty7
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b3) {
                            case 0:
                                pVar2.r0(tLObject2);
                                break;
                            default:
                                pVar2.p0(tLObject2);
                                break;
                        }
                    }
                });
                break;
            case 1:
                gl.c3(new bj7(pVar, tL_error, (byte) 26));
                break;
            case 2:
                final byte b3 = 1;
                gl.c3(new Runnable() { // from class: ty7
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (b32) {
                            case 0:
                                pVar2.r0(tLObject2);
                                break;
                            default:
                                pVar2.p0(tLObject2);
                                break;
                        }
                    }
                });
                break;
            default:
                gl.c3(new xy7(pVar, tL_error, tLObject, b2));
                break;
        }
    }
}
