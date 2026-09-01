package s8;

import java.util.Comparator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
