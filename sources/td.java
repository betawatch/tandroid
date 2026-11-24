// default package

import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class td implements ToLongFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ td(byte b) {
        this.a = b;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((k27) obj).Z0();
            case 1:
                return Long.parseLong((String) obj);
            case 2:
                return ((hm7) obj).e;
            case 3:
                return ((hm7) obj).e;
            case 4:
                if (((rxa) obj).b == null) {
                    return 0L;
                }
                return r0.k.date;
            case 5:
                return ((joc) obj).I;
            default:
                return ((joc) obj).J;
        }
    }
}
