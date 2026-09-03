package p2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.internal.play_billing.g2;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.g4;
import com.google.android.gms.internal.play_billing.h4;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p0;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.u0;
import com.google.android.gms.internal.play_billing.w0;
import j$.util.Objects;
import j7.s6;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n7.qa;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class y extends b {
    public final Context C;
    public volatile int D;
    public volatile com.google.android.gms.internal.play_billing.g E;
    public volatile hf.a F;
    public volatile ScheduledExecutorService G;

    public y(z9.d dVar, Context context, androidx.emoji2.text.f fVar) {
        super(dVar, context, fVar);
        this.D = 0;
        this.C = context;
    }

    public final t0 E(int i10) {
        if (!J()) {
            com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service is not ready.");
            F(94, 28, b0.a(-1, "Billing Override Service connection is disconnected."));
            return new r0(0);
        }
        w wVar = new w(this, i10, 0);
        h4 h4Var = new h4();
        h4Var.c = new k4();
        j4 j4Var = new j4(h4Var);
        h4Var.b = j4Var;
        h4Var.a = w.class;
        try {
            wVar.k(h4Var);
            h4Var.a = "billingOverrideService.getBillingOverride";
            return j4Var;
        } catch (Exception e) {
            g2 g2Var = new g2(e);
            s6 s6Var = g4.f;
            i4 i4Var = j4Var.b;
            if (s6Var.d(i4Var, null, g2Var)) {
                g4.c(i4Var);
            }
            return j4Var;
        }
    }

    public final void F(int i10, int i11, h hVar) {
        int i12 = z.a;
        g3 b10 = z.b(i10, i11, hVar, null, m3.b);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        this.h.O0(b10);
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
        h5.u uVar = new h5.u();
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
    public final void a(final com.google.android.gms.internal.clearcut.e eVar, final i iVar) {
        G(4, new q0.a() { // from class: p2.v
            @Override // q0.a
            public final void accept(Object obj) {
                String str = eVar.a;
                iVar.a((h) obj, str);
            }
        }, new s1(this, eVar, iVar, false, 11));
    }

    @Override // p2.b, p2.a
    public final h b(Activity activity, f fVar) {
        int i10 = 0;
        try {
            i10 = ((Integer) E(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            F(102, 28, b0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e6) {
            if (e6 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            F(95, 28, b0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e6);
        }
        if (i10 > 0) {
            h a2 = b0.a(i10, "Billing override value was set by a license tester.");
            F(93, 2, a2);
            D(a2);
            return a2;
        }
        try {
            return super.b(activity, fVar);
        } catch (Exception e10) {
            h hVar = b0.f;
            F(103, 2, hVar);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An internal error occurred.", e10);
            return hVar;
        }
    }

    @Override // p2.b, p2.a
    public final void c(o3.c cVar, org.telegram.messenger.d0 d0Var) {
        G(7, new o0.f(d0Var, 2), new s1(this, cVar, d0Var, false, 10));
    }

    @Override // p2.b, p2.a
    public final void d(BillingController billingController) {
        synchronized (this) {
            if (J()) {
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i10 = z.a;
                i3 c3 = z.c(26, m3.b);
                Objects.requireNonNull(c3, "ApiSuccess should not be null");
                qa qaVar = this.h;
                qaVar.getClass();
                try {
                    qaVar.l1(c3, (p3) qaVar.b);
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
                        F(38, 26, b0.a(-1, "Billing Override Service connection is disconnected."));
                    } else {
                        this.D = 1;
                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Starting Billing Override Service setup.");
                        this.F = new hf.a(this, i12);
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
                        F(i11, 26, b0.a(2, "Billing Override Service unavailable on device."));
                    }
                }
            }
        }
        l(billingController);
    }

    public y(z9.d dVar, Context context, p pVar, androidx.emoji2.text.f fVar) {
        super(dVar, context, pVar, fVar);
        this.D = 0;
        this.C = context;
    }
}
