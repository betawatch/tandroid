// default package

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class s61 implements m8c {
    public final /* synthetic */ t61 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s61(t61 t61Var, Pair pair, Object obj, int i, Object obj2) {
        this.a = t61Var;
        this.b = pair;
        this.c = obj;
        this.d = i;
        this.e = obj2;
    }

    @Override // m8c
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l = (Long) obj3;
        t61 t61Var = this.a;
        t61Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (t61Var.d == null) {
                t61Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            t61Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (t61Var instanceof n97) {
                t61Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        boolean z = true;
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            t61Var.a(pair, obj5);
            gl.c3(new rg((Object) t61Var, (Object) pair, obj5, z, (byte) 2));
        } else {
            if (obj2 != null) {
                l.getClass();
                t61Var.g(this.d, this.e, obj2);
                t61Var.a(pair, obj2);
            }
            gl.c3(new rg((Object) t61Var, (Object) pair, obj2, z, (byte) 2));
        }
    }
}
