// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class v8b implements ru9, kn3, OnCompleteListener, f69, g8d, f9d {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public v8b(Attributes attributes, HashMap hashMap) {
        this.a = (byte) 1;
        this.c = attributes;
        String k = lcb.k("style", attributes);
        if (k != null) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new jcb(k));
            return;
        }
        String k2 = lcb.k("class", attributes);
        if (k2 != null) {
            this.b = new ArrayList();
            for (String str : k2.split(" ")) {
                jcb jcbVar = (jcb) hashMap.get(str.trim());
                if (jcbVar != null) {
                    ((ArrayList) this.b).add(jcbVar);
                }
            }
        }
    }

    public static String r(v8b v8bVar) {
        List<String> list = (List) v8bVar.c;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) v8bVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                w26.j("Invalid application ID: ".concat(str));
                return null;
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (list != null) {
            if (list.isEmpty()) {
                w26.j("Must specify at least one namespace");
                return null;
            }
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z = true;
            for (String str2 : list) {
                id1.b(str2);
                if (!z) {
                    sb.append(",");
                }
                if (!id1.a.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
                z = false;
            }
        }
        if (str == null && list == null) {
            sb.append("/");
        }
        if (list == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    @Override // f9d
    public final void R(String str, long j, int i, r8d r8dVar, long j2, long j3) {
        int i2;
        y8d y8dVar = (y8d) this.c;
        if (((f9d) this.b) != null) {
            if (i == 2001) {
                Object[] objArr = {Integer.valueOf(y8dVar.i)};
                dc6 dc6Var = y8dVar.a;
                Log.w(dc6Var.a, dc6Var.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((i69) y8dVar.h.a).i.iterator();
                while (it.hasNext()) {
                    ((h69) it.next()).o();
                }
                i2 = 2001;
            } else {
                i2 = i;
            }
            ((f9d) this.b).R(str, j, i2, r8dVar, j2, j3);
        }
    }

    @Override // kn3
    public final void a(String str, String str2) {
        gjc gjcVar = (gjc) this.c;
        ln3 ln3Var = (ln3) this.b;
        if (!gjcVar.J) {
            if (ln3Var == gjcVar.f) {
                gjcVar.a(str, str2);
                return;
            }
            return;
        }
        if (ln3Var == gjcVar.U) {
            gjcVar.U = null;
            if (!str.isEmpty()) {
                gjcVar.v(ln3Var, str);
            }
            gjcVar.h();
            Log.d("VoiceLive", "field: final words in (" + gjcVar.L.size() + " words)");
            gjcVar.p();
            return;
        }
        if (ln3Var != gjcVar.f) {
            return;
        }
        Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
        if (!str.isEmpty()) {
            gjcVar.v(ln3Var, str);
        }
        gjcVar.f = null;
        if (xxe.a == gjcVar) {
            xxe.a = null;
        }
        gjcVar.d = null;
        gjcVar.e = null;
        gjcVar.h();
        gjcVar.p();
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        int i;
        byte b = 1;
        switch (this.a) {
            case 10:
                z2d z2dVar = new z2d((u84) this.b, (TaskCompletionSource) obj2, b);
                q2d q2dVar = (q2d) ((n3d) obj).k();
                eo eoVar = (eo) this.c;
                Parcel c = q2dVar.c();
                e2d.c(c, z2dVar);
                e2d.b(c, eoVar);
                c.writeStrongBinder(null);
                q2dVar.d(c, 2);
                return;
            default:
                u84 u84Var = (u84) this.b;
                and andVar = (and) obj;
                vyd vydVar = new vyd(u84Var, (TaskCompletionSource) obj2);
                Context context = u84Var.a;
                try {
                    i = ryc.a(context).e(0, context.getPackageName()).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 0;
                }
                k59 k59Var = (k59) this.c;
                k59Var.f = i;
                ctd ctdVar = (ctd) andVar.k();
                ho hoVar = new ho(new jp2(-1, -1, 0, true), true);
                hoVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i2 = lgd.a;
                obtain.writeStrongBinder(vydVar);
                obtain.writeInt(1);
                k59Var.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                hoVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    ctdVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    @Override // ru9
    public final void b(xu7 xu7Var) {
        j2c j2cVar = (j2c) this.c;
        SparseArray sparseArray = j2cVar.h;
        qd1 qd1Var = (qd1) this.b;
        if (xu7Var.A() != 0 || (xu7Var.A() & 128) == 0) {
            return;
        }
        xu7Var.O(6);
        int a = xu7Var.a() / 4;
        for (int i = 0; i < a; i++) {
            xu7Var.k(0, 4, qd1Var.b);
            qd1Var.l(0);
            int f = qd1Var.f(16);
            qd1Var.n(3);
            if (f == 0) {
                qd1Var.n(13);
            } else {
                int f2 = qd1Var.f(13);
                if (sparseArray.get(f2) == null) {
                    sparseArray.put(f2, new su9(new cyb(j2cVar, f2)));
                    j2cVar.n++;
                }
            }
        }
        if (j2cVar.a != 2) {
            sparseArray.remove(0);
        }
    }

    @Override // kn3
    public final void d(float f) {
        ln3 ln3Var = (ln3) this.b;
        gjc gjcVar = (gjc) this.c;
        if (ln3Var == gjcVar.f) {
            gjcVar.d(f);
        }
    }

    @Override // kn3
    public final void e(String str) {
        ((gjc) this.c).o((ln3) this.b, str, -1);
    }

    @Override // kn3
    public final void f(int i, String str) {
        ((gjc) this.c).o((ln3) this.b, str, i);
    }

    @Override // kn3
    public final void g(String str) {
        ln3 ln3Var = (ln3) this.b;
        gjc gjcVar = (gjc) this.c;
        if (ln3Var == gjcVar.f) {
            gjcVar.g(str);
        }
    }

    public final void h(s49 s49Var, zw8 zw8Var) {
        ps psVar = (ps) this.b;
        ndc ndcVar = (ndc) psVar.get(s49Var);
        if (ndcVar == null) {
            ndcVar = ndc.a();
            psVar.put(s49Var, ndcVar);
        }
        ndcVar.c = zw8Var;
        ndcVar.a |= 8;
    }

    public final void i(w83 w83Var) {
        synchronized (w83Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new vbc(this, w83Var, (byte) 1));
        }
    }

    public final String j(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                str2 = (String) ((jcb) arrayList.get(i)).a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        return str2 == null ? lcb.k(str, (Attributes) this.c) : str2;
    }

    @Override // f9d
    public final void j0(String str, long j, long j2, long j3) {
        f9d f9dVar = (f9d) this.b;
        if (f9dVar != null) {
            f9dVar.j0(str, j, j2, j3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0077, code lost:
    
        if (r3.equals("red") == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer k(String str) {
        String j = j(str);
        if (j == null) {
            return null;
        }
        char c = 1;
        try {
            return Integer.valueOf(Integer.parseInt(j.substring(1), 16));
        } catch (NumberFormatException unused) {
            double[] dArr = lcb.a;
            String lowerCase = j.toLowerCase();
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -734239628:
                    if (lowerCase.equals("yellow")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 112785:
                    break;
                case 3027034:
                    if (lowerCase.equals("blue")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3068707:
                    if (lowerCase.equals("cyan")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3181155:
                    if (lowerCase.equals("gray")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 93818879:
                    if (lowerCase.equals("black")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 98619139:
                    if (lowerCase.equals("green")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 113101865:
                    if (lowerCase.equals("white")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 828922025:
                    if (lowerCase.equals("magenta")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return -256;
                case 1:
                    return -65536;
                case 2:
                    return -16776961;
                case 3:
                    return -16711681;
                case 4:
                    return -7829368;
                case 5:
                    return -16777216;
                case 6:
                    return -16711936;
                case 7:
                    return -1;
                case '\b':
                    return -65281;
                default:
                    return null;
            }
        }
    }

    public final boolean l() {
        hmc hmcVar = (hmc) this.c;
        return hmcVar.M0 > 0.0f || hmcVar.t0();
    }

    public final zw8 m(s49 s49Var, int i) {
        ndc ndcVar;
        zw8 zw8Var;
        ps psVar = (ps) this.b;
        int d = psVar.d(s49Var);
        if (d >= 0 && (ndcVar = (ndc) psVar.i(d)) != null) {
            int i2 = ndcVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                ndcVar.a = i3;
                if (i == 4) {
                    zw8Var = ndcVar.b;
                } else if (i == 8) {
                    zw8Var = ndcVar.c;
                } else {
                    w26.j("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    psVar.g(d);
                    ndcVar.a = 0;
                    ndcVar.b = null;
                    ndcVar.c = null;
                    ndc.d.o0(ndcVar);
                }
                return zw8Var;
            }
        }
        return null;
    }

    public final void n(s49 s49Var) {
        ndc ndcVar = (ndc) ((ps) this.b).get(s49Var);
        if (ndcVar == null) {
            return;
        }
        ndcVar.a &= -2;
    }

    public final void o(s49 s49Var) {
        ps psVar = (ps) this.b;
        vf6 vf6Var = (vf6) this.c;
        int m = vf6Var.m() - 1;
        while (true) {
            if (m < 0) {
                break;
            }
            if (s49Var == vf6Var.n(m)) {
                Object[] objArr = vf6Var.c;
                Object obj = objArr[m];
                Object obj2 = pad.a;
                if (obj != obj2) {
                    objArr[m] = obj2;
                    vf6Var.a = true;
                }
            } else {
                m--;
            }
        }
        ndc ndcVar = (ndc) psVar.get(s49Var);
        if (ndcVar != null) {
            psVar.remove(s49Var);
            ndcVar.a = 0;
            ndcVar.b = null;
            ndcVar.c = null;
            ndc.d.o0(ndcVar);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.a) {
            case 8:
                hzc hzcVar = (hzc) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (hzcVar.f) {
                    hzcVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                ((Map) ((aec) this.c).c).remove((TaskCompletionSource) this.b);
                return;
        }
    }

    public final void p(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new d2b((Object) this, obj, SystemClock.elapsedRealtime(), (byte) 13));
        }
    }

    public final void q(icc iccVar) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new l3c(this, iccVar, (byte) 21));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 7:
                return "Bounds{lower=" + ((io5) this.b) + " upper=" + ((io5) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // g8d
    public final Object zzp() {
        g6d g6dVar = (g6d) this.b;
        p5d p5dVar = (p5d) this.c;
        p5dVar.getClass();
        Map a = g6d.e() ? ((Boolean) g6d.c(new ss2("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue() : false ? p5dVar.a() : p5dVar.e;
        if (a == null) {
            synchronized (p5dVar.d) {
                HashMap hashMap = p5dVar.e;
                a = hashMap;
                if (hashMap == null) {
                    HashMap a2 = p5dVar.a();
                    p5dVar.e = a2;
                    a = a2;
                }
            }
        }
        if (a == null) {
            a = Collections.EMPTY_MAP;
        }
        return (String) a.get(g6dVar.b);
    }

    @Override // ru9
    public final void c(uob uobVar, l74 l74Var, l2c l2cVar) {
    }

    public v8b(Context context) {
        this.a = (byte) 15;
        this.b = context;
    }

    public /* synthetic */ v8b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ v8b(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ v8b(String str, List list) {
        this.a = (byte) 21;
        this.b = str;
        this.c = list;
    }

    public v8b(aec aecVar, TaskCompletionSource taskCompletionSource) {
        this.a = (byte) 11;
        this.b = taskCompletionSource;
        Objects.requireNonNull(aecVar);
        this.c = aecVar;
    }

    public v8b(vsc vscVar) {
        this.a = (byte) 19;
        this.b = vscVar == null ? null : vscVar.b;
    }

    public v8b(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            default:
                this.b = new ps(0);
                this.c = new vf6();
                break;
        }
    }

    public v8b(Handler handler, xbc xbcVar) {
        this.a = (byte) 3;
        if (xbcVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = xbcVar;
    }

    public v8b(gjc gjcVar) {
        this.a = (byte) 5;
        this.c = gjcVar;
    }

    public v8b(j2c j2cVar) {
        this.a = (byte) 2;
        this.c = j2cVar;
        this.b = new qd1(4, new byte[4]);
    }

    public /* synthetic */ v8b(byte b, boolean z) {
        this.a = b;
    }
}
