package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final void f() {
        this.a.requestPermission();
    }

    @Override // t0.i
    public final Uri g() {
        return this.a.getLinkUri();
    }

    @Override // t0.i
    public final ClipDescription j() {
        return this.a.getDescription();
    }

    @Override // t0.i
    public final Object k() {
        return this.a;
    }

    @Override // t0.i
    public final void m() {
        this.a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
