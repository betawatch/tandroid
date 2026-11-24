// default package

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class vr2 extends wf6 {
    public final TimeUnit j;

    public vr2(String str, LongSupplier longSupplier, TimeUnit timeUnit, int i) {
        super(str, longSupplier, 0L, Long.MAX_VALUE, i);
        this.j = timeUnit;
    }

    public final long g(TimeUnit timeUnit) {
        return timeUnit.convert(f(), this.j);
    }

    public final String toString() {
        return this.a + "=" + f() + " " + this.j;
    }
}
