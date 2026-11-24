// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class s5c {
    public static final xye a;
    public static final fi6 b;

    static {
        yxe.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new x5c();
        } else if (i >= 28) {
            a = new w5c();
        } else if (i >= 26) {
            a = new v5c();
        } else {
            if (i >= 24) {
                if (u5c.c == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                } else {
                    a = new u5c();
                }
            }
            a = new t5c();
        }
        b = new fi6(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1.equals(r5) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, xn4 xn4Var, Resources resources, int i, String str, int i2, int i3, ir irVar) {
        Typeface a2;
        Typeface typeface;
        List unmodifiableList;
        Typeface typeface2;
        byte b2 = 18;
        if (xn4Var instanceof ao4) {
            ao4 ao4Var = (ao4) xn4Var;
            String str2 = ao4Var.e;
            a2 = null;
            byte b3 = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new ey8(irVar, typeface, b2));
                return typeface;
            }
            byte b4 = 1;
            boolean z = ao4Var.d == 0;
            int i4 = ao4Var.c;
            Handler handler = new Handler(Looper.getMainLooper());
            x59 x59Var = new x59((byte) 21);
            x59Var.b = irVar;
            pn4 pn4Var = ao4Var.b;
            pn4 pn4Var2 = ao4Var.a;
            if (pn4Var != null) {
                Object[] objArr = {pn4Var2, pn4Var};
                ArrayList arrayList = new ArrayList(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    Object obj = objArr[i5];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {pn4Var2};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            byte b5 = 3;
            yj0 yj0Var = new yj0(handler, (byte) 3);
            hi2 hi2Var = new hi2((Object) x59Var, (Object) yj0Var, (byte) 14);
            if (!z) {
                String a3 = wn4.a(i3, unmodifiableList);
                typeface2 = (Typeface) wn4.a.a(a3);
                if (typeface2 != null) {
                    yj0Var.execute(new tnd(x59Var, typeface2, b5));
                } else {
                    un4 un4Var = new un4(hi2Var, b3);
                    synchronized (wn4.c) {
                        cka ckaVar = wn4.d;
                        ArrayList arrayList3 = (ArrayList) ckaVar.get(a3);
                        if (arrayList3 != null) {
                            arrayList3.add(un4Var);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(un4Var);
                            ckaVar.put(a3, arrayList4);
                            tn4 tn4Var = new tn4(a3, context, unmodifiableList, i3, (byte) 1);
                            ThreadPoolExecutor threadPoolExecutor = wn4.b;
                            un4 un4Var2 = new un4(a3, b4);
                            Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                            rz1 rz1Var = new rz1();
                            rz1Var.b = tn4Var;
                            rz1Var.c = un4Var2;
                            rz1Var.d = handler2;
                            threadPoolExecutor.execute(rz1Var);
                        }
                    }
                }
            } else {
                if (unmodifiableList.size() > 1) {
                    u36.j("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                pn4 pn4Var3 = (pn4) unmodifiableList.get(0);
                fi6 fi6Var = wn4.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{pn4Var3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a4 = wn4.a(i3, DesugarCollections.unmodifiableList(arrayList5));
                typeface2 = (Typeface) wn4.a.a(a4);
                if (typeface2 != null) {
                    yj0Var.execute(new tnd(x59Var, typeface2, b5));
                } else if (i4 == -1) {
                    Object[] objArr3 = {pn4Var3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    vn4 b6 = wn4.b(a4, context, DesugarCollections.unmodifiableList(arrayList6), i3);
                    hi2Var.M(b6);
                    a2 = b6.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    vn4 vn4Var = (vn4) wn4.b.submit(new tn4(a4, context, pn4Var3, i3, (byte) 0)).get(i4, TimeUnit.MILLISECONDS);
                                    hi2Var.M(vn4Var);
                                    a2 = vn4Var.a;
                                } catch (ExecutionException e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused2) {
                        ((yj0) hi2Var.c).execute(new sw((x59) hi2Var.b, -3));
                    }
                }
            }
            a2 = typeface2;
        } else {
            a2 = a.a(context, (yn4) xn4Var, resources, i3);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new ey8(irVar, a2, b2));
            } else {
                irVar.b();
            }
        }
        if (a2 != null) {
            b.b(b(resources, i, str, i2, i3), a2);
        }
        return a2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
