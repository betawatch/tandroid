package v3;

import d5.z;
import m3.m;
import m3.w;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public i6 j = new i6(27);

    public void a(long j10) {
        this.g = j10;
    }

    public abstract long b(z zVar);

    public abstract boolean c(z zVar, long j10, i6 i6Var);

    public void d(boolean z10) {
        if (z10) {
            this.j = new i6(27);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
