// default package

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Location;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class sae implements s99, y2c, mi0, l12, bl0, qhc, dc4, d23, j30, pj2 {
    public static sae E;
    public static final sae a = new sae();
    public static final sae b = new sae();
    public static final sae c = new sae();
    public static final /* synthetic */ sae d = new sae();
    public static final sae e = new sae();
    public static final sae f = new sae();
    public static final sae h = new sae();
    public static final sae n = new sae();
    public static final sae r = new sae();
    public static final sae s = new sae();
    public static final sae w = new sae();
    public static final sae x = new sae();
    public static final /* synthetic */ sae y = new sae();

    @Override // bl0
    public final float B0() {
        return -1.0f;
    }

    @Override // bl0
    public final float D0() {
        return -1.0f;
    }

    @Override // l12
    public final boolean E0() {
        return false;
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // bl0
    public final int Q1() {
        return 0;
    }

    @Override // bl0
    public final int X() {
        return 0;
    }

    @Override // s99
    public final void accept(Object obj, Object obj2) {
        hsd hsdVar = (hsd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        oz5 oz5Var = new oz5(Long.MAX_VALUE, 0, false, null, null);
        ore oreVar = hsdVar.B;
        a94 a94Var = null;
        a94[] a94VarArr = oreVar == null ? null : oreVar.b;
        if (a94VarArr != null) {
            int length = a94VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                a94 a94Var2 = a94VarArr[i];
                if ("get_last_location_with_request".equals(a94Var2.a)) {
                    a94Var = a94Var2;
                    break;
                }
                i++;
            }
            if (a94Var != null && a94Var.b() >= 1) {
                q7f q7fVar = (q7f) hsdVar.k();
                yod yodVar = new yod(taskCompletionSource, (byte) 0);
                Parcel R = q7fVar.R();
                int i2 = ild.a;
                R.writeInt(1);
                oz5Var.writeToParcel(R, 0);
                ild.c(R, yodVar);
                q7fVar.V(R, 82);
                return;
            }
        }
        q7f q7fVar2 = (q7f) hsdVar.k();
        Parcel R2 = q7fVar2.R();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                q7fVar2.b.transact(7, R2, obtain, 0);
                obtain.readException();
                R2.recycle();
                Location location = (Location) ild.a(obtain, Location.CREATOR);
                obtain.recycle();
                taskCompletionSource.setResult(location);
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } catch (Throwable th) {
            R2.recycle();
            throw th;
        }
    }

    @Override // y2c
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // dc4
    public final String b() {
        return null;
    }

    public final boolean d(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    @Override // pj2
    public final long e() {
        return System.currentTimeMillis();
    }

    public final void f(String str) {
        if (d(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // qhc
    public final nhc g(Class cls, e23 e23Var) {
        e23Var.getClass();
        return new nq4(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:10:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(FileOutputStream fileOutputStream, zw2 zw2Var) {
        vi7 vi7Var;
        int i;
        FileOutputStream fileOutputStream2;
        long j;
        vi7 vi7Var2;
        if (zw2Var instanceof vi7) {
            vi7Var = (vi7) zw2Var;
            int i2 = vi7Var.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                vi7Var.e = i2 - TLObject.FLAG_31;
                Object obj = vi7Var.c;
                i = vi7Var.e;
                if (i == 0) {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = vi7Var.b;
                    FileOutputStream fileOutputStream3 = vi7Var.a;
                    ixe.b(obj);
                    fileOutputStream2 = fileOutputStream3;
                    vi7Var2 = vi7Var;
                    j <<= 1;
                    if (j <= 60000) {
                        FileLock lock = fileOutputStream2.getChannel().lock(0L, Long.MAX_VALUE, false);
                        lock.getClass();
                        return lock;
                    }
                    try {
                    } catch (IOException e2) {
                        String message = e2.getMessage();
                        if (message == null || ddb.f(0, 2, message, "Resource deadlock would occur") < 0) {
                            throw e2;
                        }
                        vi7Var2.a = fileOutputStream2;
                        vi7Var2.b = j;
                        vi7Var2.e = 1;
                        Object a2 = aie.a(j, vi7Var2);
                        vx2 vx2Var = vx2.a;
                        if (a2 == vx2Var) {
                            return vx2Var;
                        }
                    }
                    FileLock lock2 = fileOutputStream2.getChannel().lock(0L, Long.MAX_VALUE, false);
                    lock2.getClass();
                    return lock2;
                }
                ixe.b(obj);
                fileOutputStream2 = fileOutputStream;
                j = 10;
                vi7Var2 = vi7Var;
                if (j <= 60000) {
                }
            }
        }
        vi7Var = new vi7(this, zw2Var);
        Object obj2 = vi7Var.c;
        i = vi7Var.e;
        if (i == 0) {
        }
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // qhc
    public final /* synthetic */ nhc j(ki2 ki2Var, e23 e23Var) {
        return xnb.a(this, ki2Var, e23Var);
    }

    public final void k(String str) {
        if (d(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public final void l(String str, Exception exc) {
        if (d(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // bl0
    public final int m0() {
        return 0;
    }

    @Override // bl0
    public final float m1() {
        return 0.0f;
    }

    @Override // l12
    public final boolean o() {
        return false;
    }

    @Override // bl0
    public final int o1() {
        return 0;
    }

    @Override // j30
    public final void p0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i3 = 0; i3 < min; i3++) {
            short s2 = shortBuffer.get();
            shortBuffer2.put(s2);
            shortBuffer2.put(s2);
        }
    }

    @Override // j30
    public final int s1(int i, int i2, int i3) {
        return i << 1;
    }

    @Override // bl0
    public final int x0() {
        return 0;
    }

    @Override // bl0
    public final int x1() {
        return 0;
    }

    @Override // l12
    public final void R() {
    }

    @Override // l12
    public final void V() {
    }

    @Override // dc4
    public final void a() {
    }

    @Override // mi0
    public final long c(long j) {
        return j;
    }

    @Override // l12
    public final void e0(Object obj) {
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
