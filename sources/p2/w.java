package p2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.play_billing.f2;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.f4;
import com.google.android.gms.internal.play_billing.g4;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.h4;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p0;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.u0;
import com.google.android.gms.internal.play_billing.w0;
import h7.o6;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nh.d6;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w extends b {
    public final Context C;
    public volatile int D;
    public volatile com.google.android.gms.internal.play_billing.g E;
    public volatile gf.a F;
    public volatile ScheduledExecutorService G;

    public w(f7.v vVar, Context context, androidx.emoji2.text.f fVar) {
        super(vVar, context, fVar);
        this.D = 0;
        this.C = context;
    }

    public final t0 E(int i10) {
        if (!J()) {
            com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service is not ready.");
            F(94, 28, z.a(-1, "Billing Override Service connection is disconnected."));
            return new r0(0);
        }
        u uVar = new u(this, i10, 0);
        g4 g4Var = new g4();
        g4Var.c = new j4();
        i4 i4Var = new i4(g4Var);
        g4Var.b = i4Var;
        g4Var.a = u.class;
        try {
            uVar.j(g4Var);
            g4Var.a = "billingOverrideService.getBillingOverride";
            return i4Var;
        } catch (Exception e10) {
            f2 f2Var = new f2(e10);
            o6 o6Var = f4.f;
            h4 h4Var = i4Var.b;
            if (o6Var.d(h4Var, null, f2Var)) {
                f4.c(h4Var);
            }
            return i4Var;
        }
    }

    public final void F(int i10, int i11, g gVar) {
        int i12 = x.a;
        f3 b10 = x.b(i10, i11, gVar, null, l3.b);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        this.h.k2(b10);
    }

    public final void G(int i10, q0.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        t0 E = E(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.G;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!E.isDone()) {
            w0 w0Var = new w0();
            w0Var.n = E;
            u0 u0Var = new u0();
            u0Var.a = w0Var;
            w0Var.r = scheduledExecutorService.schedule(u0Var, 28500L, timeUnit);
            E.a(u0Var, p0.a);
            E = w0Var;
        }
        f5.u uVar = new f5.u();
        uVar.a = i10;
        uVar.b = aVar;
        uVar.c = runnable;
        uVar.d = this;
        E.a(new q0(E, uVar), e());
    }

    public final synchronized boolean J() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p2.b, p2.a
    public final void a(final g5.c cVar, final h hVar) {
        G(4, new q0.a() { // from class: p2.t
            @Override // q0.a
            public final void accept(Object obj) {
                String str = cVar.a;
                hVar.a((g) obj, str);
            }
        }, new q1(this, cVar, hVar, false, 12));
    }

    @Override // p2.b, p2.a
    public final g b(Activity activity, f fVar) {
        int i10 = 0;
        try {
            i10 = ((Integer) E(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            F(102, 28, z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            F(95, 28, z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (i10 > 0) {
            g a2 = z.a(i10, "Billing override value was set by a license tester.");
            F(93, 2, a2);
            D(a2);
            return a2;
        }
        try {
            return super.b(activity, fVar);
        } catch (Exception e12) {
            g gVar = z.f;
            F(103, 2, gVar);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An internal error occurred.", e12);
            return gVar;
        }
    }

    @Override // p2.b, p2.a
    public final void c(d6 d6Var, org.telegram.messenger.d dVar) {
        G(7, new o0.f(dVar, 2), new q1(this, d6Var, dVar, false, 11));
    }

    @Override // p2.b, p2.a
    public final void d(BillingController billingController) {
        synchronized (this) {
            if (J()) {
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i10 = x.a;
                h3 c3 = x.c(26, l3.b);
                Objects.requireNonNull(c3, "ApiSuccess should not be null");
                oc.i iVar = this.h;
                iVar.getClass();
                try {
                    iVar.A2(c3, (o3) iVar.b);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                }
            } else {
                int i11 = 1;
                if (this.D == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else {
                    int i12 = 3;
                    if (this.D == 3) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                        F(38, 26, z.a(-1, "Billing Override Service connection is disconnected."));
                    } else {
                        this.D = 1;
                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Starting Billing Override Service setup.");
                        this.F = new gf.a(this, i12);
                        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                        Context context = this.C;
                        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            i11 = 41;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    if (context.bindService(intent2, this.F, 1)) {
                                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                    } else {
                                        com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                    }
                                }
                                i11 = 39;
                            }
                        }
                        this.D = 0;
                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                        F(i11, 26, z.a(2, "Billing Override Service unavailable on device."));
                    }
                }
            }
        }
        l(billingController);
    }

    public w(f7.v vVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        super(vVar, context, nVar, fVar);
        this.D = 0;
        this.C = context;
    }
}
