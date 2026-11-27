// default package

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class v20 {
    public final i30 b;
    public boolean g;
    public boolean h;
    public boolean i;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Object c = new Object();
    public final HashMap d = new HashMap();
    public final HashSet e = new HashSet();
    public int f = 1;

    public v20(Context context, File file, sn6 sn6Var) {
        boolean z = false;
        d30 d30Var = new d30(context, (byte) 0);
        d30Var.c = file;
        f30 f30Var = (f30) phd.c.a();
        if (f30Var == null) {
            lq5.j("Noise suppression mode is required");
            throw null;
        }
        d30Var.d = f30Var;
        d30Var.a = false;
        d30Var.e = new qx6((Object) this, (Object) sn6Var, (byte) 5);
        d30Var.f = new lh2(this, sn6Var, z, (byte) 6);
        d30Var.g = new sjf((byte) 13);
        this.b = new i30(d30Var);
    }

    public final boolean a() {
        i30 i30Var = this.b;
        i30Var.getClass();
        i30.q();
        n20 n20Var = null;
        n20Var = null;
        n20Var = null;
        n20Var = null;
        n20Var = null;
        if (i30Var.G == 5 && i30Var.z != null && i30Var.r == 0 && i30Var.s == i30Var.j()) {
            i30Var.p();
            g30 g30Var = i30Var.z;
            long j = i30Var.j();
            long length = g30Var.b.length();
            i30Var.a(g30Var, length);
            synchronized (i30Var.l) {
                if (g30Var.d && !g30Var.e) {
                    g30Var.e = true;
                    i30Var.k.execute(new w20(i30Var, g30Var, length, j, (byte) 0));
                    File file = g30Var.b;
                    byte[] bArr = i30Var.B;
                    i30Var.C = new n20(file, j, bArr != null ? (byte[]) bArr.clone() : null);
                    i30Var.s(8);
                    i30Var.c();
                    i30Var.t();
                    i30Var.l("detached_preview");
                    n20Var = i30Var.C;
                }
            }
        }
        if (n20Var == null) {
            return false;
        }
        this.b.o();
        this.h = true;
        return true;
    }

    public final boolean b() {
        i30 i30Var = this.b;
        i30Var.getClass();
        i30.q();
        return i30Var.e().a == 5;
    }

    public final boolean c() {
        i30 i30Var = this.b;
        i30Var.getClass();
        i30.q();
        if (i30Var.G != 1) {
            return false;
        }
        File file = i30Var.b;
        if ((!file.isDirectory() && !file.mkdirs()) || !file.canWrite()) {
            i30Var.g(new IllegalStateException("Output directory is not writable: " + file));
            return false;
        }
        i30Var.h.b("start requested");
        i30Var.d();
        i30Var.s(2);
        i30Var.u(0L, -1L, null);
        return true;
    }
}
