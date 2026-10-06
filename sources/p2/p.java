package p2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public abstract class p implements t2.a {
    public final String a;
    public final List b;
    public final boolean c;

    public p(String str, List list, boolean z10) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z10;
    }
}
