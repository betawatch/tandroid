// default package

import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
