package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import m.g3;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class i {
    public final h a;

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new g(uri, clipDescription, uri2);
        } else {
            this.a = new g3(uri, clipDescription, uri2, 29);
        }
    }

    public final ClipDescription a() {
        return this.a.getDescription();
    }

    public i(g gVar) {
        this.a = gVar;
    }
}
