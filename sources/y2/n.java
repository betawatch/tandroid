package y2;

import android.os.Looper;
import android.os.SystemClock;
import e2.d0;
import java.io.IOException;
import java.util.concurrent.Executors;
import sg.a1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n implements o {
    public static final k4.d d = new k4.d(0, -9223372036854775807L, false);
    public static final k4.d e = new k4.d(2, -9223372036854775807L, false);
    public static final k4.d f = new k4.d(3, -9223372036854775807L, false);
    public final z2.a a;
    public j b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(String str) {
        this(new z2.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(r3, 1)), new h(0)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = d0.a;
    }

    @Override // y2.o
    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        j jVar = this.b;
        if (jVar != null) {
            int i10 = jVar.a;
            IOException iOException2 = jVar.e;
            if (iOException2 != null && jVar.f > i10) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        j jVar = this.b;
        e2.d.h(jVar);
        jVar.a(false);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(l lVar) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(true);
        }
        z2.a aVar = this.a;
        if (lVar != null) {
            aVar.execute(new a1(lVar, 7));
        }
        aVar.b.accept(aVar.a);
    }

    public final void f(k kVar, i iVar, int i10) {
        Looper myLooper = Looper.myLooper();
        e2.d.h(myLooper);
        this.c = null;
        j jVar = new j(this, myLooper, kVar, iVar, i10, SystemClock.elapsedRealtime());
        e2.d.g(this.b == null);
        this.b = jVar;
        jVar.b();
    }

    public n(z2.a aVar) {
        this.a = aVar;
    }
}
