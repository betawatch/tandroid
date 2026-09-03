package v1;

import cb.e;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends e {
    public b() {
        this(a.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e initialExtras) {
        super(7);
        j.e(initialExtras, "initialExtras");
        ((LinkedHashMap) this.a).putAll((LinkedHashMap) initialExtras.a);
    }
}
