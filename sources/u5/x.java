package u5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import m.s3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class x extends b6.g {
    public static final b V = new b("CastClientImplCxless", null);
    public final CastDevice R;
    public final long S;
    public final Bundle T;
    public final String U;

    public x(Context context, Looper looper, s3 s3Var, CastDevice castDevice, long j10, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, s3Var, kVar, lVar, 0);
        this.R = castDevice;
        this.S = j10;
        this.T = bundle;
        this.U = str;
    }

    @Override // b6.g
    public final boolean C() {
        return true;
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final void disconnect() {
        try {
            try {
                ((f) u()).U0();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e) {
            V.a(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 19390000;
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
    public final y5.c[] r() {
        return q5.y.e;
    }

    @Override // b6.g
    public final Bundle t() {
        Bundle bundle = new Bundle();
        V.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.R;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.S);
        bundle.putString("connectionless_client_record_id", this.U);
        Bundle bundle2 = this.T;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
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
}
