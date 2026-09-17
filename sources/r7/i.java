package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ji.u4;
import k2.g0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
            oVar.e().a(new mg.n(locationResult, 12));
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
        oVar.e().a(new g0(locationAvailability, 18));
        return true;
    }

    public final void L0() {
        this.b.e().a(new u4(this, 20));
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
