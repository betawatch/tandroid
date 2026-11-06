package u7;

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i extends a8.q implements j8.j {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.n b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 11);
        this.b = nVar;
    }

    @Override // a8.q
    public final boolean L0(Parcel parcel, int i7) {
        androidx.activity.n nVar = this.b;
        if (i7 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            nVar.g().a(new org.telegram.ui.Components.n(locationResult));
            return true;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return false;
            }
            M0();
            return true;
        }
        d.b(parcel);
        nVar.g().a(new a());
        return true;
    }

    public final void M0() {
        this.b.g().a(new uy(this, 23));
    }

    public final void N0(com.google.android.gms.common.api.internal.o oVar) {
        androidx.activity.n nVar = this.b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.o oVar2 = (com.google.android.gms.common.api.internal.o) nVar.c;
            if (oVar2 != oVar) {
                oVar2.b = null;
                nVar.c = oVar;
            }
        }
    }
}
