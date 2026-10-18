package u4;

import android.content.ComponentName;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public final g0.c a;
    public final ComponentName b;

    public a(g0.c cVar, ComponentName componentName) {
        this.a = cVar;
        this.b = componentName;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.m - ((a) obj).a.m;
    }
}
