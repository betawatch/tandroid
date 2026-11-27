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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class r7c {
    public static final p1f a;
    public static final ji6 b;

    static {
        q0f.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new w7c();
        } else if (i >= 28) {
            a = new v7c();
        } else if (i >= 26) {
            a = new u7c();
        } else {
            if (i >= 24) {
                if (t7c.c == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                } else {
                    a = new t7c();
                }
            }
            a = new s7c();
        }
        b = new ji6(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1.equals(r5) == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, bo4 bo4Var, Resources resources, int i, String str, int i2, int i3, jq jqVar) {
        Typeface a2;
        Typeface typeface;
        List unmodifiableList;
        Typeface typeface2;
        byte b2 = 15;
        if (bo4Var instanceof eo4) {
            eo4 eo4Var = (eo4) bo4Var;
            String str2 = eo4Var.e;
            a2 = null;
            boolean z = false;
            Object[] objArr = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new z09(jqVar, typeface, b2));
                return typeface;
            }
            byte b3 = 1;
            Object[] objArr2 = eo4Var.d == 0;
            int i4 = eo4Var.c;
            Handler handler = new Handler(Looper.getMainLooper());
            ve9 ve9Var = new ve9((byte) 18);
            ve9Var.b = jqVar;
            un4 un4Var = eo4Var.b;
            un4 un4Var2 = eo4Var.a;
            if (un4Var != null) {
                Object[] objArr3 = {un4Var2, un4Var};
                ArrayList arrayList = new ArrayList(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    Object obj = objArr3[i5];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                Object[] objArr4 = {un4Var2};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr4[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            byte b4 = 3;
            zi0 zi0Var = new zi0(handler, (byte) 3);
            qx6 qx6Var = new qx6(ve9Var, zi0Var, z, (byte) 12);
            if (objArr2 != true) {
                String a3 = ao4.a(i3, unmodifiableList);
                typeface2 = (Typeface) ao4.a.a(a3);
                if (typeface2 != null) {
                    zi0Var.execute(new iqd(ve9Var, typeface2, b4));
                } else {
                    yn4 yn4Var = new yn4((Object) qx6Var, (byte) (objArr == true ? 1 : 0));
                    synchronized (ao4.c) {
                        vla vlaVar = ao4.d;
                        ArrayList arrayList3 = (ArrayList) vlaVar.get(a3);
                        if (arrayList3 != null) {
                            arrayList3.add(yn4Var);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(yn4Var);
                            vlaVar.put(a3, arrayList4);
                            xn4 xn4Var = new xn4(a3, context, unmodifiableList, i3, (byte) 1);
                            ThreadPoolExecutor threadPoolExecutor = ao4.b;
                            yn4 yn4Var2 = new yn4(a3, b3);
                            Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                            uy1 uy1Var = new uy1();
                            uy1Var.b = xn4Var;
                            uy1Var.c = yn4Var2;
                            uy1Var.d = handler2;
                            threadPoolExecutor.execute(uy1Var);
                        }
                    }
                }
            } else {
                if (unmodifiableList.size() > 1) {
                    lq5.j("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                un4 un4Var3 = (un4) unmodifiableList.get(0);
                ji6 ji6Var = ao4.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{un4Var3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a4 = ao4.a(i3, DesugarCollections.unmodifiableList(arrayList5));
                typeface2 = (Typeface) ao4.a.a(a4);
                if (typeface2 != null) {
                    zi0Var.execute(new iqd(ve9Var, typeface2, b4));
                } else if (i4 == -1) {
                    Object[] objArr5 = {un4Var3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr5[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    zn4 b5 = ao4.b(a4, context, DesugarCollections.unmodifiableList(arrayList6), i3);
                    qx6Var.F(b5);
                    a2 = b5.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    zn4 zn4Var = (zn4) ao4.b.submit(new xn4(a4, context, un4Var3, i3, (byte) 0)).get(i4, TimeUnit.MILLISECONDS);
                                    qx6Var.F(zn4Var);
                                    a2 = zn4Var.a;
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
                        ((zi0) qx6Var.c).execute(new tv((ve9) qx6Var.b, -3));
                    }
                }
            }
            a2 = typeface2;
        } else {
            a2 = a.a(context, (co4) bo4Var, resources, i3);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new z09(jqVar, a2, b2));
            } else {
                jqVar.b();
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
