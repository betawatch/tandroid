package ph;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ l2(r3 r3Var, int i10) {
        this.a = i10;
        this.b = r3Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b.d;
                Integer num = (Integer) h3Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num2 = (Integer) h3Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                h3 h3Var2 = this.b.d;
                Integer num3 = (Integer) h3Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) h3Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                h3 h3Var3 = this.b.d;
                Integer num5 = (Integer) h3Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num6 = (Integer) h3Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num5 == null) {
                    return 1;
                }
                if (num6 == null) {
                    return -1;
                }
                return num6.intValue() - num5.intValue();
        }
    }
}
