package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class j {
    public final i a;

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new h(uri, clipDescription, uri2);
        } else {
            this.a = new lf.i(uri, clipDescription, uri2, 26);
        }
    }

    public final ClipDescription a() {
        return this.a.getDescription();
    }

    public j(h hVar) {
        this.a = hVar;
    }
}
