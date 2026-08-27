package u2;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import d5.f0;
import d5.g0;
import d5.z;
import e7.v;
import h3.s0;
import h3.t0;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.InflaterInputStream;
import m.t3;
import m3.m;
import m3.w;
import t2.d;
import ue.h;
import w2.i;
import w2.q;
import w3.e0;
import w3.y;
import xe.e;
import xe.f;
import xe.g;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class b implements OnCompleteListener, y2.b, y {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // w3.y
    public void a(f0 f0Var, m mVar, e0 e0Var) {
        this.d = f0Var;
        e0Var.a();
        e0Var.b();
        w C = mVar.C(e0Var.d, 5);
        this.b = C;
        C.c((t0) this.c);
    }

    @Override // w3.y
    public void b(z zVar) {
        long c10;
        d5.a.j((f0) this.d);
        int i10 = g0.a;
        f0 f0Var = (f0) this.d;
        synchronized (f0Var) {
            try {
                long j10 = f0Var.c;
                c10 = j10 != -9223372036854775807L ? j10 + f0Var.b : f0Var.c();
            } finally {
            }
        }
        long d = ((f0) this.d).d();
        if (c10 == -9223372036854775807L || d == -9223372036854775807L) {
            return;
        }
        t0 t0Var = (t0) this.c;
        if (d != t0Var.F) {
            s0 a2 = t0Var.a();
            a2.s = d;
            t0 t0Var2 = new t0(a2);
            this.c = t0Var2;
            ((w) this.b).c(t0Var2);
        }
        int a3 = zVar.a();
        ((w) this.b).a(a3, zVar);
        ((w) this.b).e(c10, 1, a3, 0, null);
    }

    public void c(g gVar) {
        if (((e) this.c) == null) {
            this.c = new e();
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            e eVar = (e) this.c;
            f a2 = gVar.a(i10);
            eVar.h.put(a2.d, a2);
            eVar.h();
        }
    }

    public i d() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new i((String) this.b, (byte[]) this.c, (d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.c;
        u9.e eVar = new u9.e(byteArrayOutputStream, hashMap, (HashMap) this.d, (r9.d) this.b);
        if (obj == null) {
            return;
        }
        r9.d dVar = (r9.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            throw new r9.b("No encoder for " + obj.getClass());
        }
    }

    public ue.e f(ue.f fVar) {
        InputStream inputStream;
        int i10 = fVar.e;
        InputStream inputStream2 = (ve.a) this.c;
        if (fVar.b) {
            n1.d dVar = (n1.d) this.b;
            dVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) dVar.b).read(bArr, i11, i10 - i11);
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
            throw new ue.c("Frame encryption is not supported");
        }
        if (fVar.d) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new ue.e(inputStream, fVar.c, i10, (h) this.d, fVar);
    }

    public void g(g gVar) {
        if (((e) this.c) == null) {
            return;
        }
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            e eVar = (e) this.c;
            eVar.h.remove(gVar.a(i10).d);
            eVar.h();
        }
    }

    @Override // oc.a
    public Object get() {
        int i10 = 6;
        return new q(new w9.d(i10), new v(i10), (b3.b) ((af.h) this.c).get(), (c3.g) ((t3) this.d).get(), (t) ((t) this.b).get());
    }

    public void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public void i(xe.a aVar) {
        g gVar;
        g gVar2 = (g) this.d;
        if (gVar2 != null && ((xe.a) this.b) == null && aVar != null) {
            c(gVar2);
        }
        if (((xe.a) this.b) != null && (gVar = (g) this.d) != null && aVar == null) {
            g(gVar);
        }
        xe.a aVar2 = (xe.a) this.b;
        if (aVar2 != null) {
            o5.h hVar = aVar2.a;
            l.e("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            g gVar3 = (g) this.d;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.b = aVar;
    }

    public void j(Object obj, String str) {
        b bVar = new b(11);
        ((b) this.d).d = bVar;
        this.d = bVar;
        bVar.c = obj;
        bVar.b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        u5.a aVar = (u5.a) this.c;
        String str = (String) this.b;
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
                ve.a aVar = (ve.a) this.c;
                sb2.append(aVar.b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                b bVar = (b) ((b) this.c).d;
                String str = "";
                while (bVar != null) {
                    Object obj = bVar.c;
                    sb3.append(str);
                    String str2 = (String) bVar.b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb3.append(obj);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    bVar = (b) bVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ b(u5.a aVar, String str, ScheduledFuture scheduledFuture) {
        this.a = 1;
        this.c = aVar;
        this.b = str;
        this.d = scheduledFuture;
    }

    public b(InputStream inputStream, long j10, int i10, h hVar) {
        this.a = 3;
        ve.a aVar = new ve.a(inputStream, j10, i10);
        this.c = aVar;
        this.b = new n1.d(aVar, 23);
        this.d = hVar;
    }

    public b(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 12:
                b bVar = new b(11);
                this.c = bVar;
                this.d = bVar;
                this.b = str;
                break;
            default:
                s0 s0Var = new s0();
                s0Var.o = str;
                this.c = new t0(s0Var);
                break;
        }
    }

    public b(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.a = 7;
        this.b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }
}
