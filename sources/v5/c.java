package v5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s;
import f5.c0;
import f7.v;
import j$.util.DesugarCollections;
import j3.s0;
import j3.t0;
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
import m.s3;
import o3.w;
import y2.q;
import y3.d0;
import y3.y;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public /* synthetic */ class c implements OnCompleteListener, a3.b, y {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public void a(ze.g gVar) {
        if (((ze.e) this.b) == null) {
            this.b = new ze.e();
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            ze.e eVar = (ze.e) this.b;
            ze.f a2 = gVar.a(i10);
            eVar.h.put(a2.d, a2);
            eVar.h();
        }
    }

    @Override // y3.y
    public void b(c0 c0Var, o3.m mVar, d0 d0Var) {
        this.c = c0Var;
        d0Var.a();
        d0Var.b();
        w Z1 = mVar.Z1(d0Var.d, 5);
        this.d = Z1;
        Z1.b((t0) this.b);
    }

    @Override // y3.y
    public void c(f5.w wVar) {
        long c3;
        f5.a.j((c0) this.c);
        int i10 = f5.d0.a;
        c0 c0Var = (c0) this.c;
        synchronized (c0Var) {
            try {
                long j10 = c0Var.c;
                c3 = j10 != -9223372036854775807L ? j10 + c0Var.b : c0Var.c();
            } finally {
            }
        }
        long d = ((c0) this.c).d();
        if (c3 == -9223372036854775807L || d == -9223372036854775807L) {
            return;
        }
        t0 t0Var = (t0) this.b;
        if (d != t0Var.F) {
            s0 a2 = t0Var.a();
            a2.s = d;
            t0 t0Var2 = new t0(a2);
            this.b = t0Var2;
            ((w) this.d).b(t0Var2);
        }
        int a10 = wVar.a();
        ((w) this.d).e(a10, wVar);
        ((w) this.d).c(c3, 1, a10, 0, null);
    }

    public y2.i d() {
        String str = ((String) this.c) == null ? " backendName" : "";
        if (((v2.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new y2.i((String) this.c, (byte[]) this.b, (v2.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        v9.e eVar = new v9.e(byteArrayOutputStream, hashMap, (HashMap) this.c, (s9.d) this.d);
        if (obj == null) {
            return;
        }
        s9.d dVar = (s9.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            throw new s9.b("No encoder for " + obj.getClass());
        }
    }

    public we.e f(we.f fVar) {
        InputStream inputStream;
        int i10 = fVar.e;
        InputStream inputStream2 = (xe.a) this.b;
        if (fVar.b) {
            org.telegram.ui.Components.n nVar = (org.telegram.ui.Components.n) this.d;
            nVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) nVar.b).read(bArr, i11, i10 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            int i12 = 0;
            boolean z10 = false;
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (!z10 || b10 != 0) {
                    bArr[i12] = b10;
                    i12++;
                }
                z10 = b10 == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i12);
            i10 = i12;
        }
        if (fVar.f) {
            throw new we.c("Frame encryption is not supported");
        }
        if (fVar.d) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new we.e(inputStream, fVar.c, i10, (we.h) this.c, fVar);
    }

    public void g(ze.g gVar) {
        if (((ze.e) this.b) == null) {
            return;
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            ze.e eVar = (ze.e) this.b;
            eVar.h.remove(gVar.a(i10).d);
            eVar.h();
        }
    }

    @Override // pc.a
    public Object get() {
        int i10 = 8;
        return new q(new v(i10), new bb.a(i10), (d3.b) ((a5.j) this.b).get(), (e3.f) ((s3) this.c).get(), (s) ((s) this.d).get());
    }

    public void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.c = str;
    }

    public void i(ze.a aVar) {
        ze.g gVar;
        ze.g gVar2 = (ze.g) this.c;
        if (gVar2 != null && ((ze.a) this.d) == null && aVar != null) {
            a(gVar2);
        }
        if (((ze.a) this.d) != null && (gVar = (ze.g) this.c) != null && aVar == null) {
            g(gVar);
        }
        ze.a aVar2 = (ze.a) this.d;
        if (aVar2 != null) {
            q5.h hVar = aVar2.a;
            z5.l.e("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            ze.g gVar3 = (ze.g) this.c;
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
        c cVar = new c(10);
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
            case 3:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                xe.a aVar = (xe.a) this.b;
                sb2.append(aVar.b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 11:
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

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public c(InputStream inputStream, long j10, int i10, we.h hVar) {
        this.a = 3;
        xe.a aVar = new xe.a(inputStream, j10, i10);
        this.b = aVar;
        this.d = new org.telegram.ui.Components.n(aVar, 23);
        this.c = hVar;
    }

    public c(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 11:
                c cVar = new c(10);
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

    public c(int i10, String str, ArrayList arrayList, byte[] bArr) {
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

    public c(URL url, x2.i iVar, String str) {
        this.a = 2;
        this.b = url;
        this.d = iVar;
        this.c = str;
    }
}
