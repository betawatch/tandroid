package x4;

import android.content.ComponentName;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
