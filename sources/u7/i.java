package u7;

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.of;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class i extends a8.q implements j8.j {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.n b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 11);
        this.b = nVar;
    }

    @Override // a8.q
    public final boolean l1(Parcel parcel, int i7) {
        androidx.activity.n nVar = this.b;
        if (i7 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            nVar.i().a(new hn(locationResult, 23));
            return true;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return false;
            }
            m1();
            return true;
        }
        d.b(parcel);
        nVar.i().a(new a());
        return true;
    }

    public final void m1() {
        this.b.i().a(new of(this, 22));
    }

    public final void n1(com.google.android.gms.common.api.internal.o oVar) {
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
