package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class h implements i {
    public final InputContentInfo a;

    public h(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // t0.i
    public final Uri c() {
        return this.a.getContentUri();
    }

    @Override // t0.i
    public final void d() {
        this.a.requestPermission();
    }

    @Override // t0.i
    public final Uri f() {
        return this.a.getLinkUri();
    }

    @Override // t0.i
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override // t0.i
    public final Object l() {
        return this.a;
    }

    @Override // t0.i
    public final void p() {
        this.a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
