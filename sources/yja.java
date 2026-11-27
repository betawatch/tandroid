// default package

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class yja {
    public final bba a;
    public final z9a b;
    public final y9a c;
    public final srb d;
    public final o73 e;
    public final ko8 f;
    public final mx2 g;
    public o9a h;
    public boolean i;
    public boolean j;
    public String k;

    public yja(bba bbaVar, z9a z9aVar, y9a y9aVar, srb srbVar, o73 o73Var, ko8 ko8Var, mx2 mx2Var) {
        bbaVar.getClass();
        z9aVar.getClass();
        y9aVar.getClass();
        srbVar.getClass();
        o73Var.getClass();
        ko8Var.getClass();
        mx2Var.getClass();
        this.a = bbaVar;
        this.b = z9aVar;
        this.c = y9aVar;
        this.d = srbVar;
        this.e = o73Var;
        this.f = ko8Var;
        this.g = mx2Var;
        this.k = "";
        fud.b(xde.a(mx2Var), new uja(this, null, (byte) 0));
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        fud.b(xde.a(this.g), new uja(this, null, (byte) 1));
    }

    public final void b() {
        byte b = 1;
        this.i = true;
        o9a o9aVar = this.h;
        if (o9aVar == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        zw2 zw2Var = null;
        if (o9aVar == null) {
            ur5.e("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (d(o9aVar) || c(o9aVar)) {
            fud.b(xde.a(this.g), new fj4(this, o9aVar, zw2Var, b));
        }
    }

    public final boolean c(o9a o9aVar) {
        Map map = o9aVar.c;
        boolean z = true;
        ko8 ko8Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + ko8Var.a());
            return true;
        }
        ko8Var.getClass();
        io8 io8Var = (io8) map.get(ko8Var.a());
        if (io8Var != null && io8Var.a == ko8Var.c && ur5.a(io8Var.b, (String) ko8Var.d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + ko8Var.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (bs3.c(r8) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (bs3.c(r8) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(o9a o9aVar) {
        long c;
        orb orbVar = o9aVar.b;
        s9a s9aVar = o9aVar.a;
        if (orbVar == null) {
            Log.d("FirebaseSessions", "Session " + s9aVar.a + " has not backgrounded yet");
            return false;
        }
        this.d.getClass();
        orb a = srb.a();
        int i = bs3.d;
        long d = mje.d(a.a - orbVar.a, fs3.c);
        bba bbaVar = this.a;
        bs3 c2 = bbaVar.a.c();
        if (c2 != null) {
            c = c2.a;
            if (c > 0) {
            }
        }
        bs3 c3 = bbaVar.b.c();
        if (c3 != null) {
            c = c3.a;
            if (c > 0) {
            }
        }
        c = mje.c(30, fs3.e);
        boolean z = bs3.b(d, c) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + s9aVar.a + " is expired");
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, vja vjaVar, zw2 zw2Var) {
        xja xjaVar;
        int i;
        String str2;
        if (zw2Var instanceof xja) {
            xjaVar = (xja) zw2Var;
            int i2 = xjaVar.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                xjaVar.e = i2 - TLObject.FLAG_31;
                Object obj = xjaVar.c;
                vx2 vx2Var = vx2.a;
                i = xjaVar.e;
                if (i != 0) {
                    ixe.b(obj);
                    if (ur5.a(this.k, str)) {
                        return f9c.a;
                    }
                    this.k = str;
                    nj4 nj4Var = nj4.a;
                    xjaVar.a = str;
                    xjaVar.b = vjaVar;
                    xjaVar.e = 1;
                    obj = nj4Var.b(xjaVar);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vjaVar = xjaVar.b;
                    str = xjaVar.a;
                    ixe.b(obj);
                }
                for (ty2 ty2Var : ((Map) obj).values()) {
                    jaa jaaVar = new jaa(str);
                    ty2Var.getClass();
                    String str3 = "App Quality Sessions session changed: " + jaaVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    rx6 rx6Var = ty2Var.b;
                    synchronized (rx6Var) {
                        if (!Objects.equals((String) rx6Var.d, str)) {
                            rx6.d0((gd4) rx6Var.b, (String) rx6Var.c, str);
                            rx6Var.d = str;
                        }
                    }
                    int ordinal = vjaVar.ordinal();
                    if (ordinal == 0) {
                        str2 = "Notified " + iaa.a + " of new session " + str;
                    } else {
                        if (ordinal != 1) {
                            throw new zp2();
                        }
                        str2 = "Notified " + iaa.a + " of new fallback session " + str;
                    }
                    Log.d("FirebaseSessions", str2);
                }
                return f9c.a;
            }
        }
        xjaVar = new xja(this, zw2Var);
        Object obj2 = xjaVar.c;
        vx2 vx2Var2 = vx2.a;
        i = xjaVar.e;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return f9c.a;
    }
}
