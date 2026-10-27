package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u {
    public static final AtomicLong g = new AtomicLong();
    public final g2.m a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public u(g2.m mVar, long j10) {
        this(mVar, mVar.a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(g2.m mVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.a = mVar;
        this.b = uri;
        this.c = map;
        this.d = j10;
        this.e = j11;
        this.f = j12;
    }
}
