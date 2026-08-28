package x5;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.p0;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m.t3;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g implements com.google.android.gms.common.api.c {
    public static final u5.c[] P = new u5.c[0];
    public b A;
    public IInterface B;
    public final ArrayList C;
    public c0 D;
    public int E;
    public final m F;
    public final m G;
    public final int H;
    public final String I;
    public volatile String J;
    public u5.a K;
    public boolean L;
    public volatile f0 M;
    public final AtomicInteger N;
    public final Set O;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public androidx.activity.o h;
    public final Context n;
    public final Looper r;
    public final j0 s;
    public final a0 v;
    public final Object w;
    public final Object x;
    public y y;

    public g(Context context, Looper looper, int i9, t3 t3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i10) {
        synchronized (j0.g) {
            try {
                if (j0.h == null) {
                    j0.h = new j0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j0 j0Var = j0.h;
        Object obj = u5.d.c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        String str = (String) t3Var.e;
        Object obj2 = u5.d.c;
        this.f = null;
        this.w = new Object();
        this.x = new Object();
        this.C = new ArrayList();
        this.E = 1;
        this.K = null;
        this.L = false;
        this.M = null;
        this.N = new AtomicInteger(0);
        l.i(context, "Context must not be null");
        this.n = context;
        l.i(looper, "Looper must not be null");
        this.r = looper;
        l.i(j0Var, "Supervisor must not be null");
        this.s = j0Var;
        this.v = new a0(this, looper);
        this.H = i9;
        this.F = mVar;
        this.G = mVar2;
        this.I = str;
        Set set = (Set) t3Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.O = set;
    }

    public static /* bridge */ /* synthetic */ void D(g gVar) {
        int i9;
        int i10;
        synchronized (gVar.w) {
            i9 = gVar.E;
        }
        if (i9 == 3) {
            gVar.L = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(i10, gVar.N.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean E(g gVar, int i9, int i10, IInterface iInterface) {
        synchronized (gVar.w) {
            try {
                if (gVar.E != i9) {
                    return false;
                }
                gVar.F(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void A(int i9) {
        this.a = i9;
        this.b = System.currentTimeMillis();
    }

    public void B(int i9, IBinder iBinder, Bundle bundle, int i10) {
        d0 d0Var = new d0(this, i9, iBinder, bundle);
        a0 a0Var = this.v;
        a0Var.sendMessage(a0Var.obtainMessage(1, i10, -1, d0Var));
    }

    public boolean C() {
        return this instanceof l5.a;
    }

    public final void F(int i9, IInterface iInterface) {
        androidx.activity.o oVar;
        l.b((i9 == 4) == (iInterface != null));
        synchronized (this.w) {
            try {
                this.E = i9;
                this.B = iInterface;
                Bundle bundle = null;
                if (i9 == 1) {
                    c0 c0Var = this.D;
                    if (c0Var != null) {
                        j0 j0Var = this.s;
                        String str = (String) this.h.b;
                        l.h(str);
                        String str2 = (String) this.h.c;
                        if (this.I == null) {
                            this.n.getClass();
                        }
                        j0Var.c(str, str2, c0Var, this.h.a);
                        this.D = null;
                    }
                } else if (i9 == 2 || i9 == 3) {
                    c0 c0Var2 = this.D;
                    if (c0Var2 != null && (oVar = this.h) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.b) + " on " + ((String) oVar.c));
                        j0 j0Var2 = this.s;
                        String str3 = (String) this.h.b;
                        l.h(str3);
                        String str4 = (String) this.h.c;
                        if (this.I == null) {
                            this.n.getClass();
                        }
                        j0Var2.c(str3, str4, c0Var2, this.h.a);
                        this.N.incrementAndGet();
                    }
                    c0 c0Var3 = new c0(this, this.N.get());
                    this.D = c0Var3;
                    String x10 = x();
                    String w8 = w();
                    boolean y10 = y();
                    androidx.activity.o oVar2 = new androidx.activity.o();
                    oVar2.c = x10;
                    oVar2.b = w8;
                    oVar2.a = y10;
                    this.h = oVar2;
                    if (y10 && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.b)));
                    }
                    j0 j0Var3 = this.s;
                    String str5 = (String) this.h.b;
                    l.h(str5);
                    String str6 = (String) this.h.c;
                    String str7 = this.I;
                    if (str7 == null) {
                        str7 = this.n.getClass().getName();
                    }
                    u5.a b10 = j0Var3.b(new g0(str5, str6, this.h.a), c0Var3, str7);
                    if (!b10.c()) {
                        androidx.activity.o oVar3 = this.h;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) oVar3.b) + " on " + ((String) oVar3.c));
                        int i10 = b10.b;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (b10.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b10.c);
                        }
                        int i11 = this.N.get();
                        e0 e0Var = new e0(this, i10, bundle);
                        a0 a0Var = this.v;
                        a0Var.sendMessage(a0Var.obtainMessage(7, i11, -1, e0Var));
                    }
                } else if (i9 == 4) {
                    l.h(iInterface);
                    IInterface iInterface2 = iInterface;
                    this.c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.common.api.c
    public boolean a() {
        return this instanceof k5.e;
    }

    @Override // com.google.android.gms.common.api.c
    public final Set b() {
        return p() ? this.O : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.c
    public final void c(h hVar, Set set) {
        Bundle t10 = t();
        String str = Build.VERSION.SDK_INT < 31 ? this.J : this.J;
        int i9 = this.H;
        int i10 = u5.e.a;
        Scope[] scopeArr = f.A;
        Bundle bundle = new Bundle();
        u5.c[] cVarArr = f.B;
        f fVar = new f(6, i9, i10, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.d = this.n.getPackageName();
        fVar.h = t10;
        if (set != null) {
            fVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            fVar.n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.e = hVar.asBinder();
            }
        } else if (this instanceof o7.b) {
            fVar.n = null;
        }
        fVar.r = P;
        fVar.s = r();
        if (C()) {
            fVar.x = true;
        }
        try {
            synchronized (this.x) {
                try {
                    y yVar = this.y;
                    if (yVar != null) {
                        yVar.E0(new b0(this, this.N.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i11 = this.N.get();
            a0 a0Var = this.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final void d(String str) {
        this.f = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.c
    public void disconnect() {
        this.N.incrementAndGet();
        synchronized (this.C) {
            try {
                int size = this.C.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((w) this.C.get(i9)).c();
                }
                this.C.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.x) {
            this.y = null;
        }
        F(1, null);
    }

    @Override // com.google.android.gms.common.api.c
    public void e(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.A = bVar;
        F(2, null);
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean f() {
        boolean z10;
        synchronized (this.w) {
            int i9 = this.E;
            z10 = true;
            if (i9 != 2 && i9 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.common.api.c
    public final void g(String str, PrintWriter printWriter) {
        int i9;
        IInterface iInterface;
        y yVar;
        synchronized (this.w) {
            i9 = this.E;
            iInterface = this.B;
        }
        synchronized (this.x) {
            yVar = this.y;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i9 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i9 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i9 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i9 == 4) {
            printWriter.print("CONNECTED");
        } else if (i9 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append(BuildConfig.BETA_URL);
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (yVar == null) {
            printWriter.println(BuildConfig.BETA_URL);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.c;
            append.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i10 = this.a;
            if (i10 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i10 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i10 != 3) {
                printWriter.append((CharSequence) String.valueOf(i10));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.b;
            append2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) h8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.e;
            append3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final String h() {
        androidx.activity.o oVar;
        if (!i() || (oVar = this.h) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) oVar.c;
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean i() {
        boolean z10;
        synchronized (this.w) {
            z10 = this.E == 4;
        }
        return z10;
    }

    @Override // com.google.android.gms.common.api.c
    public final void j(xa.c cVar) {
        ((p0) cVar.b).o.x.post(new androidx.activity.i(cVar, 14));
    }

    @Override // com.google.android.gms.common.api.c
    public boolean k() {
        return true;
    }

    @Override // com.google.android.gms.common.api.c
    public abstract int l();

    @Override // com.google.android.gms.common.api.c
    public final u5.c[] m() {
        f0 f0Var = this.M;
        if (f0Var == null) {
            return null;
        }
        return f0Var.b;
    }

    @Override // com.google.android.gms.common.api.c
    public final String n() {
        return this.f;
    }

    @Override // com.google.android.gms.common.api.c
    public Intent o() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override // com.google.android.gms.common.api.c
    public boolean p() {
        return false;
    }

    public abstract IInterface q(IBinder iBinder);

    public u5.c[] r() {
        return P;
    }

    public Bundle s() {
        return null;
    }

    public Bundle t() {
        return new Bundle();
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.w) {
            try {
                if (this.E == 5) {
                    throw new DeadObjectException();
                }
                if (!i()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.B;
                l.i(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public String x() {
        return "com.google.android.gms";
    }

    public boolean y() {
        return l() >= 211700000;
    }

    public void z(u5.a aVar) {
        this.d = aVar.b;
        this.e = System.currentTimeMillis();
    }
}
