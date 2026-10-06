package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ii.n4;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
            nVar.e().a(new n4(locationResult, 21));
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
        nVar.e().a(new n2.c(locationAvailability, 15));
        return true;
    }

    public final void L0() {
        this.b.e().a(new l2.g(this, 16));
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
