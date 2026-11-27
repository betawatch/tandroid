// default package

import j$.util.function.BiFunction$-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
