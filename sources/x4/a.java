package x4;

import android.content.ComponentName;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public final g0.b a;
    public final ComponentName b;

    public a(g0.b bVar, ComponentName componentName) {
        this.a = bVar;
        this.b = componentName;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.m - ((a) obj).a.m;
    }
}
