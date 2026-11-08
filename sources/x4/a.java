package x4;

import android.content.ComponentName;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
