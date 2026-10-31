package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements ld.p {
    public static final x c;
    public static final x d;
    public final /* synthetic */ int b;

    static {
        int i10 = 2;
        c = new x(i10, 0);
        d = new x(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, int i11) {
        super(i10);
        this.b = i11;
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((cd.h) obj).plus((cd.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((cd.h) obj).plus((cd.f) obj2);
        }
    }
}
