package x3;

import c3.h0;
import c3.q;
import e2.v;
import org.telegram.ui.Cells.f3;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class i {
    public h0 b;
    public q c;
    public g d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final e a = new e();
    public f3 j = new f3(22);

    public void a(long j3) {
        this.g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, f3 f3Var);

    public void d(boolean z10) {
        if (z10) {
            this.j = new f3(22);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
