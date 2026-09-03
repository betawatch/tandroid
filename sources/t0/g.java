package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
    public final void b() {
        this.a.requestPermission();
    }

    @Override // t0.h
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // t0.h
    public final Object d() {
        return this.a;
    }

    @Override // t0.h
    public final void e() {
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
