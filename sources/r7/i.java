package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import m.g3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i extends b8.b implements g8.n {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.o b;

    public i(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.b = oVar;
    }

    @Override // b8.b
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            oVar.e().a(new g3(locationResult, 16));
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            L0();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) d.a(parcel, LocationAvailability.CREATOR);
        d.b(parcel);
        oVar.e().a(new o0.b(locationAvailability));
        return true;
    }

    public final void L0() {
        this.b.e().a(new l2.g(this, 17));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
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
