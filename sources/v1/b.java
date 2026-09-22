package v1;

import b2.g;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
