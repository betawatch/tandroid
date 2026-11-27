// default package

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class xe2 implements RequestDelegate {
    public final /* synthetic */ byte a;

    public /* synthetic */ xe2(byte b) {
        this.a = b;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 1;
        switch (this.a) {
            case 0:
                break;
            case 1:
                hl.c3(new kc((byte) 10));
                break;
            case 2:
                hl.c3(new ti1(tL_error, b));
                break;
            case 3:
                hl.c3(new d87(tLObject, b));
                break;
            case 4:
                RectF rectF = ProfileActivity.Z6;
                break;
            case 5:
                hl.c3(new kc((byte) 10));
                break;
            case 6:
                hl.c3(new kc((byte) 10));
                break;
            case 7:
                hl.c3(new kc((byte) 10));
                break;
            case 8:
                hl.c3(new kc((byte) 10));
                break;
            case 9:
                hl.c3(new kc((byte) 10));
                break;
            case 10:
                hl.c3(new kc((byte) 10));
                break;
            case 11:
                hl.c3(new kc((byte) 10));
                break;
            case 12:
                VoIPService.lambda$createGroupInstance$71(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$callFailed$111(tLObject, tL_error);
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
