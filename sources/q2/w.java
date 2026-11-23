package q2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
