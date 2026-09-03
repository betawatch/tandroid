package vh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a {
    public static long u = 1;
    public final long a;
    public TL_iv.PageBlock b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public t g;
    public ArrayList h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(TL_iv.PageBlock pageBlock, int i10, int i11) {
        this(pageBlock, i10, i11, r4);
        long j10 = u;
        u = 1 + j10;
    }

    public final boolean a() {
        return this.c > 0 && this.e;
    }

    public final boolean b() {
        return this.c > 0;
    }

    public final boolean c() {
        return this.d > 0;
    }

    public a(TL_iv.PageBlock pageBlock, int i10, int i11, long j10) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.b = pageBlock;
        this.c = i10;
        this.d = i11;
        this.a = j10;
    }
}
