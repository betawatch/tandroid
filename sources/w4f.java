// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.telegram.messenger.WearAuthListenerService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w4f extends Handler {
    public boolean a;
    public final d2f b;
    public final /* synthetic */ WearAuthListenerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4f(WearAuthListenerService wearAuthListenerService, Looper looper) {
        super(looper);
        this.c = wearAuthListenerService;
        this.b = new d2f();
    }

    public final synchronized void a(String str) {
        if (this.a) {
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(this.c.a));
            }
            try {
                this.c.unbindService(this.b);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.a = false;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            if (!this.a) {
                if (Log.isLoggable("WearableLS", 2)) {
                    Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.c.a)));
                }
                WearAuthListenerService wearAuthListenerService = this.c;
                wearAuthListenerService.bindService(wearAuthListenerService.d, this.b, 1);
                this.a = true;
            }
        }
        try {
            super.dispatchMessage(message);
        } finally {
            if (!hasMessages(0)) {
                a("dispatch");
            }
        }
    }
}
