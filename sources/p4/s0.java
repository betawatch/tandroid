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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 extends g3 implements ServiceConnection {
    public static final /* synthetic */ int G = 0;
    public n0 D;
    public boolean E;
    public mg.l F;
    public final ComponentName r;
    public final com.google.android.gms.internal.cast.z s;
    public final ArrayList w;
    public boolean x;
    public boolean y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public s0(Context context, ComponentName componentName) {
        super(context, new l2.f(componentName, 22));
        this.w = new ArrayList();
        this.r = componentName;
        this.s = new com.google.android.gms.internal.cast.z();
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
            n0 n0Var = this.D;
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(10, i10, 0, nVar != null ? nVar.a : null, null);
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
                this.w.add(r0Var);
                if (this.E) {
                    r0Var.a(this.D);
                }
                r();
                return r0Var;
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
                        n0 n0Var = new n0(this, messenger);
                        int i10 = n0Var.d;
                        n0Var.d = i10 + 1;
                        n0Var.g = i10;
                        if (n0Var.b(1, i10, 4, null, null)) {
                            try {
                                n0Var.a.getBinder().linkToDeath(n0Var, 0);
                                this.D = n0Var;
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
        if (this.D != null) {
            g(null);
            this.E = false;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((o0) arrayList.get(i10)).c();
            }
            n0 n0Var = this.D;
            n0Var.b(2, 0, 0, null, null);
            n0Var.b.b.clear();
            n0Var.a.getBinder().unlinkToDeath(n0Var, 0);
            n0Var.i.s.post(new m0(n0Var, 0));
            this.D = null;
        }
    }

    public final void q() {
        if (this.y) {
            this.y = false;
            p();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
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
