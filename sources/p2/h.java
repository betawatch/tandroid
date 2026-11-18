package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class h {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j3;
        this.c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
