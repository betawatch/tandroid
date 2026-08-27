package p8;

import java.util.Comparator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r extends t {
    public static t f(int i10) {
        return i10 < 0 ? t.b : i10 > 0 ? t.c : t.a;
    }

    @Override // p8.t
    public final t a(int i10, int i11) {
        return f(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // p8.t
    public final t b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // p8.t
    public final t c(boolean z10, boolean z11) {
        return f(z10 == z11 ? 0 : z10 ? 1 : -1);
    }

    @Override // p8.t
    public final t d(boolean z10, boolean z11) {
        return f(z11 == z10 ? 0 : z11 ? 1 : -1);
    }

    @Override // p8.t
    public final int e() {
        return 0;
    }
}
