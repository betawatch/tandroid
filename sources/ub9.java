// default package

import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ub9 {
    public final ko4 a;
    public final po5 b;
    public final long c;
    public final List d;
    public final n29 e;

    public ub9(ko4 ko4Var, po5 po5Var, nz9 nz9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        yve.f(!po5Var.isEmpty());
        this.a = ko4Var;
        this.b = po5.q(po5Var);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = nz9Var.b(this);
        long j = nz9Var.c;
        long j2 = nz9Var.b;
        String str = gcc.a;
        this.c = gcc.b0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public String a() {
        return null;
    }

    public abstract j63 b();

    public n29 c() {
        return null;
    }
}
