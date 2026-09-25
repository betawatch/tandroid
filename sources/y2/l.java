package y2;

import android.os.Looper;
import android.os.SystemClock;
import e2.d0;
import java.io.IOException;
import java.util.concurrent.Executors;
import pg.c1;
import u2.o1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class l implements m {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a a;
    public h b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(String str) {
        this(new z2.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(r3, 1)), new o1(18)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = d0.a;
    }

    @Override // y2.m
    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        h hVar = this.b;
        if (hVar != null) {
            int i10 = hVar.a;
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > i10) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        h hVar = this.b;
        e2.d.h(hVar);
        hVar.a(false);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(j jVar) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.a;
        if (jVar != null) {
            aVar.execute(new c1(jVar, 9));
        }
        aVar.b.accept(aVar.a);
    }

    public final void f(i iVar, g gVar, int i10) {
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        e2.d.g(this.b == null);
        this.b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.a = aVar;
    }
}
