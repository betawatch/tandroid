package u4;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class m implements n4.a {
    public final String a;
    public final List b;
    public final boolean c;

    public m(String str, List list, boolean z4) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z4;
    }
}
