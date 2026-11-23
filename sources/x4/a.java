package x4;

import android.content.ComponentName;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
