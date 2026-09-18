package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class i {
    public final h a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new g(uri, clipDescription, uri2);
        } else {
            this.a = new lf.i(uri, clipDescription, uri2, 26);
        }
    }

    public final ClipDescription a() {
        return this.a.getDescription();
    }

    public i(g gVar) {
        this.a = gVar;
    }
}
