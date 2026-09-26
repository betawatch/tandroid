package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class i extends b8.b implements g8.n {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.n b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.b = nVar;
    }

    @Override // b8.b
    public final boolean K0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            nVar.e().a(new ka.c(locationResult, 18));
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
        nVar.e().a(new k2.u(locationAvailability, 22));
        return true;
    }

    public final void L0() {
        this.b.e().a(new l.d(this));
    }

    public final void M0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.c;
            if (pVar2 != pVar) {
                pVar2.b = null;
                pVar2.c = null;
                nVar.c = pVar;
            }
        }
    }
}
