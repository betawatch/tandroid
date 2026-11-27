// default package

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class s73 extends yfb implements ur4 {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public byte h;
    public final /* synthetic */ o83 n;
    public final /* synthetic */ u8a r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s73(o83 o83Var, u8a u8aVar, zw2 zw2Var) {
        super(1, zw2Var);
        this.n = o83Var;
        this.r = u8aVar;
    }

    @Override // qf0
    public final zw2 create(zw2 zw2Var) {
        return new s73(this.n, this.r, zw2Var);
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        return ((s73) create((zw2) obj)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uj7 wj7Var;
        m89 m89Var;
        p89 p89Var;
        p89 p89Var2;
        Iterator it;
        uj7 uj7Var;
        m89 m89Var2;
        p89 p89Var3;
        r73 r73Var;
        wj7 wj7Var2;
        p89 p89Var4;
        m89 m89Var3;
        Object obj2;
        int hashCode;
        Object b;
        Object obj3;
        byte b2 = this.h;
        u8a u8aVar = this.r;
        o83 o83Var = this.n;
        vx2 vx2Var = vx2.a;
        if (b2 == 0) {
            ixe.b(obj);
            wj7Var = new wj7();
            m89Var = new m89();
            p89Var = new p89();
            this.a = wj7Var;
            this.b = m89Var;
            this.c = p89Var;
            this.d = p89Var;
            this.h = (byte) 1;
            obj = o83Var.h(true, this);
            if (obj != vx2Var) {
                p89Var2 = p89Var;
            }
            return vx2Var;
        }
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 != 4) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashCode = this.f;
                    obj3 = this.a;
                    ixe.b(obj);
                    return new k63(hashCode, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (uj7) this.c;
                p89Var4 = (p89) this.b;
                m89Var3 = (m89) this.a;
                ixe.b(obj);
                obj2 = obj4;
                try {
                    m89Var3.a = true;
                    ((wj7) obj2).f(null);
                    Object obj5 = p89Var4.a;
                    hashCode = obj5 == null ? obj5.hashCode() : 0;
                    nr5 c = o83Var.c();
                    this.a = obj5;
                    this.b = null;
                    this.c = null;
                    this.f = hashCode;
                    this.h = (byte) 4;
                    b = c.b(this);
                    if (b != vx2Var) {
                        obj = b;
                        obj3 = obj5;
                        return new k63(hashCode, ((Number) obj).intValue(), obj3);
                    }
                    return vx2Var;
                } catch (Throwable th) {
                    ((wj7) obj2).f(null);
                    throw th;
                }
            }
            it = this.e;
            r73Var = (r73) this.d;
            p89Var3 = (p89) this.c;
            m89Var2 = (m89) this.b;
            uj7Var = (uj7) this.a;
            ixe.b(obj);
            while (it.hasNext()) {
                is4 is4Var = (is4) it.next();
                this.a = uj7Var;
                this.b = m89Var2;
                this.c = p89Var3;
                this.d = r73Var;
                this.e = it;
                this.h = (byte) 2;
                if (is4Var.invoke(r73Var, this) == vx2Var) {
                    break;
                }
            }
            p89Var2 = p89Var3;
            m89Var = m89Var2;
            wj7Var = uj7Var;
            u8aVar.c = null;
            this.a = m89Var;
            this.b = p89Var2;
            this.c = wj7Var;
            this.d = null;
            this.e = null;
            this.h = (byte) 3;
            wj7Var2 = (wj7) wj7Var;
            if (wj7Var2.d(this) != vx2Var) {
                p89Var4 = p89Var2;
                m89Var3 = m89Var;
                obj2 = wj7Var2;
                m89Var3.a = true;
                ((wj7) obj2).f(null);
                Object obj52 = p89Var4.a;
                if (obj52 == null) {
                }
                nr5 c2 = o83Var.c();
                this.a = obj52;
                this.b = null;
                this.c = null;
                this.f = hashCode;
                this.h = (byte) 4;
                b = c2.b(this);
                if (b != vx2Var) {
                }
            }
            return vx2Var;
        }
        p89Var = (p89) this.d;
        p89Var2 = (p89) this.c;
        m89Var = (m89) this.b;
        wj7Var = (uj7) this.a;
        ixe.b(obj);
        p89Var.a = ((k63) obj).b;
        r73 r73Var2 = new r73(wj7Var, m89Var, p89Var2, o83Var);
        List list = (List) u8aVar.c;
        if (list != null) {
            it = list.iterator();
            uj7Var = wj7Var;
            m89Var2 = m89Var;
            p89Var3 = p89Var2;
            r73Var = r73Var2;
            while (it.hasNext()) {
            }
            p89Var2 = p89Var3;
            m89Var = m89Var2;
            wj7Var = uj7Var;
        }
        u8aVar.c = null;
        this.a = m89Var;
        this.b = p89Var2;
        this.c = wj7Var;
        this.d = null;
        this.e = null;
        this.h = (byte) 3;
        wj7Var2 = (wj7) wj7Var;
        if (wj7Var2.d(this) != vx2Var) {
        }
        return vx2Var;
    }
}
