package x5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 implements Handler.Callback {
    public final /* synthetic */ j0 a;

    public /* synthetic */ i0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 0) {
            synchronized (this.a.a) {
                try {
                    g0 g0Var = (g0) message.obj;
                    h0 h0Var = (h0) this.a.a.get(g0Var);
                    if (h0Var != null && h0Var.a.isEmpty()) {
                        if (h0Var.c) {
                            h0Var.h.c.removeMessages(1, h0Var.e);
                            j0 j0Var = h0Var.h;
                            j0Var.d.b(j0Var.b, h0Var);
                            h0Var.c = false;
                            h0Var.b = 2;
                        }
                        this.a.a.remove(g0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i9 != 1) {
            return false;
        }
        synchronized (this.a.a) {
            try {
                g0 g0Var2 = (g0) message.obj;
                h0 h0Var2 = (h0) this.a.a.get(g0Var2);
                if (h0Var2 != null && h0Var2.b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g0Var2)), new Exception());
                    ComponentName componentName = h0Var2.f;
                    if (componentName == null) {
                        g0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = g0Var2.b;
                        l.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    h0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
