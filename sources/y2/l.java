package y2;

import android.os.Looper;
import android.os.SystemClock;
import e2.m0;
import java.io.IOException;
import java.util.concurrent.Executors;
import org.telegram.ui.Wallet.m4;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        this(new z2.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(r3, 1)), new v0.k(11)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = m0.a;
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
        hVar.getClass();
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
            aVar.execute(new m4(jVar, 15));
        }
        aVar.b.accept(aVar.a);
    }

    public final void f(i iVar, g gVar, int i10) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        u6.p(this.b == null);
        this.b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.a = aVar;
    }
}
