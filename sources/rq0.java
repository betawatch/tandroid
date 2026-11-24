// default package

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rq0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ p8c c;
    public final /* synthetic */ tq0 d;

    public rq0(tq0 tq0Var, LocationManager locationManager, LocationListener[] locationListenerArr, p8c p8cVar) {
        this.d = tq0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = p8cVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(tq0.g(location));
    }
}
