package u4;

import android.content.ComponentName;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
