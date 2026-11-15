package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class t {
    public static final AtomicLong g = new AtomicLong();
    public final j2.m a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public t(j2.m mVar, long j3) {
        this(mVar, mVar.a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public t(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.a = mVar;
        this.b = uri;
        this.c = map;
        this.d = j3;
        this.e = j10;
        this.f = j11;
    }
}
