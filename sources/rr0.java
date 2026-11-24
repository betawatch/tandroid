// default package

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rr0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ qac c;
    public final /* synthetic */ tr0 d;

    public rr0(tr0 tr0Var, LocationManager locationManager, LocationListener[] locationListenerArr, qac qacVar) {
        this.d = tr0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = qacVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(tr0.g(location));
    }
}
