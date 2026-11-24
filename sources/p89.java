// default package

import android.os.Build;
import android.util.Log;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p89 implements kaa {
    public static final int g;
    public static final j79 h;
    public final tpb a;
    public final ti4 b;
    public final ss c;
    public final r89 d;
    public final haa e;
    public final qj7 f;

    static {
        int i = ts3.d;
        g = (int) ts3.d(wge.c(24, xs3.f), xs3.d);
        h = new j79("com/google/firebase/sessions//");
    }

    public p89(tpb tpbVar, ti4 ti4Var, ss ssVar, r89 r89Var, haa haaVar) {
        tpbVar.getClass();
        ti4Var.getClass();
        ssVar.getClass();
        r89Var.getClass();
        haaVar.getClass();
        this.a = tpbVar;
        this.b = ti4Var;
        this.c = ssVar;
        this.d = r89Var;
        this.e = haaVar;
        this.f = new qj7();
    }

    public static String e(String str) {
        j79 j79Var = h;
        j79Var.getClass();
        String replaceAll = j79Var.a.matcher(str).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|(1:(3:(1:(5:11|12|13|14|15)(2:21|22))(5:23|24|25|26|(3:28|29|30)(4:31|(1:33)|(3:36|14|15)|35))|19|20)(1:39))(2:51|(1:56)(1:55))|40|41|(3:43|44|45)(3:46|(3:48|26|(0)(0))|35)))|58|6|(0)(0)|40|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0144, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r1.d(r2) != r11) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:25:0x0048, B:26:0x0091, B:28:0x009d, B:31:0x00a6), top: B:24:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[Catch: all -> 0x0142, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:25:0x0048, B:26:0x0091, B:28:0x009d, B:31:0x00a6), top: B:24:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075 A[Catch: all -> 0x0144, TRY_LEAVE, TryCatch #1 {all -> 0x0144, blocks: (B:41:0x006f, B:43:0x0075, B:46:0x007e), top: B:40:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e A[Catch: all -> 0x0144, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0144, blocks: (B:41:0x006f, B:43:0x0075, B:46:0x007e), top: B:40:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // kaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(px2 px2Var) {
        o89 o89Var;
        int i;
        haa haaVar;
        qj7 qj7Var;
        qj7 qj7Var2;
        qj7 qj7Var3;
        String str;
        if (px2Var instanceof o89) {
            o89Var = (o89) px2Var;
            int i2 = o89Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                o89Var.d = i2 - TLObject.FLAG_31;
                Object obj = o89Var.b;
                i = o89Var.d;
                haaVar = this.e;
                g7c g7cVar = g7c.a;
                px2 px2Var2 = null;
                ly2 ly2Var = ly2.a;
                if (i != 0) {
                    tue.b(obj);
                    qj7Var = this.f;
                    if (!qj7Var.c() && !haaVar.b()) {
                        return g7cVar;
                    }
                    o89Var.a = qj7Var;
                    o89Var.d = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qj7Var3 = o89Var.a;
                            try {
                                tue.b(obj);
                                str = ((kq5) obj).a;
                                if (!str.equals("")) {
                                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                                    qj7Var3.f(null);
                                    return g7cVar;
                                }
                                lw7 lw7Var = new lw7("X-Crashlytics-Installation-ID", str);
                                lw7 lw7Var2 = new lw7("X-Crashlytics-Device-Model", e(Build.MANUFACTURER + Build.MODEL));
                                String str2 = Build.VERSION.INCREMENTAL;
                                str2.getClass();
                                lw7 lw7Var3 = new lw7("X-Crashlytics-OS-Build-Version", e(str2));
                                String str3 = Build.VERSION.RELEASE;
                                str3.getClass();
                                lw7 lw7Var4 = new lw7("X-Crashlytics-OS-Display-Version", e(str3));
                                this.c.getClass();
                                Map c = sk6.c(lw7Var, lw7Var2, lw7Var3, lw7Var4, new lw7("X-Crashlytics-API-Client-Version", "3.0.8"));
                                Log.d("FirebaseSessions", "Fetching settings from server.");
                                r89 r89Var = this.d;
                                hj1 hj1Var = new hj1(this, px2Var2, (byte) 7);
                                o83 o83Var = new o83(2, null, (byte) 1);
                                o89Var.a = qj7Var3;
                                o89Var.d = 3;
                                Object c2 = srd.c(r89Var.b, new q89(r89Var, c, hj1Var, o83Var, null), o89Var);
                                if (c2 != ly2Var) {
                                    c2 = g7cVar;
                                }
                                if (c2 != ly2Var) {
                                    qj7Var2 = qj7Var3;
                                    qj7Var2.f(null);
                                    return g7cVar;
                                }
                                return ly2Var;
                            } catch (Throwable th) {
                                th = th;
                                qj7Var2 = qj7Var3;
                            }
                        } else {
                            if (i != 3) {
                                dq9.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qj7Var2 = o89Var.a;
                            try {
                                tue.b(obj);
                                qj7Var2.f(null);
                                return g7cVar;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        qj7Var2.f(null);
                        throw th;
                    }
                    qj7 qj7Var4 = o89Var.a;
                    tue.b(obj);
                    qj7Var = qj7Var4;
                }
                if (haaVar.b()) {
                    Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                    qj7Var.f(null);
                    return g7cVar;
                }
                dhf dhfVar = kq5.c;
                ti4 ti4Var = this.b;
                o89Var.a = qj7Var;
                o89Var.d = 2;
                Object z = dhfVar.z(ti4Var, o89Var);
                if (z != ly2Var) {
                    qj7Var3 = qj7Var;
                    obj = z;
                    str = ((kq5) obj).a;
                    if (!str.equals("")) {
                    }
                }
                return ly2Var;
            }
        }
        o89Var = new o89(this, (qx2) px2Var);
        Object obj2 = o89Var.b;
        i = o89Var.d;
        haaVar = this.e;
        g7c g7cVar2 = g7c.a;
        px2 px2Var22 = null;
        ly2 ly2Var2 = ly2.a;
        if (i != 0) {
        }
        if (haaVar.b()) {
        }
    }

    @Override // kaa
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override // kaa
    public final ts3 c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        int i = ts3.d;
        return new ts3(wge.c(num.intValue(), xs3.d));
    }

    @Override // kaa
    public final Double d() {
        return this.e.a().b;
    }
}
