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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class s3c {
    public static final vwe a;
    public static final fg6 b;

    static {
        wve.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new x3c();
        } else if (i >= 28) {
            a = new w3c();
        } else if (i >= 26) {
            a = new v3c();
        } else {
            if (i >= 24) {
                if (u3c.c == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                } else {
                    a = new u3c();
                }
            }
            a = new t3c();
        }
        b = new fg6(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1.equals(r5) == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, wl4 wl4Var, Resources resources, int i, String str, int i2, int i3, iq iqVar) {
        Typeface a2;
        Typeface typeface;
        List unmodifiableList;
        Typeface typeface2;
        byte b2 = 16;
        if (wl4Var instanceof zl4) {
            zl4 zl4Var = (zl4) wl4Var;
            String str2 = zl4Var.e;
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
                new Handler(Looper.getMainLooper()).post(new lw8(iqVar, typeface, b2));
                return typeface;
            }
            byte b3 = 1;
            Object[] objArr2 = zl4Var.d == 0;
            int i4 = zl4Var.c;
            Handler handler = new Handler(Looper.getMainLooper());
            u39 u39Var = new u39((byte) 21);
            u39Var.b = iqVar;
            pl4 pl4Var = zl4Var.b;
            pl4 pl4Var2 = zl4Var.a;
            if (pl4Var != null) {
                Object[] objArr3 = {pl4Var2, pl4Var};
                ArrayList arrayList = new ArrayList(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    Object obj = objArr3[i5];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                Object[] objArr4 = {pl4Var2};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr4[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            byte b4 = 3;
            yi0 yi0Var = new yi0(handler, (byte) 3);
            lv6 lv6Var = new lv6(u39Var, yi0Var, z, (byte) 12);
            if (objArr2 != true) {
                String a3 = vl4.a(i3, unmodifiableList);
                typeface2 = (Typeface) vl4.a.a(a3);
                if (typeface2 != null) {
                    yi0Var.execute(new rld(u39Var, typeface2, b4));
                } else {
                    tl4 tl4Var = new tl4((Object) lv6Var, (byte) (objArr == true ? 1 : 0));
                    synchronized (vl4.c) {
                        aia aiaVar = vl4.d;
                        ArrayList arrayList3 = (ArrayList) aiaVar.get(a3);
                        if (arrayList3 != null) {
                            arrayList3.add(tl4Var);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(tl4Var);
                            aiaVar.put(a3, arrayList4);
                            sl4 sl4Var = new sl4(a3, context, unmodifiableList, i3, (byte) 1);
                            ThreadPoolExecutor threadPoolExecutor = vl4.b;
                            tl4 tl4Var2 = new tl4(a3, b3);
                            Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                            ey1 ey1Var = new ey1();
                            ey1Var.b = sl4Var;
                            ey1Var.c = tl4Var2;
                            ey1Var.d = handler2;
                            threadPoolExecutor.execute(ey1Var);
                        }
                    }
                }
            } else {
                if (unmodifiableList.size() > 1) {
                    w26.j("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                pl4 pl4Var3 = (pl4) unmodifiableList.get(0);
                fg6 fg6Var = vl4.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{pl4Var3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a4 = vl4.a(i3, DesugarCollections.unmodifiableList(arrayList5));
                typeface2 = (Typeface) vl4.a.a(a4);
                if (typeface2 != null) {
                    yi0Var.execute(new rld(u39Var, typeface2, b4));
                } else if (i4 == -1) {
                    Object[] objArr5 = {pl4Var3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr5[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    ul4 b5 = vl4.b(a4, context, DesugarCollections.unmodifiableList(arrayList6), i3);
                    lv6Var.E(b5);
                    a2 = b5.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    ul4 ul4Var = (ul4) vl4.b.submit(new sl4(a4, context, pl4Var3, i3, (byte) 0)).get(i4, TimeUnit.MILLISECONDS);
                                    lv6Var.E(ul4Var);
                                    a2 = ul4Var.a;
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
                        ((yi0) lv6Var.c).execute(new sv((u39) lv6Var.b, -3));
                    }
                }
            }
            a2 = typeface2;
        } else {
            a2 = a.a(context, (xl4) wl4Var, resources, i3);
            if (a2 != null) {
                new Handler(Looper.getMainLooper()).post(new lw8(iqVar, a2, b2));
            } else {
                iqVar.b();
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
