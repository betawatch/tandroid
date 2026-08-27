package qf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.tc0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ tc0 c;
    public final /* synthetic */ b2 d;

    public /* synthetic */ p0(w0 w0Var, b2 b2Var, tc0 tc0Var) {
        this.b = w0Var;
        this.d = b2Var;
        this.c = tc0Var;
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
                tc0 tc0Var = this.c;
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
                        tc0Var.w0 = tL_channelLocation;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                AndroidUtilities.runOnUIThread(new p0(w0Var2, this.d, tc0Var));
                break;
        }
    }

    public /* synthetic */ p0(w0 w0Var, tc0 tc0Var, b2 b2Var) {
        this.b = w0Var;
        this.c = tc0Var;
        this.d = b2Var;
    }
}
