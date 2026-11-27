// default package

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class os2 extends ai6 {
    public final TimeUnit j;

    public os2(String str, LongSupplier longSupplier, TimeUnit timeUnit, int i) {
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
