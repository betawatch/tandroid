// default package

import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ vv0(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 0;
        int i = this.b;
        switch (b) {
            case 0:
                gl.d3(new xv0(i, b2));
                break;
            case 1:
                String str = LaunchActivity.C1;
                gl.d3(new az5(tLObject, i, (byte) 1));
                break;
            case 2:
                String str2 = LaunchActivity.C1;
                gl.d3(new az5(tLObject, i, b2));
                break;
            case 3:
                gl.d3(new az5(i, tLObject));
                break;
            case 4:
                VoIPGroupNotification.lambda$decline$3(i, tLObject, tL_error);
                break;
            case 5:
                if (tLObject instanceof TLRPC.TL_updates) {
                    na7.q1(i).Q3((TLRPC.TL_updates) tLObject, false);
                    break;
                }
                break;
            default:
                VoIPPreNotificationService.lambda$decline$4(i, tLObject, tL_error);
                break;
        }
    }
}
