// default package

import j$.util.function.IntUnaryOperator$-CC;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ytc implements IntUnaryOperator {
    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$-CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        if (i >= 16777215) {
            return 1;
        }
        return i + 1;
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$-CC.$default$compose(this, intUnaryOperator);
    }
}
