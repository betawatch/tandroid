// default package

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class th9 {
    public final rh9 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final uh9 e;
    public int f;
    public int g;
    public uh9 h;

    public th9(rh9 rh9Var, ArrayList arrayList, int i, int i2, uh9 uh9Var, int i3, int i4, uh9 uh9Var2) {
        this.a = rh9Var;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = uh9Var;
        this.f = i3;
        this.g = i4;
        this.h = uh9Var2;
    }

    public final TL_iv.RichText a(int i) {
        int i2 = i == this.c ? this.d : 0;
        int i3 = i == this.f ? this.g : Integer.MAX_VALUE;
        return (i2 == 0 && i3 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i) : b(i).b(i2, i3);
    }

    public final uh9 b(int i) {
        if (i == this.c) {
            return this.e;
        }
        int i2 = this.f;
        ArrayList arrayList = this.b;
        rh9 rh9Var = this.a;
        if (i != i2) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new uh9(richText, identityHashMap, rh9Var.o(richText, 0, identityHashMap).length(), 0);
        }
        uh9 uh9Var = this.h;
        if (uh9Var != null) {
            return uh9Var;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        uh9 uh9Var2 = new uh9(richText2, identityHashMap2, rh9Var.o(richText2, 0, identityHashMap2).length(), 0);
        this.h = uh9Var2;
        return uh9Var2;
    }
}
