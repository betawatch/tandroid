package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j {
    public final i a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new h(uri, clipDescription, uri2);
        } else {
            this.a = new j4.c(uri, clipDescription, uri2, false, 29);
        }
    }

    public final ClipDescription a() {
        return this.a.j();
    }

    public j(h hVar) {
        this.a = hVar;
    }
}
