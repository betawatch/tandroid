package zh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ i2(m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b.d;
                Integer num = (Integer) c3Var.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num2 = (Integer) c3Var.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                c3 c3Var2 = this.b.d;
                Integer num3 = (Integer) c3Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) c3Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                c3 c3Var3 = this.b.d;
                Integer num5 = (Integer) c3Var3.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num6 = (Integer) c3Var3.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
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
