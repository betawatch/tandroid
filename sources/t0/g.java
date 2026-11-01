package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class g implements h {
    public final InputContentInfo a;

    public g(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // t0.h
    public final Uri a() {
        return this.a.getContentUri();
    }

    @Override // t0.h
    public final void c() {
        this.a.requestPermission();
    }

    @Override // t0.h
    public final Uri d() {
        return this.a.getLinkUri();
    }

    @Override // t0.h
    public final Object f() {
        return this.a;
    }

    @Override // t0.h
    public final void g() {
        this.a.releasePermission();
    }

    @Override // t0.h
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
