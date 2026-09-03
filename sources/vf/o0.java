package vf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.bd0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ bd0 c;
    public final /* synthetic */ d2 d;

    public /* synthetic */ o0(v0 v0Var, d2 d2Var, bd0 bd0Var) {
        this.b = v0Var;
        this.d = d2Var;
        this.c = bd0Var;
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
                bd0 bd0Var = this.c;
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
                        bd0Var.x0 = tL_channelLocation;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                AndroidUtilities.runOnUIThread(new o0(v0Var2, this.d, bd0Var));
                break;
        }
    }

    public /* synthetic */ o0(v0 v0Var, bd0 bd0Var, d2 d2Var) {
        this.b = v0Var;
        this.c = bd0Var;
        this.d = d2Var;
    }
}
