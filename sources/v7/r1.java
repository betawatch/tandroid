package v7;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class r1 implements ja.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ r1(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // ja.a
    public /* bridge */ /* synthetic */ ja.a m(Class cls, ia.d dVar) {
        switch (this.a) {
            case 4:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                break;
            case 5:
            default:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                break;
            case 6:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                break;
        }
        return this;
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                r1 r1Var = (r1) ((r1) this.c).c;
                while (r1Var != null) {
                    Object obj = r1Var.d;
                    sb2.append(str);
                    String str2 = (String) r1Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    r1Var = (r1) r1Var.c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                r1 r1Var2 = (r1) ((r1) this.d).c;
                while (r1Var2 != null) {
                    Object obj2 = r1Var2.d;
                    sb3.append(str);
                    String str3 = (String) r1Var2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    r1Var2 = (r1) r1Var2.c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public r1(int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                this.b = new HashMap();
                this.d = new HashMap();
                this.c = x7.d0.c;
                break;
            case 12:
                this.b = new HashMap();
                this.d = new HashMap();
                this.c = z7.x.c;
                break;
            default:
                this.b = new HashMap();
                this.d = new HashMap();
                this.c = w7.e.c;
                break;
        }
    }

    public /* synthetic */ r1(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 11:
                r1 r1Var = new r1(10, false);
                this.d = r1Var;
                this.c = r1Var;
                this.b = str;
                break;
            default:
                r1 r1Var2 = new r1(0, false);
                this.c = r1Var2;
                this.d = r1Var2;
                this.b = str;
                break;
        }
    }
}
