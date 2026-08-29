package q4;

import android.text.TextUtils;
import f5.c0;
import f5.w;
import j3.s0;
import j3.t0;
import j3.t1;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v implements o3.k {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final c0 b;
    public o3.m d;
    public int f;
    public final w c = new w();
    public byte[] e = new byte[1024];

    public v(String str, c0 c0Var) {
        this.a = str;
        this.b = c0Var;
    }

    public final o3.w a(long j10) {
        o3.w Z1 = this.d.Z1(0, 3);
        s0 s0Var = new s0();
        s0Var.o = "text/vtt";
        s0Var.c = this.a;
        s0Var.s = j10;
        Z1.b(new t0(s0Var));
        this.d.e1();
        return Z1;
    }

    @Override // o3.k
    public final int d(o3.l lVar, o3.n nVar) {
        String f9;
        this.d.getClass();
        int i10 = (int) ((o3.h) lVar).c;
        int i11 = this.f;
        byte[] bArr = this.e;
        if (i11 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i12 = this.f;
        int read = ((o3.h) lVar).read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f + read;
            this.f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        w wVar = new w(this.e);
        c5.l.d(wVar);
        String f10 = wVar.f(p8.d.c);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(f10)) {
                while (true) {
                    String f11 = wVar.f(p8.d.c);
                    if (f11 == null) {
                        break;
                    }
                    if (c5.l.a.matcher(f11).matches()) {
                        do {
                            f9 = wVar.f(p8.d.c);
                            if (f9 != null) {
                            }
                        } while (!f9.isEmpty());
                    } else {
                        Matcher matcher2 = c5.j.a.matcher(f11);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c3 = c5.l.c(group);
                long b10 = this.b.b(((((j10 + c3) - j11) * 90000) / 1000000) % 8589934592L);
                o3.w a2 = a(b10 - c3);
                byte[] bArr3 = this.e;
                int i14 = this.f;
                w wVar2 = this.c;
                wVar2.A(i14, bArr3);
                a2.e(this.f, wVar2);
                a2.c(b10, 1, this.f, 0, null);
                return -1;
            }
            if (f10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = g.matcher(f10);
                if (!matcher3.find()) {
                    throw t1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(f10), null);
                }
                Matcher matcher4 = h.matcher(f10);
                if (!matcher4.find()) {
                    throw t1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(f10), null);
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j11 = c5.l.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                j10 = (Long.parseLong(group3) * 1000000) / 90000;
            }
            f10 = wVar.f(p8.d.c);
        }
    }

    @Override // o3.k
    public final boolean e(o3.l lVar) {
        o3.h hVar = (o3.h) lVar;
        hVar.f(this.e, 0, 6, false);
        byte[] bArr = this.e;
        w wVar = this.c;
        wVar.A(6, bArr);
        if (c5.l.a(wVar)) {
            return true;
        }
        hVar.f(this.e, 6, 3, false);
        wVar.A(9, this.e);
        return c5.l.a(wVar);
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // o3.k
    public final void i(o3.m mVar) {
        this.d = mVar;
        mVar.D1(new o3.o(-9223372036854775807L));
    }

    @Override // o3.k
    public final void release() {
    }
}
