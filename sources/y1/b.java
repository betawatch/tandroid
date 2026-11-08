package y1;

import bi.b1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends b1 {
    public b() {
        this(a.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b1 initialExtras) {
        super(9);
        j.e(initialExtras, "initialExtras");
        ((LinkedHashMap) this.a).putAll((LinkedHashMap) initialExtras.a);
    }
}
