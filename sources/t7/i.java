package t7;

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends com.google.android.gms.internal.cast.o implements i8.j {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.n b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 9);
        this.b = nVar;
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean L0(Parcel parcel, int i3) {
        androidx.activity.n nVar = this.b;
        if (i3 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            nVar.g().a(new y00(locationResult));
            return true;
        }
        if (i3 != 2) {
            if (i3 != 3) {
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
        this.b.g().a(new nh(this, 19));
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
