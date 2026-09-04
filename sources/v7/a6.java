package v7;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class a6 implements ja.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ a6(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // ja.a
    public /* bridge */ /* synthetic */ ja.a j(Class cls, ia.d dVar) {
        switch (this.a) {
            case 2:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 3:
            default:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 4:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
        }
        return this;
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                a6 a6Var = (a6) ((a6) this.c).d;
                String str = "";
                while (a6Var != null) {
                    Object obj = a6Var.c;
                    sb2.append(str);
                    String str2 = (String) a6Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    a6Var = (a6) a6Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public a6(int i10) {
        this.a = i10;
        switch (i10) {
            case 4:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = x7.d0.c;
                break;
            case 10:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = z7.x.c;
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = w7.e.c;
                break;
        }
    }

    public /* synthetic */ a6(String str) {
        this.a = 9;
        a6 a6Var = new a6(8, false);
        this.c = a6Var;
        this.d = a6Var;
        this.b = str;
    }
}
