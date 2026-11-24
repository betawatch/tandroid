// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ts extends BroadcastReceiver {
    public final /* synthetic */ byte a;

    public /* synthetic */ ts(byte b) {
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
                    bc4.K.c(new y8c((byte) 17, bc4.G(i), p));
                }
                break;
            case 1:
                e86.h(intent);
                break;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.w().Q(MediaController.w().v0, true);
                    break;
                }
                break;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (e21.a) {
                        fc4.b("screen off");
                    }
                    ConnectionsManager.getInstance(z8c.t0).setAppPaused(true, true);
                    a.w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (e21.a) {
                        fc4.b("screen on");
                    }
                    ConnectionsManager.getInstance(z8c.t0).setAppPaused(false, true);
                    a.w = true;
                }
                nm7.e().k(nm7.O4, new Object[0]);
                break;
        }
    }
}
