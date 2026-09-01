package s5;

import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s;
import h7.u;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.InflaterInputStream;
import m.r3;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m implements t0.h, OnCompleteListener, a3.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ m() {
        this.a = 10;
    }

    @Override // t0.h
    public Uri a() {
        return (Uri) this.b;
    }

    @Override // t0.h
    public Uri c() {
        return (Uri) this.d;
    }

    @Override // t0.h
    public Object d() {
        return null;
    }

    public y2.i f() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((v2.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new y2.i((String) this.b, (byte[]) this.c, (v2.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void g(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        x9.e eVar = new x9.e(byteArrayOutputStream, hashMap, (HashMap) this.c, (u9.d) this.d);
        if (obj == null) {
            return;
        }
        u9.d dVar = (u9.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            throw new u9.b("No encoder for " + obj.getClass());
        }
    }

    @Override // rc.a
    public Object get() {
        int i10 = 7;
        return new y2.q(new z9.d(i10), new u(i10), (d3.b) ((c5.j) this.b).get(), (e3.g) ((r3) this.c).get(), (s) ((sf.e) this.d).get());
    }

    @Override // t0.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    public ye.e h(ye.f fVar) {
        InputStream inputStream;
        int i10 = fVar.e;
        InputStream inputStream2 = (ze.a) this.b;
        if (fVar.b) {
            ai aiVar = (ai) this.d;
            aiVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) aiVar.b).read(bArr, i11, i10 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            int i12 = 0;
            boolean z4 = false;
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (!z4 || b10 != 0) {
                    bArr[i12] = b10;
                    i12++;
                }
                z4 = b10 == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i12);
            i10 = i12;
        }
        if (fVar.f) {
            throw new ye.c("Frame encryption is not supported");
        }
        if (fVar.d) {
            i10 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new ye.e(inputStream, fVar.c, i10, (ye.h) this.c, fVar);
    }

    public Object i(Bitmap bitmap) {
        ug.a aVar = (ug.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((ug.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public void j(v7.f fVar) {
        try {
            w7.g gVar = (w7.g) this.c;
            v7.i iVar = new v7.i(fVar);
            Parcel M0 = gVar.M0();
            g7.b.c(M0, iVar);
            gVar.Q0(M0, 9);
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }

    public int k(tb.e eVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            vb.f fVar = (vb.f) obj;
            int i12 = fVar.d;
            tb.d dVar = fVar.a;
            int a2 = dVar.a(eVar);
            int i13 = a2 + 4;
            int ordinal = dVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i13 = ((i12 / 2) * 11) + i13 + (i12 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i13 += fVar.a() * 8;
                } else if (ordinal == 5) {
                    i13 = a2 + 12;
                } else if (ordinal == 6) {
                    i13 += i12 * 13;
                }
            } else {
                int i14 = ((i12 / 3) * 10) + i13;
                int i15 = i12 % 3;
                i13 = i14 + (i15 != 1 ? i15 == 2 ? 7 : 0 : 4);
            }
            i10 += i13;
        }
        return i10;
    }

    public boolean l() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.d = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.b).readLine();
                this.d = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.d = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    public String m() {
        if (!l()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        x5.a aVar = (x5.a) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.a) {
            aVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                vb.f fVar = null;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    vb.f fVar2 = (vb.f) obj;
                    if (fVar != null) {
                        sb.append(",");
                    }
                    sb.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb.toString();
            case 12:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                ze.a aVar = (ze.a) this.b;
                sb2.append(aVar.b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public m(h hVar) {
        this.a = 0;
        this.d = hVar;
        this.c = new AtomicLong((u5.a.b.nextLong() & 65535) * 10000);
    }

    public m(v7.d dVar, w7.g gVar) {
        this.a = 4;
        this.c = gVar;
        b6.m.h(dVar);
        this.b = dVar;
    }

    public m(ug.b bVar) {
        this.a = 3;
        this.b = new ug.a();
        this.c = bVar;
    }

    public m(InputStream inputStream, long j10, int i10, ye.h hVar) {
        this.a = 12;
        ze.a aVar = new ze.a(inputStream, j10, i10);
        this.b = aVar;
        this.d = new ai(aVar, 24);
        this.c = hVar;
    }

    public m(cb.m mVar, tb.e eVar, vb.e eVar2) {
        tb.d dVar;
        int i10;
        int i11;
        this.a = 5;
        this.d = mVar;
        this.b = new ArrayList();
        vb.e eVar3 = eVar2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            dVar = tb.d.n;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.c;
            int i15 = i12 + eVar3.d;
            vb.e eVar4 = eVar3.e;
            int i16 = i13;
            tb.d dVar2 = eVar3.a;
            boolean z4 = (dVar2 == tb.d.h && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.c);
            i10 = z4 ? 1 : i16;
            if (eVar4 == null || eVar4.a != dVar2 || z4) {
                ((ArrayList) this.b).add(0, new vb.f(this, dVar2, eVar3.b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z4) {
                ((ArrayList) this.b).add(0, new vb.f(this, dVar, eVar3.b, eVar3.c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z10 = mVar.a;
        tb.b bVar = (tb.b) mVar.d;
        if (z10) {
            vb.f fVar = (vb.f) ((ArrayList) this.b).get(0);
            if (fVar != null && fVar.a != dVar && i17 != 0) {
                ((ArrayList) this.b).add(0, new vb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((vb.f) ((ArrayList) this.b).get(0)).a == dVar ? 1 : 0, new vb.f(this, tb.d.s, 0, 0, 0));
        }
        int i18 = eVar.a;
        int i19 = 26;
        int c3 = m1.j.c(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (c3 == 0) {
            i19 = 9;
        } else if (c3 != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int k10 = k(eVar);
        while (i18 < i19 && !vb.c.c(k10, tb.e.c(i18), bVar)) {
            i18++;
        }
        while (i18 > i10 && vb.c.c(k10, tb.e.c(i18 - 1), bVar)) {
            i18--;
        }
        this.c = tb.e.c(i18);
    }

    @Override // t0.h
    public void b() {
    }

    @Override // t0.h
    public void e() {
    }

    public m(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 2;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
