package t0;

import android.content.ClipDescription;
import android.net.Uri;
import c3.l;
import c3.o;
import c3.r;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.s;
import java.io.EOFException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import u2.r1;
import u2.v0;
import v7.u6;
import x7.d0;
import z7.x;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class h implements i, ka.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ h(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // t0.i
    public Uri a() {
        return (Uri) this.b;
    }

    @Override // t0.i
    public Uri c() {
        return (Uri) this.c;
    }

    @Override // ka.a
    public /* bridge */ /* synthetic */ ka.a d(Class cls, ja.d dVar) {
        switch (this.a) {
            case 2:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 7:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 10:
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

    @Override // t0.i
    public Object e() {
        return null;
    }

    public long g() {
        l lVar = (l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    @Override // t0.i
    public ClipDescription getDescription() {
        return (ClipDescription) this.d;
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
    public void h(g2.h hVar, Uri uri, Map map, long j10, long j11, v0 v0Var) {
        l lVar = new l(hVar, j10, j11);
        this.d = lVar;
        if (((o) this.c) != null) {
            return;
        }
        o[] e = ((r) this.b).e(uri, map);
        int length = e.length;
        l0 l0Var = n0.b;
        s.f(length, "expectedSize");
        k0 k0Var = new k0(length);
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
                o oVar = e[i10];
                try {
                } catch (EOFException unused) {
                    if (((o) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((o) this.c) == null && lVar.d != j10) {
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
                if (((o) this.c) == null) {
                }
                boolean z11 = true;
                u6.p(z11);
                lVar.f = 0;
                i10++;
            }
            if (((o) this.c) == null) {
                String str = "None of the available extractors (" + new d9.l(", ").e(s.x(n0.v(e), new si.a(6))) + ") could read the stream.";
                uri.getClass();
                throw new r1(str, k0Var.f());
            }
        }
        ((o) this.c).c(v0Var);
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 4:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                h hVar = (h) ((h) this.c).d;
                while (hVar != null) {
                    Object obj = hVar.c;
                    sb2.append(str);
                    String str2 = (String) hVar.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    hVar = (h) hVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 15:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                h hVar2 = (h) ((h) this.c).d;
                while (hVar2 != null) {
                    Object obj2 = hVar2.c;
                    sb3.append(str);
                    String str3 = (String) hVar2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    hVar2 = (h) hVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public h(int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = w7.e.c;
                break;
            case 10:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = d0.c;
                break;
            case 16:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = x.c;
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = v7.i.c;
                break;
        }
    }

    public /* synthetic */ h(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                h hVar = new h(14, false);
                this.c = hVar;
                this.d = hVar;
                this.b = str;
                break;
            default:
                h hVar2 = new h(3, false);
                this.c = hVar2;
                this.d = hVar2;
                this.b = str;
                break;
        }
    }

    public h(String str, Boolean bool, wc.a aVar, String str2) {
        this.a = 9;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 0;
        this.b = uri;
        this.d = clipDescription;
        this.c = uri2;
    }

    public h(r rVar) {
        this.a = 1;
        this.b = rVar;
    }

    @Override // t0.i
    public void b() {
    }

    @Override // t0.i
    public void f() {
    }
}
