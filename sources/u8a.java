// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.zip.Inflater;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class u8a implements ws4, gn7, reb, jb9 {
    public static u8a e;
    public static final String[] f = {"Connection", "Upgrade"};
    public static final String[] h = {"Upgrade", "websocket"};
    public static final String[] n = {"Sec-WebSocket-Version", "13"};
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public u8a(Typeface typeface, zf7 zf7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = zf7Var;
        this.c = new bg7(1024);
        int a = zf7Var.a(6);
        if (a != 0) {
            int i5 = a + zf7Var.a;
            i = zf7Var.b.getInt(zf7Var.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i << 1];
        int a2 = zf7Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + zf7Var.a;
            i2 = zf7Var.b.getInt(zf7Var.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            px3 px3Var = new px3(this, i7);
            yf7 b = px3Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? b.b.getInt(a3 + b.a) : 0, (char[]) this.b, i7 << 1);
            yf7 b2 = px3Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = b2.b.getInt(b2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                lq5.j("invalid metadata codepoint length");
                throw null;
            }
            bg7 bg7Var = (bg7) this.c;
            yf7 b3 = px3Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = b3.b.getInt(b3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            bg7Var.a(px3Var, 0, i4 - 1);
        }
    }

    public static void E(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public static synchronized u8a v() {
        u8a u8aVar;
        synchronized (u8a.class) {
            u8aVar = e;
            if (u8aVar == null) {
                u8aVar = new u8a((byte) 0);
                e = u8aVar;
            }
        }
        return u8aVar;
    }

    public final void A() {
        long uptimeMillis = SystemClock.uptimeMillis();
        Iterator it = ((LinkedHashMap) this.d).values().iterator();
        while (it.hasNext()) {
            n((long[]) it.next(), uptimeMillis);
        }
        this.d = new LinkedHashMap();
    }

    public final boolean B(g9 g9Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(q(g9Var), new n27((Context) this.b, (ufb) menuItem));
    }

    public final boolean C(g9 g9Var, f27 f27Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        pfb q = q(g9Var);
        vla vlaVar = (vla) this.d;
        Menu menu = (Menu) vlaVar.get(f27Var);
        if (menu == null) {
            menu = new d37((Context) this.b, f27Var);
            vlaVar.put(f27Var, menu);
        }
        return callback.onCreateActionMode(q, menu);
    }

    public final ip3 D(String str) {
        if (str == null) {
            p3d.h("input must not be null");
            return null;
        }
        mp3 mp3Var = new mp3((ArrayList) this.a, (up5) this.c, (ArrayList) this.b);
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char charAt = str.charAt(i2);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            mp3Var.i(str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            mp3Var.i(str.substring(i));
        }
        mp3Var.f(mp3Var.n);
        tp5 q = mp3Var.j.q(new um4((Object) mp3Var.k, (Object) mp3Var.m, (byte) 6));
        Iterator it = mp3Var.o.iterator();
        while (it.hasNext()) {
            ((y1) it.next()).g(q);
        }
        ip3 ip3Var = (ip3) mp3Var.l.b;
        Iterator it2 = ((ArrayList) this.d).iterator();
        if (it2.hasNext()) {
            throw qu6.l(it2);
        }
        return ip3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        if (r9.d(r0) != r6) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: all -> 0x008d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008d, blocks: (B:25:0x0061, B:29:0x0071), top: B:24:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(ax2 ax2Var) {
        yr9 yr9Var;
        int i;
        xj7 xj7Var;
        Throwable th;
        xj7 xj7Var2;
        u8a u8aVar;
        try {
            if (ax2Var instanceof yr9) {
                yr9Var = (yr9) ax2Var;
                int i2 = yr9Var.e;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    yr9Var.e = i2 - TLObject.FLAG_31;
                    Object obj = yr9Var.c;
                    i = yr9Var.e;
                    g9c g9cVar = g9c.a;
                    vx2 vx2Var = vx2.a;
                    if (i != 0) {
                        ixe.b(obj);
                        if (!(((vp2) this.b).v() instanceof hp5)) {
                            return g9cVar;
                        }
                        xj7Var = (xj7) this.a;
                        yr9Var.a = this;
                        yr9Var.b = xj7Var;
                        yr9Var.e = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                grb.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xj7Var2 = yr9Var.b;
                            u8aVar = yr9Var.a;
                            try {
                                ixe.b(obj);
                                ((vp2) u8aVar.b).B(g9cVar);
                                xj7Var2.f(null);
                                return g9cVar;
                            } catch (Throwable th2) {
                                th = th2;
                                xj7Var2.f(null);
                                throw th;
                            }
                        }
                        xj7 xj7Var3 = yr9Var.b;
                        u8a u8aVar2 = yr9Var.a;
                        ixe.b(obj);
                        xj7Var = xj7Var3;
                        this = u8aVar2;
                    }
                    if (((vp2) this.b).v() instanceof hp5) {
                        xj7Var.f(null);
                        return g9cVar;
                    }
                    yr9Var.a = this;
                    yr9Var.b = xj7Var;
                    yr9Var.e = 2;
                    if (this.m(yr9Var) != vx2Var) {
                        u8aVar = this;
                        xj7Var2 = xj7Var;
                        ((vp2) u8aVar.b).B(g9cVar);
                        xj7Var2.f(null);
                        return g9cVar;
                    }
                    return vx2Var;
                }
            }
            if (((vp2) this.b).v() instanceof hp5) {
            }
        } catch (Throwable th3) {
            xj7 xj7Var4 = xj7Var;
            th = th3;
            xj7Var2 = xj7Var4;
            xj7Var2.f(null);
            throw th;
        }
        yr9Var = new yr9(this, ax2Var);
        Object obj2 = yr9Var.c;
        i = yr9Var.e;
        g9c g9cVar2 = g9c.a;
        vx2 vx2Var2 = vx2.a;
        if (i != 0) {
        }
    }

    public final xg0 G(List list) {
        xg0 xg0Var;
        HashMap hashMap = (HashMap) this.c;
        ArrayList g = g(list);
        if (g.size() < 2) {
            return (xg0) dqe.a(g, null);
        }
        Collections.sort(g, new ta((byte) 8));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((xg0) g.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= g.size()) {
                break;
            }
            xg0 xg0Var2 = (xg0) g.get(i3);
            if (i2 == xg0Var2.c) {
                arrayList.add(new Pair(xg0Var2.b, Integer.valueOf(xg0Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (xg0) g.get(0);
            }
        }
        xg0 xg0Var3 = (xg0) hashMap.get(arrayList);
        if (xg0Var3 != null) {
            return xg0Var3;
        }
        List subList = g.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < subList.size(); i5++) {
            i4 += ((xg0) subList.get(i5)).d;
        }
        int nextInt = ((Random) this.d).nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= subList.size()) {
                xg0Var = (xg0) dqe.b(subList);
                break;
            }
            xg0Var = (xg0) subList.get(i);
            i6 += xg0Var.d;
            if (nextInt < i6) {
                break;
            }
            i++;
        }
        hashMap.put(arrayList, xg0Var);
        return xg0Var;
    }

    public final synchronized void H(Exception exc) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a;
        if (countDownLatch == null || ((ArrayList) this.b) == null) {
            throw new IllegalStateException("Cannot set exception before awaiting!");
        }
        if (((Exception) this.d) == null) {
            this.d = exc;
        }
        countDownLatch.countDown();
    }

    public final Bundle I(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public final synchronized void J(yna ynaVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.a) == null || (arrayList = (ArrayList) this.b) == null) {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
        if (((Socket) this.c) == null) {
            this.c = socket;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                yna ynaVar2 = (yna) obj;
                if (ynaVar2 != ynaVar) {
                    ynaVar2.a(new InterruptedException());
                    ynaVar2.interrupt();
                }
            }
        } else {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        ((CountDownLatch) this.a).countDown();
    }

    @Override // gn7
    public final void a() {
        qj7 qj7Var = (qj7) this.c;
        if (((fn7) this.b) == null) {
            return;
        }
        u8a u8aVar = (u8a) this.d;
        if (u8aVar != null) {
            u8aVar.a();
            this.d = null;
        }
        int i = qj7Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            jn7 jn7Var = (jn7) this.a;
            fn7 fn7Var = (fn7) this.b;
            if (i2 < 0 || i2 >= qj7Var.b) {
                lq5.g(qj7Var.b - 1, uh9.m(i2, "Index ", " must be in 0.."));
                return;
            }
            jn7Var.n(fn7Var, qj7Var.a[i2]);
        }
        qj7Var.b = 0;
        this.a = null;
        this.b = null;
    }

    public final u8a b(int i) {
        if (((fn7) this.b) == null) {
            return this;
        }
        qj7 qj7Var = (qj7) this.c;
        int i2 = qj7Var.b + 1;
        int[] iArr = qj7Var.a;
        if (iArr.length < i2) {
            iArr = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            qj7Var.a = iArr;
        }
        int i3 = qj7Var.b;
        iArr[i3] = i;
        qj7Var.b = i3 + 1;
        ((jn7) this.a).a((fn7) this.b, i);
        return this;
    }

    public final void c(gp4 gp4Var) {
        if (((ArrayList) this.a).contains(gp4Var)) {
            xi4.k(gp4Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(gp4Var);
        }
        gp4Var.w = true;
    }

    @Override // jb9
    public final void d() {
        hl.d3(new fb9((e) this.a, (Context) this.b, (vnb) this.c, (dn9) this.d, (byte) 2), 200L);
    }

    public final u8a e(int i) {
        if (((fn7) this.b) == null) {
            return this;
        }
        u8a u8aVar = (u8a) this.d;
        if (u8aVar == null) {
            u8aVar = new u8a(jn7.e(), (fn7) this.b);
            this.d = u8aVar;
        }
        u8aVar.b(i);
        return this;
    }

    @Override // jb9
    public final void f() {
        hl.d3(new yz8((e) this.a, (dn9) this.d, (byte) 13), 200L);
    }

    public final ArrayList g(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        E(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        E(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            xg0 xg0Var = (xg0) list.get(i);
            if (!hashMap.containsKey(xg0Var.b) && !hashMap2.containsKey(Integer.valueOf(xg0Var.c))) {
                arrayList.add(xg0Var);
            }
        }
        return arrayList;
    }

    public final s30 h() {
        vz6 vz6Var;
        if (!((asb) this.c).p() && (vz6Var = (vz6) this.d) != null) {
            yve.f(((asb) this.c).b(vz6Var.a) != -1);
        }
        return new s30(this);
    }

    @Override // jb9
    public final void i() {
        e eVar = (e) this.a;
        eVar.showDialog(new xk8(eVar, 3, true));
    }

    @Override // reb
    public final /* synthetic */ heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override // ws4
    public final void k(Throwable th) {
        ((sz6) this.d).c.remove((xw6) this.a);
        pye.a((gk5) this.c);
    }

    @Override // reb
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        m43 m43Var;
        int i3;
        int i4;
        int i5;
        int D;
        e78 e78Var = (e78) this.c;
        int[] iArr = e78Var.b;
        ey7 ey7Var = e78Var.a;
        ey7 ey7Var2 = (ey7) this.b;
        ey7 ey7Var3 = (ey7) this.a;
        ey7Var3.L(i + i2, bArr);
        ey7Var3.N(i);
        Inflater inflater = (Inflater) this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        if (gcc.R(ey7Var3, ey7Var2, inflater)) {
            ey7Var3.L(ey7Var2.c, ey7Var2.a);
        }
        int i6 = 0;
        e78Var.d = 0;
        e78Var.e = 0;
        e78Var.f = 0;
        e78Var.g = 0;
        e78Var.h = 0;
        e78Var.i = 0;
        ey7Var.K(0);
        e78Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (ey7Var3.a() >= 3) {
            int i7 = ey7Var3.c;
            int A = ey7Var3.A();
            int H = ey7Var3.H();
            int i8 = ey7Var3.b + H;
            if (i8 > i7) {
                ey7Var3.N(i7);
                i3 = i6;
                m43Var = null;
            } else {
                char c = 128;
                if (A != 128) {
                    switch (A) {
                        case 20:
                            if (H % 5 == 2) {
                                ey7Var3.O(2);
                                Arrays.fill(iArr, i6);
                                int i9 = H / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int A2 = ey7Var3.A();
                                    char c2 = c;
                                    double A3 = ey7Var3.A();
                                    double A4 = ey7Var3.A() - 128;
                                    double A5 = ey7Var3.A() - 128;
                                    iArr[A2] = (ey7Var3.A() << 24) | (gcc.i((int) ((1.402d * A4) + A3), 0, jn7.d4) << 16) | (gcc.i((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, jn7.d4) << 8) | gcc.i((int) ((A5 * 1.772d) + A3), 0, jn7.d4);
                                    i10++;
                                    c = c2;
                                    e78Var = e78Var;
                                }
                                e78Var.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                ey7Var3.O(3);
                                int i11 = H - 4;
                                if (((ey7Var3.A() & 128) != 0 ? 1 : i6) != 0) {
                                    if (i11 >= 7 && (D = ey7Var3.D()) >= 4) {
                                        e78Var.h = ey7Var3.H();
                                        e78Var.i = ey7Var3.H();
                                        ey7Var.K(D - 4);
                                        i11 = H - 11;
                                    }
                                }
                                int i12 = ey7Var.b;
                                int i13 = ey7Var.c;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    ey7Var3.k(i12, min, ey7Var.a);
                                    ey7Var.N(i12 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                e78Var.d = ey7Var3.H();
                                e78Var.e = ey7Var3.H();
                                ey7Var3.O(11);
                                e78Var.f = ey7Var3.H();
                                e78Var.g = ey7Var3.H();
                                break;
                            }
                            break;
                    }
                    m43Var = null;
                    i3 = 0;
                } else {
                    if (e78Var.d == 0 || e78Var.e == 0 || e78Var.h == 0 || e78Var.i == 0 || (i4 = ey7Var.c) == 0 || ey7Var.b != i4 || !e78Var.c) {
                        m43Var = null;
                    } else {
                        ey7Var.N(0);
                        int i14 = e78Var.h * e78Var.i;
                        int[] iArr2 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int A6 = ey7Var.A();
                            if (A6 != 0) {
                                i5 = i15 + 1;
                                iArr2[i15] = iArr[A6];
                            } else {
                                int A7 = ey7Var.A();
                                if (A7 != 0) {
                                    i5 = ((A7 & 64) == 0 ? A7 & 63 : ((A7 & 63) << 8) | ey7Var.A()) + i15;
                                    Arrays.fill(iArr2, i15, i5, (A7 & 128) == 0 ? iArr[0] : iArr[ey7Var.A()]);
                                }
                            }
                            i15 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, e78Var.h, e78Var.i, Bitmap.Config.ARGB_8888);
                        float f2 = e78Var.f;
                        float f3 = e78Var.d;
                        float f4 = f2 / f3;
                        float f5 = e78Var.g;
                        float f6 = e78Var.e;
                        m43Var = new m43(null, null, null, createBitmap, f5 / f6, 0, 0, f4, 0, TLObject.FLAG_31, -3.4028235E38f, e78Var.h / f3, e78Var.i / f6, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                    }
                    i3 = 0;
                    e78Var.d = 0;
                    e78Var.e = 0;
                    e78Var.f = 0;
                    e78Var.g = 0;
                    e78Var.h = 0;
                    e78Var.i = 0;
                    ey7Var.K(0);
                    e78Var.c = false;
                }
                ey7Var3.N(i8);
            }
            if (m43Var != null) {
                arrayList.add(m43Var);
            }
            i6 = i3;
        }
        ot2Var.accept(new p43(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r7 != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r7 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ax2 ax2Var) {
        p73 p73Var;
        int i;
        k63 k63Var;
        o83 o83Var = (o83) this.d;
        if (ax2Var instanceof p73) {
            p73Var = (p73) ax2Var;
            int i2 = p73Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                p73Var.d = i2 - TLObject.FLAG_31;
                Object obj = p73Var.b;
                i = p73Var.d;
                if (i != 0) {
                    ixe.b(obj);
                    List list = (List) this.c;
                    vx2 vx2Var = vx2.a;
                    if (list == null || list.isEmpty()) {
                        p73Var.a = this;
                        p73Var.d = 1;
                        obj = o83Var.h(false, p73Var);
                    } else {
                        nr5 c = o83Var.c();
                        s73 s73Var = new s73(o83Var, this, null);
                        p73Var.a = this;
                        p73Var.d = 2;
                        obj = c.c(s73Var, p73Var);
                    }
                    return vx2Var;
                }
                if (i == 1) {
                    this = p73Var.a;
                    ixe.b(obj);
                    k63Var = (k63) obj;
                } else {
                    if (i != 2) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = p73Var.a;
                    ixe.b(obj);
                    k63Var = (k63) obj;
                }
                ((o83) this.d).h.H(k63Var);
                return g9c.a;
            }
        }
        p73Var = new p73(this, ax2Var);
        Object obj2 = p73Var.b;
        i = p73Var.d;
        if (i != 0) {
        }
        ((o83) this.d).h.H(k63Var);
        return g9c.a;
    }

    public final void n(long[] jArr, long j) {
        if (j - jArr[3] >= 2000) {
            HashSet hashSet = (HashSet) this.b;
            StringBuilder sb = new StringBuilder();
            byte b = 0;
            sb.append(jArr[0]);
            sb.append(":");
            sb.append(jArr[1]);
            if (hashSet.add(sb.toString())) {
                yd ydVar = (yd) this.c;
                long j2 = jArr[0];
                int i = (int) jArr[1];
                long j3 = jArr[3];
                int i2 = ydVar.b;
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j2));
                ha4 ha4Var = new ha4(j2, (M0 == null || M0.min) ? 0L : M0.access_hash, i, "list_view", null, "chat_list", null, ea4.g(i2) - ((int) ((SystemClock.uptimeMillis() - j3) / 1000)), Utilities.b.nextLong());
                ha4Var.i = Integer.valueOf((int) (j - j3));
                String i3 = ea4.i(i2);
                if (i3 != null) {
                    ea4.e.postRunnable(new x94(i3, ha4Var, b));
                }
            }
        }
    }

    public final gp4 o(String str) {
        xq4 xq4Var = (xq4) ((HashMap) this.b).get(str);
        if (xq4Var != null) {
            return xq4Var.c;
        }
        return null;
    }

    @Override // ws4
    public final void onSuccess(Object obj) {
        vw6 vw6Var = (vw6) obj;
        gk5 gk5Var = (gk5) this.c;
        yx6 yx6Var = (yx6) this.b;
        sz6 sz6Var = (sz6) this.d;
        CopyOnWriteArraySet copyOnWriteArraySet = sz6Var.c;
        rx6 rx6Var = sz6Var.b;
        xw6 xw6Var = (xw6) this.a;
        copyOnWriteArraySet.remove(xw6Var);
        boolean z = false;
        try {
            if (!yx6Var.i()) {
                lz6 lz6Var = (lz6) xw6Var.e;
                lz6Var.getClass();
                IBinder asBinder = lz6Var.a.asBinder();
                vw6Var.getClass();
                if (rx6Var.Y(xw6Var)) {
                    efd.f("MediaSessionStub", "Controller " + xw6Var + " has sent connection request multiple times");
                }
                rx6Var.b(asBinder, xw6Var, vw6Var.a, vw6Var.b);
                vy0 Q = rx6Var.Q(xw6Var);
                if (Q == null) {
                    efd.f("MediaSessionStub", "Ignoring connection request from unknown controller info");
                } else {
                    yx6Var.t();
                    og8 og8Var = yx6Var.t;
                    kg8 kg8Var = yx6Var.s;
                    yx6Var.t();
                    zf8 zf8Var = vw6Var.b;
                    kg8 a0 = sz6Var.a0(sz6Var.b0(kg8Var));
                    if (rx6Var.Y(xw6Var)) {
                        asb asbVar = a0.j;
                        f2c f2cVar = a0.F;
                        rx6Var.D0();
                        us2 us2Var = (us2) ((qs) rx6Var.c).get(xw6Var);
                        if (us2Var != null) {
                            us2Var.h = asbVar;
                            us2Var.i = f2cVar;
                        }
                    }
                    MediaSession.Token token = ((gx6) yx6Var.h.p.b).c.b;
                    yx6Var.t();
                    po5 po5Var = vw6Var.c;
                    if (po5Var == null) {
                        yx6Var.t();
                        po5Var = yx6Var.y;
                    }
                    po5 po5Var2 = vw6Var.d;
                    if (po5Var2 == null) {
                        yx6Var.t();
                        po5Var2 = yx6Var.z;
                    }
                    yx6Var.t();
                    po5 po5Var3 = po5Var;
                    j99 j99Var = yx6Var.r;
                    po5 po5Var4 = po5Var2;
                    i9a i9aVar = vw6Var.a;
                    zf8 q = og8Var.q();
                    Bundle bundle = new Bundle(yx6Var.j.a.d);
                    Bundle bundle2 = vw6Var.e;
                    if (bundle2 == null) {
                        yx6Var.t();
                        bundle2 = yx6Var.A;
                    }
                    xs2 xs2Var = new xs2(sz6Var, po5Var3, po5Var4, j99Var, i9aVar, zf8Var, q, bundle, bundle2, a0, token);
                    if (!yx6Var.i()) {
                        try {
                            ((fk5) gk5Var).a(Q.d(), xs2Var.a(xw6Var.c));
                            z = true;
                        } catch (RemoteException unused) {
                        }
                        if (!z) {
                            pye.a(gk5Var);
                            return;
                        } else {
                            if (yx6Var.x && yx6.j(xw6Var)) {
                                return;
                            }
                            yx6Var.e.getClass();
                            return;
                        }
                    }
                }
            }
            pye.a(gk5Var);
        } catch (Throwable th) {
            if (0 == 0) {
                pye.a(gk5Var);
            }
            throw th;
        }
    }

    public final gp4 p(String str) {
        for (xq4 xq4Var : ((HashMap) this.b).values()) {
            if (xq4Var != null) {
                gp4 gp4Var = xq4Var.c;
                if (!str.equals(gp4Var.e)) {
                    gp4Var = gp4Var.M.c.p(str);
                }
                if (gp4Var != null) {
                    return gp4Var;
                }
            }
        }
        return null;
    }

    public final pfb q(g9 g9Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pfb pfbVar = (pfb) arrayList.get(i);
            if (pfbVar != null && pfbVar.b == g9Var) {
                return pfbVar;
            }
        }
        pfb pfbVar2 = new pfb((Context) this.b, g9Var);
        arrayList.add(pfbVar2);
        return pfbVar2;
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        for (xq4 xq4Var : ((HashMap) this.b).values()) {
            if (xq4Var != null) {
                arrayList.add(xq4Var);
            }
        }
        return arrayList;
    }

    @Override // reb
    public final int s() {
        return 2;
    }

    public final ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (xq4 xq4Var : ((HashMap) this.b).values()) {
            if (xq4Var != null) {
                arrayList.add(xq4Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List u() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public final boolean w(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public final boolean x(Context context) {
        Boolean bool = (Boolean) this.b;
        if (bool == null) {
            bool = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.b = bool;
        }
        if (!bool.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.b).booleanValue();
    }

    public final void y(xq4 xq4Var) {
        gp4 gp4Var = xq4Var.c;
        String str = gp4Var.e;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(gp4Var.e, xq4Var);
        if (kq4.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + gp4Var);
        }
    }

    public final void z(xq4 xq4Var) {
        HashMap hashMap = (HashMap) this.b;
        gp4 gp4Var = xq4Var.c;
        if (gp4Var.T) {
            ((nq4) this.d).f(gp4Var);
        }
        if (hashMap.get(gp4Var.e) == xq4Var && ((xq4) hashMap.put(gp4Var.e, null)) != null && kq4.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + gp4Var);
        }
    }

    @Override // reb
    public final void reset() {
    }

    public /* synthetic */ u8a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public u8a(byte b) {
        switch (b) {
            case 3:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
            case 6:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 12:
                this.a = new ey7();
                this.b = new ey7();
                this.c = new e78();
                break;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = new ArrayDeque();
                break;
        }
    }

    public u8a(ko4 ko4Var) {
        this.a = ko4Var;
        this.b = null;
        this.c = asb.a;
        this.d = null;
    }

    public u8a(jn7 jn7Var, fn7 fn7Var) {
        qj7 qj7Var = new qj7();
        qj7Var.a = new int[16];
        this.c = qj7Var;
        this.a = jn7Var;
        this.b = fn7Var;
    }
}
