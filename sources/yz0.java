// default package

import j$.util.function.BiFunction$-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class yz0 implements BiFunction {
    public final /* synthetic */ byte a;

    public final /* synthetic */ BiFunction andThen(Function function) {
        byte b = this.a;
        return BiFunction$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.valueOf(Math.max(((Long) obj).longValue(), ((Long) obj2).longValue()));
            default:
                return Integer.valueOf(((Integer) obj2).intValue() + ((Integer) obj).intValue());
        }
    }
}
