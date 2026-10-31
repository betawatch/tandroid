package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u {
    public static final AtomicLong g = new AtomicLong();
    public final g2.n a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public u(g2.n nVar, long j10) {
        this(nVar, nVar.a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(g2.n nVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.a = nVar;
        this.b = uri;
        this.c = map;
        this.d = j10;
        this.e = j11;
        this.f = j12;
    }
}
