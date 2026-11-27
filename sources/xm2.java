// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class xm2 implements is4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ xm2(byte b) {
        this.a = b;
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        ym2 ym2Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                kx2 kx2Var = (kx2) obj2;
                str.getClass();
                kx2Var.getClass();
                if (str.length() == 0) {
                    return kx2Var.toString();
                }
                return str + ", " + kx2Var;
            case 1:
                mx2 mx2Var = (mx2) obj;
                kx2 kx2Var2 = (kx2) obj2;
                mx2Var.getClass();
                kx2Var2.getClass();
                mx2 minusKey = mx2Var.minusKey(kx2Var2.getKey());
                u24 u24Var = u24.a;
                if (minusKey == u24Var) {
                    return kx2Var2;
                }
                rj2 rj2Var = rj2.b;
                px2 px2Var = (px2) minusKey.get(rj2Var);
                if (px2Var == null) {
                    ym2Var = new ym2(kx2Var2, minusKey);
                } else {
                    mx2 minusKey2 = minusKey.minusKey(rj2Var);
                    if (minusKey2 == u24Var) {
                        return new ym2(px2Var, kx2Var2);
                    }
                    ym2Var = new ym2(px2Var, new ym2(kx2Var2, minusKey2));
                }
                return ym2Var;
            case 2:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 3:
                return ((mx2) obj).plus((kx2) obj2);
            case 4:
                return ((mx2) obj).plus((kx2) obj2);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                return obj;
            case 7:
                if (obj == null) {
                    return null;
                }
                grb.o();
                return null;
            default:
                return (erb) obj;
        }
    }
}
