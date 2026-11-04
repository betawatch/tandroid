package p6;

import android.accounts.Account;
import android.content.AttributionSource;
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
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static final m6.c[] D = new m6.c[0];
    public boolean A;
    public volatile h0 B;
    public final AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public androidx.activity.n g;
    public final Context h;
    public final Looper i;
    public final l0 j;
    public final c0 k;
    public final Object l;
    public final Object m;
    public z n;
    public b o;
    public IInterface p;
    public final ArrayList q;
    public e0 r;
    public int s;
    public final n t;
    public final n u;
    public final int v;
    public final String w;
    public volatile String x;
    public volatile y00 y;
    public m6.a z;

    public d(Context context, Looper looper, l0 l0Var, int i3, n nVar, n nVar2, String str) {
        Object obj = m6.d.d;
        this.f = null;
        this.l = new Object();
        this.m = new Object();
        this.q = new ArrayList();
        this.s = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        m.h(context, "Context must not be null");
        this.h = context;
        m.h(looper, "Looper must not be null");
        this.i = looper;
        m.h(l0Var, "Supervisor must not be null");
        this.j = l0Var;
        this.k = new c0(this, looper);
        this.v = i3;
        this.t = nVar;
        this.u = nVar2;
        this.w = str;
    }

    public void a() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.q;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((y) arrayList.get(i3)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.m) {
            this.n = null;
        }
        z(1, null);
    }

    public boolean b() {
        return true;
    }

    public void c(b bVar) {
        m.h(bVar, "Connection progress callbacks cannot be null.");
        this.o = bVar;
        z(2, null);
    }

    public abstract int d();

    public Intent e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean f() {
        return false;
    }

    public abstract IInterface g(IBinder iBinder);

    public final void h(String str) {
        this.f = str;
        a();
    }

    public m6.c[] i() {
        return D;
    }

    public Bundle j() {
        return null;
    }

    public Bundle k() {
        return new Bundle();
    }

    public final void l(i iVar, Set set) {
        String attributionTag;
        Bundle k10 = k();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.x;
        } else if (this.y == null) {
            attributionTag = this.x;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.y.a;
            attributionTag = attributionSource == null ? this.x : attributionSource.getAttributionTag() == null ? this.x : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i3 = this.v;
        int i10 = m6.e.a;
        Scope[] scopeArr = g.F;
        Bundle bundle = new Bundle();
        m6.c[] cVarArr = g.G;
        g gVar = new g(6, i3, i10, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        gVar.d = this.h.getPackageName();
        gVar.h = k10;
        if (set != null) {
            gVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            gVar.n = new Account("<<default account>>", "com.google");
            if (iVar != null) {
                gVar.e = iVar.asBinder();
            }
        } else if (this instanceof g8.b) {
            gVar.n = null;
        }
        gVar.r = D;
        gVar.s = i();
        if (w()) {
            gVar.y = true;
        }
        try {
            synchronized (this.m) {
                try {
                    z zVar = this.n;
                    if (zVar != null) {
                        zVar.H0(new d0(this, this.C.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i11 = this.C.get();
            c0 c0Var = this.k;
            c0Var.sendMessage(c0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            v(8, null, null, this.C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            v(8, null, null, this.C.get());
        }
    }

    public final IInterface m() {
        IInterface iInterface;
        synchronized (this.l) {
            try {
                if (this.s == 5) {
                    throw new DeadObjectException();
                }
                if (!r()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.p;
                m.h(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String n();

    public abstract String o();

    public String p() {
        return "com.google.android.gms";
    }

    public boolean q() {
        return d() >= 211700000;
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.l) {
            z10 = this.s == 4;
        }
        return z10;
    }

    public final boolean s() {
        boolean z10;
        synchronized (this.l) {
            int i3 = this.s;
            z10 = true;
            if (i3 != 2 && i3 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void t(m6.a aVar) {
        this.d = aVar.b;
        this.e = System.currentTimeMillis();
    }

    public void u(int i3) {
        this.a = i3;
        this.b = System.currentTimeMillis();
    }

    public void v(int i3, IBinder iBinder, Bundle bundle, int i10) {
        f0 f0Var = new f0(this, i3, iBinder, bundle);
        c0 c0Var = this.k;
        c0Var.sendMessage(c0Var.obtainMessage(1, i10, -1, f0Var));
    }

    public boolean w() {
        return this instanceof d6.a;
    }

    public final /* synthetic */ boolean x(int i3, int i10, IInterface iInterface) {
        synchronized (this.l) {
            try {
                if (this.s != i3) {
                    return false;
                }
                z(i10, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void y() {
        int i3;
        int i10;
        synchronized (this.l) {
            i3 = this.s;
        }
        if (i3 == 3) {
            this.A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        c0 c0Var = this.k;
        c0Var.sendMessage(c0Var.obtainMessage(i10, this.C.get(), 16));
    }

    public final void z(int i3, IInterface iInterface) {
        androidx.activity.n nVar;
        m.b((i3 == 4) == (iInterface != null));
        synchronized (this.l) {
            try {
                this.s = i3;
                this.p = iInterface;
                Bundle bundle = null;
                if (i3 == 1) {
                    e0 e0Var = this.r;
                    if (e0Var != null) {
                        l0 l0Var = this.j;
                        String str = (String) this.g.c;
                        m.g(str);
                        String str2 = (String) this.g.d;
                        if (this.w == null) {
                            this.h.getClass();
                        }
                        l0Var.c(str, str2, e0Var, this.g.b);
                        this.r = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    e0 e0Var2 = this.r;
                    if (e0Var2 != null && (nVar = this.g) != null) {
                        String str3 = (String) nVar.c;
                        String str4 = (String) nVar.d;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str3);
                        sb2.append(" on ");
                        sb2.append(str4);
                        Log.e("GmsClient", sb2.toString());
                        l0 l0Var2 = this.j;
                        String str5 = (String) this.g.c;
                        m.g(str5);
                        String str6 = (String) this.g.d;
                        if (this.w == null) {
                            this.h.getClass();
                        }
                        l0Var2.c(str5, str6, e0Var2, this.g.b);
                        this.C.incrementAndGet();
                    }
                    e0 e0Var3 = new e0(this, this.C.get());
                    this.r = e0Var3;
                    String p10 = p();
                    String o10 = o();
                    boolean q10 = q();
                    this.g = new androidx.activity.n(p10, o10, q10);
                    if (q10 && d() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.g.c)));
                    }
                    l0 l0Var3 = this.j;
                    String str7 = (String) this.g.c;
                    m.g(str7);
                    String str8 = (String) this.g.d;
                    String str9 = this.w;
                    if (str9 == null) {
                        str9 = this.h.getClass().getName();
                    }
                    m6.a b10 = l0Var3.b(new i0(str7, str8, this.g.b), e0Var3, str9);
                    if (!b10.c()) {
                        androidx.activity.n nVar2 = this.g;
                        String str10 = (String) nVar2.c;
                        String str11 = (String) nVar2.d;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str10).length() + 34 + String.valueOf(str11).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str10);
                        sb3.append(" on ");
                        sb3.append(str11);
                        Log.w("GmsClient", sb3.toString());
                        int i10 = b10.b;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (b10.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b10.c);
                        }
                        int i11 = this.C.get();
                        g0 g0Var = new g0(this, i10, bundle);
                        c0 c0Var = this.k;
                        c0Var.sendMessage(c0Var.obtainMessage(7, i11, -1, g0Var));
                    }
                } else if (i3 == 4) {
                    m.g(iInterface);
                    IInterface iInterface2 = iInterface;
                    this.c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
