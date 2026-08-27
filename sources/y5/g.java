package y5;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g implements com.google.android.gms.common.api.c {
    public static final v5.c[] P = new v5.c[0];
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
    public v5.a K;
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
    public androidx.activity.n h;
    public final Context n;
    public final Looper r;
    public final j0 s;
    public final a0 v;
    public final Object w;
    public final Object x;
    public y y;

    public g(Context context, Looper looper, int i10, t3 t3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
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
        Object obj = v5.d.c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        String str = (String) t3Var.e;
        Object obj2 = v5.d.c;
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
        this.H = i10;
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
        int i10;
        int i11;
        synchronized (gVar.w) {
            i10 = gVar.E;
        }
        if (i10 == 3) {
            gVar.L = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(i11, gVar.N.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean E(g gVar, int i10, int i11, IInterface iInterface) {
        synchronized (gVar.w) {
            try {
                if (gVar.E != i10) {
                    return false;
                }
                gVar.F(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void A(int i10) {
        this.a = i10;
        this.b = System.currentTimeMillis();
    }

    public void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        d0 d0Var = new d0(this, i10, iBinder, bundle);
        a0 a0Var = this.v;
        a0Var.sendMessage(a0Var.obtainMessage(1, i11, -1, d0Var));
    }

    public boolean C() {
        return this instanceof l5.a;
    }

    public final void F(int i10, IInterface iInterface) {
        androidx.activity.n nVar;
        l.b((i10 == 4) == (iInterface != null));
        synchronized (this.w) {
            try {
                this.E = i10;
                this.B = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
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
                } else if (i10 == 2 || i10 == 3) {
                    c0 c0Var2 = this.D;
                    if (c0Var2 != null && (nVar = this.h) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) nVar.b) + " on " + ((String) nVar.c));
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
                    String x8 = x();
                    String w10 = w();
                    boolean y10 = y();
                    androidx.activity.n nVar2 = new androidx.activity.n();
                    nVar2.c = x8;
                    nVar2.b = w10;
                    nVar2.a = y10;
                    this.h = nVar2;
                    if (y10 && k() < 17895000) {
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
                    v5.a b10 = j0Var3.b(new g0(str5, str6, this.h.a), c0Var3, str7);
                    if (!b10.c()) {
                        androidx.activity.n nVar3 = this.h;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) nVar3.b) + " on " + ((String) nVar3.c));
                        int i11 = b10.b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (b10.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b10.c);
                        }
                        int i12 = this.N.get();
                        e0 e0Var = new e0(this, i11, bundle);
                        a0 a0Var = this.v;
                        a0Var.sendMessage(a0Var.obtainMessage(7, i12, -1, e0Var));
                    }
                } else if (i10 == 4) {
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
        return o() ? this.O : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.c
    public final void c(String str) {
        this.f = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean d() {
        boolean z10;
        synchronized (this.w) {
            int i10 = this.E;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.common.api.c
    public void disconnect() {
        this.N.incrementAndGet();
        synchronized (this.C) {
            try {
                int size = this.C.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((w) this.C.get(i10)).c();
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
    public final void e(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        y yVar;
        synchronized (this.w) {
            i10 = this.E;
            iInterface = this.B;
        }
        synchronized (this.x) {
            yVar = this.y;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
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
            int i11 = this.a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.b;
            append2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) i8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.e;
            append3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    @Override // com.google.android.gms.common.api.c
    public final String f() {
        androidx.activity.n nVar;
        if (!h() || (nVar = this.h) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) nVar.c;
    }

    @Override // com.google.android.gms.common.api.c
    public final void g(k5.i iVar) {
        ((p0) iVar.b).o.x.post(new a8.b(iVar, 14));
    }

    @Override // com.google.android.gms.common.api.c
    public final boolean h() {
        boolean z10;
        synchronized (this.w) {
            z10 = this.E == 4;
        }
        return z10;
    }

    @Override // com.google.android.gms.common.api.c
    public final void i(h hVar, Set set) {
        Bundle t10 = t();
        String str = Build.VERSION.SDK_INT < 31 ? this.J : this.J;
        int i10 = this.H;
        int i11 = v5.e.a;
        Scope[] scopeArr = f.A;
        Bundle bundle = new Bundle();
        v5.c[] cVarArr = f.B;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.d = this.n.getPackageName();
        fVar.h = t10;
        if (set != null) {
            fVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            fVar.n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.e = hVar.asBinder();
            }
        } else if (this instanceof p7.b) {
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
        } catch (DeadObjectException e9) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e9);
            int i12 = this.N.get();
            a0 a0Var = this.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        }
    }

    @Override // com.google.android.gms.common.api.c
    public boolean j() {
        return true;
    }

    @Override // com.google.android.gms.common.api.c
    public abstract int k();

    @Override // com.google.android.gms.common.api.c
    public final v5.c[] l() {
        f0 f0Var = this.M;
        if (f0Var == null) {
            return null;
        }
        return f0Var.b;
    }

    @Override // com.google.android.gms.common.api.c
    public final String m() {
        return this.f;
    }

    @Override // com.google.android.gms.common.api.c
    public Intent n() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override // com.google.android.gms.common.api.c
    public boolean o() {
        return false;
    }

    @Override // com.google.android.gms.common.api.c
    public void p(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.A = bVar;
        F(2, null);
    }

    public abstract IInterface q(IBinder iBinder);

    public v5.c[] r() {
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
                if (!h()) {
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
        return k() >= 211700000;
    }

    public void z(v5.a aVar) {
        this.d = aVar.b;
        this.e = System.currentTimeMillis();
    }
}
