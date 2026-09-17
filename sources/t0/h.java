package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
    public final Object i() {
        return this.a;
    }

    @Override // t0.i
    public final void k() {
        this.a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
