package x8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.telegram.messenger.WearAuthListenerService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends Handler {
    public boolean a;
    public final e b;
    public final /* synthetic */ WearAuthListenerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WearAuthListenerService wearAuthListenerService, Looper looper) {
        super(looper);
        this.c = wearAuthListenerService;
        this.b = new e();
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
            try {
                if (!this.a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.c.a)));
                    }
                    WearAuthListenerService wearAuthListenerService = this.c;
                    wearAuthListenerService.bindService(wearAuthListenerService.d, this.b, 1);
                    this.a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            super.dispatchMessage(message);
            if (hasMessages(0)) {
                return;
            }
            a("dispatch");
        } catch (Throwable th3) {
            if (!hasMessages(0)) {
                a("dispatch");
            }
            throw th3;
        }
    }
}
