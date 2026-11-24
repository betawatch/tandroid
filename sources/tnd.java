// default package

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tnd implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public /* synthetic */ tnd(Object obj, Parcelable parcelable, Object obj2, byte b) {
        this.a = b;
        this.b = parcelable;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable d;
        Exception exc;
        FileOutputStream w0;
        int i;
        ti5 ti5Var;
        ti5 lgfVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        FileOutputStream fileOutputStream = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ow7 ow7Var = (ow7) this.c;
                bpd bpdVar = (bpd) this.b;
                if ((bpdVar instanceof cmd) && (d = ((cmd) bpdVar).d()) != null) {
                    ow7Var.b(d);
                    return;
                }
                try {
                    if (!bpdVar.isDone()) {
                        throw new IllegalStateException(v1f.a("Future was expected to be done: %s", bpdVar));
                    }
                    boolean z8 = false;
                    while (true) {
                        try {
                            Object obj = bpdVar.get();
                            if (z8) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int intValue = num.intValue();
                            nkd nkdVar = (nkd) ow7Var.d;
                            if (intValue <= 0) {
                                ((Runnable) ow7Var.c).run();
                                return;
                            }
                            byte b = ow7Var.a;
                            fj0 a = sld.a(num.intValue(), "Billing override value was set by a license tester.");
                            nkdVar.E(93, b, a);
                            ((gu2) ow7Var.b).accept(a);
                            return;
                        } catch (InterruptedException unused) {
                            z8 = true;
                        } catch (Throwable th) {
                            if (z8) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    ow7Var.b(e.getCause());
                    return;
                } catch (Throwable th2) {
                    ow7Var.b(th2);
                    return;
                }
                break;
            case 1:
                ((o9) this.b).a = this.c;
                return;
            case 2:
                Object obj2 = this.c;
                Object obj3 = this.b;
                try {
                    Method method = p9.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        p9.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 3:
                ((ir) ((x59) this.b).b).h((Typeface) this.c);
                return;
            case 4:
                wb2 wb2Var = (wb2) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    wb2Var.B((qc3) obj4);
                }
                arrayList.clear();
                wb2Var.v.remove(arrayList);
                return;
            case 5:
                ((vb1) this.b).C((ie5) this.c);
                return;
            case 6:
                j46 j46Var = (j46) this.c;
                fy2 fy2Var = j46Var.d;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th4) {
                        dbe.a(k34.a, th4);
                    }
                    Runnable f = j46Var.f();
                    if (f == null) {
                        return;
                    }
                    this.b = f;
                    i2++;
                    if (i2 >= 16 && fy2Var.d(j46Var)) {
                        fy2Var.c(j46Var, this);
                        return;
                    }
                }
                break;
            case 7:
                oy oyVar = (oy) this.c;
                Object obj5 = this.b;
                boolean z9 = oyVar.c.get();
                x5d x5dVar = oyVar.e;
                if (z9) {
                    if (x5dVar.h == oyVar) {
                        SystemClock.uptimeMillis();
                        x5dVar.h = null;
                        x5dVar.a();
                    }
                } else if (x5dVar.g != oyVar) {
                    if (x5dVar.h == oyVar) {
                        SystemClock.uptimeMillis();
                        x5dVar.h = null;
                        x5dVar.a();
                    }
                } else if (!x5dVar.c) {
                    SystemClock.uptimeMillis();
                    x5dVar.g = null;
                    na6 na6Var = x5dVar.a;
                    if (na6Var != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            na6Var.i(obj5);
                        } else {
                            na6Var.g(obj5);
                        }
                    }
                }
                oyVar.b = 3;
                return;
            case 8:
                ((vb1) this.c).C((e64) this.b);
                return;
            case 9:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f;
                mx6 mx6Var = new mx6(file);
                File file2 = (File) mx6Var.c;
                try {
                    w0 = mx6Var.w0();
                } catch (Exception e3) {
                    exc = e3;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(w0);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj6 = arrayList2.get(i3);
                        i3++;
                        hwe.e(newSerializer, (wia) obj6);
                        i2 = i2;
                    }
                    int i4 = i2;
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    w0.flush();
                    try {
                        w0.getFD().sync();
                        i = 1;
                    } catch (IOException unused2) {
                        i = i4;
                    }
                    if (i == 0) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        w0.close();
                    } catch (IOException e4) {
                        Log.e("AtomicFile", "Failed to close file output stream", e4);
                    }
                    mx6.k0(file2, file);
                    return;
                } catch (Exception e5) {
                    exc = e5;
                    fileOutputStream = w0;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused3) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            Log.e("AtomicFile", "Failed to close file output stream", e6);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    dq9.n("Failed to write to file ", file, exc);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                qt qtVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    qtVar.putAll(hwe.b(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(qtVar.values()));
                    return;
                } catch (Exception e7) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e7);
                    return;
                }
            case 11:
                Bitmap bitmap = (Bitmap) this.b;
                String str = (String) this.c;
                if (TextUtils.isEmpty(str)) {
                    u36.j("path is empty");
                    return;
                }
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str));
                    try {
                        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2)) {
                            fileOutputStream2.close();
                            return;
                        }
                        Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                        throw new RuntimeException("Unable to compress bitmap for saving " + str);
                    } finally {
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e8) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e8);
                    rjb.k(b10.h("Unable to write bitmap to file ", str), e8);
                    return;
                }
            case 12:
                ot2 ot2Var = (ot2) this.b;
                y3d y3dVar = (y3d) this.c;
                i05 i05Var = y3dVar.f;
                zz4 zz4Var = y3dVar.a;
                w3d w3dVar = (w3d) i05Var.s.get(y3dVar.b);
                if (w3dVar != null) {
                    if (!ot2Var.c()) {
                        w3dVar.l(ot2Var, null);
                        return;
                    }
                    y3dVar.e = true;
                    if (zz4Var.w()) {
                        if (!y3dVar.e || (ti5Var = y3dVar.c) == null) {
                            return;
                        }
                        zz4Var.j(ti5Var, y3dVar.d);
                        return;
                    }
                    try {
                        zz4Var.j(null, zz4Var.w() ? zz4Var.E : Collections.EMPTY_SET);
                        return;
                    } catch (SecurityException e9) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e9);
                        zz4Var.d("Failed to get service from broker.");
                        w3dVar.l(new ot2(10, null, null), null);
                        return;
                    }
                }
                return;
            case 13:
                k4d k4dVar = (k4d) this.c;
                e5d e5dVar = (e5d) this.b;
                ot2 ot2Var2 = e5dVar.b;
                if (ot2Var2.c()) {
                    n5d n5dVar = e5dVar.c;
                    ite.h(n5dVar);
                    ot2 ot2Var3 = n5dVar.c;
                    if (!ot2Var3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ot2Var3)), new Exception());
                        k4dVar.k.b(ot2Var3);
                        k4dVar.j.c();
                        return;
                    }
                    y3d y3dVar2 = k4dVar.k;
                    IBinder iBinder = n5dVar.b;
                    if (iBinder == null) {
                        lgfVar = null;
                    } else {
                        int i5 = e5.b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        lgfVar = queryLocalInterface instanceof ti5 ? (ti5) queryLocalInterface : new lgf(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                    }
                    Set set = k4dVar.f;
                    y3dVar2.getClass();
                    if (lgfVar == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        y3dVar2.b(new ot2(4, null, null));
                    } else {
                        y3dVar2.c = lgfVar;
                        y3dVar2.d = set;
                        if (y3dVar2.e) {
                            y3dVar2.a.j(lgfVar, set);
                        }
                    }
                } else {
                    k4dVar.k.b(ot2Var2);
                }
                k4dVar.j.c();
                return;
            case 14:
                Future future = (Future) this.b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.c;
                future.cancel(true);
                yid.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ui0 ui0Var = (ui0) this.b;
                xg0 xg0Var = (xg0) this.c;
                fj0 fj0Var = sld.i;
                ui0Var.x(24, 7, fj0Var);
                tgd tgdVar = fhd.b;
                ((bj0) xg0Var.b).b(fj0Var, ojd.e);
                return;
            case 16:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        lpd lpdVar = (lpd) referenceQueue.remove();
                        if (lpdVar.a.remove(lpdVar)) {
                            lpdVar.clear();
                            lpdVar.b.getClass();
                        }
                    } catch (InterruptedException unused4) {
                    }
                }
                return;
            case 17:
                bhd bhdVar = ((ugd) this.b).c;
                o7d o7dVar = (o7d) this.c;
                ce6 ce6Var = bhd.H;
                ws wsVar = o7dVar.d;
                dcd dcdVar = o7dVar.f;
                ws wsVar2 = bhdVar.u;
                vjf vjfVar = bhdVar.E;
                if (!qe1.d(wsVar, wsVar2)) {
                    bhdVar.u = wsVar;
                    vjfVar.c();
                }
                double d2 = o7dVar.a;
                if (Double.isNaN(d2) || Math.abs(d2 - bhdVar.w) <= 1.0E-7d) {
                    z = false;
                } else {
                    bhdVar.w = d2;
                    z = true;
                }
                boolean z10 = o7dVar.b;
                if (z10 != bhdVar.x) {
                    bhdVar.x = z10;
                    z = true;
                }
                ce6 ce6Var2 = bhd.H;
                ce6Var2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(bhdVar.n));
                if (vjfVar != null && (z || bhdVar.n)) {
                    vjfVar.f();
                }
                Double.isNaN(o7dVar.h);
                int i6 = o7dVar.c;
                if (i6 != bhdVar.y) {
                    bhdVar.y = i6;
                    z2 = true;
                } else {
                    z2 = false;
                }
                ce6Var2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(bhdVar.n));
                if (vjfVar != null && (z2 || bhdVar.n)) {
                    vjfVar.a();
                }
                int i7 = o7dVar.e;
                if (i7 != bhdVar.z) {
                    bhdVar.z = i7;
                    z3 = true;
                } else {
                    z3 = false;
                }
                ce6Var2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(bhdVar.n));
                if (vjfVar != null && (z3 || bhdVar.n)) {
                    vjfVar.e();
                }
                if (!qe1.d(bhdVar.A, dcdVar)) {
                    bhdVar.A = dcdVar;
                }
                bhdVar.n = false;
                return;
            case 18:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (dg7 e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new dg7("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 19:
                lg7 lg7Var = (lg7) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = lg7Var.b.decrementAndGet();
                ite.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    lg7Var.c();
                    lg7Var.c.set(false);
                }
                gef.a.clear();
                cgf.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 20:
                k7e k7eVar = (k7e) this.b;
                vzd vzdVar = (vzd) this.c;
                k7eVar.getClass();
                try {
                    vzdVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(vzdVar.c);
                    int i8 = cjd.a;
                    obtain.writeInt(0);
                    obtain.writeByteArray(null);
                    try {
                        vzdVar.b.transact(1, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th5) {
                        obtain.recycle();
                        throw th5;
                    }
                } catch (RemoteException e12) {
                    Log.e("WearableLS", "Failed to send a response back", e12);
                    return;
                }
            case 21:
                zif zifVar = (zif) this.b;
                o7d o7dVar2 = (o7d) this.c;
                ce6 ce6Var3 = zif.X;
                ws wsVar3 = o7dVar2.d;
                dcd dcdVar2 = o7dVar2.f;
                ws wsVar4 = zifVar.F;
                vjf vjfVar2 = zifVar.H;
                if (!qe1.d(wsVar3, wsVar4)) {
                    zifVar.F = wsVar3;
                    vjfVar2.c();
                }
                double d3 = o7dVar2.a;
                if (Double.isNaN(d3) || Math.abs(d3 - zifVar.P) <= 1.0E-7d) {
                    z4 = false;
                } else {
                    zifVar.P = d3;
                    z4 = true;
                }
                boolean z11 = o7dVar2.b;
                if (z11 != zifVar.M) {
                    zifVar.M = z11;
                    z4 = true;
                }
                Double.isNaN(o7dVar2.h);
                ce6 ce6Var4 = zif.X;
                ce6Var4.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(zifVar.O));
                if (vjfVar2 != null && (z4 || zifVar.O)) {
                    vjfVar2.f();
                }
                int i9 = o7dVar2.c;
                if (i9 != zifVar.R) {
                    zifVar.R = i9;
                    z5 = true;
                } else {
                    z5 = false;
                }
                ce6Var4.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z5), Boolean.valueOf(zifVar.O));
                if (vjfVar2 != null && (z5 || zifVar.O)) {
                    vjfVar2.a();
                }
                int i10 = o7dVar2.e;
                if (i10 != zifVar.S) {
                    zifVar.S = i10;
                    z6 = true;
                } else {
                    z6 = false;
                }
                ce6Var4.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z6), Boolean.valueOf(zifVar.O));
                if (vjfVar2 != null && (z6 || zifVar.O)) {
                    vjfVar2.e();
                }
                if (!qe1.d(zifVar.Q, dcdVar2)) {
                    zifVar.Q = dcdVar2;
                }
                zifVar.O = false;
                return;
            default:
                zif zifVar2 = (zif) this.b;
                c7d c7dVar = (c7d) this.c;
                ce6 ce6Var5 = zif.X;
                String str2 = c7dVar.a;
                if (qe1.d(str2, zifVar2.L)) {
                    z7 = false;
                } else {
                    zifVar2.L = str2;
                    z7 = true;
                }
                zif.X.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z7), Boolean.valueOf(zifVar2.N));
                vjf vjfVar3 = zifVar2.H;
                if (vjfVar3 != null && (z7 || zifVar2.N)) {
                    vjfVar3.d();
                }
                zifVar2.N = false;
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                wm9 wm9Var = new wm9(tnd.class.getSimpleName(), (byte) 22);
                ow7 ow7Var = (ow7) this.c;
                xab xabVar = new xab((byte) 14, false);
                ((xab) wm9Var.d).c = xabVar;
                wm9Var.d = xabVar;
                xabVar.b = ow7Var;
                return wm9Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ tnd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ tnd(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
