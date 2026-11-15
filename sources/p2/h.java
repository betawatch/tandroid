package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
