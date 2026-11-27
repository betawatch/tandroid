// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ur extends BroadcastReceiver {
    public final /* synthetic */ byte a;

    public /* synthetic */ ur(byte b) {
        this.a = b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                try {
                    a.c = a.e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p = a.p();
                for (int i = 0; i < 4; i++) {
                    ConnectionsManager.getInstance(i).checkConnection();
                    xb4.K.c(new xac((byte) 17, xb4.G(i), p));
                }
                break;
            case 1:
                i86.h(intent);
                break;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.z().U(MediaController.z().v0, true);
                    break;
                }
                break;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (f11.a) {
                        cc4.b("screen off");
                    }
                    ConnectionsManager.getInstance(yac.t0).setAppPaused(true, true);
                    a.w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (f11.a) {
                        cc4.b("screen on");
                    }
                    ConnectionsManager.getInstance(yac.t0).setAppPaused(false, true);
                    a.w = true;
                }
                jn7.e().k(jn7.N4, new Object[0]);
                break;
        }
    }
}
