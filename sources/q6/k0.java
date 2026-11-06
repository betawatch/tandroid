package q6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class k0 implements Handler.Callback {
    public final /* synthetic */ l0 a;

    public /* synthetic */ k0(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            l0 l0Var = this.a;
            synchronized (l0Var.a) {
                try {
                    i0 i0Var = (i0) message.obj;
                    j0 j0Var = (j0) l0Var.a.get(i0Var);
                    if (j0Var != null && j0Var.a.isEmpty()) {
                        if (j0Var.c) {
                            i0 i0Var2 = j0Var.e;
                            l0 l0Var2 = j0Var.h;
                            l0Var2.c.removeMessages(1, i0Var2);
                            l0Var2.d.b(l0Var2.b, j0Var);
                            j0Var.c = false;
                            j0Var.b = 2;
                        }
                        l0Var.a.remove(i0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        l0 l0Var3 = this.a;
        synchronized (l0Var3.a) {
            try {
                i0 i0Var3 = (i0) message.obj;
                j0 j0Var2 = (j0) l0Var3.a.get(i0Var3);
                if (j0Var2 != null && j0Var2.b == 3) {
                    String valueOf = String.valueOf(i0Var3);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = j0Var2.f;
                    if (componentName == null) {
                        i0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = i0Var3.b;
                        m.g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    j0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
