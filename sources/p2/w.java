package p2;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w extends IOException {
    public final i2.n a;
    public final Uri b;
    public final Map c;
    public final long d;

    public w(i2.n nVar, Uri uri, Map map, long j10, Exception exc) {
        super(exc);
        this.a = nVar;
        this.b = uri;
        this.c = map;
        this.d = j10;
    }
}
