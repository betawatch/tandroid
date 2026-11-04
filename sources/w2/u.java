package w2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u {
    public static final AtomicLong g = new AtomicLong();
    public final i2.n a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public u(i2.n nVar, long j10) {
        this(nVar, nVar.a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(i2.n nVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.a = nVar;
        this.b = uri;
        this.c = map;
        this.d = j10;
        this.e = j11;
        this.f = j12;
    }
}
