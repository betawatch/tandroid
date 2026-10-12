package p4;

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
import ji.d4;
import ji.m5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s0 extends g3 implements ServiceConnection {
    public static final /* synthetic */ int G = 0;
    public boolean E;
    public m5 F;
    public final ComponentName r;
    public final com.google.android.gms.internal.cast.a0 s;
    public final ArrayList v;
    public boolean w;
    public boolean x;
    public n0 y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public s0(Context context, ComponentName componentName) {
        super(context, new d4(componentName, 17));
        this.v = new ArrayList();
        this.r = componentName;
        this.s = new com.google.android.gms.internal.cast.a0();
    }

    @Override // com.google.android.gms.internal.vision.g3
    public final p c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        b2.u uVar = (b2.u) this.n;
        if (uVar == null) {
            return null;
        }
        List list = (List) uVar.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) list.get(i10)).d().equals(str)) {
                q0 q0Var = new q0(this, str);
                this.v.add(q0Var);
                if (this.E) {
                    q0Var.a(this.y);
                }
                r();
                return q0Var;
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
            n0 n0Var = this.y;
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(10, i10, 0, nVar != null ? nVar.a : null, null);
        }
        r();
    }

    public final void n() {
        if (this.x) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.r);
        try {
            this.x = this.a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final r0 o(String str, String str2) {
        b2.u uVar = (b2.u) this.n;
        if (uVar == null) {
            return null;
        }
        List list = (List) uVar.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) list.get(i10)).d().equals(str)) {
                r0 r0Var = new r0(this, str, str2);
                this.v.add(r0Var);
                if (this.E) {
                    r0Var.a(this.y);
                }
                r();
                return r0Var;
            }
        }
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.x) {
            p();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        n0 n0Var = new n0(this, messenger);
                        int i10 = n0Var.d;
                        n0Var.d = i10 + 1;
                        n0Var.g = i10;
                        if (n0Var.b(1, i10, 4, null, null)) {
                            try {
                                n0Var.a.getBinder().linkToDeath(n0Var, 0);
                                this.y = n0Var;
                                return;
                            } catch (RemoteException unused) {
                                n0Var.binderDied();
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
        if (this.y != null) {
            g(null);
            this.E = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((o0) arrayList.get(i10)).c();
            }
            n0 n0Var = this.y;
            n0Var.b(2, 0, 0, null, null);
            n0Var.b.b.clear();
            n0Var.a.getBinder().unlinkToDeath(n0Var, 0);
            n0Var.i.s.post(new m0(n0Var, 0));
            this.y = null;
        }
    }

    public final void q() {
        if (this.x) {
            this.x = false;
            p();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void r() {
        if (!this.w || (((n) this.h) == null && this.v.isEmpty())) {
            q();
        } else {
            n();
        }
    }

    public final String toString() {
        return "Service connection " + this.r.flattenToShortString();
    }
}
