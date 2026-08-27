package z4;

import java.util.Collections;
import java.util.List;
import r4.c;
import r4.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements g {
    public static final b b = new b();
    public final List a;

    public b(c cVar) {
        this.a = Collections.singletonList(cVar);
    }

    @Override // r4.g
    public final int c(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // r4.g
    public final long f(int i10) {
        d5.a.f(i10 == 0);
        return 0L;
    }

    @Override // r4.g
    public final List h(long j10) {
        return j10 >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // r4.g
    public final int p() {
        return 1;
    }

    public b() {
        this.a = Collections.EMPTY_LIST;
    }
}
