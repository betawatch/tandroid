package s4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r0 extends g3 implements ServiceConnection {
    public static final /* synthetic */ int G = 0;
    public m0 D;
    public boolean E;
    public m3 F;
    public final ComponentName r;
    public final com.google.android.gms.internal.cast.y s;
    public final ArrayList w;
    public boolean x;
    public boolean y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public r0(Context context, ComponentName componentName) {
        super(context, new vy(componentName, 15));
        this.w = new ArrayList();
        this.r = componentName;
        this.s = new com.google.android.gms.internal.cast.y();
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final p c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        ca.i iVar = (ca.i) this.n;
        if (iVar == null) {
            return null;
        }
        List list = (List) iVar.c;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((m) list.get(i7)).d().equals(str)) {
                p0 p0Var = new p0(this, str);
                this.w.add(p0Var);
                if (this.E) {
                    p0Var.a(this.D);
                }
                r();
                return p0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final q d(String str) {
        if (str != null) {
            return o(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final q e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return o(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final void f(n nVar) {
        if (this.E) {
            m0 m0Var = this.D;
            int i7 = m0Var.d;
            m0Var.d = i7 + 1;
            m0Var.b(10, i7, 0, nVar != null ? nVar.a : null, null);
        }
        r();
    }

    public final void n() {
        if (this.y) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.r);
        try {
            this.y = this.a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final q0 o(String str, String str2) {
        ca.i iVar = (ca.i) this.n;
        if (iVar == null) {
            return null;
        }
        List list = (List) iVar.c;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((m) list.get(i7)).d().equals(str)) {
                q0 q0Var = new q0(this, str, str2);
                this.w.add(q0Var);
                if (this.E) {
                    q0Var.a(this.D);
                }
                r();
                return q0Var;
            }
        }
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.y) {
            p();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        m0 m0Var = new m0(this, messenger);
                        int i7 = m0Var.d;
                        m0Var.d = i7 + 1;
                        m0Var.g = i7;
                        if (m0Var.b(1, i7, 4, null, null)) {
                            try {
                                m0Var.a.getBinder().linkToDeath(m0Var, 0);
                                this.D = m0Var;
                                return;
                            } catch (RemoteException unused) {
                                m0Var.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        p();
    }

    public final void p() {
        if (this.D != null) {
            g(null);
            this.E = false;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((n0) arrayList.get(i7)).c();
            }
            m0 m0Var = this.D;
            m0Var.b(2, 0, 0, null, null);
            m0Var.b.b.clear();
            m0Var.a.getBinder().unlinkToDeath(m0Var, 0);
            m0Var.i.s.post(new l0(m0Var, 0));
            this.D = null;
        }
    }

    public final void q() {
        if (this.y) {
            this.y = false;
            p();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
            }
        }
    }

    public final void r() {
        if (!this.x || (((n) this.h) == null && this.w.isEmpty())) {
            q();
        } else {
            n();
        }
    }

    public final String toString() {
        return "Service connection " + this.r.flattenToShortString();
    }
}
