package xh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class m0 implements LocationListener {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ LocationListener[] b;
    public final /* synthetic */ r20 c;
    public final /* synthetic */ o0 d;

    public m0(o0 o0Var, LocationManager locationManager, LocationListener[] locationListenerArr, r20 r20Var) {
        this.d = o0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = r20Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(o0.h(location));
    }
}
