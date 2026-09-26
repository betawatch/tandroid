package zd;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements rd.p {
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

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((id.h) obj).plus((id.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((id.h) obj).plus((id.f) obj2);
        }
    }
}
