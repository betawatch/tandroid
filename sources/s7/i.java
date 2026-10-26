package s7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import li.h5;
import s4.o0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i extends c8.b implements h8.n {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.n b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.b = nVar;
    }

    @Override // c8.b
    public final boolean J0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            nVar.e().a(new h5(locationResult));
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
        nVar.e().a(new jg.i(locationAvailability));
        return true;
    }

    public final void K0() {
        this.b.e().a(new o0(this));
    }

    public final void L0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.b;
            if (pVar2 != pVar) {
                pVar2.b = null;
                pVar2.c = null;
                nVar.b = pVar;
            }
        }
    }
}
