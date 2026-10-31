package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;
import r2.y;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends b8.b implements g8.k {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.o b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.b = oVar;
    }

    @Override // b8.b
    public final boolean L0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            oVar.h().a(new n2.u(locationResult, 20));
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            M0();
            return true;
        }
        d.b(parcel);
        oVar.h().a(new a());
        return true;
    }

    public final void M0() {
        this.b.h().a(new y(this, 1));
    }

    public final void N0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.c;
            if (pVar2 != pVar) {
                pVar2.b = null;
                pVar2.c = null;
                oVar.c = pVar;
            }
        }
    }
}
