// default package

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oz6 extends Binder implements IInterface {
    public final WeakReference a;
    public final mx6 b;
    public final CopyOnWriteArraySet c;
    public x79 d;
    public d89 e;
    public int f;
    public co5 i;
    public co5 j;
    public int k;
    public bqb l;
    public nz6 m;
    public mz6 n;

    public oz6(tx6 tx6Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.a = new WeakReference(tx6Var);
        this.b = new mx6(tx6Var);
        this.c = new CopyOnWriteArraySet();
        x79 x79Var = x79.r;
        this.d = x79Var;
        this.e = d89.h;
        this.i = x79Var;
        this.j = x79Var;
        this.k = 0;
    }

    public static void W(tx6 tx6Var, sw6 sw6Var, int i, q8a q8aVar) {
        try {
            rw6 rw6Var = sw6Var.e;
            rw6Var.getClass();
            rw6Var.g(i, q8aVar);
            tx6Var.c.a(true, true);
        } catch (RemoteException e) {
            ncd.g("MediaSessionStub", "Failed to send result to controller " + sw6Var, e);
        }
    }

    public static cj6 X(fu2 fu2Var) {
        return new cj6(new cj6(fu2Var, (byte) 8), (byte) 7);
    }

    public static t76 e(tx6 tx6Var, sw6 sw6Var, int i, lz6 lz6Var, fu2 fu2Var) {
        if (tx6Var.i()) {
            return ao5.b;
        }
        t76 t76Var = (t76) lz6Var.t(tx6Var, sw6Var, i);
        q9a q9aVar = new q9a();
        t76Var.b(new jy6(tx6Var, q9aVar, fu2Var, t76Var, (byte) 3), fp3.a);
        return q9aVar;
    }

    public final void P(dk5 dk5Var, int i, Bundle bundle, Bundle bundle2, boolean z) {
        r7a r7aVar;
        Bundle o = hac.o(bundle2);
        if (dk5Var == null || bundle == null || o == null) {
            return;
        }
        try {
            int i2 = bundle.getInt(r7a.h, 0);
            if (i2 != 0) {
                r7aVar = new r7a(i2);
            } else {
                String string = bundle.getString(r7a.i);
                string.getClass();
                Bundle o2 = hac.o(bundle.getBundle(r7a.j));
                if (o2 == null) {
                    o2 = Bundle.EMPTY;
                }
                r7aVar = new r7a(string, o2);
            }
            if (!un2.i(r7aVar.b)) {
                d(dk5Var, i, r7aVar, 0, new dz6(new yy6(z, r7aVar, o), (byte) 1));
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                tx6 tx6Var = (tx6) this.a.get();
                if (tx6Var != null && !tx6Var.i()) {
                    R(new jg((Object) this, (Object) dk5Var.asBinder(), (Object) r7aVar, (Object) tx6Var, i, (Object) dk5Var, (byte) 6));
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            ncd.g("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    public final void Q(sw6 sw6Var, int i) {
        S(sw6Var, i, 1, X(new cz6((Object) this, (Object) sw6Var, (byte) 2)));
    }

    public final void R(Runnable runnable) {
        tx6 tx6Var = (tx6) this.a.get();
        if (tx6Var != null) {
            hac.X(tx6Var.l, runnable);
        }
    }

    public final void S(final sw6 sw6Var, final int i, int i2, final lz6 lz6Var) {
        WeakReference weakReference = this.a;
        tx6 tx6Var = (tx6) weakReference.get();
        if (tx6Var != null) {
            jte.p(Looper.myLooper() == tx6Var.l.getLooper());
        }
        final tx6 tx6Var2 = (tx6) weakReference.get();
        if (tx6Var2 == null || tx6Var2.i()) {
            return;
        }
        mx6 mx6Var = this.b;
        if (mx6Var.X(sw6Var)) {
            if (!mx6Var.Z(sw6Var, i2)) {
                W(tx6Var2, sw6Var, i, new q8a(-4));
                return;
            }
            dhf dhfVar = tx6Var2.e;
            tx6Var2.q(sw6Var);
            dhfVar.getClass();
            if (i2 != 27) {
                mx6Var.p(sw6Var, i2, new lt2() { // from class: fz6
                    @Override // lt2
                    public final t76 run() {
                        return (t76) lz6.this.t(tx6Var2, sw6Var, i);
                    }
                });
            } else {
                lz6Var.t(tx6Var2, sw6Var, i);
                mx6Var.p(sw6Var, i2, new ez6());
            }
        }
    }

    public final void T() {
        this.a.clear();
        mx6 mx6Var = this.b;
        ((WeakReference) mx6Var.d).clear();
        mo5 M = mx6Var.M();
        int size = M.size();
        int i = 0;
        while (i < size) {
            Object obj = M.get(i);
            i++;
            sw6 sw6Var = (sw6) obj;
            mx6Var.i0(sw6Var);
            rw6 rw6Var = sw6Var.e;
            if (rw6Var != null) {
                rw6Var.e();
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            rw6 rw6Var2 = ((sw6) it.next()).e;
            if (rw6Var2 != null) {
                rw6Var2.e();
            }
        }
        copyOnWriteArraySet.clear();
    }

    public final void U(qe8 qe8Var, HashMap hashMap) {
        String str;
        Object obj = qe8Var.d;
        if (obj == null || hashMap.containsKey(obj) || (str = (String) this.j.get(obj)) == null) {
            return;
        }
        hashMap.put(obj, str);
    }

    public final void V(qe8 qe8Var, HashMap hashMap) {
        String str;
        Object obj = qe8Var.a;
        if (obj == null || hashMap.containsKey(obj) || (str = (String) this.i.get(obj)) == null) {
            return;
        }
        hashMap.put(obj, str);
    }

    public final void Y(dk5 dk5Var, int i, Bundle bundle, boolean z) {
        if (dk5Var == null || bundle == null) {
            return;
        }
        b(dk5Var, i, 31, new dz6(new cz6((Object) new s51((byte) 9, bundle, z), (Object) new yy6((byte) 20), (byte) 0), (byte) 1));
    }

    public final void Z(dk5 dk5Var, int i, IBinder iBinder, boolean z) {
        if (dk5Var == null || iBinder == null) {
            return;
        }
        b(dk5Var, i, 20, new dz6(new cz6((Object) new s51((byte) 11, iBinder, z), (Object) new yy6((byte) 20), (byte) 0), (byte) 1));
    }

    public final qe8 a(qe8 qe8Var) {
        Object obj;
        Object obj2 = qe8Var.a;
        if (obj2 == null) {
            obj2 = null;
            obj = null;
        } else {
            String str = (String) this.i.get(obj2);
            if (str != null) {
                obj2 = str;
            }
            obj = null;
        }
        int i = qe8Var.b;
        Object obj3 = obj;
        bt6 bt6Var = qe8Var.c;
        Object obj4 = qe8Var.d;
        if (obj4 != null) {
            Object obj5 = (String) this.j.get(obj4);
            if (obj5 == null) {
                obj5 = obj4;
            }
            obj3 = obj5;
        }
        return new qe8(obj2, i, bt6Var, obj3, qe8Var.e, qe8Var.f, qe8Var.g, qe8Var.h, qe8Var.i);
    }

    public final ye8 a0(ye8 ye8Var) {
        nz6 nz6Var;
        d0c d0cVar;
        boolean z;
        bqb bqbVar = ye8Var.j;
        qe8 qe8Var = ye8Var.d;
        qe8 qe8Var2 = ye8Var.e;
        n8a n8aVar = ye8Var.c;
        if (bqbVar.p()) {
            return ye8Var;
        }
        if (!Objects.equals(this.l, bqbVar) || (nz6Var = this.m) == null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            aqb aqbVar = new aqb();
            for (int i = 0; i < bqbVar.o(); i++) {
                bqbVar.n(i, aqbVar);
                Object obj = aqbVar.a;
                if (obj != null && !hashMap.containsKey(obj)) {
                    String str = (String) this.i.get(aqbVar.a);
                    Object obj2 = aqbVar.a;
                    if (str == null) {
                        int i2 = this.k;
                        this.k = i2 + 1;
                        String str2 = hac.a;
                        str = Integer.toString(i2, 36);
                    }
                    hashMap.put(obj2, str);
                }
            }
            ypb ypbVar = new ypb();
            for (int i3 = 0; i3 < bqbVar.h(); i3++) {
                bqbVar.f(i3, ypbVar, true);
                Object obj3 = ypbVar.b;
                if (obj3 != null && !hashMap2.containsKey(obj3)) {
                    String str3 = (String) this.j.get(ypbVar.b);
                    Object obj4 = ypbVar.b;
                    if (str3 == null) {
                        int i4 = this.k;
                        this.k = i4 + 1;
                        String str4 = hac.a;
                        str3 = Integer.toString(i4, 36);
                    }
                    hashMap2.put(obj4, str3);
                }
                Object obj5 = ypbVar.a;
                if (obj5 != null && !hashMap2.containsKey(obj5)) {
                    String str5 = (String) this.j.get(ypbVar.a);
                    Object obj6 = ypbVar.a;
                    if (str5 == null) {
                        int i5 = this.k;
                        this.k = i5 + 1;
                        String str6 = hac.a;
                        str5 = Integer.toString(i5, 36);
                    }
                    hashMap2.put(obj6, str5);
                }
            }
            V(n8aVar.a, hashMap);
            V(qe8Var, hashMap);
            V(qe8Var2, hashMap);
            U(n8aVar.a, hashMap2);
            U(qe8Var, hashMap2);
            U(qe8Var2, hashMap2);
            this.i = co5.g(hashMap);
            this.j = co5.g(hashMap2);
            this.l = bqbVar;
            nz6Var = new nz6(bqbVar, this.i, this.j);
            this.m = nz6Var;
        }
        n8a n8aVar2 = new n8a(a(n8aVar.a), n8aVar.b, n8aVar.c, n8aVar.d, n8aVar.e, n8aVar.f, n8aVar.g, n8aVar.h, n8aVar.i, n8aVar.j);
        qe8 a = a(qe8Var);
        qe8 a2 = a(qe8Var2);
        u64 u64Var = ye8Var.a;
        int i6 = ye8Var.b;
        int i7 = ye8Var.f;
        ce8 ce8Var = ye8Var.g;
        int i8 = ye8Var.h;
        boolean z2 = ye8Var.i;
        int i9 = ye8Var.k;
        jec jecVar = ye8Var.l;
        jt6 jt6Var = ye8Var.m;
        float f = ye8Var.n;
        float f2 = ye8Var.o;
        int i10 = ye8Var.p;
        o00 o00Var = ye8Var.q;
        g53 g53Var = ye8Var.r;
        of3 of3Var = ye8Var.s;
        int i11 = ye8Var.t;
        boolean z3 = ye8Var.u;
        boolean z4 = ye8Var.v;
        int i12 = ye8Var.w;
        boolean z5 = ye8Var.x;
        boolean z6 = ye8Var.y;
        int i13 = ye8Var.z;
        int i14 = ye8Var.A;
        jt6 jt6Var2 = ye8Var.B;
        long j = ye8Var.C;
        long j2 = ye8Var.D;
        long j3 = ye8Var.E;
        g0c g0cVar = ye8Var.F;
        d0c d0cVar2 = ye8Var.G;
        if (nz6Var.p()) {
            d0cVar = d0cVar2;
        } else {
            d0cVar = d0cVar2;
            if (n8aVar2.a.b >= nz6Var.e.o()) {
                z = false;
                jte.p(z);
                return new ye8(u64Var, i6, n8aVar2, a, a2, i7, ce8Var, i8, z2, jecVar, nz6Var, i9, jt6Var, f, f2, o00Var, i10, g53Var, of3Var, i11, z3, z4, i12, i13, i14, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
            }
        }
        z = true;
        jte.p(z);
        return new ye8(u64Var, i6, n8aVar2, a, a2, i7, ce8Var, i8, z2, jecVar, nz6Var, i9, jt6Var, f, f2, o00Var, i10, g53Var, of3Var, i11, z3, z4, i12, i13, i14, z5, z6, jt6Var2, j, j2, j3, g0cVar, d0cVar);
    }

    public final void b(dk5 dk5Var, int i, int i2, lz6 lz6Var) {
        c(dk5Var, i, new a74(this, i2, lz6Var));
    }

    public final ye8 b0(ye8 ye8Var) {
        mo5 mo5Var = ye8Var.F.a;
        bo5 bo5Var = new bo5(4);
        kq kqVar = new kq(4);
        for (int i = 0; i < mo5Var.size(); i++) {
            uzb uzbVar = ((f0c) mo5Var.get(i)).b;
            String str = uzbVar.b;
            String str2 = (String) this.d.get(uzbVar);
            if (str2 == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.f;
                this.f = i2 + 1;
                String str3 = hac.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(str);
                str2 = sb.toString();
            }
            bo5Var.D(uzbVar, str2);
            kqVar.w(str, str2);
        }
        this.d = bo5Var.C();
        this.e = kqVar.e(false);
        jo5 p = mo5.p();
        for (int i3 = 0; i3 < mo5Var.size(); i3++) {
            f0c f0cVar = (f0c) mo5Var.get(i3);
            p.c(new f0c(c0(f0cVar.b), f0cVar.c, f0cVar.d, f0cVar.e));
        }
        ye8 a = ye8Var.a(new g0c(p.f()));
        d0c d0cVar = a.G;
        if (d0cVar.H.isEmpty()) {
            return a;
        }
        c0c c = d0cVar.a().c();
        v7c it = d0cVar.H.values().iterator();
        while (it.hasNext()) {
            a0c a0cVar = (a0c) it.next();
            c.a(new a0c(c0(a0cVar.a), a0cVar.b));
        }
        return a.d(c.b());
    }

    public final void c(dk5 dk5Var, int i, kz6 kz6Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            tx6 tx6Var = (tx6) this.a.get();
            if (tx6Var != null && !tx6Var.i()) {
                R(new v36((Object) this, (Object) dk5Var.asBinder(), (Object) kz6Var, i, (byte) 5));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final uzb c0(uzb uzbVar) {
        String str = (String) this.d.get(uzbVar);
        if (str == null) {
            str = uzbVar.b;
        }
        int i = 0;
        while (true) {
            int i2 = uzbVar.a;
            go4[] go4VarArr = uzbVar.d;
            if (i >= i2) {
                return new uzb(str, go4VarArr);
            }
            if (go4VarArr[i].n != null) {
                go4[] go4VarArr2 = new go4[i2];
                for (int i3 = 0; i3 < uzbVar.a; i3++) {
                    go4 go4Var = go4VarArr[i3];
                    String str2 = go4Var.n;
                    String str3 = str2 != null ? (String) this.e.get(str2) : null;
                    if (str3 != null) {
                        fo4 a = go4Var.a();
                        a.m = str3;
                        go4VarArr2[i3] = new go4(a);
                    } else {
                        go4VarArr2[i3] = go4Var;
                    }
                }
                return new uzb(str, go4VarArr2);
            }
            i++;
        }
    }

    public final void d(dk5 dk5Var, final int i, final r7a r7aVar, final int i2, final lz6 lz6Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final tx6 tx6Var = (tx6) this.a.get();
            if (tx6Var != null && !tx6Var.i()) {
                final IBinder asBinder = dk5Var.asBinder();
                R(new Runnable() { // from class: bz6
                    @Override // java.lang.Runnable
                    public final void run() {
                        mx6 mx6Var = oz6.this.b;
                        sw6 N = mx6Var.N(asBinder);
                        if (N == null || !mx6Var.X(N)) {
                            return;
                        }
                        r7a r7aVar2 = r7aVar;
                        tx6 tx6Var2 = tx6Var;
                        int i3 = i;
                        if (r7aVar2 != null) {
                            if (!mx6Var.c0(N, r7aVar2)) {
                                oz6.W(tx6Var2, N, i3, new q8a(-4));
                                return;
                            }
                        } else if (!mx6Var.a0(N, i2)) {
                            oz6.W(tx6Var2, N, i3, new q8a(-4));
                            return;
                        }
                        lz6Var.t(tx6Var2, N, i3);
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final int f(sw6 sw6Var, cf8 cf8Var, int i) {
        if (cf8Var.m0(17)) {
            mx6 mx6Var = this.b;
            if (!mx6Var.Z(sw6Var, 17) && mx6Var.Z(sw6Var, 16)) {
                return cf8Var.l0() + i;
            }
        }
        return i;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        dk5 dk5Var;
        Bundle bundle;
        boolean z;
        final byte b = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        byte b2 = 14;
        byte b3 = 29;
        final byte b4 = 4;
        byte b5 = 10;
        final byte b6 = 2;
        byte b7 = 24;
        byte b8 = 20;
        switch (i) {
            case 3002:
                dk5 a = ap6.a(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (a != null && readFloat >= 0.0f && readFloat <= 1.0f) {
                    b(a, readInt, 24, X(new pc(readFloat, (byte) 4)));
                }
                return true;
            case 3003:
                dk5 a2 = ap6.a(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                if (a2 != null && readInt3 >= 0) {
                    b(a2, readInt2, 25, X(new pg(readInt3, (byte) 9)));
                    return true;
                }
                return true;
            case 3004:
                dk5 a3 = ap6.a(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                if (a3 != null) {
                    b(a3, readInt4, 26, X(new yy6(b6)));
                    return true;
                }
                return true;
            case 3005:
                dk5 a4 = ap6.a(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                if (a4 != null) {
                    b(a4, readInt5, 26, X(new yy6((byte) 6)));
                    return true;
                }
                return true;
            case 3006:
                dk5 a5 = ap6.a(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                r9 = parcel.readInt() != 0;
                if (a5 != null) {
                    b(a5, readInt6, 26, X(new z64(b4, r9)));
                    return true;
                }
                return true;
            case 3007:
                Y(ap6.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) cme.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                dk5 a6 = ap6.a(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                Bundle bundle2 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                long readLong = parcel.readLong();
                if (a6 != null && bundle2 != null) {
                    b(a6, readInt7, 31, new dz6(new cz6(new d12((Object) bundle2, readLong, (byte) 9), new yy6(b8), r9 ? (byte) 1 : (byte) 0), b));
                    return true;
                }
                return true;
            case 3009:
                Y(ap6.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) cme.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                Z(ap6.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                Z(ap6.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                dk5 a7 = ap6.a(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int readInt9 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (a7 != null && readStrongBinder != null && (readInt9 == -1 || readInt9 >= 0)) {
                    b(a7, readInt8, 20, new dz6(new cz6(new hg((Object) readStrongBinder, readInt9, readLong2, (byte) 5), new yy6(b8), r9 ? (byte) 1 : (byte) 0), b));
                    return true;
                }
                return true;
            case 3013:
                dk5 a8 = ap6.a(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                boolean z2 = parcel.readInt() != 0;
                if (a8 != null) {
                    b(a8, readInt10, 1, X(new z64((byte) 3, z2)));
                    return true;
                }
                return true;
            case 3014:
                dk5 a9 = ap6.a(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                Bundle bundle3 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a9 != null && bundle3 != null) {
                    try {
                        q8a a10 = q8a.a(bundle3);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            tx6 tx6Var = (tx6) this.a.get();
                            if (tx6Var != null && !tx6Var.i()) {
                                R(new v36((Object) this, (Object) a9.asBinder(), readInt11, (Object) a10, (byte) 4));
                            }
                        } finally {
                        }
                    } catch (RuntimeException e) {
                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e);
                    }
                }
                return true;
            case 3015:
                dk5 a11 = ap6.a(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle4 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.a;
                tx6 tx6Var2 = (tx6) weakReference.get();
                if (a11 == null || bundle4 == null || tx6Var2 == null) {
                    zve.a(a11);
                } else {
                    try {
                        Context context = tx6Var2.f;
                        nt2 a12 = nt2.a(bundle4);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        String str = a12.c;
                        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                        if (packagesForUid != null && packagesForUid.length != 0) {
                            for (String str2 : packagesForUid) {
                                if (!str2.equals(str)) {
                                }
                            }
                            ncd.f("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                            zve.a(a11);
                        }
                        long clearCallingIdentity2 = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a12.d;
                        }
                        try {
                            my6 my6Var = new my6(str, callingPid, callingUid);
                            boolean E0 = nl9.D0(context).E0(my6Var);
                            int i3 = a12.a;
                            int i4 = a12.b;
                            sw6 sw6Var = new sw6(my6Var, i3, i4, E0, new hz6(a11, i4), a12.e);
                            tx6 tx6Var3 = (tx6) weakReference.get();
                            if (tx6Var3 == null || tx6Var3.i()) {
                                zve.a(a11);
                            } else {
                                this.c.add(sw6Var);
                                hac.X(tx6Var3.l, new jy6(this, tx6Var3, sw6Var, a11, (byte) 2));
                            }
                        } finally {
                        }
                    } catch (RuntimeException e2) {
                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e2);
                    }
                }
                return true;
            case 3016:
                dk5 a13 = ap6.a(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                P(a13, readInt12, (Bundle) cme.a(parcel, creator), (Bundle) cme.a(parcel, creator), false);
                return true;
            case 3017:
                dk5 a14 = ap6.a(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                if (a14 != null && (readInt14 == 2 || readInt14 == 0 || readInt14 == 1)) {
                    b(a14, readInt13, 15, X(new pg(readInt14, (byte) 8)));
                    return true;
                }
                return true;
            case 3018:
                dk5 a15 = ap6.a(parcel.readStrongBinder());
                int readInt15 = parcel.readInt();
                boolean z3 = parcel.readInt() != 0;
                if (a15 != null) {
                    b(a15, readInt15, 14, X(new z64((byte) 5, z3)));
                    return true;
                }
                return true;
            case 3019:
                dk5 a16 = ap6.a(parcel.readStrongBinder());
                int readInt16 = parcel.readInt();
                int readInt17 = parcel.readInt();
                if (a16 != null && readInt17 >= 0) {
                    b(a16, readInt16, 20, new cj6(new vy6(this, readInt17, (byte) 4), (byte) 7));
                    return true;
                }
                return true;
            case 3020:
                dk5 a17 = ap6.a(parcel.readStrongBinder());
                int readInt18 = parcel.readInt();
                int readInt19 = parcel.readInt();
                int readInt20 = parcel.readInt();
                if (a17 != null && readInt19 >= 0 && readInt20 >= readInt19) {
                    b(a17, readInt18, 20, new cj6(new sy6(this, readInt19, readInt20), (byte) 7));
                    return true;
                }
                return true;
            case 3021:
                dk5 a18 = ap6.a(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (a18 != null) {
                    b(a18, readInt21, 20, X(new yy6((byte) 15)));
                    return true;
                }
                return true;
            case 3022:
                dk5 a19 = ap6.a(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                int readInt23 = parcel.readInt();
                int readInt24 = parcel.readInt();
                if (a19 != null && readInt23 >= 0 && readInt24 >= 0) {
                    b(a19, readInt22, 20, X(new lm0(readInt23, readInt24, (byte) 5)));
                    return true;
                }
                return true;
            case 3023:
                dk5 a20 = ap6.a(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                final int readInt26 = parcel.readInt();
                final int readInt27 = parcel.readInt();
                final int readInt28 = parcel.readInt();
                if (a20 != null && readInt26 >= 0 && readInt27 >= readInt26 && readInt28 >= 0) {
                    b(a20, readInt25, 20, X(new fu2() { // from class: zy6
                        @Override // fu2
                        public final void accept(Object obj) {
                            ((cf8) obj).t0(readInt26, readInt27, readInt28);
                        }
                    }));
                    return true;
                }
                return true;
            case 3024:
                dk5 a21 = ap6.a(parcel.readStrongBinder());
                int readInt29 = parcel.readInt();
                if (a21 != null) {
                    c(a21, readInt29, new kz6(this) { // from class: wy6
                        public final /* synthetic */ oz6 b;

                        {
                            this.b = this;
                        }

                        @Override // kz6
                        public final void a(sw6 sw6Var2, int i5) {
                            byte b9 = b;
                            oz6 oz6Var = this.b;
                            switch (b9) {
                                case 0:
                                    oz6Var.S(sw6Var2, i5, 11, oz6.X(new yy6((byte) 18)));
                                    break;
                                case 1:
                                    oz6Var.Q(sw6Var2, i5);
                                    break;
                                case 2:
                                    oz6Var.S(sw6Var2, i5, 3, oz6.X(new yy6((byte) 23)));
                                    break;
                                case 3:
                                    oz6Var.S(sw6Var2, i5, 12, oz6.X(new yy6((byte) 21)));
                                    break;
                                case 4:
                                    oz6Var.S(sw6Var2, i5, 1, oz6.X(new yy6((byte) 17)));
                                    break;
                                case 5:
                                    oz6Var.S(sw6Var2, i5, 9, oz6.X(new yy6((byte) 22)));
                                    break;
                                default:
                                    oz6Var.S(sw6Var2, i5, 7, oz6.X(new yy6((byte) 19)));
                                    break;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3025:
                dk5 a22 = ap6.a(parcel.readStrongBinder());
                int readInt30 = parcel.readInt();
                if (a22 != null) {
                    c(a22, readInt30, new kz6(this) { // from class: wy6
                        public final /* synthetic */ oz6 b;

                        {
                            this.b = this;
                        }

                        @Override // kz6
                        public final void a(sw6 sw6Var2, int i5) {
                            byte b9 = b4;
                            oz6 oz6Var = this.b;
                            switch (b9) {
                                case 0:
                                    oz6Var.S(sw6Var2, i5, 11, oz6.X(new yy6((byte) 18)));
                                    break;
                                case 1:
                                    oz6Var.Q(sw6Var2, i5);
                                    break;
                                case 2:
                                    oz6Var.S(sw6Var2, i5, 3, oz6.X(new yy6((byte) 23)));
                                    break;
                                case 3:
                                    oz6Var.S(sw6Var2, i5, 12, oz6.X(new yy6((byte) 21)));
                                    break;
                                case 4:
                                    oz6Var.S(sw6Var2, i5, 1, oz6.X(new yy6((byte) 17)));
                                    break;
                                case 5:
                                    oz6Var.S(sw6Var2, i5, 9, oz6.X(new yy6((byte) 22)));
                                    break;
                                default:
                                    oz6Var.S(sw6Var2, i5, 7, oz6.X(new yy6((byte) 19)));
                                    break;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3026:
                dk5 a23 = ap6.a(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                if (a23 != null) {
                    b(a23, readInt31, 2, X(new yy6((byte) 13)));
                    return true;
                }
                return true;
            case 3027:
                dk5 a24 = ap6.a(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                Bundle bundle5 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a24 != null && bundle5 != null) {
                    try {
                        b(a24, readInt32, 13, X(new cj6(new ce8(bundle5.getFloat(ce8.e, 1.0f), bundle5.getFloat(ce8.f, 1.0f)), (byte) 6)));
                    } catch (RuntimeException e3) {
                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e3);
                    }
                }
                return true;
            case 3028:
                dk5 a25 = ap6.a(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                float readFloat2 = parcel.readFloat();
                if (a25 != null && readFloat2 > 0.0f) {
                    b(a25, readInt33, 13, X(new pc(readFloat2, (byte) 3)));
                    return true;
                }
                return true;
            case 3029:
                dk5 a26 = ap6.a(parcel.readStrongBinder());
                int readInt34 = parcel.readInt();
                final Bundle bundle6 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a26 != null && bundle6 != null) {
                    b(a26, readInt34, 20, new dz6(new cz6(new lz6() { // from class: xy6
                        @Override // lz6
                        public final Object t(tx6 tx6Var4, sw6 sw6Var2, int i5) {
                            byte b9 = b6;
                            Bundle bundle7 = bundle6;
                            switch (b9) {
                                case 0:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle7)));
                                    } catch (RuntimeException e4) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return kke.b(e4);
                                    }
                                case 1:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle7)));
                                    } catch (RuntimeException e5) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return kke.b(e5);
                                    }
                                case 2:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle7)));
                                    } catch (RuntimeException e6) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return kke.b(e6);
                                    }
                                default:
                                    try {
                                        jt6 b10 = jt6.b(sw6Var2.c, bundle7);
                                        tx6Var4.t();
                                        tx6Var4.t.j0(b10);
                                        return kke.c(new q8a(0));
                                    } catch (RuntimeException e7) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return kke.b(e7);
                                    }
                            }
                        }
                    }, new yy6((byte) 8), b), b));
                    return true;
                }
                return true;
            case 3030:
                dk5 a27 = ap6.a(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                int readInt36 = parcel.readInt();
                final Bundle bundle7 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a27 != null && bundle7 != null && readInt36 >= 0) {
                    final byte b9 = r9 ? (byte) 1 : (byte) 0;
                    b(a27, readInt35, 20, new dz6(new cz6(new lz6() { // from class: xy6
                        @Override // lz6
                        public final Object t(tx6 tx6Var4, sw6 sw6Var2, int i5) {
                            byte b92 = b9;
                            Bundle bundle72 = bundle7;
                            switch (b92) {
                                case 0:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e4) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return kke.b(e4);
                                    }
                                case 1:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e5) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return kke.b(e5);
                                    }
                                case 2:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e6) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return kke.b(e6);
                                    }
                                default:
                                    try {
                                        jt6 b10 = jt6.b(sw6Var2.c, bundle72);
                                        tx6Var4.t();
                                        tx6Var4.t.j0(b10);
                                        return kke.c(new q8a(0));
                                    } catch (RuntimeException e7) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return kke.b(e7);
                                    }
                            }
                        }
                    }, new vy6(this, readInt36, (byte) 1), b), b));
                    return true;
                }
                return true;
            case 3031:
                dk5 a28 = ap6.a(parcel.readStrongBinder());
                int readInt37 = parcel.readInt();
                final IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (a28 != null && readStrongBinder2 != null) {
                    b(a28, readInt37, 20, new dz6(new cz6(new lz6() { // from class: uy6
                        @Override // lz6
                        public final Object t(tx6 tx6Var4, sw6 sw6Var2, int i5) {
                            byte b10 = b6;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder2;
                            switch (b10) {
                                case 0:
                                    try {
                                        mo5 a29 = e41.a(iBinder);
                                        jo5 p = mo5.p();
                                        while (i6 < a29.size()) {
                                            Bundle bundle8 = (Bundle) a29.get(i6);
                                            bundle8.getClass();
                                            p.c(bt6.a(sw6Var2.c, bundle8));
                                            i6++;
                                        }
                                        return tx6Var4.k(sw6Var2, p.f());
                                    } catch (RuntimeException e4) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return kke.b(e4);
                                    }
                                case 1:
                                    try {
                                        mo5 a30 = e41.a(iBinder);
                                        jo5 p2 = mo5.p();
                                        while (i6 < a30.size()) {
                                            Bundle bundle9 = (Bundle) a30.get(i6);
                                            bundle9.getClass();
                                            p2.c(bt6.a(sw6Var2.c, bundle9));
                                            i6++;
                                        }
                                        return tx6Var4.k(sw6Var2, p2.f());
                                    } catch (RuntimeException e5) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return kke.b(e5);
                                    }
                                default:
                                    try {
                                        mo5 a31 = e41.a(iBinder);
                                        jo5 p3 = mo5.p();
                                        while (i6 < a31.size()) {
                                            Bundle bundle10 = (Bundle) a31.get(i6);
                                            bundle10.getClass();
                                            p3.c(bt6.a(sw6Var2.c, bundle10));
                                            i6++;
                                        }
                                        return tx6Var4.k(sw6Var2, p3.f());
                                    } catch (RuntimeException e6) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return kke.b(e6);
                                    }
                            }
                        }
                    }, new yy6((byte) 7), b), b));
                    return true;
                }
                return true;
            case 3032:
                dk5 a29 = ap6.a(parcel.readStrongBinder());
                int readInt38 = parcel.readInt();
                int readInt39 = parcel.readInt();
                final IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (a29 != null && readStrongBinder3 != null && readInt39 >= 0) {
                    b(a29, readInt38, 20, new dz6(new cz6(new lz6() { // from class: uy6
                        @Override // lz6
                        public final Object t(tx6 tx6Var4, sw6 sw6Var2, int i5) {
                            byte b10 = b;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder3;
                            switch (b10) {
                                case 0:
                                    try {
                                        mo5 a292 = e41.a(iBinder);
                                        jo5 p = mo5.p();
                                        while (i6 < a292.size()) {
                                            Bundle bundle8 = (Bundle) a292.get(i6);
                                            bundle8.getClass();
                                            p.c(bt6.a(sw6Var2.c, bundle8));
                                            i6++;
                                        }
                                        return tx6Var4.k(sw6Var2, p.f());
                                    } catch (RuntimeException e4) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return kke.b(e4);
                                    }
                                case 1:
                                    try {
                                        mo5 a30 = e41.a(iBinder);
                                        jo5 p2 = mo5.p();
                                        while (i6 < a30.size()) {
                                            Bundle bundle9 = (Bundle) a30.get(i6);
                                            bundle9.getClass();
                                            p2.c(bt6.a(sw6Var2.c, bundle9));
                                            i6++;
                                        }
                                        return tx6Var4.k(sw6Var2, p2.f());
                                    } catch (RuntimeException e5) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return kke.b(e5);
                                    }
                                default:
                                    try {
                                        mo5 a31 = e41.a(iBinder);
                                        jo5 p3 = mo5.p();
                                        while (i6 < a31.size()) {
                                            Bundle bundle10 = (Bundle) a31.get(i6);
                                            bundle10.getClass();
                                            p3.c(bt6.a(sw6Var2.c, bundle10));
                                            i6++;
                                        }
                                        return tx6Var4.k(sw6Var2, p3.f());
                                    } catch (RuntimeException e6) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return kke.b(e6);
                                    }
                            }
                        }
                    }, new vy6(this, readInt39, (byte) 3), b), b));
                    return true;
                }
                return true;
            case 3033:
                dk5 a30 = ap6.a(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                final Bundle bundle8 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a30 != null && bundle8 != null) {
                    final byte b10 = 3;
                    b(a30, readInt40, 19, new dz6(new lz6() { // from class: xy6
                        @Override // lz6
                        public final Object t(tx6 tx6Var4, sw6 sw6Var2, int i5) {
                            byte b92 = b10;
                            Bundle bundle72 = bundle8;
                            switch (b92) {
                                case 0:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e4) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e4);
                                        return kke.b(e4);
                                    }
                                case 1:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e5) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e5);
                                        return kke.b(e5);
                                    }
                                case 2:
                                    try {
                                        return tx6Var4.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e6) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e6);
                                        return kke.b(e6);
                                    }
                                default:
                                    try {
                                        jt6 b102 = jt6.b(sw6Var2.c, bundle72);
                                        tx6Var4.t();
                                        tx6Var4.t.j0(b102);
                                        return kke.c(new q8a(0));
                                    } catch (RuntimeException e7) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return kke.b(e7);
                                    }
                            }
                        }
                    }, b));
                    return true;
                }
                return true;
            case 3034:
                dk5 a31 = ap6.a(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (a31 != null) {
                    c(a31, readInt41, new kz6(this) { // from class: wy6
                        public final /* synthetic */ oz6 b;

                        {
                            this.b = this;
                        }

                        @Override // kz6
                        public final void a(sw6 sw6Var2, int i5) {
                            byte b92 = b6;
                            oz6 oz6Var = this.b;
                            switch (b92) {
                                case 0:
                                    oz6Var.S(sw6Var2, i5, 11, oz6.X(new yy6((byte) 18)));
                                    break;
                                case 1:
                                    oz6Var.Q(sw6Var2, i5);
                                    break;
                                case 2:
                                    oz6Var.S(sw6Var2, i5, 3, oz6.X(new yy6((byte) 23)));
                                    break;
                                case 3:
                                    oz6Var.S(sw6Var2, i5, 12, oz6.X(new yy6((byte) 21)));
                                    break;
                                case 4:
                                    oz6Var.S(sw6Var2, i5, 1, oz6.X(new yy6((byte) 17)));
                                    break;
                                case 5:
                                    oz6Var.S(sw6Var2, i5, 9, oz6.X(new yy6((byte) 22)));
                                    break;
                                default:
                                    oz6Var.S(sw6Var2, i5, 7, oz6.X(new yy6((byte) 19)));
                                    break;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3035:
                dk5 a32 = ap6.a(parcel.readStrongBinder());
                parcel.readInt();
                if (a32 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        tx6 tx6Var4 = (tx6) this.a.get();
                        if (tx6Var4 != null && !tx6Var4.i()) {
                            final IBinder asBinder = a32.asBinder();
                            final byte b11 = r9 ? (byte) 1 : (byte) 0;
                            R(new Runnable(this) { // from class: ty6
                                public final /* synthetic */ oz6 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b12 = b11;
                                    IBinder iBinder = asBinder;
                                    oz6 oz6Var = this.b;
                                    switch (b12) {
                                        case 0:
                                            mx6 mx6Var = oz6Var.b;
                                            mx6Var.C0();
                                            sw6 N = mx6Var.N(iBinder);
                                            if (N != null) {
                                                mx6Var.i0(N);
                                                break;
                                            }
                                            break;
                                        default:
                                            mx6 mx6Var2 = oz6Var.b;
                                            sw6 N2 = mx6Var2.N(iBinder);
                                            if (N2 != null) {
                                                mx6Var2.F(N2);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3036:
                dk5 a33 = ap6.a(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                if (a33 != null) {
                    b(a33, readInt42, 4, X(new yy6((byte) 12)));
                    return true;
                }
                return true;
            case 3037:
                dk5 a34 = ap6.a(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                int readInt44 = parcel.readInt();
                if (a34 != null && readInt44 >= 0) {
                    b(a34, readInt43, 10, new cj6(new vy6(this, readInt44, (byte) 0), (byte) 7));
                    return true;
                }
                return true;
            case 3038:
                dk5 a35 = ap6.a(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                long readLong3 = parcel.readLong();
                if (a35 != null) {
                    b(a35, readInt45, 5, X(new f50(readLong3)));
                    return true;
                }
                return true;
            case 3039:
                dk5 a36 = ap6.a(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                int readInt47 = parcel.readInt();
                long readLong4 = parcel.readLong();
                if (a36 != null && readInt47 >= 0) {
                    b(a36, readInt46, 10, new cj6(new hg((Object) this, readInt47, readLong4, (byte) 4), (byte) 7));
                    return true;
                }
                return true;
            case 3040:
                dk5 a37 = ap6.a(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                if (a37 != null) {
                    final byte b12 = r9 ? (byte) 1 : (byte) 0;
                    c(a37, readInt48, new kz6(this) { // from class: wy6
                        public final /* synthetic */ oz6 b;

                        {
                            this.b = this;
                        }

                        @Override // kz6
                        public final void a(sw6 sw6Var2, int i5) {
                            byte b92 = b12;
                            oz6 oz6Var = this.b;
                            switch (b92) {
                                case 0:
                                    oz6Var.S(sw6Var2, i5, 11, oz6.X(new yy6((byte) 18)));
                                    break;
                                case 1:
                                    oz6Var.Q(sw6Var2, i5);
                                    break;
                                case 2:
                                    oz6Var.S(sw6Var2, i5, 3, oz6.X(new yy6((byte) 23)));
                                    break;
                                case 3:
                                    oz6Var.S(sw6Var2, i5, 12, oz6.X(new yy6((byte) 21)));
                                    break;
                                case 4:
                                    oz6Var.S(sw6Var2, i5, 1, oz6.X(new yy6((byte) 17)));
                                    break;
                                case 5:
                                    oz6Var.S(sw6Var2, i5, 9, oz6.X(new yy6((byte) 22)));
                                    break;
                                default:
                                    oz6Var.S(sw6Var2, i5, 7, oz6.X(new yy6((byte) 19)));
                                    break;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3041:
                final byte b13 = 3;
                dk5 a38 = ap6.a(parcel.readStrongBinder());
                int readInt49 = parcel.readInt();
                if (a38 != null) {
                    c(a38, readInt49, new kz6(this) { // from class: wy6
                        public final /* synthetic */ oz6 b;

                        {
                            this.b = this;
                        }

                        @Override // kz6
                        public final void a(sw6 sw6Var2, int i5) {
                            byte b92 = b13;
                            oz6 oz6Var = this.b;
                            switch (b92) {
                                case 0:
                                    oz6Var.S(sw6Var2, i5, 11, oz6.X(new yy6((byte) 18)));
                                    break;
                                case 1:
                                    oz6Var.Q(sw6Var2, i5);
                                    break;
                                case 2:
                                    oz6Var.S(sw6Var2, i5, 3, oz6.X(new yy6((byte) 23)));
                                    break;
                                case 3:
                                    oz6Var.S(sw6Var2, i5, 12, oz6.X(new yy6((byte) 21)));
                                    break;
                                case 4:
                                    oz6Var.S(sw6Var2, i5, 1, oz6.X(new yy6((byte) 17)));
                                    break;
                                case 5:
                                    oz6Var.S(sw6Var2, i5, 9, oz6.X(new yy6((byte) 22)));
                                    break;
                                default:
                                    oz6Var.S(sw6Var2, i5, 7, oz6.X(new yy6((byte) 19)));
                                    break;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3042:
                dk5 a39 = ap6.a(parcel.readStrongBinder());
                int readInt50 = parcel.readInt();
                if (a39 != null) {
                    b(a39, readInt50, 6, X(new yy6((byte) 3)));
                    return true;
                }
                return true;
            case 3043:
                dk5 a40 = ap6.a(parcel.readStrongBinder());
                int readInt51 = parcel.readInt();
                if (a40 != null) {
                    b(a40, readInt51, 8, X(new yy6(r9 ? (byte) 1 : (byte) 0)));
                    return true;
                }
                return true;
            case 3044:
                dk5 a41 = ap6.a(parcel.readStrongBinder());
                int readInt52 = parcel.readInt();
                Surface surface = (Surface) cme.a(parcel, Surface.CREATOR);
                if (a41 != null) {
                    b(a41, readInt52, 27, X(new nv4(this, surface, b3)));
                    return true;
                }
                return true;
            case 3045:
                dk5 a42 = ap6.a(parcel.readStrongBinder());
                if (a42 != null) {
                    long clearCallingIdentity4 = Binder.clearCallingIdentity();
                    try {
                        tx6 tx6Var5 = (tx6) this.a.get();
                        if (tx6Var5 != null && !tx6Var5.i()) {
                            final IBinder asBinder2 = a42.asBinder();
                            R(new Runnable(this) { // from class: ty6
                                public final /* synthetic */ oz6 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b122 = b;
                                    IBinder iBinder = asBinder2;
                                    oz6 oz6Var = this.b;
                                    switch (b122) {
                                        case 0:
                                            mx6 mx6Var = oz6Var.b;
                                            mx6Var.C0();
                                            sw6 N = mx6Var.N(iBinder);
                                            if (N != null) {
                                                mx6Var.i0(N);
                                                break;
                                            }
                                            break;
                                        default:
                                            mx6 mx6Var2 = oz6Var.b;
                                            sw6 N2 = mx6Var2.N(iBinder);
                                            if (N2 != null) {
                                                mx6Var2.F(N2);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3046:
                dk5 a43 = ap6.a(parcel.readStrongBinder());
                int readInt53 = parcel.readInt();
                if (a43 != null) {
                    final byte b14 = 6;
                    c(a43, readInt53, new kz6(this) { // from class: wy6
                        public final /* synthetic */ oz6 b;

                        {
                            this.b = this;
                        }

                        @Override // kz6
                        public final void a(sw6 sw6Var2, int i5) {
                            byte b92 = b14;
                            oz6 oz6Var = this.b;
                            switch (b92) {
                                case 0:
                                    oz6Var.S(sw6Var2, i5, 11, oz6.X(new yy6((byte) 18)));
                                    break;
                                case 1:
                                    oz6Var.Q(sw6Var2, i5);
                                    break;
                                case 2:
                                    oz6Var.S(sw6Var2, i5, 3, oz6.X(new yy6((byte) 23)));
                                    break;
                                case 3:
                                    oz6Var.S(sw6Var2, i5, 12, oz6.X(new yy6((byte) 21)));
                                    break;
                                case 4:
                                    oz6Var.S(sw6Var2, i5, 1, oz6.X(new yy6((byte) 17)));
                                    break;
                                case 5:
                                    oz6Var.S(sw6Var2, i5, 9, oz6.X(new yy6((byte) 22)));
                                    break;
                                default:
                                    oz6Var.S(sw6Var2, i5, 7, oz6.X(new yy6((byte) 19)));
                                    break;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3047:
                dk5 a44 = ap6.a(parcel.readStrongBinder());
                int readInt54 = parcel.readInt();
                if (a44 != null) {
                    final byte b15 = 5;
                    c(a44, readInt54, new kz6(this) { // from class: wy6
                        public final /* synthetic */ oz6 b;

                        {
                            this.b = this;
                        }

                        @Override // kz6
                        public final void a(sw6 sw6Var2, int i5) {
                            byte b92 = b15;
                            oz6 oz6Var = this.b;
                            switch (b92) {
                                case 0:
                                    oz6Var.S(sw6Var2, i5, 11, oz6.X(new yy6((byte) 18)));
                                    break;
                                case 1:
                                    oz6Var.Q(sw6Var2, i5);
                                    break;
                                case 2:
                                    oz6Var.S(sw6Var2, i5, 3, oz6.X(new yy6((byte) 23)));
                                    break;
                                case 3:
                                    oz6Var.S(sw6Var2, i5, 12, oz6.X(new yy6((byte) 21)));
                                    break;
                                case 4:
                                    oz6Var.S(sw6Var2, i5, 1, oz6.X(new yy6((byte) 17)));
                                    break;
                                case 5:
                                    oz6Var.S(sw6Var2, i5, 9, oz6.X(new yy6((byte) 22)));
                                    break;
                                default:
                                    oz6Var.S(sw6Var2, i5, 7, oz6.X(new yy6((byte) 19)));
                                    break;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 3048:
                dk5 a45 = ap6.a(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                Bundle bundle9 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a45 != null && bundle9 != null) {
                    try {
                        b(a45, readInt55, 29, X(new nv4(this, d0c.b(bundle9), (byte) 28)));
                    } catch (RuntimeException e4) {
                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e4);
                    }
                }
                return true;
            case 3049:
                dk5 a46 = ap6.a(parcel.readStrongBinder());
                int readInt56 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle10 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a46 != null && readString != null && bundle10 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        ncd.f("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            d(a46, readInt56, null, 40010, new dz6(new yy6((byte) 5, (Object) g19.a(bundle10), readString), b));
                        } catch (RuntimeException e5) {
                            ncd.g("MediaSessionStub", "Ignoring malformed Bundle for Rating", e5);
                        }
                    }
                }
                return true;
            case 3050:
                dk5 a47 = ap6.a(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                Bundle bundle11 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a47 != null && bundle11 != null) {
                    try {
                        d(a47, readInt57, null, 40010, new dz6(new yy6(g19.a(bundle11), b7), b));
                    } catch (RuntimeException e6) {
                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for Rating", e6);
                    }
                }
                return true;
            case 3051:
                dk5 a48 = ap6.a(parcel.readStrongBinder());
                int readInt58 = parcel.readInt();
                int readInt59 = parcel.readInt();
                int readInt60 = parcel.readInt();
                if (a48 != null && readInt59 >= 0) {
                    b(a48, readInt58, 33, X(new lm0(readInt59, readInt60, (byte) 4)));
                    return true;
                }
                return true;
            case 3052:
                dk5 a49 = ap6.a(parcel.readStrongBinder());
                int readInt61 = parcel.readInt();
                int readInt62 = parcel.readInt();
                if (a49 != null) {
                    b(a49, readInt61, 34, X(new pg(readInt62, (byte) 7)));
                    return true;
                }
                return true;
            case 3053:
                dk5 a50 = ap6.a(parcel.readStrongBinder());
                int readInt63 = parcel.readInt();
                int readInt64 = parcel.readInt();
                if (a50 != null) {
                    b(a50, readInt63, 34, X(new pg(readInt64, (byte) 6)));
                    return true;
                }
                return true;
            case 3054:
                dk5 a51 = ap6.a(parcel.readStrongBinder());
                int readInt65 = parcel.readInt();
                final boolean z4 = parcel.readInt() != 0;
                final int readInt66 = parcel.readInt();
                if (a51 != null) {
                    b(a51, readInt65, 34, X(new fu2() { // from class: az6
                        @Override // fu2
                        public final void accept(Object obj) {
                            ((cf8) obj).G(readInt66, z4);
                        }
                    }));
                    return true;
                }
                return true;
            case 3055:
                dk5 a52 = ap6.a(parcel.readStrongBinder());
                int readInt67 = parcel.readInt();
                int readInt68 = parcel.readInt();
                final Bundle bundle12 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                if (a52 != null && bundle12 != null && readInt68 >= 0) {
                    b(a52, readInt67, 20, new dz6(new cz6(new lz6() { // from class: xy6
                        @Override // lz6
                        public final Object t(tx6 tx6Var42, sw6 sw6Var2, int i5) {
                            byte b92 = b;
                            Bundle bundle72 = bundle12;
                            switch (b92) {
                                case 0:
                                    try {
                                        return tx6Var42.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e42) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e42);
                                        return kke.b(e42);
                                    }
                                case 1:
                                    try {
                                        return tx6Var42.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e52) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e52);
                                        return kke.b(e52);
                                    }
                                case 2:
                                    try {
                                        return tx6Var42.k(sw6Var2, mo5.u(bt6.a(sw6Var2.c, bundle72)));
                                    } catch (RuntimeException e62) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e62);
                                        return kke.b(e62);
                                    }
                                default:
                                    try {
                                        jt6 b102 = jt6.b(sw6Var2.c, bundle72);
                                        tx6Var42.t();
                                        tx6Var42.t.j0(b102);
                                        return kke.c(new q8a(0));
                                    } catch (RuntimeException e7) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e7);
                                        return kke.b(e7);
                                    }
                            }
                        }
                    }, new vy6(this, readInt68, (byte) 2), b), b));
                    return true;
                }
                return true;
            case 3056:
                dk5 a53 = ap6.a(parcel.readStrongBinder());
                int readInt69 = parcel.readInt();
                int readInt70 = parcel.readInt();
                int readInt71 = parcel.readInt();
                final IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (a53 != null && readStrongBinder4 != null && readInt70 >= 0 && readInt71 >= readInt70) {
                    final byte b16 = r9 ? (byte) 1 : (byte) 0;
                    b(a53, readInt69, 20, new dz6(new cz6(new lz6() { // from class: uy6
                        @Override // lz6
                        public final Object t(tx6 tx6Var42, sw6 sw6Var2, int i5) {
                            byte b102 = b16;
                            int i6 = 0;
                            IBinder iBinder = readStrongBinder4;
                            switch (b102) {
                                case 0:
                                    try {
                                        mo5 a292 = e41.a(iBinder);
                                        jo5 p = mo5.p();
                                        while (i6 < a292.size()) {
                                            Bundle bundle82 = (Bundle) a292.get(i6);
                                            bundle82.getClass();
                                            p.c(bt6.a(sw6Var2.c, bundle82));
                                            i6++;
                                        }
                                        return tx6Var42.k(sw6Var2, p.f());
                                    } catch (RuntimeException e42) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e42);
                                        return kke.b(e42);
                                    }
                                case 1:
                                    try {
                                        mo5 a302 = e41.a(iBinder);
                                        jo5 p2 = mo5.p();
                                        while (i6 < a302.size()) {
                                            Bundle bundle92 = (Bundle) a302.get(i6);
                                            bundle92.getClass();
                                            p2.c(bt6.a(sw6Var2.c, bundle92));
                                            i6++;
                                        }
                                        return tx6Var42.k(sw6Var2, p2.f());
                                    } catch (RuntimeException e52) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e52);
                                        return kke.b(e52);
                                    }
                                default:
                                    try {
                                        mo5 a312 = e41.a(iBinder);
                                        jo5 p3 = mo5.p();
                                        while (i6 < a312.size()) {
                                            Bundle bundle102 = (Bundle) a312.get(i6);
                                            bundle102.getClass();
                                            p3.c(bt6.a(sw6Var2.c, bundle102));
                                            i6++;
                                        }
                                        return tx6Var42.k(sw6Var2, p3.f());
                                    } catch (RuntimeException e62) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e62);
                                        return kke.b(e62);
                                    }
                            }
                        }
                    }, new sy6(this, readInt70, readInt71), b), b));
                    return true;
                }
                return true;
            case 3057:
                dk5 a54 = ap6.a(parcel.readStrongBinder());
                int readInt72 = parcel.readInt();
                Bundle bundle13 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                boolean z5 = parcel.readInt() != 0;
                if (a54 != null && bundle13 != null) {
                    try {
                        b(a54, readInt72, 35, X(new s51(b5, o00.a(bundle13), z5)));
                    } catch (RuntimeException e7) {
                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e7);
                    }
                }
                return true;
            case 3058:
                dk5 a55 = ap6.a(parcel.readStrongBinder());
                int readInt73 = parcel.readInt();
                if (a55 != null) {
                    b(a55, readInt73, 24, X(new u36((byte) 29)));
                    return true;
                }
                return true;
            case 3059:
                dk5 a56 = ap6.a(parcel.readStrongBinder());
                int readInt74 = parcel.readInt();
                if (a56 != null) {
                    b(a56, readInt74, 24, X(new yy6(b5)));
                    return true;
                }
                return true;
            case 3060:
                dk5 a57 = ap6.a(parcel.readStrongBinder());
                int readInt75 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle14 = (Bundle) cme.a(parcel, creator2);
                Bundle bundle15 = (Bundle) cme.a(parcel, creator2);
                if (parcel.readInt() != 0) {
                    dk5Var = a57;
                    bundle = bundle14;
                    z = true;
                } else {
                    dk5Var = a57;
                    bundle = bundle14;
                    z = false;
                }
                P(dk5Var, readInt75, bundle, bundle15, z);
                return true;
            case 3061:
                dk5 a58 = ap6.a(parcel.readStrongBinder());
                int readInt76 = parcel.readInt();
                Surface surface2 = (Surface) cme.a(parcel, Surface.CREATOR);
                int readInt77 = parcel.readInt();
                int readInt78 = parcel.readInt();
                if (a58 != null) {
                    b(a58, readInt76, 27, X(new d01(this, surface2, readInt77, readInt78)));
                    return true;
                }
                return true;
            case 3062:
                dk5 a59 = ap6.a(parcel.readStrongBinder());
                int readInt79 = parcel.readInt();
                int readInt80 = parcel.readInt();
                int readInt81 = parcel.readInt();
                if (a59 != null) {
                    b(a59, readInt79, 27, X(new sy6(this, readInt80, readInt81)));
                    return true;
                }
                return true;
            default:
                dt6 dt6Var = null;
                switch (i) {
                    case 4001:
                        dk5 a60 = ap6.a(parcel.readStrongBinder());
                        int readInt82 = parcel.readInt();
                        Bundle bundle16 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                        if (a60 != null) {
                            if (bundle16 != null) {
                                try {
                                    dt6Var = dt6.a(bundle16);
                                } catch (RuntimeException e8) {
                                    ncd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e8);
                                }
                            }
                            d(a60, readInt82, null, 50000, new dz6(new yy6(dt6Var, (byte) 11), r9 ? (byte) 1 : (byte) 0));
                        }
                        return true;
                    case 4002:
                        dk5 a61 = ap6.a(parcel.readStrongBinder());
                        int readInt83 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (a61 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                ncd.f("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            d(a61, readInt83, null, 50004, new dz6(new yy6(readString2, b4), r9 ? (byte) 1 : (byte) 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        dk5 a62 = ap6.a(parcel.readStrongBinder());
                        int readInt84 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt85 = parcel.readInt();
                        int readInt86 = parcel.readInt();
                        Bundle bundle17 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                        if (a62 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                ncd.f("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt85 < 0) {
                                ncd.f("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt86 < 1) {
                                ncd.f("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle17 != null) {
                                    try {
                                        dt6Var = dt6.a(bundle17);
                                    } catch (RuntimeException e9) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e9);
                                    }
                                }
                                d(a62, readInt84, null, 50003, new dz6(new u36(readString3, readInt85, readInt86, dt6Var), r9 ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4004:
                        dk5 a63 = ap6.a(parcel.readStrongBinder());
                        int readInt87 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle18 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                        if (a63 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                ncd.f("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        dt6Var = dt6.a(bundle18);
                                    } catch (RuntimeException e10) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                                    }
                                }
                                d(a63, readInt87, null, 50005, new dz6(new yy6((byte) 16, (Object) dt6Var, readString4), r9 ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4005:
                        dk5 a64 = ap6.a(parcel.readStrongBinder());
                        int readInt88 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt89 = parcel.readInt();
                        int readInt90 = parcel.readInt();
                        Bundle bundle19 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                        if (a64 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                ncd.f("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt89 < 0) {
                                ncd.f("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt90 < 1) {
                                ncd.f("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle19 != null) {
                                    try {
                                        dt6Var = dt6.a(bundle19);
                                    } catch (RuntimeException e11) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                                    }
                                }
                                d(a64, readInt88, null, 50006, new dz6(new yy6(readString5, readInt89, readInt90, dt6Var), r9 ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4006:
                        dk5 a65 = ap6.a(parcel.readStrongBinder());
                        int readInt91 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle20 = (Bundle) cme.a(parcel, Bundle.CREATOR);
                        if (a65 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                ncd.f("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle20 != null) {
                                    try {
                                        dt6Var = dt6.a(bundle20);
                                    } catch (RuntimeException e12) {
                                        ncd.g("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e12);
                                    }
                                }
                                d(a65, readInt91, null, 50001, new dz6(new yy6(b2, dt6Var, readString6), r9 ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4007:
                        dk5 a66 = ap6.a(parcel.readStrongBinder());
                        int readInt92 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (a66 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                ncd.f("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            d(a66, readInt92, null, 50002, new dz6(new u36(readString7, (byte) 27), r9 ? (byte) 1 : (byte) 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
