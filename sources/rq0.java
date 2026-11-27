// default package

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rq0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ pcc c;
    public final /* synthetic */ tq0 d;

    public rq0(tq0 tq0Var, LocationManager locationManager, LocationListener[] locationListenerArr, pcc pccVar) {
        this.d = tq0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = pccVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(tq0.g(location));
    }
}
