// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class y9f implements ServiceConnection {
    public final HashMap a = new HashMap();
    public byte b = 2;
    public boolean c;
    public IBinder d;
    public final o7f e;
    public ComponentName f;
    public final /* synthetic */ aef h;

    public y9f(aef aefVar, o7f o7fVar) {
        this.h = aefVar;
        this.e = o7fVar;
    }

    public final ws2 a(String str) {
        try {
            Intent a = sbd.a(this.h.b, this.e);
            this.b = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(yld.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                aef aefVar = this.h;
                wz4 wz4Var = aefVar.d;
                Context context = aefVar.b;
                o7f o7fVar = this.e;
                boolean L = wz4Var.L(context, str, a, this, 4225);
                this.c = L;
                if (L) {
                    aefVar.c.sendMessageDelayed(aefVar.c.obtainMessage(1, o7fVar), aefVar.f);
                    return ws2.f;
                }
                this.b = (byte) 2;
                try {
                    aefVar.d.K(aefVar.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ws2(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (hbd e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aef aefVar = this.h;
        synchronized (aefVar.a) {
            aefVar.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = (byte) 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        aef aefVar = this.h;
        synchronized (aefVar.a) {
            aefVar.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = (byte) 2;
        }
    }
}
