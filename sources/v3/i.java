package v3;

import d5.y;
import m3.m;
import m3.w;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class i {
    public w b;
    public m c;
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
    public e3 j = new e3(26);

    public void a(long j10) {
        this.g = j10;
    }

    public abstract long b(y yVar);

    public abstract boolean c(y yVar, long j10, e3 e3Var);

    public void d(boolean z10) {
        if (z10) {
            this.j = new e3(26);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
