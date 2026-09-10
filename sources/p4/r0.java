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
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import java.util.List;
import m.g3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class r0 extends h3 implements ServiceConnection {
    public static final /* synthetic */ int G = 0;
    public boolean E;
    public org.telegram.tgnet.j F;
    public final ComponentName r;
    public final com.google.android.gms.internal.cast.c0 s;
    public final ArrayList v;
    public boolean w;
    public boolean x;
    public m0 y;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public r0(Context context, ComponentName componentName) {
        super(context, new g3(componentName, 12));
        this.v = new ArrayList();
        this.r = componentName;
        this.s = new com.google.android.gms.internal.cast.c0();
    }

    @Override // com.google.android.gms.internal.vision.h3
    public final p c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        b2.p pVar = (b2.p) this.n;
        if (pVar == null) {
            return null;
        }
        List list = (List) pVar.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) list.get(i10)).d().equals(str)) {
                p0 p0Var = new p0(this, str);
                this.v.add(p0Var);
                if (this.E) {
                    p0Var.a(this.y);
                }
                r();
                return p0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.vision.h3
    public final q d(String str) {
        if (str != null) {
            return o(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // com.google.android.gms.internal.vision.h3
    public final q e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return o(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // com.google.android.gms.internal.vision.h3
    public final void f(n nVar) {
        if (this.E) {
            m0 m0Var = this.y;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(10, i10, 0, nVar != null ? nVar.a : null, null);
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

    public final q0 o(String str, String str2) {
        b2.p pVar = (b2.p) this.n;
        if (pVar == null) {
            return null;
        }
        List list = (List) pVar.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) list.get(i10)).d().equals(str)) {
                q0 q0Var = new q0(this, str, str2);
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

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.x) {
            p();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        m0 m0Var = new m0(this, messenger);
                        int i10 = m0Var.d;
                        m0Var.d = i10 + 1;
                        m0Var.g = i10;
                        if (m0Var.b(1, i10, 4, null, null)) {
                            try {
                                m0Var.a.getBinder().linkToDeath(m0Var, 0);
                                this.y = m0Var;
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
        if (this.y != null) {
            g(null);
            this.E = false;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((n0) arrayList.get(i10)).c();
            }
            m0 m0Var = this.y;
            m0Var.b(2, 0, 0, null, null);
            m0Var.b.b.clear();
            m0Var.a.getBinder().unlinkToDeath(m0Var, 0);
            m0Var.i.s.post(new l0(m0Var, 0));
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
