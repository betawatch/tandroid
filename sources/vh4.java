// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vh4 implements f73, j98, g84 {
    public static final uh4 e = new uh4();
    public static vh4 f;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public vh4(View view) {
        sk[] skVarArr = {new sk(), new sk(), new sk()};
        this.b = skVarArr;
        this.c = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.d = animatorSet;
        animatorSet.playTogether(m(skVarArr[0], 0, jn7.d4, 0, jn7.W4), m(skVarArr[1], 0, jn7.d4, jn7.f2, jn7.W4), m(skVarArr[2], 0, jn7.d4, jn7.W4, jn7.W4), m(skVarArr[0], jn7.d4, 0, 1000, 400), m(skVarArr[1], jn7.d4, 0, 1000, 400), m(skVarArr[2], jn7.d4, 0, 1000, 400));
        animatorSet.addListener(new j8(this, view));
    }

    public static double K(th4 th4Var, th4 th4Var2) {
        double d = th4Var.a - th4Var2.a;
        double d2 = th4Var.b - th4Var2.b;
        return (d2 * d2) + (d * d);
    }

    public static void a(fg7[][][] fg7VarArr, int i, fg7 fg7Var) {
        fg7[] fg7VarArr2 = fg7VarArr[i + fg7Var.d][fg7Var.c];
        pg7 pg7Var = fg7Var.a;
        int ordinal = pg7Var.ordinal();
        char c = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c = 1;
            } else if (ordinal == 4) {
                c = 3;
            } else {
                if (ordinal != 6) {
                    xi4.k(pg7Var, "Illegal mode ");
                    return;
                }
                c = 0;
            }
        }
        fg7 fg7Var2 = fg7VarArr2[c];
        if (fg7Var2 == null || fg7Var2.f > fg7Var.f) {
            fg7VarArr2[c] = fg7Var;
        }
    }

    public static boolean g(pg7 pg7Var, char c) {
        int ordinal = pg7Var.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c < '`' ? k34.a[c] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal == 6) {
                    return k34.c(String.valueOf(c));
                }
                return false;
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static boolean i(yb0 yb0Var) {
        return (yb0Var.a == null && yb0Var.b == null) ? false : true;
    }

    public static float j(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean q(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < 5) {
                int i3 = iArr[i];
                if (i3 == 0) {
                    break;
                }
                i2 += i3;
                i++;
            } else if (i2 >= 7) {
                float f2 = i2 / 7.0f;
                float f3 = f2 / 2.0f;
                if (Math.abs(f2 - iArr[0]) >= f3 || Math.abs(f2 - iArr[1]) >= f3 || Math.abs((f2 * 3.0f) - iArr[2]) >= 3.0f * f3 || Math.abs(f2 - iArr[3]) >= f3 || Math.abs(f2 - iArr[4]) >= f3) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static vh4 r() {
        vh4 vh4Var = f;
        if (vh4Var != null) {
            return vh4Var;
        }
        vh4 vh4Var2 = new vh4();
        f = vh4Var2;
        return vh4Var2;
    }

    public static xdc t(int i) {
        int F = ik8.F(i);
        return F != 0 ? F != 1 ? xdc.c(40) : xdc.c(26) : xdc.c(9);
    }

    public final mo4 A() {
        mo4 mo4Var = (mo4) this.d;
        if (mo4Var != null) {
            return mo4Var;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = k(i3, 8, i2);
        }
        int k = k(8, 7, k(8, 8, k(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            k = k(8, i4, k);
        }
        int i5 = ((rj0) this.b).b;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = k(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = k(i8, 8, i);
        }
        mo4 a = mo4.a(k, i);
        if (a == null) {
            a = mo4.a(k ^ 21522, i ^ 21522);
        }
        this.d = a;
        if (a != null) {
            return a;
        }
        throw lo4.a();
    }

    public final xdc B() {
        xdc xdcVar = (xdc) this.c;
        if (xdcVar != null) {
            return xdcVar;
        }
        int i = ((rj0) this.b).b;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return xdc.c(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = k(i7, i6, i5);
            }
        }
        xdc b = xdc.b(i5);
        if (b != null && (b.a << 2) + 17 == i) {
            this.c = b;
            return b;
        }
        for (int i8 = 5; i8 >= 0; i8--) {
            for (int i9 = i - 9; i9 >= i3; i9--) {
                i4 = k(i8, i9, i4);
            }
        }
        xdc b2 = xdc.b(i4);
        if (b2 == null || (b2.a << 2) + 17 != i) {
            throw lo4.a();
        }
        this.c = b2;
        return b2;
    }

    @Override // j98
    public final void C(int i, boolean z, boolean z2) {
        ArrayList arrayList = (ArrayList) this.c;
        zn5 zn5Var = (zn5) this.d;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.isEmpty() || zn5Var.b == null || this.a || z) {
            return;
        }
        this.a = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = hashMap.get(arrayList.get(i2));
            q7a q7aVar = new q7a();
            arrayList2.add(q7aVar);
            if (obj instanceof ro6) {
                ro6 ro6Var = (ro6) obj;
                String str = ro6Var.h;
                if (str != null) {
                    q7aVar.c = str;
                } else {
                    q7aVar.l = ro6Var;
                }
                q7aVar.k = ro6Var.s;
                q7aVar.e = ro6Var.c;
                CharSequence charSequence = ro6Var.I;
                q7aVar.d = charSequence != null ? charSequence.toString() : null;
                q7aVar.i = ro6Var.n;
                q7aVar.j = ro6Var.r;
                q7aVar.h = ro6Var.x;
            }
        }
        zn5Var.e(arrayList2, false);
    }

    @Override // g84
    public final void D() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((g84) this.b).D();
        if (this.a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((seb) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public final void E() {
        if (((mo4) this.d) != null) {
            int i = ik8.G(8)[((mo4) this.d).b];
            rj0 rj0Var = (rj0) this.b;
            int i2 = rj0Var.b;
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (bs2.a(i, i3, i4)) {
                        rj0Var.a(i4, i3);
                    }
                }
            }
        }
    }

    public final void F(View view) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.d).cancel();
        }
    }

    public final void G() {
        if (this.a) {
            ((xgb) this.d).e(new c1(this, (byte) 29));
            this.a = false;
        }
    }

    public final boolean H(String str, String str2) {
        synchronized (this) {
            if (!((vx5) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                return false;
            }
            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
            atomicMarkableReference.set((vx5) atomicMarkableReference.getReference(), true);
            azb azbVar = new azb(this, (byte) 11);
            AtomicReference atomicReference = (AtomicReference) this.c;
            while (!atomicReference.compareAndSet(null, azbVar)) {
                if (atomicReference.get() != null) {
                    return true;
                }
            }
            ((i03) ((rx6) ((gd4) this.d).c).c).a(azbVar);
            return true;
        }
    }

    public final void I(boolean z) {
        if (((boolean[]) this.c)[0]) {
            return;
        }
        knc kncVar = (knc) ((rx) this.d).d;
        kncVar.G3 = z;
        kncVar.invalidate();
    }

    public final void J(ViewGroup viewGroup, vnb vnbVar, yb0 yb0Var, wb0 wb0Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                tb0 tb0Var = (tb0) this.d;
                int i = dc0.G;
                tb0Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) context.getSystemService(WindowManager.class);
            tb0 tb0Var2 = new tb0(this, context, vnbVar, wb0Var);
            this.d = tb0Var2;
            m0 m0Var = new m0(this, (byte) 26);
            WeakHashMap weakHashMap = ihc.a;
            ahc.i(tb0Var2, m0Var);
        }
        ((tb0) this.d).a(yb0Var);
        if (this.a) {
            return;
        }
        if (((tb0) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((tb0) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        hl.m(layoutParams);
        hl.s3((WindowManager) this.c, (tb0) this.d, layoutParams);
        ((WindowManager) this.c).addView((tb0) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public final void L(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            if (this.a) {
                ((ArrayDeque) this.c).add(new wkf(runnable, executor));
            } else {
                this.a = true;
                O(runnable, executor);
            }
        }
    }

    public final void M(SpannableString spannableString, int i) {
        sk[] skVarArr = (sk[]) this.b;
        int i2 = i + 1;
        spannableString.setSpan(skVarArr[0], i, i2, 0);
        int i3 = i + 2;
        spannableString.setSpan(skVarArr[1], i2, i3, 0);
        spannableString.setSpan(skVarArr[2], i3, i + 3, 0);
    }

    public final void N() {
        synchronized (this.b) {
            if (((ArrayDeque) this.c).isEmpty()) {
                this.a = false;
                return;
            }
            wkf wkfVar = (wkf) ((ArrayDeque) this.c).remove();
            O(wkfVar.b, wkfVar.a);
        }
    }

    public final void O(Runnable runnable, Executor executor) {
        try {
            executor.execute(new xs4((Object) this, (Object) runnable, (byte) 24));
        } catch (RejectedExecutionException unused) {
            N();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(xdc xdcVar, fg7[][][] fg7VarArr, int i, fg7 fg7Var) {
        int i2;
        int i3;
        char charAt;
        pg7 pg7Var;
        char charAt2;
        pg7 pg7Var2;
        char charAt3;
        pg7 pg7Var3;
        int i4;
        String str = (String) this.b;
        xs3 xs3Var = (xs3) this.c;
        CharsetEncoder[] charsetEncoderArr = xs3Var.a;
        int length = charsetEncoderArr.length;
        int i5 = xs3Var.b;
        if (i5 >= 0) {
            if (charsetEncoderArr[i5].canEncode(String.valueOf(str.charAt(i)))) {
                length = i5 + 1;
                i2 = length;
                for (i3 = i5; i3 < i2; i3++) {
                    if (charsetEncoderArr[i3].canEncode(String.valueOf(str.charAt(i)))) {
                        a(fg7VarArr, i, new fg7(this, pg7.h, i, i3, 1, fg7Var, xdcVar));
                    }
                }
                charAt = str.charAt(i);
                pg7Var = pg7.r;
                if (g(pg7Var, charAt)) {
                    a(fg7VarArr, i, new fg7(this, pg7Var, i, 0, 1, fg7Var, xdcVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i);
                pg7Var2 = pg7.e;
                int i6 = 2;
                if (g(pg7Var2, charAt2)) {
                    int i7 = i + 1;
                    a(fg7VarArr, i, new fg7(this, pg7Var2, i, 0, (i7 >= length2 || !g(pg7Var2, str.charAt(i7))) ? 1 : 2, fg7Var, xdcVar));
                }
                charAt3 = str.charAt(i);
                pg7Var3 = pg7.d;
                if (g(pg7Var3, charAt3)) {
                    return;
                }
                int i8 = i + 1;
                if (i8 >= length2 || !g(pg7Var3, str.charAt(i8))) {
                    i4 = 1;
                } else {
                    int i9 = i + 2;
                    if (i9 < length2 && g(pg7Var3, str.charAt(i9))) {
                        i6 = 3;
                    }
                    i4 = i6;
                }
                a(fg7VarArr, i, new fg7(this, pg7Var3, i, 0, i4, fg7Var, xdcVar));
                return;
            }
        }
        i5 = 0;
        i2 = length;
        while (i3 < i2) {
        }
        charAt = str.charAt(i);
        pg7Var = pg7.r;
        if (g(pg7Var, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i);
        pg7Var2 = pg7.e;
        int i62 = 2;
        if (g(pg7Var2, charAt2)) {
        }
        charAt3 = str.charAt(i);
        pg7Var3 = pg7.d;
        if (g(pg7Var3, charAt3)) {
        }
    }

    public final void c(View view) {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.d).start();
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    @Override // f73
    public final h73 createDataSource() {
        pb3 pb3Var = new pb3((String) this.d, 8000, 8000, this.a, (um4) this.b);
        v2c v2cVar = (v2c) this.c;
        if (v2cVar != null) {
            pb3Var.addTransferListener(v2cVar);
        }
        return pb3Var;
    }

    public final void d(syc sycVar) {
        ArrayList arrayList = (ArrayList) s();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s35 s35Var = (s35) obj;
            try {
                try {
                    hl.c3(new gp6((Object) s35Var.c, this.b, s35Var.a, (Object) "websocket error: ".concat(t35.b(sycVar)), (byte) 25));
                } catch (Throwable unused) {
                    s35Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void e() {
        ArrayList arrayList = (ArrayList) s();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s35 s35Var = (s35) obj;
            try {
                try {
                    s35Var.getClass();
                } catch (Throwable unused) {
                    s35Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // g84
    public final x1c e0(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.d;
        g84 g84Var = (g84) this.b;
        if (i2 != 3 && i2 != 5) {
            this.a = true;
        }
        if (i2 != 3) {
            return g84Var.e0(i, i2);
        }
        seb sebVar = (seb) sparseArray.get(i);
        if (sebVar != null) {
            return sebVar;
        }
        seb sebVar2 = new seb(g84Var.e0(i, i2), (peb) this.c);
        sparseArray.put(i, sebVar2);
        return sebVar2;
    }

    @Override // j98
    public final boolean f() {
        return ((zn5) this.d).b.f();
    }

    public final int k(int i, int i2, int i3) {
        boolean z = this.a;
        rj0 rj0Var = (rj0) this.b;
        int i4 = i3 << 1;
        return z ? rj0Var.b(i2, i) : rj0Var.b(i, i2) ? i4 | 1 : i4;
    }

    public final ValueAnimator m(sk skVar, int i, int i2, int i3, int i4) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new lk(this, skVar, (byte) 14));
        ofInt.setDuration(i4);
        ofInt.setStartDelay(i3);
        ofInt.setInterpolator(k43.f);
        return ofInt;
    }

    @Override // g84
    public final void m0(zy9 zy9Var) {
        ((g84) this.b).m0(zy9Var);
    }

    public final pm3 n(xdc xdcVar) {
        int i;
        String str = (String) this.b;
        int length = str.length();
        CharsetEncoder[] charsetEncoderArr = ((xs3) this.c).a;
        fg7[][][] fg7VarArr = (fg7[][][]) Array.newInstance((Class<?>) fg7.class, length + 1, charsetEncoderArr.length, 4);
        b(xdcVar, fg7VarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    fg7 fg7Var = fg7VarArr[i2][i3][i4];
                    if (fg7Var != null && i2 < length) {
                        b(xdcVar, fg7VarArr, i2, fg7Var);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                fg7 fg7Var2 = fg7VarArr[length][i8][i9];
                if (fg7Var2 != null && (i = fg7Var2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new pm3(this, xdcVar, fg7VarArr[length][i5][i7]);
        }
        throw new w30(qd4.y("Internal error: failed to encode \"", str, "\""));
    }

    public final ps6 o(UUID uuid, b64 b64Var) {
        String str = b64Var.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            yve.l(uri, "The uri must be set.");
            throw new qs6(new n73(uri, 1, null, map, 0L, -1L, null, 0), uri, o99.h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = o51.f;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : o51.d.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            hashMap.putAll((HashMap) this.d);
        }
        return ije.a(((vh4) this.b).createDataSource(), str, b64Var.a, hashMap);
    }

    public final ps6 p(c64 c64Var) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), c64Var.a, "\"}".getBytes(charset)};
        long j = 0;
        for (int i = 0; i < 3; i++) {
            j += bArr[i].length;
        }
        int i2 = (int) j;
        yve.d(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i2));
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        h73 createDataSource = ((vh4) this.b).createDataSource();
        String str = c64Var.b;
        String o07Var = o07.i.toString();
        String valueOf = String.valueOf(i2);
        awd.a("Content-Length", valueOf);
        return ije.a(createDataSource, str, bArr2, o99.g(2, new Object[]{"Content-Type", o07Var, "Content-Length", valueOf}, null));
    }

    public final List s() {
        synchronized (((ArrayList) this.c)) {
            if (!this.a) {
                return (ArrayList) this.d;
            }
            ArrayList arrayList = new ArrayList(((ArrayList) this.c).size());
            ArrayList arrayList2 = (ArrayList) this.c;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList.add((s35) obj);
            }
            this.d = arrayList;
            this.a = false;
            return arrayList;
        }
    }

    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final boolean u(int i, int i2, int[] iArr) {
        float f2;
        char c;
        float f3;
        ?? r16;
        char c2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = (ArrayList) this.c;
        boolean z = false;
        char c3 = 2;
        char c4 = 3;
        int i6 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int j = (int) j(iArr, i2);
        int i7 = iArr[2];
        rj0 rj0Var = (rj0) this.b;
        int i8 = rj0Var.b;
        int i9 = rj0Var.a;
        int[] iArr2 = (int[]) this.d;
        Arrays.fill(iArr2, 0);
        int i10 = i;
        while (true) {
            f2 = Float.NaN;
            if (i10 < 0) {
                c = 2;
                break;
            }
            if (rj0Var.b(j, i10)) {
                iArr2[2] = iArr2[2] + 1;
                i10--;
            } else {
                while (i10 >= 0 && !rj0Var.b(j, i10)) {
                    c = c3;
                    int i11 = iArr2[1];
                    if (i11 > i7) {
                        break;
                    }
                    iArr2[1] = i11 + 1;
                    i10--;
                    c3 = c;
                }
                c = c3;
                if (i10 >= 0 && iArr2[1] <= i7) {
                    while (i10 >= 0 && rj0Var.b(j, i10)) {
                        int i12 = iArr2[0];
                        if (i12 > i7) {
                            break;
                        }
                        iArr2[0] = i12 + 1;
                        i10--;
                    }
                    if (iArr2[0] <= i7) {
                        int i13 = i + 1;
                        while (i13 < i8 && rj0Var.b(j, i13)) {
                            iArr2[c] = iArr2[c] + 1;
                            i13++;
                        }
                        if (i13 != i8) {
                            while (i13 < i8 && !rj0Var.b(j, i13)) {
                                int i14 = iArr2[3];
                                if (i14 >= i7) {
                                    break;
                                }
                                iArr2[3] = i14 + 1;
                                i13++;
                            }
                            if (i13 != i8 && iArr2[3] < i7) {
                                while (i13 < i8 && rj0Var.b(j, i13)) {
                                    int i15 = iArr2[4];
                                    if (i15 >= i7) {
                                        break;
                                    }
                                    iArr2[4] = i15 + 1;
                                    i13++;
                                }
                                int i16 = iArr2[4];
                                if (i16 < i7 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c]) + iArr2[3]) + i16) - i6) * 5 < (i6 << 1) && q(iArr2)) {
                                    f3 = j(iArr2, i13);
                                }
                            }
                        }
                    }
                }
            }
        }
        f3 = Float.NaN;
        if (!Float.isNaN(f3)) {
            int i17 = (int) f3;
            int i18 = iArr[c];
            Arrays.fill(iArr2, 0);
            int i19 = j;
            while (true) {
                if (i19 < 0) {
                    break;
                }
                if (rj0Var.b(i19, i17)) {
                    iArr2[c] = iArr2[c] + 1;
                    i19--;
                } else {
                    while (i19 >= 0 && !rj0Var.b(i19, i17)) {
                        int i20 = iArr2[1];
                        if (i20 > i18) {
                            break;
                        }
                        iArr2[1] = i20 + 1;
                        i19--;
                    }
                    if (i19 >= 0 && iArr2[1] <= i18) {
                        while (i19 >= 0 && rj0Var.b(i19, i17)) {
                            int i21 = iArr2[0];
                            if (i21 > i18) {
                                break;
                            }
                            iArr2[0] = i21 + 1;
                            i19--;
                        }
                        if (iArr2[0] <= i18) {
                            int i22 = j + 1;
                            while (i22 < i9 && rj0Var.b(i22, i17)) {
                                iArr2[c] = iArr2[c] + 1;
                                i22++;
                            }
                            if (i22 != i9) {
                                while (i22 < i9 && !rj0Var.b(i22, i17)) {
                                    int i23 = iArr2[3];
                                    if (i23 >= i18) {
                                        break;
                                    }
                                    iArr2[3] = i23 + 1;
                                    i22++;
                                }
                                if (i22 != i9 && iArr2[3] < i18) {
                                    while (i22 < i9 && rj0Var.b(i22, i17)) {
                                        int i24 = iArr2[4];
                                        if (i24 >= i18) {
                                            break;
                                        }
                                        iArr2[4] = i24 + 1;
                                        i22++;
                                    }
                                    int i25 = iArr2[4];
                                    if (i25 < i18 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c]) + iArr2[3]) + i25) - i6) * 5 < i6 && q(iArr2)) {
                                        f2 = j(iArr2, i22);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f4 = f2;
            if (!Float.isNaN(f4)) {
                int i26 = (int) f4;
                Arrays.fill(iArr2, 0);
                int i27 = 0;
                while (i17 >= i27 && i26 >= i27) {
                    r16 = z;
                    if (!rj0Var.b(i26 - i27, i17 - i27)) {
                        break;
                    }
                    iArr2[c] = iArr2[c] + 1;
                    i27++;
                    z = r16 == true ? 1 : 0;
                }
                r16 = z;
                if (iArr2[c] == 0) {
                    return r16;
                }
                while (i17 >= i27 && i26 >= i27 && !rj0Var.b(i26 - i27, i17 - i27)) {
                    iArr2[1] = iArr2[1] + 1;
                    i27++;
                }
                if (iArr2[1] == 0) {
                    return r16;
                }
                while (i17 >= i27 && i26 >= i27 && rj0Var.b(i26 - i27, i17 - i27)) {
                    iArr2[r16] = iArr2[r16] + 1;
                    i27++;
                }
                if (iArr2[r16] == 0) {
                    return r16;
                }
                int i28 = rj0Var.b;
                int i29 = 1;
                while (true) {
                    int i30 = i17 + i29;
                    c2 = c4;
                    if (i30 >= i28 || (i5 = i26 + i29) >= i9 || !rj0Var.b(i5, i30)) {
                        break;
                    }
                    iArr2[c] = iArr2[c] + 1;
                    i29++;
                    c4 = c2;
                }
                while (true) {
                    int i31 = i17 + i29;
                    if (i31 >= i28 || (i4 = i26 + i29) >= i9 || rj0Var.b(i4, i31)) {
                        break;
                    }
                    iArr2[c2] = iArr2[c2] + 1;
                    i29++;
                }
                if (iArr2[c2] == 0) {
                    return r16;
                }
                while (true) {
                    int i32 = i17 + i29;
                    if (i32 >= i28 || (i3 = i26 + i29) >= i9 || !rj0Var.b(i3, i32)) {
                        break;
                    }
                    iArr2[4] = iArr2[4] + 1;
                    i29++;
                }
                if (iArr2[4] == 0) {
                    return r16;
                }
                int i33 = r16;
                int i34 = i33;
                while (i33 < 5) {
                    int i35 = iArr2[i33];
                    if (i35 == 0) {
                        return r16;
                    }
                    i34 += i35;
                    i33++;
                }
                if (i34 < 7) {
                    return r16;
                }
                float f5 = i34 / 7.0f;
                float f6 = f5 / 1.333f;
                if (Math.abs(f5 - iArr2[r16]) >= f6 || Math.abs(f5 - iArr2[1]) >= f6 || Math.abs((f5 * 3.0f) - iArr2[c]) >= 3.0f * f6 || Math.abs(f5 - iArr2[c2]) >= f6 || Math.abs(f5 - iArr2[4]) >= f6) {
                    return r16;
                }
                float f7 = i6 / 7.0f;
                for (int i36 = r16; i36 < arrayList.size(); i36++) {
                    th4 th4Var = (th4) arrayList.get(i36);
                    float f8 = th4Var.c;
                    float f9 = th4Var.a;
                    float f10 = th4Var.b;
                    if (Math.abs(f3 - f10) <= f7 && Math.abs(f4 - f9) <= f7) {
                        float abs = Math.abs(f7 - f8);
                        if (abs <= 1.0f || abs <= f8) {
                            int i37 = th4Var.d;
                            int i38 = i37 + 1;
                            float f11 = i37;
                            float f12 = (f9 * f11) + f4;
                            float f13 = i38;
                            arrayList.set(i36, new th4(f12 / f13, c00.z(f11, f10, f3, f13), c00.z(f11, th4Var.c, f7, f13), i38));
                            return true;
                        }
                    }
                }
                arrayList.add(new th4(f4, f3, f7, 1));
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        float f3 = 0.0f;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            th4 th4Var = (th4) obj;
            if (th4Var.d >= 2) {
                i++;
                f3 += th4Var.c;
            }
        }
        if (i >= 3) {
            float f4 = f3 / size;
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList.get(i3);
                i3++;
                f2 += Math.abs(((th4) obj2).c - f4);
            }
            if (f2 <= f3 * 0.05f) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void w() {
        if (this.a) {
            return;
        }
        Boolean z = z();
        this.c = z;
        if (z == null) {
            ((w44) ((feb) this.b)).a(new xi4((byte) 0));
        }
        this.a = true;
    }

    public final synchronized boolean x() {
        Boolean bool;
        w();
        bool = (Boolean) this.c;
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public final Boolean z() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ji4 ji4Var = ((FirebaseMessaging) this.d).a;
        ji4Var.a();
        Context context = ji4Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // j98
    public final void h() {
    }

    @Override // j98
    public final void y() {
    }

    @Override // j98
    public final void l(Editable editable) {
    }

    public vh4(g84 g84Var, peb pebVar) {
        this.b = g84Var;
        this.c = pebVar;
        this.d = new SparseArray();
    }

    public vh4(rj0 rj0Var, byte b) {
        switch (b) {
            case 3:
                int i = rj0Var.b;
                if (i >= 21 && (i & 3) == 1) {
                    this.b = rj0Var;
                    return;
                }
                throw lo4.a();
            default:
                this.b = rj0Var;
                this.c = new ArrayList();
                this.d = new int[5];
                return;
        }
    }

    public vh4(byte b) {
        switch (b) {
            case 13:
                this.b = new Object();
                this.c = new ArrayDeque();
                this.d = new AtomicReference();
                break;
            default:
                this.b = new um4();
                break;
        }
    }

    public vh4(gd4 gd4Var, boolean z) {
        this.d = gd4Var;
        this.c = new AtomicReference(null);
        this.a = z;
        this.b = new AtomicMarkableReference(new vx5(z ? TLObject.FLAG_13 : 1024), false);
    }
}
