package w9;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.f0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.q20;
import y8.w0;
import yh.r2;
import yh.x7;
import zg.o0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class k implements Continuation, xv0, rk0 {
    public Object a;

    public /* synthetic */ k(Object obj) {
        this.a = obj;
    }

    @Override // org.telegram.ui.Components.xv0
    public void E(boolean z10) {
        x7 x7Var = (x7) this.a;
        le.b bVar = x7Var.W;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        q20 q20Var = x7Var.s;
        if (q20Var != null) {
            q20Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.xv0
    public float Y0() {
        return f0.b(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((x7) this.a).Z, 0);
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

    @Override // org.telegram.ui.Components.xv0
    public int e1() {
        return ((x7) this.a).a0;
    }

    @Override // org.telegram.ui.Components.rk0
    public void h(View view, o0 o0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.a;
        tVar.a.Za(null, tVar.e, tVar.b, view, 0.0f, 0.0f, o0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new r2(this, 9));
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.a).call();
    }

    public k() {
        this.a = new HashMap();
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
