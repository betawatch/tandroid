// default package

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class va9 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zb9 b;

    public /* synthetic */ va9(zb9 zb9Var, byte b) {
        this.a = b;
        this.b = zb9Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        zb9 zb9Var = this.b;
        switch (b) {
            case 0:
                qb9 qb9Var = zb9Var.d;
                Integer num = (Integer) qb9Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num2 = (Integer) qb9Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num == null) {
                    return 1;
                }
                if (num2 != null) {
                    return num2.intValue() - num.intValue();
                }
                return -1;
            case 1:
                qb9 qb9Var2 = zb9Var.d;
                Integer num3 = (Integer) qb9Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) qb9Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 != null) {
                    return num4.intValue() - num3.intValue();
                }
                return -1;
            default:
                qb9 qb9Var3 = zb9Var.d;
                Integer num5 = (Integer) qb9Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num6 = (Integer) qb9Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num5 == null) {
                    return 1;
                }
                if (num6 != null) {
                    return num6.intValue() - num5.intValue();
                }
                return -1;
        }
    }
}
