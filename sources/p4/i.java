package p4;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class i extends MediaRouter2$RouteCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ i(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

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
