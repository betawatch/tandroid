package z4;

import java.util.Collections;
import java.util.List;
import r4.f;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements f {
    public static final b b = new b();
    public final List a;

    public b(r4.b bVar) {
        this.a = Collections.singletonList(bVar);
    }

    @Override // r4.f
    public final int b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // r4.f
    public final long h(int i9) {
        d5.a.f(i9 == 0);
        return 0L;
    }

    @Override // r4.f
    public final List m(long j10) {
        return j10 >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // r4.f
    public final int r() {
        return 1;
    }

    public b() {
        this.a = Collections.EMPTY_LIST;
    }
}
