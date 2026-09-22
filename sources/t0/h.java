package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
