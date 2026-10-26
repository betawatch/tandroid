package y2;

import a8.yb;
import android.os.Looper;
import android.os.SystemClock;
import e2.n0;
import java.io.IOException;
import java.util.concurrent.Executors;
import org.telegram.ui.Components.cy0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        this(new z2.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(r3, 1)), new vg.d(11)));
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = n0.a;
    }

    public final void a() {
        h hVar = this.b;
        hVar.getClass();
        hVar.a(false);
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean c() {
        return this.b != null;
    }

    @Override // y2.m
    public final void d() {
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

    public final void e(j jVar) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(true);
        }
        z2.a aVar = this.a;
        if (jVar != null) {
            aVar.execute(new cy0(jVar, 19));
        }
        aVar.b.accept(aVar.a);
    }

    public final void f(i iVar, g gVar, int i10) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.c = null;
        h hVar = new h(this, myLooper, iVar, gVar, i10, SystemClock.elapsedRealtime());
        yb.p(this.b == null);
        this.b = hVar;
        hVar.b();
    }

    public l(z2.a aVar) {
        this.a = aVar;
    }
}
