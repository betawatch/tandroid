// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tr extends BroadcastReceiver {
    public final /* synthetic */ byte a;

    public /* synthetic */ tr(byte b) {
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
                    ba4.K.c(new x6c((byte) 17, ba4.G(i), p));
                }
                break;
            case 1:
                e66.h(intent);
                break;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.w().Q(MediaController.w().v0, true);
                    break;
                }
                break;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (w01.a) {
                        fa4.b("screen off");
                    }
                    ConnectionsManager.getInstance(y6c.t0).setAppPaused(true, true);
                    a.w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (w01.a) {
                        fa4.b("screen on");
                    }
                    ConnectionsManager.getInstance(y6c.t0).setAppPaused(false, true);
                    a.w = true;
                }
                kk7.e().k(kk7.M4, new Object[0]);
                break;
        }
    }
}
