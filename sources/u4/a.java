package u4;

import android.content.ComponentName;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
