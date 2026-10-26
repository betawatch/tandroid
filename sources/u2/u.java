package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
