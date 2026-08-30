package u4;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
