package org.telegram.utils.twidget;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.r2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class r0 extends k {
    public static final r0 i = new r0();
    public q0 d;
    public Context g;
    public boolean h;
    public final Object b = new Object();
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final AtomicLong f = new AtomicLong();

    public final q0 e() {
        q0 q0Var = this.d;
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this);
        if (!this.g.bindService(new Intent(this.g, (Class<?>) WidgetEngineService.class), q0Var2, 65)) {
            this.g.unbindService(q0Var2);
            throw new IllegalStateException("Widget engine service is unavailable");
        }
        q0Var2.d = true;
        this.d = q0Var2;
        if (this.h) {
            h(q0Var2);
        }
        return q0Var2;
    }

    public final long f(Context context, String str, String str2, float f10, float f11, int i7, String str3, String str4, String str5, String str6, boolean z9, WidgetSandboxBackend widgetSandboxBackend) {
        q0 e10;
        boolean z10;
        b bVar;
        int i10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this.b) {
            try {
                if (this.g == null) {
                    this.g = context.getApplicationContext();
                }
                e10 = e();
                this.c.removeCallbacks(e10.f);
                e10.c++;
                z10 = e10.a == null;
                long elapsedRealtime = SystemClock.elapsedRealtime() + 10000;
                while (true) {
                    bVar = e10.a;
                    if (bVar == null) {
                        long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
                        if (elapsedRealtime2 <= 0) {
                            g(e10);
                            throw new IllegalStateException("Widget engine did not start");
                        }
                        this.b.wait(elapsedRealtime2);
                    } else {
                        i10 = e10.b;
                    }
                }
            } catch (Exception e11) {
                j(e10);
                throw e11;
            } finally {
            }
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        o0 o0Var = new o0(this, e10, i10, widgetSandboxBackend);
        try {
            bVar.v(false, false, null);
            Charset charset = StandardCharsets.UTF_8;
            o0Var.d = bVar.t(str.getBytes(charset), str2.getBytes(charset), f10, f11, i7, str3.getBytes(charset), str4.getBytes(charset), str5.getBytes(charset), str6.getBytes(charset), z9, o0Var);
            if (r2.a) {
                StringBuilder sb2 = new StringBuilder("create ");
                sb2.append(SystemClock.uptimeMillis() - uptimeMillis);
                sb2.append(" ms");
                rf.b.p(sb2, z10 ? rf.b.h(uptimeMillis2, " (engine started: ", " ms to bind)") : "", "WidgetEngine");
            }
            long incrementAndGet = this.f.incrementAndGet();
            this.e.put(Long.valueOf(incrementAndGet), o0Var);
            synchronized (this.b) {
                try {
                    if (e10.b == i10) {
                        if (e10.a == null) {
                        }
                    }
                    i(e10, i10);
                } finally {
                }
            }
            return incrementAndGet;
        } catch (Exception e12) {
            synchronized (this.b) {
                j(e10);
                throw e12;
            }
        }
    }

    public final void g(q0 q0Var) {
        q0Var.a = null;
        if (q0Var.d) {
            q0Var.d = false;
            this.c.removeCallbacks(q0Var.f);
            if (this.d == q0Var) {
                this.d = null;
            }
            try {
                this.g.unbindService(q0Var);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void h(q0 q0Var) {
        if (q0Var.e) {
            return;
        }
        q0Var.e = true;
        q0Var.c++;
        this.c.removeCallbacks(q0Var.f);
        b bVar = q0Var.a;
        if (bVar != null) {
            try {
                bVar.b1();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void i(q0 q0Var, int i7) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                Iterator it = this.e.entrySet().iterator();
                while (it.hasNext()) {
                    o0 o0Var = (o0) ((Map.Entry) it.next()).getValue();
                    if (o0Var.a == q0Var && o0Var.b == i7) {
                        arrayList.add(o0Var);
                        it.remove();
                        j(q0Var);
                    }
                }
                if (q0Var.b == i7) {
                    g(q0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i1 session = ((o0) obj).c.session();
            session.a.post(new b1(session, 1));
        }
    }

    public final void j(q0 q0Var) {
        int i7 = q0Var.c;
        j0 j0Var = q0Var.f;
        int i10 = i7 - 1;
        q0Var.c = i10;
        if (i10 > 0) {
            return;
        }
        Handler handler = this.c;
        handler.removeCallbacks(j0Var);
        handler.postDelayed(j0Var, 30000L);
    }
}
