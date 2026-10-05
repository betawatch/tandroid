package w9;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import n7.z0;
import org.telegram.messenger.BuildConfig;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.rc;
import y8.w0;
import yh.y3;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class k implements Continuation, qq0 {
    public Object a;

    public /* synthetic */ k(Object obj) {
        this.a = obj;
    }

    public void a(IBinder iBinder) {
        synchronized (((HashMap) this.a)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new w0();
            for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + BuildConfig.BETA_URL);
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.a).call();
    }

    @Override // org.telegram.ui.Components.qq0
    public void x0() {
        rc k10 = ((y3) this.a).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    public k(int i10) {
        switch (i10) {
            case 4:
                this.a = new z0[zf.b.values().length];
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qq0
    public /* synthetic */ void V() {
    }
}
