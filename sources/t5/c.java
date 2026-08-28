package t5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import d5.e0;
import d5.f0;
import h3.s0;
import h3.t0;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.InflaterInputStream;
import m.t3;
import m3.w;
import n2.p;
import w2.q;
import w3.d0;
import w3.y;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public /* synthetic */ class c implements OnCompleteListener, y2.b, y {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ c(int i9) {
        this.a = i9;
    }

    public void a(we.g gVar) {
        if (((we.e) this.b) == null) {
            this.b = new we.e();
        }
        for (int i9 = 0; i9 < gVar.a.size(); i9++) {
            we.e eVar = (we.e) this.b;
            we.f a2 = gVar.a(i9);
            eVar.h.put(a2.d, a2);
            eVar.h();
        }
    }

    public w2.i b() {
        String str = ((String) this.c) == null ? " backendName" : "";
        if (((t2.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new w2.i((String) this.c, (byte[]) this.b, (t2.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void c(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        t9.e eVar = new t9.e(byteArrayOutputStream, hashMap, (HashMap) this.c, (q9.d) this.d);
        if (obj == null) {
            return;
        }
        q9.d dVar = (q9.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            throw new q9.b("No encoder for " + obj.getClass());
        }
    }

    public te.e d(te.f fVar) {
        InputStream inputStream;
        int i9 = fVar.e;
        InputStream inputStream2 = (ue.a) this.b;
        if (fVar.b) {
            p pVar = (p) this.d;
            pVar.getClass();
            byte[] bArr = new byte[i9];
            int i10 = 0;
            while (i10 < i9) {
                int read = ((com.google.firebase.messaging.d) pVar.b).read(bArr, i10, i9 - i10);
                if (read <= 0) {
                    throw new EOFException();
                }
                i10 += read;
            }
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < i9; i12++) {
                byte b10 = bArr[i12];
                if (!z10 || b10 != 0) {
                    bArr[i11] = b10;
                    i11++;
                }
                z10 = b10 == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i11);
            i9 = i11;
        }
        if (fVar.f) {
            throw new te.c("Frame encryption is not supported");
        }
        if (fVar.d) {
            i9 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new te.e(inputStream, fVar.c, i9, (te.h) this.c, fVar);
    }

    @Override // w3.y
    public void e(e0 e0Var, m3.m mVar, d0 d0Var) {
        this.c = e0Var;
        d0Var.a();
        d0Var.b();
        w I = mVar.I(d0Var.d, 5);
        this.d = I;
        I.c((t0) this.b);
    }

    public void f(we.g gVar) {
        if (((we.e) this.b) == null) {
            return;
        }
        for (int i9 = 0; i9 < gVar.a.size(); i9++) {
            we.e eVar = (we.e) this.b;
            eVar.h.remove(gVar.a(i9).d);
            eVar.h();
        }
    }

    @Override // w3.y
    public void g(d5.y yVar) {
        long c10;
        d5.a.j((e0) this.c);
        int i9 = f0.a;
        e0 e0Var = (e0) this.c;
        synchronized (e0Var) {
            try {
                long j10 = e0Var.c;
                c10 = j10 != -9223372036854775807L ? j10 + e0Var.b : e0Var.c();
            } finally {
            }
        }
        long d = ((e0) this.c).d();
        if (c10 == -9223372036854775807L || d == -9223372036854775807L) {
            return;
        }
        t0 t0Var = (t0) this.b;
        if (d != t0Var.F) {
            s0 a2 = t0Var.a();
            a2.s = d;
            t0 t0Var2 = new t0(a2);
            this.b = t0Var2;
            ((w) this.d).c(t0Var2);
        }
        int a3 = yVar.a();
        ((w) this.d).a(a3, yVar);
        ((w) this.d).e(c10, 1, a3, 0, null);
    }

    @Override // nc.a
    public Object get() {
        int i9 = 7;
        return new q(new ya.b(i9), new wa.a(i9), (b3.c) ((b3.b) this.b).get(), (c3.h) ((t3) this.c).get(), (t) ((t) this.d).get());
    }

    public void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.c = str;
    }

    public void i(we.a aVar) {
        we.g gVar;
        we.g gVar2 = (we.g) this.c;
        if (gVar2 != null && ((we.a) this.d) == null && aVar != null) {
            a(gVar2);
        }
        if (((we.a) this.d) != null && (gVar = (we.g) this.c) != null && aVar == null) {
            f(gVar);
        }
        we.a aVar2 = (we.a) this.d;
        if (aVar2 != null) {
            o5.h hVar = aVar2.a;
            x5.l.e("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            we.g gVar3 = (we.g) this.c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public void j(Object obj, String str) {
        c cVar = new c(11);
        ((c) this.d).d = cVar;
        this.d = cVar;
        cVar.b = obj;
        cVar.c = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        a aVar = (a) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.a) {
            aVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                ue.a aVar = (ue.a) this.b;
                sb2.append(aVar.b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.c);
                sb3.append('{');
                c cVar = (c) ((c) this.b).d;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.b;
                    sb3.append(str);
                    String str2 = (String) cVar.c;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb3.append(obj);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    cVar = (c) cVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public c(InputStream inputStream, long j10, int i9, te.h hVar) {
        this.a = 2;
        ue.a aVar = new ue.a(inputStream, j10, i9);
        this.b = aVar;
        this.d = new p(aVar, 22);
        this.c = hVar;
    }

    public c(String str, int i9) {
        this.a = i9;
        switch (i9) {
            case 12:
                c cVar = new c(11);
                this.b = cVar;
                this.d = cVar;
                this.c = str;
                break;
            default:
                s0 s0Var = new s0();
                s0Var.o = str;
                this.b = new t0(s0Var);
                break;
        }
    }

    public c(int i9, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.a = 7;
        this.c = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.b = unmodifiableList;
        this.d = bArr;
    }

    public c(URL url, v2.i iVar, String str) {
        this.a = 3;
        this.b = url;
        this.d = iVar;
        this.c = str;
    }
}
