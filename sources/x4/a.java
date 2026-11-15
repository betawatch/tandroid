package x4;

import android.content.ComponentName;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
