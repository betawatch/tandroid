package u5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import m.s3;
import r5.e0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class w extends b6.g {
    public static final b k0 = new b("CastClientImpl", null);
    public static final Object l0 = new Object();
    public static final Object m0 = new Object();
    public q5.d R;
    public final CastDevice S;
    public final e0 T;
    public final HashMap U;
    public final long V;
    public final Bundle W;
    public v X;
    public String Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public double c0;
    public q5.x d0;
    public int e0;
    public int f0;
    public String g0;
    public String h0;
    public Bundle i0;
    public final HashMap j0;

    public w(Context context, Looper looper, s3 s3Var, CastDevice castDevice, long j10, e0 e0Var, Bundle bundle, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, s3Var, kVar, lVar, 0);
        this.S = castDevice;
        this.T = e0Var;
        this.V = j10;
        this.W = bundle;
        this.U = new HashMap();
        new AtomicLong(0L);
        this.j0 = new HashMap();
        this.e0 = -1;
        this.f0 = -1;
        this.R = null;
        this.Y = null;
        this.c0 = 0.0d;
        I();
        this.Z = false;
        this.d0 = null;
        I();
    }

    public static void G(w wVar, long j10, int i10) {
        com.google.android.gms.common.api.internal.f fVar;
        synchronized (wVar.j0) {
            fVar = (com.google.android.gms.common.api.internal.f) wVar.j0.remove(Long.valueOf(j10));
        }
        if (fVar != null) {
            fVar.a(new Status(i10, null, null, null));
        }
    }

    @Override // b6.g
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        k0.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i10));
        if (i10 == 0 || i10 == 2300) {
            this.a0 = true;
            this.b0 = true;
        }
        if (i10 == 2300) {
            Bundle bundle2 = new Bundle();
            this.i0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    public final void H() {
        k0.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.U) {
            this.U.clear();
        }
    }

    public final void I() {
        CastDevice castDevice = this.S;
        b6.m.i(castDevice, "device should not be null");
        if (castDevice.f(2048) || !castDevice.f(4) || castDevice.f(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final void disconnect() {
        Object[] objArr = {this.X, Boolean.valueOf(h())};
        b bVar = k0;
        bVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        v vVar = this.X;
        w wVar = null;
        this.X = null;
        if (vVar != null) {
            w wVar2 = (w) vVar.b.getAndSet(null);
            if (wVar2 != null) {
                wVar2.e0 = -1;
                wVar2.f0 = -1;
                wVar2.R = null;
                wVar2.Y = null;
                wVar2.c0 = 0.0d;
                wVar2.I();
                wVar2.Z = false;
                wVar2.d0 = null;
                wVar = wVar2;
            }
            if (wVar != null) {
                H();
                try {
                    try {
                        ((f) u()).U0();
                    } finally {
                        super.disconnect();
                    }
                } catch (RemoteException | IllegalStateException e) {
                    bVar.a(e, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        bVar.b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12800000;
    }

    @Override // b6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // b6.g
    public final Bundle s() {
        Bundle bundle = this.i0;
        if (bundle == null) {
            return null;
        }
        this.i0 = null;
        return bundle;
    }

    @Override // b6.g
    public final Bundle t() {
        Bundle bundle = new Bundle();
        k0.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.g0, this.h0);
        CastDevice castDevice = this.S;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.V);
        Bundle bundle2 = this.W;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        v vVar = new v(this);
        this.X = vVar;
        bundle.putParcelable("listener", new BinderWrapper(vVar));
        String str = this.g0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.h0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // b6.g
    public final void z(y5.a aVar) {
        super.z(aVar);
        H();
    }
}
