// default package

import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class te implements ToLongFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ te(byte b) {
        this.a = b;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((k47) obj).Z0();
            case 1:
                return Long.parseLong((String) obj);
            case 2:
                return ((ko7) obj).e;
            case 3:
                return ((ko7) obj).e;
            case 4:
                if (((uza) obj).b == null) {
                    return 0L;
                }
                return r0.k.date;
            case 5:
                return ((lqc) obj).I;
            default:
                return ((lqc) obj).J;
        }
    }
}
