package uf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ad0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ ad0 c;
    public final /* synthetic */ d2 d;

    public /* synthetic */ n0(u0 u0Var, d2 d2Var, ad0 ad0Var) {
        this.b = u0Var;
        this.d = d2Var;
        this.c = ad0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                u0Var.getClass();
                this.d.dismiss();
                u0Var.presentFragment(this.c);
                break;
            default:
                u0 u0Var2 = this.b;
                ad0 ad0Var = this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(u0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(u0Var2.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = u0Var2.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        ad0Var.x0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new n0(u0Var2, this.d, ad0Var));
                break;
        }
    }

    public /* synthetic */ n0(u0 u0Var, ad0 ad0Var, d2 d2Var) {
        this.b = u0Var;
        this.c = ad0Var;
        this.d = d2Var;
    }
}
