// default package

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class z63 extends ccb implements qp4 {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public byte h;
    public final /* synthetic */ v73 n;
    public final /* synthetic */ c5a r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z63(v73 v73Var, c5a c5aVar, fw2 fw2Var) {
        super(1, fw2Var);
        this.n = v73Var;
        this.r = c5aVar;
    }

    @Override // of0
    public final fw2 create(fw2 fw2Var) {
        return new z63(this.n, this.r, fw2Var);
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        return ((z63) create((fw2) obj)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lh7 nh7Var;
        z49 z49Var;
        c59 c59Var;
        c59 c59Var2;
        Iterator it;
        lh7 lh7Var;
        z49 z49Var2;
        c59 c59Var3;
        y63 y63Var;
        nh7 nh7Var2;
        c59 c59Var4;
        z49 z49Var3;
        Object obj2;
        int hashCode;
        Object b;
        Object obj3;
        byte b2 = this.h;
        c5a c5aVar = this.r;
        v73 v73Var = this.n;
        bx2 bx2Var = bx2.a;
        if (b2 == 0) {
            qse.b(obj);
            nh7Var = new nh7();
            z49Var = new z49();
            c59Var = new c59();
            this.a = nh7Var;
            this.b = z49Var;
            this.c = c59Var;
            this.d = c59Var;
            this.h = (byte) 1;
            obj = v73Var.h(true, this);
            if (obj != bx2Var) {
                c59Var2 = c59Var;
            }
            return bx2Var;
        }
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 != 4) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashCode = this.f;
                    obj3 = this.a;
                    qse.b(obj);
                    return new s53(hashCode, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (lh7) this.c;
                c59Var4 = (c59) this.b;
                z49Var3 = (z49) this.a;
                qse.b(obj);
                obj2 = obj4;
                try {
                    z49Var3.a = true;
                    ((nh7) obj2).f(null);
                    Object obj5 = c59Var4.a;
                    hashCode = obj5 == null ? obj5.hashCode() : 0;
                    kp5 c = v73Var.c();
                    this.a = obj5;
                    this.b = null;
                    this.c = null;
                    this.f = hashCode;
                    this.h = (byte) 4;
                    b = c.b(this);
                    if (b != bx2Var) {
                        obj = b;
                        obj3 = obj5;
                        return new s53(hashCode, ((Number) obj).intValue(), obj3);
                    }
                    return bx2Var;
                } catch (Throwable th) {
                    ((nh7) obj2).f(null);
                    throw th;
                }
            }
            it = this.e;
            y63Var = (y63) this.d;
            c59Var3 = (c59) this.c;
            z49Var2 = (z49) this.b;
            lh7Var = (lh7) this.a;
            qse.b(obj);
            while (it.hasNext()) {
                eq4 eq4Var = (eq4) it.next();
                this.a = lh7Var;
                this.b = z49Var2;
                this.c = c59Var3;
                this.d = y63Var;
                this.e = it;
                this.h = (byte) 2;
                if (eq4Var.invoke(y63Var, this) == bx2Var) {
                    break;
                }
            }
            c59Var2 = c59Var3;
            z49Var = z49Var2;
            nh7Var = lh7Var;
            c5aVar.d = null;
            this.a = z49Var;
            this.b = c59Var2;
            this.c = nh7Var;
            this.d = null;
            this.e = null;
            this.h = (byte) 3;
            nh7Var2 = (nh7) nh7Var;
            if (nh7Var2.d(this) != bx2Var) {
                c59Var4 = c59Var2;
                z49Var3 = z49Var;
                obj2 = nh7Var2;
                z49Var3.a = true;
                ((nh7) obj2).f(null);
                Object obj52 = c59Var4.a;
                if (obj52 == null) {
                }
                kp5 c2 = v73Var.c();
                this.a = obj52;
                this.b = null;
                this.c = null;
                this.f = hashCode;
                this.h = (byte) 4;
                b = c2.b(this);
                if (b != bx2Var) {
                }
            }
            return bx2Var;
        }
        c59Var = (c59) this.d;
        c59Var2 = (c59) this.c;
        z49Var = (z49) this.b;
        nh7Var = (lh7) this.a;
        qse.b(obj);
        c59Var.a = ((s53) obj).b;
        y63 y63Var2 = new y63(nh7Var, z49Var, c59Var2, v73Var);
        List list = (List) c5aVar.d;
        if (list != null) {
            it = list.iterator();
            lh7Var = nh7Var;
            z49Var2 = z49Var;
            c59Var3 = c59Var2;
            y63Var = y63Var2;
            while (it.hasNext()) {
            }
            c59Var2 = c59Var3;
            z49Var = z49Var2;
            nh7Var = lh7Var;
        }
        c5aVar.d = null;
        this.a = z49Var;
        this.b = c59Var2;
        this.c = nh7Var;
        this.d = null;
        this.e = null;
        this.h = (byte) 3;
        nh7Var2 = (nh7) nh7Var;
        if (nh7Var2.d(this) != bx2Var) {
        }
        return bx2Var;
    }
}
