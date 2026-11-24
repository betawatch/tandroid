// default package

import j$.util.function.BiFunction$-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class qz0 implements BiFunction {
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
