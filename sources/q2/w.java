package q2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class w extends IOException {
    public final j2.m a;
    public final Uri b;
    public final Map c;
    public final long d;

    public w(j2.m mVar, Uri uri, Map map, long j3, Exception exc) {
        super(exc);
        this.a = mVar;
        this.b = uri;
        this.c = map;
        this.d = j3;
    }
}
