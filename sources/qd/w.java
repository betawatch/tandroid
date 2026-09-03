package qd;

import ld.b2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.k implements dd.p {
    public static final w c;
    public static final w d;
    public static final w e;
    public final /* synthetic */ int b;

    static {
        int i10 = 2;
        c = new w(i10, 0);
        d = new w(i10, 1);
        e = new w(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10, int i11) {
        super(i10);
        this.b = i11;
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                uc.f fVar = (uc.f) obj2;
                if (!(fVar instanceof b2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar : Integer.valueOf(intValue + 1);
            case 1:
                b2 b2Var = (b2) obj;
                uc.f fVar2 = (uc.f) obj2;
                if (b2Var != null) {
                    return b2Var;
                }
                if (fVar2 instanceof b2) {
                    return (b2) fVar2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
