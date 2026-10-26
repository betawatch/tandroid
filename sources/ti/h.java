package ti;

import j$.util.function.IntUnaryOperator$-CC;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements IntUnaryOperator {
    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$-CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i10) {
        if (i10 >= 16777215) {
            return 1;
        }
        return i10 + 1;
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$-CC.$default$compose(this, intUnaryOperator);
    }
}
