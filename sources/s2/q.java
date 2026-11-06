package s2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class q implements w2.a {
    public final String a;
    public final List b;
    public final boolean c;

    public q(String str, List list, boolean z9) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z9;
    }
}
