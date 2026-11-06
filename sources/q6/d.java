package q6;

import a8.i8;
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
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class d {
    public static final n6.c[] D = new n6.c[0];
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
    public volatile z2.d y;
    public n6.a z;

    public d(Context context, Looper looper, l0 l0Var, int i7, n nVar, n nVar2, String str) {
        Object obj = n6.d.d;
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
        this.v = i7;
        this.t = nVar;
        this.u = nVar2;
        this.w = str;
    }

    public final void A(int i7, IInterface iInterface) {
        androidx.activity.n nVar;
        m.b((i7 == 4) == (iInterface != null));
        synchronized (this.l) {
            try {
                this.s = i7;
                this.p = iInterface;
                Bundle bundle = null;
                if (i7 == 1) {
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
                } else if (i7 == 2 || i7 == 3) {
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
                    String q10 = q();
                    String p10 = p();
                    boolean r10 = r();
                    this.g = new androidx.activity.n(q10, p10, r10);
                    if (r10 && d() < 17895000) {
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
                    n6.a b10 = l0Var3.b(new i0(str7, str8, this.g.b), e0Var3, str9);
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
                } else if (i7 == 4) {
                    m.g(iInterface);
                    IInterface iInterface2 = iInterface;
                    this.c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public void a() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.q;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((y) arrayList.get(i7)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.m) {
            this.n = null;
        }
        A(1, null);
    }

    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        z zVar;
        long j3;
        synchronized (this.l) {
            i7 = this.s;
            iInterface = this.p;
        }
        synchronized (this.m) {
            zVar = this.n;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i7 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i7 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i7 == 4) {
            printWriter.print("CONNECTED");
        } else if (i7 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) o()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (zVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zVar.a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.c;
            String format = simpleDateFormat.format(new Date(j10));
            j3 = 0;
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(format).length());
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(format);
            append.println(sb2.toString());
        } else {
            j3 = 0;
        }
        if (this.b > j3) {
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
            String format2 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format2).length());
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(format2);
            append2.println(sb3.toString());
        }
        if (this.e > j3) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) i8.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.e;
            String format3 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb4 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(format3).length());
            sb4.append(j12);
            sb4.append(" ");
            sb4.append(format3);
            append3.println(sb4.toString());
        }
    }

    public boolean c() {
        return true;
    }

    public abstract int d();

    public Intent e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean f() {
        return false;
    }

    public void g(i iVar, Set set) {
        String attributionTag;
        Bundle m10 = m();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.x;
        } else if (this.y == null) {
            attributionTag = this.x;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.y.b;
            attributionTag = attributionSource == null ? this.x : attributionSource.getAttributionTag() == null ? this.x : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i7 = this.v;
        int i10 = n6.e.a;
        Scope[] scopeArr = g.E;
        Bundle bundle = new Bundle();
        n6.c[] cVarArr = g.F;
        g gVar = new g(6, i7, i10, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        gVar.d = this.h.getPackageName();
        gVar.h = m10;
        if (set != null) {
            gVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            gVar.n = new Account("<<default account>>", "com.google");
            if (iVar != null) {
                gVar.e = iVar.asBinder();
            }
        } else if (this instanceof h8.b) {
            gVar.n = null;
        }
        gVar.r = D;
        gVar.s = k();
        if (x()) {
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
            w(8, null, null, this.C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            w(8, null, null, this.C.get());
        }
    }

    public void h(b bVar) {
        m.h(bVar, "Connection progress callbacks cannot be null.");
        this.o = bVar;
        A(2, null);
    }

    public abstract IInterface i(IBinder iBinder);

    public final void j(String str) {
        this.f = str;
        a();
    }

    public n6.c[] k() {
        return D;
    }

    public Bundle l() {
        return null;
    }

    public Bundle m() {
        return new Bundle();
    }

    public final IInterface n() {
        IInterface iInterface;
        synchronized (this.l) {
            try {
                if (this.s == 5) {
                    throw new DeadObjectException();
                }
                if (!s()) {
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

    public abstract String o();

    public abstract String p();

    public String q() {
        return "com.google.android.gms";
    }

    public boolean r() {
        return d() >= 211700000;
    }

    public final boolean s() {
        boolean z9;
        synchronized (this.l) {
            z9 = this.s == 4;
        }
        return z9;
    }

    public final boolean t() {
        boolean z9;
        synchronized (this.l) {
            int i7 = this.s;
            z9 = true;
            if (i7 != 2 && i7 != 3) {
                z9 = false;
            }
        }
        return z9;
    }

    public void u(n6.a aVar) {
        this.d = aVar.b;
        this.e = System.currentTimeMillis();
    }

    public void v(int i7) {
        this.a = i7;
        this.b = System.currentTimeMillis();
    }

    public void w(int i7, IBinder iBinder, Bundle bundle, int i10) {
        f0 f0Var = new f0(this, i7, iBinder, bundle);
        c0 c0Var = this.k;
        c0Var.sendMessage(c0Var.obtainMessage(1, i10, -1, f0Var));
    }

    public boolean x() {
        return this instanceof e6.a;
    }

    public final /* synthetic */ boolean y(int i7, int i10, IInterface iInterface) {
        synchronized (this.l) {
            try {
                if (this.s != i7) {
                    return false;
                }
                A(i10, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void z() {
        int i7;
        int i10;
        synchronized (this.l) {
            i7 = this.s;
        }
        if (i7 == 3) {
            this.A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        c0 c0Var = this.k;
        c0Var.sendMessage(c0Var.obtainMessage(i10, this.C.get(), 16));
    }
}
