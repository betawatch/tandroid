package p2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
