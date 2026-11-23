package x4;

import android.content.ComponentName;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
