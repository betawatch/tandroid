// default package

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class q79 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q79(Looper looper, byte b) {
        super(looper);
        switch (b) {
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    public q79(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
