package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ji.h5;
import ji.w4;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i extends b8.b implements g8.n {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.o b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.b = oVar;
    }

    @Override // b8.b
    public final boolean J0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            oVar.e().a(new m.l(locationResult));
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            K0();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) d.a(parcel, LocationAvailability.CREATOR);
        d.b(parcel);
        oVar.e().a(new w4(locationAvailability, 22));
        return true;
    }

    public final void K0() {
        this.b.e().a(new h5(this, 22));
    }

    public final void L0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.b;
            if (pVar2 != pVar) {
                pVar2.b = null;
                pVar2.c = null;
                oVar.b = pVar;
            }
        }
    }
}
