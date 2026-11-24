// default package

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tpd extends zz4 {
    public final cka F;
    public final cka G;
    public final cka H;

    public tpd(f05 f05Var, g05 g05Var, ovb ovbVar, Context context, Looper looper) {
        super(23, f05Var, g05Var, ovbVar, context, looper);
        this.F = new cka(0);
        this.G = new cka(0);
        this.H = new cka(0);
    }

    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof b5f ? (b5f) queryLocalInterface : new b5f(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", (byte) 5);
    }

    @Override // hh0
    public final o94[] f() {
        return nmd.a;
    }

    @Override // hh0
    public final int i() {
        return 11717000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // hh0
    public final void t(int i) {
        super.t(i);
        synchronized (this.F) {
            this.F.clear();
        }
        synchronized (this.G) {
            this.G.clear();
        }
        synchronized (this.H) {
            this.H.clear();
        }
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
