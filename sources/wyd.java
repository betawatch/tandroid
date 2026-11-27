// default package

import java.lang.reflect.Field;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class wyd {
    public Object A;
    public final pi5 a;
    public final Object[] b;
    public final Class c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int[] m;
    public int n;
    public int o;
    public int p = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int q = TLObject.FLAG_31;
    public int r = 0;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public Field x;
    public Object y;
    public Object z;

    public wyd(Class cls, String str, Object[] objArr) {
        this.c = cls;
        pi5 pi5Var = new pi5(str, (byte) 4);
        this.a = pi5Var;
        this.b = objArr;
        this.d = pi5Var.b();
        int b = pi5Var.b();
        this.e = b;
        if (b == 0) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.k = 0;
            this.j = 0;
            this.l = 0;
            this.m = null;
            return;
        }
        int b2 = pi5Var.b();
        this.f = b2;
        int b3 = pi5Var.b();
        this.g = pi5Var.b();
        this.h = pi5Var.b();
        this.k = pi5Var.b();
        this.j = pi5Var.b();
        this.i = pi5Var.b();
        this.l = pi5Var.b();
        int b4 = pi5Var.b();
        this.m = b4 != 0 ? new int[b4] : null;
        this.n = (b2 << 1) + b3;
    }

    public static Field b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            xi4.l(c00.k(sb, " not found. Known fields are ", arrays));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        if ((r8.t & 2048) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        if ((r1 & 1) == 1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        pi5 pi5Var = this.a;
        if (pi5Var.b >= pi5Var.c.length()) {
            return false;
        }
        this.s = pi5Var.b();
        int b = pi5Var.b();
        this.t = b;
        int i = b & jn7.d4;
        this.u = i;
        int i2 = this.s;
        if (i2 < this.p) {
            this.p = i2;
        }
        if (i2 > this.q) {
            this.q = i2;
        }
        gmd gmdVar = gmd.s;
        byte b2 = gmdVar.a;
        if (i != b2 && i >= gmd.e.a) {
            byte b3 = gmd.r.a;
        }
        this.r++;
        Class cls = wzd.a;
        if ((b & 1024) != 0) {
            int i3 = this.o;
            this.o = i3 + 1;
            this.m[i3] = i2;
        }
        this.y = null;
        this.z = null;
        this.A = null;
        int i4 = this.d;
        if (i > b2) {
            this.v = pi5Var.b();
            int i5 = this.u;
            if (i5 != gmd.b.a + 51 && i5 != gmd.d.a + 51) {
                if (i5 != gmd.c.a + 51 || (i4 & 1) != 1) {
                    return true;
                }
                this.z = c();
            }
            this.y = c();
            return true;
        }
        this.x = b(this.c, (String) c());
        if ((i4 & 1) == 1 && this.u <= gmd.d.a) {
            this.w = pi5Var.b();
        }
        int i6 = this.u;
        if (i6 == gmd.b.a || i6 == gmd.d.a) {
            this.y = this.x.getType();
            return true;
        }
        if (i6 != gmd.f.a && i6 != gmd.r.a) {
            if (i6 != gmd.c.a && i6 != gmd.h.a && i6 != gmd.n.a) {
                if (i6 == gmdVar.a) {
                    this.A = c();
                }
                return true;
            }
            this.z = c();
        }
        this.y = c();
        return true;
        return true;
    }

    public final Object c() {
        int i = this.n;
        this.n = i + 1;
        return this.b[i];
    }
}
