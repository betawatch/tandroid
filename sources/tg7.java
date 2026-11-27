// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class tg7 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tg7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        xcd xcdVar;
        int i;
        switch (this.a) {
            case 0:
                ox oxVar = (ox) this.b;
                oxVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    oxVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        oxVar.c.set(true);
                        throw th;
                    } finally {
                        oxVar.b(null);
                    }
                }
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ks) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    ns nsVar = (ns) it;
                    if (!nsVar.hasNext()) {
                        return arrayList;
                    }
                    hka hkaVar = ((nka) nsVar.next()).c;
                    hka hkaVar2 = new hka();
                    hkaVar2.a = hkaVar.a;
                    hkaVar2.b = hkaVar.b;
                    Intent[] intentArr = hkaVar.c;
                    hkaVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                    hkaVar2.d = hkaVar.d;
                    hkaVar2.e = hkaVar.e;
                    hkaVar2.f = hkaVar.f;
                    hkaVar2.g = hkaVar.g;
                    hkaVar2.h = hkaVar.h;
                    hkaVar2.k = hkaVar.k;
                    hkaVar2.l = hkaVar.l;
                    hkaVar2.m = hkaVar.m;
                    b78[] b78VarArr = hkaVar.i;
                    if (b78VarArr != null) {
                        hkaVar2.i = (b78[]) Arrays.copyOf(b78VarArr, b78VarArr.length);
                    }
                    if (hkaVar.j != null) {
                        hkaVar2.j = new HashSet(hkaVar.j);
                    }
                    PersistableBundle persistableBundle = hkaVar.n;
                    if (persistableBundle != null) {
                        hkaVar2.n = persistableBundle;
                    }
                    if (TextUtils.isEmpty(hkaVar2.e)) {
                        lq5.j("Shortcut must have a non-empty label");
                        return null;
                    }
                    Intent[] intentArr2 = hkaVar2.c;
                    if (intentArr2 != null && intentArr2.length != 0) {
                        arrayList.add(hkaVar2);
                    }
                }
                lq5.j("Shortcut must have an intent");
                return null;
            case 2:
                return BitmapFactory.decodeFile(((nka) this.b).b);
            case 3:
                nhd nhdVar = (nhd) this.b;
                vh0 vh0Var = nhdVar.d;
                synchronized (vh0Var.a) {
                    if (vh0Var.b != 3) {
                        boolean z = vh0Var.b == 1;
                        synchronized (vh0Var.a) {
                            xcdVar = vh0Var.i;
                        }
                        vh0 vh0Var2 = nhdVar.d;
                        if (xcdVar == null) {
                            vh0Var2.k(0);
                            gi0 gi0Var = hod.h;
                            vh0Var2.j(jn7.r1, gi0Var);
                            nhdVar.c(gi0Var);
                        } else {
                            String packageName = vh0Var2.g.getPackageName();
                            int i2 = 25;
                            int i3 = 3;
                            int i4 = 25;
                            while (true) {
                                if (i4 >= 3) {
                                    try {
                                        mcd mcdVar = (mcd) xcdVar;
                                        Parcel X = mcdVar.X();
                                        X.writeInt(i4);
                                        X.writeString(packageName);
                                        X.writeString("subs");
                                        Parcel Y = mcdVar.Y(X, 1);
                                        int readInt = Y.readInt();
                                        Y.recycle();
                                        if (readInt == 0) {
                                            old.g("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                            i3 = readInt;
                                        } else {
                                            i4--;
                                            i3 = readInt;
                                        }
                                    } catch (Exception e) {
                                        old.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                        boolean z2 = e instanceof DeadObjectException;
                                        int i5 = z2 ? 91 : e instanceof RemoteException ? 90 : e instanceof SecurityException ? 92 : 42;
                                        String a = ik8.c(i5, 42) ? pnd.a(e) : null;
                                        nhdVar.d.k(0);
                                        nhdVar.b(z2 ? hod.h : hod.f, i5, a, z);
                                        nhdVar.c(z2 ? hod.h : hod.f);
                                    }
                                } else {
                                    i4 = 0;
                                }
                            }
                            vh0Var2.k = i4 >= 3;
                            if (i4 < 3) {
                                old.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                i = 9;
                            } else {
                                i = 1;
                            }
                            while (true) {
                                if (i2 >= 3) {
                                    mcd mcdVar2 = (mcd) xcdVar;
                                    Parcel X2 = mcdVar2.X();
                                    X2.writeInt(i2);
                                    X2.writeString(packageName);
                                    X2.writeString("inapp");
                                    Parcel Y2 = mcdVar2.Y(X2, 1);
                                    int readInt2 = Y2.readInt();
                                    Y2.recycle();
                                    if (readInt2 == 0) {
                                        vh0Var2.l = i2;
                                        old.g("BillingClient", "mHighestLevelSupportedForInApp: " + i2);
                                        i3 = readInt2;
                                    } else {
                                        i2--;
                                        i3 = readInt2;
                                    }
                                }
                            }
                            int i6 = vh0Var2.l;
                            vh0Var2.l = i6;
                            vh0Var2.w = i6 >= 26;
                            vh0Var2.v = i6 >= 24;
                            vh0Var2.u = i6 >= 21;
                            vh0Var2.t = i6 >= 20;
                            vh0Var2.s = i6 >= 19;
                            vh0Var2.r = i6 >= 17;
                            vh0Var2.q = i6 >= 16;
                            vh0Var2.p = i6 >= 15;
                            vh0Var2.o = i6 >= 14;
                            vh0Var2.n = i6 >= 9;
                            vh0Var2.m = i6 >= 6;
                            if (i6 < 3) {
                                old.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i = 36;
                            }
                            vh0.p(vh0Var2, i3);
                            if (i3 != 0) {
                                gi0 gi0Var2 = hod.a;
                                nhdVar.b(gi0Var2, i, null, z);
                                nhdVar.c(gi0Var2);
                            } else {
                                try {
                                    Long a2 = nhdVar.a(z);
                                    if (z) {
                                        eme s = wme.s();
                                        s.b();
                                        wme.r((wme) s.b, 6);
                                        mve r = uve.r();
                                        r.c(false);
                                        r.d();
                                        if (a2 != null) {
                                            long longValue = a2.longValue();
                                            r.b();
                                            uve.p((uve) r.b, longValue);
                                        }
                                        vh0 vh0Var3 = nhdVar.d;
                                        s.b();
                                        wme.q((wme) s.b, (uve) r.a());
                                        vh0Var3.i((wme) s.a());
                                    } else {
                                        fue p = que.p();
                                        dne s2 = wne.s();
                                        s2.b();
                                        wne.r((wne) s2.b, 0);
                                        p.b();
                                        que.n((que) p.b, (wne) s2.a());
                                        if (a2 != null) {
                                            long longValue2 = a2.longValue();
                                            p.b();
                                            que.o((que) p.b, longValue2);
                                        }
                                        nhdVar.d.h.o((que) p.a());
                                    }
                                } catch (Throwable th2) {
                                    old.i("BillingClient", "Unable to log.", th2);
                                }
                                nhdVar.c(hod.g);
                            }
                        }
                    }
                }
                return null;
            case 4:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 5:
                return v26.c.a(((j2f) this.b).g);
            case 6:
                return v26.c.a(((w5f) this.b).g);
            case 7:
                return v26.c.a(((q8f) this.b).g);
            case 8:
                return v26.c.a(((xhf) this.b).a);
            default:
                return v26.c.a(((ijf) this.b).g);
        }
    }
}
