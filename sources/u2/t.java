package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class t {
    public static final AtomicLong g = new AtomicLong();
    public final g2.m a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public t(g2.m mVar, long j10) {
        this(mVar, mVar.a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public t(g2.m mVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.a = mVar;
        this.b = uri;
        this.c = map;
        this.d = j10;
        this.e = j11;
        this.f = j12;
    }
}
