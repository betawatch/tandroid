package r2;

import android.text.TextUtils;
import e2.s0;
import e2.t0;
import f3.j0;
import h2.k0;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class t implements f3.o {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final k0 b;
    public final c4.k d;
    public final boolean e;
    public f3.q f;
    public int h;
    public final x c = new x();
    public byte[] g = new byte[1024];

    public t(String str, k0 k0Var, c4.k kVar, boolean z9) {
        this.a = str;
        this.b = k0Var;
        this.d = kVar;
        this.e = z9;
    }

    @Override // f3.o
    public final boolean b(f3.p pVar) {
        f3.l lVar = (f3.l) pVar;
        lVar.k(this.g, 0, 6, false);
        byte[] bArr = this.g;
        x xVar = this.c;
        xVar.L(6, bArr);
        if (l4.i.a(xVar)) {
            return true;
        }
        lVar.k(this.g, 6, 3, false);
        xVar.L(9, this.g);
        return l4.i.a(xVar);
    }

    @Override // f3.o
    public final void c(f3.q qVar) {
        if (this.e) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f = qVar;
        qVar.f(new f3.t(-9223372036854775807L));
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        throw new IllegalStateException();
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // f3.o
    public final int f(f3.p pVar, f3.s sVar) {
        String n10;
        this.f.getClass();
        int length = (int) pVar.getLength();
        int i7 = this.h;
        byte[] bArr = this.g;
        if (i7 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i10 = this.h;
        int read = pVar.read(bArr2, i10, bArr2.length - i10);
        if (read != -1) {
            int i11 = this.h + read;
            this.h = i11;
            if (length == -1 || i11 != length) {
                return 0;
            }
        }
        x xVar = new x(this.g);
        l4.i.d(xVar);
        String n11 = xVar.n(StandardCharsets.UTF_8);
        long j3 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(n11)) {
                while (true) {
                    String n12 = xVar.n(StandardCharsets.UTF_8);
                    if (n12 == null) {
                        break;
                    }
                    if (l4.i.a.matcher(n12).matches()) {
                        do {
                            n10 = xVar.n(StandardCharsets.UTF_8);
                            if (n10 != null) {
                            }
                        } while (!n10.isEmpty());
                    } else {
                        Matcher matcher2 = l4.h.a.matcher(n12);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    g(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c10 = l4.i.c(group);
                String str = m0.a;
                long b10 = this.b.b(m0.a0((j3 + c10) - j10, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                j0 g10 = g(b10 - c10);
                byte[] bArr3 = this.g;
                int i12 = this.h;
                x xVar2 = this.c;
                xVar2.L(i12, bArr3);
                g10.b(this.h, xVar2);
                g10.c(b10, 1, this.h, 0, null);
                return -1;
            }
            if (n11.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(n11);
                if (!matcher3.find()) {
                    throw t0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n11));
                }
                Matcher matcher4 = j.matcher(n11);
                if (!matcher4.find()) {
                    throw t0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n11));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j10 = l4.i.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String str2 = m0.a;
                j3 = m0.a0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            n11 = xVar.n(StandardCharsets.UTF_8);
        }
    }

    public final j0 g(long j3) {
        j0 O1 = this.f.O1(0, 3);
        e2.t tVar = new e2.t();
        tVar.r = s0.n("text/vtt");
        tVar.d = this.a;
        tVar.w = j3;
        f1.s(tVar, O1);
        this.f.U0();
        return O1;
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
