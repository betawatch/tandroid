package s8;

import java.util.Comparator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n extends p {
    public static p f(int i10) {
        return i10 < 0 ? p.b : i10 > 0 ? p.c : p.a;
    }

    @Override // s8.p
    public final p a(int i10, int i11) {
        return f(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // s8.p
    public final p b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // s8.p
    public final p c(boolean z4, boolean z10) {
        return f(z4 == z10 ? 0 : z4 ? 1 : -1);
    }

    @Override // s8.p
    public final p d(boolean z4, boolean z10) {
        return f(z10 == z4 ? 0 : z10 ? 1 : -1);
    }

    @Override // s8.p
    public final int e() {
        return 0;
    }
}
