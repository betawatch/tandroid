package sf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.rc0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ rc0 c;
    public final /* synthetic */ c2 d;

    public /* synthetic */ o0(v0 v0Var, c2 c2Var, rc0 rc0Var) {
        this.b = v0Var;
        this.d = c2Var;
        this.c = rc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                v0Var.getClass();
                this.d.dismiss();
                v0Var.presentFragment(this.c);
                break;
            default:
                v0 v0Var2 = this.b;
                rc0 rc0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(v0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(v0Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = v0Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        rc0Var.w0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new o0(v0Var2, this.d, rc0Var));
                break;
        }
    }

    public /* synthetic */ o0(v0 v0Var, rc0 rc0Var, c2 c2Var) {
        this.b = v0Var;
        this.c = rc0Var;
        this.d = c2Var;
    }
}
