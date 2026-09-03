package q5;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f0 extends com.google.android.gms.common.api.j implements g0 {
    public static final u5.b G = new u5.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a8.j(14), u5.j.a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final r5.e0 D;
    public final List E;
    public int F;
    public final e0 k;
    public a7.e l;
    public boolean m;
    public boolean n;
    public TaskCompletionSource o;
    public TaskCompletionSource p;
    public final AtomicLong q;
    public final Object r;
    public final Object s;
    public d t;
    public String u;
    public double v;
    public boolean w;
    public int x;
    public int y;
    public x z;

    public f0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.c);
        this.k = new e0(this);
        this.r = new Object();
        this.s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.b;
        this.A = eVar.a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.q = new AtomicLong(0L);
        this.F = 1;
        j();
    }

    public static void f(f0 f0Var, long j10, int i10) {
        TaskCompletionSource taskCompletionSource;
        synchronized (f0Var.B) {
            HashMap hashMap = f0Var.B;
            Long valueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            f0Var.B.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i10 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
            }
        }
    }

    public static void g(f0 f0Var, int i10) {
        synchronized (f0Var.s) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
                }
                f0Var.p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(f0 f0Var) {
        if (f0Var.l == null) {
            f0Var.l = new a7.e(f0Var.f, 2);
        }
        return f0Var.l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.r) {
            try {
                TaskCompletionSource taskCompletionSource = this.o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
                }
                this.o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.A;
        if (castDevice.f(2048) || !castDevice.f(4) || castDevice.f(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }
}
