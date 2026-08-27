package p8;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g0 implements o8.i, Serializable {
    public final int a;

    public g0() {
        l.a(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // o8.i
    public final Object get() {
        return new ArrayList(this.a);
    }
}
