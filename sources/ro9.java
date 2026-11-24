// default package

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ro9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bq9 b;

    public /* synthetic */ ro9(bq9 bq9Var, byte b) {
        this.a = b;
        this.b = bq9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        aq9 aq9Var;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 1;
        bq9 bq9Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ro9(bq9Var, b3));
                break;
            case 1:
                vo9.a0.remove(bq9Var);
                break;
            case 2:
                w01 w01Var = bq9Var.e;
                ArrayDeque arrayDeque = bq9Var.j;
                if (!bq9Var.h && bq9Var.f != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    aq9 aq9Var2 = bq9Var.g;
                    boolean z = aq9Var2 != null && aq9Var2.b();
                    long j2 = -1;
                    if (z) {
                        bq9Var.p = -1L;
                    } else {
                        j2 = bq9Var.p;
                        if (j2 < 0) {
                            bq9Var.p = elapsedRealtime;
                            j2 = elapsedRealtime;
                        }
                    }
                    boolean z2 = z || elapsedRealtime - j2 < 1500;
                    if (z2 != bq9Var.o) {
                        bq9Var.o = z2;
                        bq9Var.q = elapsedRealtime;
                        bq9Var.d("video ".concat(z2 ? "on" : "off"));
                        bq9Var.f.r1((!z2 || (aq9Var = bq9Var.g) == null) ? null : aq9Var.getSurface());
                        w01Var.getClass();
                        w01Var.E = z2 ? (byte) 2 : (byte) 1;
                    }
                    int l0 = bq9Var.f.l0();
                    if (l0 > 1) {
                        int i = l0 - 1;
                        bq9Var.f.P(0, i);
                        for (int i2 = 0; i2 < i && !arrayDeque.isEmpty(); i2++) {
                            arrayDeque.pollFirst();
                        }
                    }
                    int l02 = bq9Var.f.l0();
                    Iterator it = arrayDeque.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Long l = (Long) it.next();
                            int i4 = i3 + 1;
                            if (i3 == l02) {
                                j = Math.max(0L, bq9Var.f.k()) + l.longValue();
                            } else {
                                i3 = i4;
                            }
                        } else {
                            j = -1;
                        }
                    }
                    boolean z3 = bq9Var.f.h() == 3 && bq9Var.f.s();
                    long j3 = bq9Var.q;
                    boolean z4 = j3 >= 0 && elapsedRealtime - j3 < 500;
                    if (j >= 0 && (z3 || !z4)) {
                        w01Var.p = j;
                        boolean z5 = w01Var.q;
                        w01Var.q = z3;
                        if (z3 && !w01Var.t) {
                            w01Var.t = true;
                            w01Var.B();
                        }
                        if (w01Var.c == 4 || w01Var.g >= 0 || w01Var.f < 0) {
                            w01Var.E();
                        } else {
                            if (z3) {
                                w01Var.u = false;
                            } else if (w01Var.t && !w01Var.h && !w01Var.u) {
                                w01Var.h = true;
                                w01Var.i++;
                                l01 l01Var = w01Var.a;
                                StringBuilder o = wi8.o(j, "stall at ", ", buffered to ");
                                o.append(w01Var.f);
                                l01Var.d(o.toString());
                                w01Var.E();
                                w01Var.j();
                                w01Var.w();
                            }
                            if (z3 && !z5 && w01Var.h) {
                                w01Var.h = false;
                            }
                            w01Var.E();
                            w01Var.j();
                            w01Var.w();
                        }
                    }
                    bq9Var.b.postDelayed(bq9Var.n, 100L);
                    break;
                }
                break;
            default:
                if (!bq9Var.h) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(we8.c.a, 144179200);
                    xc3.a(nm7.d3, 0, "bufferForPlaybackMs", "0");
                    xc3.a(nm7.d3, 0, "bufferForPlaybackAfterRebufferMs", "0");
                    xc3.a(1000, nm7.d3, "minBufferMs", "bufferForPlaybackMs");
                    xc3.a(1000, nm7.d3, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                    xc3.a(30000, 1000, "maxBufferMs", "minBufferMs");
                    xc3.a(nm7.d3, 0, "bufferForPlaybackMs", "0");
                    xc3.a(nm7.d3, 0, "bufferForPlaybackAfterRebufferMs", "0");
                    xc3.a(1000, nm7.d3, "minBufferMs", "bufferForPlaybackMs");
                    xc3.a(1000, nm7.d3, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                    xc3.a(30000, 1000, "maxBufferMs", "minBufferMs");
                    xc3 xc3Var = new xc3(new ag0(), 1000, 1000, 30000, 30000, nm7.d3, nm7.d3, nm7.d3, nm7.d3, true, hashMap);
                    Context context = a.b;
                    v64 v64Var = new v64(context, new ad3(new yp9(a.b), b2), new a10(context, b3));
                    Looper looper = bq9Var.a.getLooper();
                    jte.p(!v64Var.A);
                    looper.getClass();
                    v64Var.i = looper;
                    v64Var.b(xc3Var);
                    h74 a = v64Var.a();
                    bq9Var.f = a;
                    a.i0(new o00(3, 0, 1, 1, false, 0, true), false);
                    bq9Var.f.R(bq9Var.i);
                    bq9Var.f.m.a(new b40(bq9Var, r4));
                    aq9 aq9Var3 = bq9Var.g;
                    if (aq9Var3 != null && bq9Var.o) {
                        bq9Var.f.r1(aq9Var3.getSurface());
                    }
                    bq9Var.f.V(true);
                    w01 w01Var2 = bq9Var.e;
                    if (w01Var2.c == 0) {
                        w01Var2.a.d("start");
                        w01Var2.y();
                    }
                    bq9Var.b.postDelayed(bq9Var.n, 100L);
                    break;
                }
                break;
        }
    }
}
