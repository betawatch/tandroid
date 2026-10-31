package xh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ q20 c;
    public final /* synthetic */ o0 d;

    public m0(o0 o0Var, LocationManager locationManager, LocationListener[] locationListenerArr, q20 q20Var) {
        this.d = o0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = q20Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(o0.h(location));
    }
}
