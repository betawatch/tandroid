package y2;

import android.os.Looper;
import android.os.SystemClock;
import e2.d0;
import java.io.IOException;
import java.util.concurrent.Executors;
import rg.b0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m implements n {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a a;
    public i b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(String str) {
        this(new z2.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(r3, 1)), new org.telegram.ui.web.n(3)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = d0.a;
    }

    public final void a() {
        i iVar = this.b;
        e2.d.h(iVar);
        iVar.a(false);
    }

    @Override // y2.n
    public final void b() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        i iVar = this.b;
        if (iVar != null) {
            int i10 = iVar.a;
            IOException iOException2 = iVar.e;
            if (iOException2 != null && iVar.f > i10) {
                throw iOException2;
            }
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(k kVar) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.a(true);
        }
        z2.a aVar = this.a;
        if (kVar != null) {
            aVar.execute(new b0(kVar, 8));
        }
        aVar.b.accept(aVar.a);
    }

    public final void f(j jVar, h hVar, int i10) {
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.c = null;
        i iVar = new i(this, myLooper, jVar, hVar, i10, SystemClock.elapsedRealtime());
        e2.d.g(this.b == null);
        this.b = iVar;
        iVar.b();
    }

    public m(z2.a aVar) {
        this.a = aVar;
    }
}
