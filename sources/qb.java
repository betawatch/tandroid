// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cc b;
    public final /* synthetic */ id c;

    public /* synthetic */ qb(cc ccVar, id idVar, byte b) {
        this.a = b;
        this.b = ccVar;
        this.c = idVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final cc ccVar = this.b;
                ccVar.getClass();
                final byte b = 1;
                final id idVar = this.c;
                hl.c3(new Runnable() { // from class: rb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        id idVar2 = idVar;
                        cc ccVar2 = ccVar;
                        switch (b2) {
                            case 0:
                                ccVar2.F0(idVar2, tLObject2, tL_error2);
                                break;
                            default:
                                ccVar2.I0(idVar2, tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b2 = 0;
                final cc ccVar2 = this.b;
                final id idVar2 = this.c;
                hl.c3(new Runnable() { // from class: rb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        id idVar22 = idVar2;
                        cc ccVar22 = ccVar2;
                        switch (b22) {
                            case 0:
                                ccVar22.F0(idVar22, tLObject2, tL_error2);
                                break;
                            default:
                                ccVar22.I0(idVar22, tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
