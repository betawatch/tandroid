package v1;

import b2.g;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class b extends g {
    public b() {
        this(a.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g initialExtras) {
        super(7);
        i.e(initialExtras, "initialExtras");
        ((LinkedHashMap) this.a).putAll((LinkedHashMap) initialExtras.a);
    }
}
