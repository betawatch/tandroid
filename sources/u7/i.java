package u7;

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.qf;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
            nVar.i().a(new jn(locationResult, 23));
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
        this.b.i().a(new qf(this, 22));
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
