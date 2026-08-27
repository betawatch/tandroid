package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public final ClipDescription k() {
        return this.a.getDescription();
    }

    @Override // t0.i
    public final Object l() {
        return this.a;
    }

    @Override // t0.i
    public final void o() {
        this.a.releasePermission();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
