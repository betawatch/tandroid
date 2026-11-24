// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class qn2 implements fs4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ qn2(byte b) {
        this.a = b;
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        rn2 rn2Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                ay2 ay2Var = (ay2) obj2;
                str.getClass();
                ay2Var.getClass();
                if (str.length() == 0) {
                    return ay2Var.toString();
                }
                return str + ", " + ay2Var;
            case 1:
                cy2 cy2Var = (cy2) obj;
                ay2 ay2Var2 = (ay2) obj2;
                cy2Var.getClass();
                ay2Var2.getClass();
                cy2 minusKey = cy2Var.minusKey(ay2Var2.getKey());
                k34 k34Var = k34.a;
                if (minusKey == k34Var) {
                    return ay2Var2;
                }
                jk2 jk2Var = jk2.b;
                fy2 fy2Var = (fy2) minusKey.get(jk2Var);
                if (fy2Var == null) {
                    rn2Var = new rn2(ay2Var2, minusKey);
                } else {
                    cy2 minusKey2 = minusKey.minusKey(jk2Var);
                    if (minusKey2 == k34Var) {
                        return new rn2(fy2Var, ay2Var2);
                    }
                    rn2Var = new rn2(fy2Var, new rn2(ay2Var2, minusKey2));
                }
                return rn2Var;
            case 2:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 3:
                return ((cy2) obj).plus((ay2) obj2);
            case 4:
                return ((cy2) obj).plus((ay2) obj2);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                return obj;
            case 7:
                if (obj == null) {
                    return null;
                }
                rjb.p();
                return null;
            default:
                return (gpb) obj;
        }
    }
}
