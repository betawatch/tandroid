package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g implements i {
    public final InputContentInfo a;

    public g(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // t0.i
    public final Uri a() {
        return this.a.getContentUri();
    }

    @Override // t0.i
    public final void b() {
        this.a.requestPermission();
    }

    @Override // t0.i
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // t0.i
    public final Object e() {
        return this.a;
    }

    @Override // t0.i
    public final void f() {
        this.a.releasePermission();
    }

    @Override // t0.i
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
