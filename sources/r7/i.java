package r7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ki.e0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
            nVar.e().a(new o0.b(locationResult, 14));
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
        nVar.e().a(new k2.e(locationAvailability, 20));
        return true;
    }

    public final void L0() {
        this.b.e().a(new e0(this, 19));
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
