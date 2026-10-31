package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
