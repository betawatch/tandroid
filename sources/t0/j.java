package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class j {
    public final i a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new g(uri, clipDescription, uri2);
        } else {
            this.a = new h(uri, clipDescription, uri2);
        }
    }

    public final ClipDescription a() {
        return this.a.getDescription();
    }

    public j(g gVar) {
        this.a = gVar;
    }
}
