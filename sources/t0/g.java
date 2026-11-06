package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g implements h {
    public final InputContentInfo a;

    public g(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // t0.h
    public final Uri c() {
        return this.a.getContentUri();
    }

    @Override // t0.h
    public final void e() {
        this.a.requestPermission();
    }

    @Override // t0.h
    public final Uri f() {
        return this.a.getLinkUri();
    }

    @Override // t0.h
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override // t0.h
    public final Object h() {
        return this.a;
    }

    @Override // t0.h
    public final void i() {
        this.a.releasePermission();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
