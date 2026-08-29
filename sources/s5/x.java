package s5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import m.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x extends z5.g {
    public static final b U = new b("CastClientImplCxless", null);
    public final CastDevice Q;
    public final long R;
    public final Bundle S;
    public final String T;

    public x(Context context, Looper looper, s3 s3Var, CastDevice castDevice, long j10, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, s3Var, kVar, lVar, 0);
        this.Q = castDevice;
        this.R = j10;
        this.S = bundle;
        this.T = str;
    }

    @Override // z5.g
    public final boolean C() {
        return true;
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final void disconnect() {
        try {
            try {
                ((f) u()).U0();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e10) {
            U.a(e10, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 19390000;
    }

    @Override // z5.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // z5.g
    public final w5.c[] r() {
        return o5.y.e;
    }

    @Override // z5.g
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

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
