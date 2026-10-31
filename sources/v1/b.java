package v1;

import b2.h;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends h {
    public b() {
        this(a.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h initialExtras) {
        super(9);
        i.e(initialExtras, "initialExtras");
        ((LinkedHashMap) this.a).putAll((LinkedHashMap) initialExtras.a);
    }
}
