package r5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import m.t3;
import m5.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x extends y5.g {
    public static final b U = new b("CastClientImplCxless", null);
    public final CastDevice Q;
    public final long R;
    public final Bundle S;
    public final String T;

    public x(Context context, Looper looper, t3 t3Var, CastDevice castDevice, long j10, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, t3Var, kVar, lVar, 0);
        this.Q = castDevice;
        this.R = j10;
        this.S = bundle;
        this.T = str;
    }

    @Override // y5.g
    public final boolean C() {
        return true;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final void disconnect() {
        try {
            try {
                ((f) u()).U0();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e9) {
            U.a(e9, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 19390000;
    }

    @Override // y5.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // y5.g
    public final v5.c[] r() {
        return z.e;
    }

    @Override // y5.g
    public final Bundle t() {
        Bundle bundle = new Bundle();
        U.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.Q;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.R);
        bundle.putString("connectionless_client_record_id", this.T);
        Bundle bundle2 = this.S;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
