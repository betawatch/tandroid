package p4;

import android.media.MediaRouter2;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class i extends MediaRouter2.RouteCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ i(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesAdded(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesChanged(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesRemoved(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesUpdated(List list) {
        switch (this.a) {
            case 1:
                this.b.q();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
