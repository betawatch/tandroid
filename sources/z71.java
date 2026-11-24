// default package

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class z71 implements nac {
    public final /* synthetic */ a81 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z71(a81 a81Var, Pair pair, Object obj, int i, Object obj2) {
        this.a = a81Var;
        this.b = pair;
        this.c = obj;
        this.d = i;
        this.e = obj2;
    }

    @Override // nac
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l = (Long) obj3;
        a81 a81Var = this.a;
        a81Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (a81Var.d == null) {
                a81Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            a81Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (a81Var instanceof ob7) {
                a81Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        boolean z = true;
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            a81Var.a(pair, obj5);
            gm.c3(new rh((Object) a81Var, (Object) pair, obj5, z, (byte) 2));
        } else {
            if (obj2 != null) {
                l.getClass();
                a81Var.g(this.d, this.e, obj2);
                a81Var.a(pair, obj2);
            }
            gm.c3(new rh((Object) a81Var, (Object) pair, obj2, z, (byte) 2));
        }
    }
}
