package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class u {
    public static final AtomicLong b = new AtomicLong();
    public final long a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(g2.m mVar) {
        this(0L);
        Uri uri = mVar.a;
        Map map = Collections.EMPTY_MAP;
    }

    public u(long j3) {
        this.a = j3;
    }
}
