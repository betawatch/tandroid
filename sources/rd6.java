// default package

import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class rd6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LocationSharingService b;

    public /* synthetic */ rd6(LocationSharingService locationSharingService, byte b) {
        this.a = b;
        this.b = locationSharingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        LocationSharingService locationSharingService = this.b;
        switch (b) {
            case 0:
                int i = LocationSharingService.d;
                locationSharingService.b.postDelayed(locationSharingService.c, 1000L);
                Utilities.d.c(new jm3((byte) 27));
                break;
            default:
                if (!LocationSharingService.a().isEmpty()) {
                    locationSharingService.c(true);
                    break;
                } else {
                    locationSharingService.stopSelf();
                    break;
                }
        }
    }
}
