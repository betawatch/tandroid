package u2;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import v7.u6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public class c implements ka.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ c(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // ka.a
    public /* bridge */ /* synthetic */ ka.a a(Class cls, ja.d dVar) {
        switch (this.a) {
            case 1:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 6:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 9:
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

    public long b() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(g2.h hVar, Uri uri, Map map, long j10, long j11, x0 x0Var) {
        c3.l lVar = new c3.l(hVar, j10, j11);
        this.d = lVar;
        if (((c3.o) this.c) != null) {
            return;
        }
        c3.o[] e = ((c3.r) this.b).e(uri, map);
        int length = e.length;
        e9.l0 l0Var = e9.n0.b;
        e9.s.f(length, "expectedSize");
        e9.k0 k0Var = new e9.k0(length);
        boolean z10 = true;
        if (e.length == 1) {
            this.c = e[0];
        } else {
            int length2 = e.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                c3.o oVar = e[i10];
                try {
                } catch (EOFException unused) {
                    if (((c3.o) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((c3.o) this.c) == null && lVar.d != j10) {
                        z10 = false;
                    }
                    u6.p(z10);
                    lVar.f = 0;
                    throw th2;
                }
                if (oVar.a(lVar)) {
                    this.c = oVar;
                    lVar.f = 0;
                    break;
                }
                k0Var.d(oVar.e());
                if (((c3.o) this.c) == null) {
                }
                boolean z11 = true;
                u6.p(z11);
                lVar.f = 0;
                i10++;
            }
            if (((c3.o) this.c) == null) {
                String str = "None of the available extractors (" + new d9.l(", ", 0).e(e9.s.x(e9.n0.v(e), new sg.y(7))) + ") could read the stream.";
                uri.getClass();
                throw new t1(str, k0Var.f());
            }
        }
        ((c3.o) this.c).c(x0Var);
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 3:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                c cVar = (c) ((c) this.c).d;
                while (cVar != null) {
                    Object obj = cVar.c;
                    sb2.append(str);
                    String str2 = (String) cVar.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    cVar = (c) cVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 14:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                c cVar2 = (c) ((c) this.c).d;
                while (cVar2 != null) {
                    Object obj2 = cVar2.c;
                    sb3.append(str);
                    String str3 = (String) cVar2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    cVar2 = (c) cVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = w7.e.c;
                break;
            case 9:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = x7.d0.c;
                break;
            case 15:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = z7.x.c;
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = v7.i.c;
                break;
        }
    }

    public /* synthetic */ c(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 14:
                c cVar = new c(13, false);
                this.c = cVar;
                this.d = cVar;
                this.b = str;
                break;
            default:
                c cVar2 = new c(2, false);
                this.c = cVar2;
                this.d = cVar2;
                this.b = str;
                break;
        }
    }

    public c(String str, Boolean bool, wc.a aVar, String str2) {
        this.a = 8;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public c(c3.r rVar) {
        this.a = 0;
        this.b = rVar;
    }
}
