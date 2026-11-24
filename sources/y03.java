// default package

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y03 extends y13 {
    public final Context e;
    public o13 f;
    public Executor g;
    public CancellationSignal h;
    public final x03 i;

    public y03(Context context) {
        context.getClass();
        this.e = context;
        this.i = new x03(this, new Handler(Looper.getMainLooper()), (byte) 0);
    }
}
