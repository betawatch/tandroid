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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class u0 extends k {
    public static final u0 i = new u0();
    public t0 d;
    public Context g;
    public boolean h;
    public final Object b = new Object();
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final AtomicLong f = new AtomicLong();

    public final t0 e() {
        t0 t0Var = this.d;
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(this);
        if (!this.g.bindService(new Intent(this.g, (Class<?>) WidgetEngineService.class), t0Var2, 65)) {
            this.g.unbindService(t0Var2);
            throw new IllegalStateException("Widget engine service is unavailable");
        }
        t0Var2.d = true;
        this.d = t0Var2;
        if (this.h) {
            h(t0Var2);
        }
        return t0Var2;
    }

    public final long f(Context context, String str, String str2, float f10, float f11, int i7, String str3, String str4, String str5, String str6, boolean z10, WidgetSandboxBackend widgetSandboxBackend) {
        t0 e10;
        boolean z11;
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
                z11 = e10.a == null;
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
        r0 r0Var = new r0(this, e10, i10, widgetSandboxBackend);
        try {
            bVar.v(false, false, null);
            Charset charset = StandardCharsets.UTF_8;
            r0Var.d = bVar.t(str.getBytes(charset), str2.getBytes(charset), f10, f11, i7, str3.getBytes(charset), str4.getBytes(charset), str5.getBytes(charset), str6.getBytes(charset), z10, r0Var);
            if (r2.a) {
                StringBuilder sb2 = new StringBuilder("create ");
                sb2.append(SystemClock.uptimeMillis() - uptimeMillis);
                sb2.append(" ms");
                r.b.t(sb2, z11 ? r.b.j(uptimeMillis2, " (engine started: ", " ms to bind)") : "", "WidgetEngine");
            }
            long incrementAndGet = this.f.incrementAndGet();
            this.e.put(Long.valueOf(incrementAndGet), r0Var);
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

    public final void g(t0 t0Var) {
        t0Var.a = null;
        if (t0Var.d) {
            t0Var.d = false;
            this.c.removeCallbacks(t0Var.f);
            if (this.d == t0Var) {
                this.d = null;
            }
            try {
                this.g.unbindService(t0Var);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void h(t0 t0Var) {
        if (t0Var.e) {
            return;
        }
        t0Var.e = true;
        t0Var.c++;
        this.c.removeCallbacks(t0Var.f);
        b bVar = t0Var.a;
        if (bVar != null) {
            try {
                bVar.b1();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void i(t0 t0Var, int i7) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                Iterator it = this.e.entrySet().iterator();
                while (it.hasNext()) {
                    r0 r0Var = (r0) ((Map.Entry) it.next()).getValue();
                    if (r0Var.a == t0Var && r0Var.b == i7) {
                        arrayList.add(r0Var);
                        it.remove();
                        j(t0Var);
                    }
                }
                if (t0Var.b == i7) {
                    g(t0Var);
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
            l1 session = ((r0) obj).c.session();
            session.a.post(new e1(session, 1));
        }
    }

    public final void j(t0 t0Var) {
        int i7 = t0Var.c;
        j0 j0Var = t0Var.f;
        int i10 = i7 - 1;
        t0Var.c = i10;
        if (i10 > 0) {
            return;
        }
        Handler handler = this.c;
        handler.removeCallbacks(j0Var);
        handler.postDelayed(j0Var, 30000L);
    }
}
