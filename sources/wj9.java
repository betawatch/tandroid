// default package

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wj9 {
    public final uj9 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final xj9 e;
    public int f;
    public int g;
    public xj9 h;

    public wj9(uj9 uj9Var, ArrayList arrayList, int i, int i2, xj9 xj9Var, int i3, int i4, xj9 xj9Var2) {
        this.a = uj9Var;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = xj9Var;
        this.f = i3;
        this.g = i4;
        this.h = xj9Var2;
    }

    public final TL_iv.RichText a(int i) {
        int i2 = i == this.c ? this.d : 0;
        int i3 = i == this.f ? this.g : Integer.MAX_VALUE;
        return (i2 == 0 && i3 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i) : b(i).b(i2, i3);
    }

    public final xj9 b(int i) {
        if (i == this.c) {
            return this.e;
        }
        int i2 = this.f;
        ArrayList arrayList = this.b;
        uj9 uj9Var = this.a;
        if (i != i2) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new xj9(richText, identityHashMap, uj9Var.o(richText, 0, identityHashMap).length(), 0);
        }
        xj9 xj9Var = this.h;
        if (xj9Var != null) {
            return xj9Var;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        xj9 xj9Var2 = new xj9(richText2, identityHashMap2, uj9Var.o(richText2, 0, identityHashMap2).length(), 0);
        this.h = xj9Var2;
        return xj9Var2;
    }
}
