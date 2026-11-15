package u7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.o3;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class l extends q6.h {
    public final a0.l F;
    public final a0.l G;
    public final a0.l H;

    public l(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, o3 o3Var) {
        super(context, looper, 23, o3Var, kVar, lVar, 0);
        this.F = new a0.l(0);
        this.G = new a0.l(0);
        this.H = new a0.l(0);
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 11717000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof y ? (y) queryLocalInterface : new y(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 10);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return j8.h.a;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // q6.d
    public final void v(int i7) {
        super.v(i7);
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

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
