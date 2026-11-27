// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vd4 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ je4 b;

    public /* synthetic */ vd4(je4 je4Var, byte b) {
        this.a = b;
        this.b = je4Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final je4 je4Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                hl.c3(new Runnable() { // from class: wd4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        je4 je4Var2 = je4Var;
                        switch (b3) {
                            case 0:
                                je4Var2.F = 0;
                                if (tL_error2 == null) {
                                    bs2.v(null, 2131750707, d31.b0(je4Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                je4Var2.f0(tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                je4Var.getClass();
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: wd4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        je4 je4Var2 = je4Var;
                        switch (b32) {
                            case 0:
                                je4Var2.F = 0;
                                if (tL_error2 == null) {
                                    bs2.v(null, 2131750707, d31.b0(je4Var2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                je4Var2.f0(tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
