package v7;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class l implements ja.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ l(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // ja.a
    public /* bridge */ /* synthetic */ ja.a a(Class cls, ia.d dVar) {
        switch (this.a) {
            case 0:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 5:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 7:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            default:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
        }
        return this;
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                l lVar = (l) ((l) this.c).d;
                while (lVar != null) {
                    Object obj = lVar.c;
                    sb2.append(str);
                    String str2 = (String) lVar.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    lVar = (l) lVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                l lVar2 = (l) ((l) this.c).d;
                while (lVar2 != null) {
                    Object obj2 = lVar2.c;
                    sb3.append(str);
                    String str3 = (String) lVar2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    lVar2 = (l) lVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public l(int i10) {
        this.a = i10;
        switch (i10) {
            case 5:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = w7.e.c;
                break;
            case 7:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = x7.d0.c;
                break;
            case 13:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = z7.x.c;
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = i.c;
                break;
        }
    }

    public /* synthetic */ l(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 12:
                l lVar = new l(11, false);
                this.c = lVar;
                this.d = lVar;
                this.b = str;
                break;
            default:
                l lVar2 = new l(1, false);
                this.c = lVar2;
                this.d = lVar2;
                this.b = str;
                break;
        }
    }
}
