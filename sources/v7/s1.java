package v7;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class s1 implements ja.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ s1(int i10, boolean z10) {
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
                s1 s1Var = (s1) ((s1) this.c).c;
                while (s1Var != null) {
                    Object obj = s1Var.d;
                    sb2.append(str);
                    String str2 = (String) s1Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    s1Var = (s1) s1Var.c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                s1 s1Var2 = (s1) ((s1) this.d).c;
                while (s1Var2 != null) {
                    Object obj2 = s1Var2.d;
                    sb3.append(str);
                    String str3 = (String) s1Var2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    s1Var2 = (s1) s1Var2.c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public s1(int i10) {
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

    public /* synthetic */ s1(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 11:
                s1 s1Var = new s1(10, false);
                this.d = s1Var;
                this.c = s1Var;
                this.b = str;
                break;
            default:
                s1 s1Var2 = new s1(0, false);
                this.c = s1Var2;
                this.d = s1Var2;
                this.b = str;
                break;
        }
    }
}
