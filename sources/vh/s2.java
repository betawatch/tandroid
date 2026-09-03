package vh;

import j$.util.function.BiFunction$-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Integer) obj2).intValue() + ((Integer) obj).intValue());
    }
}
