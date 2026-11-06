package s2;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
