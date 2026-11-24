// default package

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wq2 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public boolean e;
    public lr2 f;
    public final HashSet g;

    public wq2(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(yy8.a(cls));
        for (Class cls2 : clsArr) {
            kte.a(cls2, "Null interface");
            this.b.add(yy8.a(cls2));
        }
    }

    public final void a(if3 if3Var) {
        if (this.b.contains(if3Var.a)) {
            u36.j("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(if3Var);
        }
    }

    public final xq2 b() {
        if (!(this.f != null)) {
            dq9.m("Missing required property: factory.");
            return null;
        }
        return new xq2(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e ? 1 : 0, this.f, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            dq9.m("Instantiation type has already been set.");
        }
    }

    public wq2(yy8 yy8Var, yy8... yy8VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(yy8Var);
        for (yy8 yy8Var2 : yy8VarArr) {
            kte.a(yy8Var2, "Null interface");
        }
        Collections.addAll(this.b, yy8VarArr);
    }
}
