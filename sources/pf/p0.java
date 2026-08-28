package pf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.pc0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ pc0 c;
    public final /* synthetic */ c2 d;

    public /* synthetic */ p0(w0 w0Var, c2 c2Var, pc0 pc0Var) {
        this.b = w0Var;
        this.d = c2Var;
        this.c = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                w0Var.getClass();
                this.d.dismiss();
                w0Var.presentFragment(this.c);
                break;
            default:
                w0 w0Var2 = this.b;
                pc0 pc0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(w0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(w0Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = w0Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pc0Var.w0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new p0(w0Var2, this.d, pc0Var));
                break;
        }
    }

    public /* synthetic */ p0(w0 w0Var, pc0 pc0Var, c2 c2Var) {
        this.b = w0Var;
        this.c = pc0Var;
        this.d = c2Var;
    }
}
