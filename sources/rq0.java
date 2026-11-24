// default package

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
