package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ki.t1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
            oVar.e().a(new l2.f(locationResult, 17));
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
        oVar.e().a(new t1(locationAvailability, 24));
        return true;
    }

    public final void K0() {
        this.b.e().a(new le.b(this, 18));
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
