// default package

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p8d extends zz4 {
    public final Context F;

    public p8d(f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(45, f05Var, g05Var, ovbVar, context, looper);
        this.F = context;
    }

    @Override // hh0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof iee ? (iee) queryLocalInterface : new iee(iBinder);
    }

    @Override // hh0
    public final int i() {
        return 12200000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
