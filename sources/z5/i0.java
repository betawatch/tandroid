package z5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i0 implements Handler.Callback {
    public final /* synthetic */ j0 a;

    public /* synthetic */ i0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
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
        if (i10 != 1) {
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
