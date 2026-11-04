package q2;

import android.text.TextUtils;
import d2.u;
import d2.u0;
import d2.v0;
import g2.l0;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements e3.o {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final l0 b;
    public final b4.k d;
    public final boolean e;
    public e3.q f;
    public int h;
    public final y c = new y();
    public byte[] g = new byte[1024];

    public t(String str, l0 l0Var, b4.k kVar, boolean z10) {
        this.a = str;
        this.b = l0Var;
        this.d = kVar;
        this.e = z10;
    }

    @Override // e3.o
    public final boolean b(e3.p pVar) {
        e3.l lVar = (e3.l) pVar;
        lVar.h(this.g, 0, 6, false);
        byte[] bArr = this.g;
        y yVar = this.c;
        yVar.L(6, bArr);
        if (k4.i.a(yVar)) {
            return true;
        }
        lVar.h(this.g, 6, 3, false);
        yVar.L(9, this.g);
        return k4.i.a(yVar);
    }

    @Override // e3.o
    public final void c(e3.q qVar) {
        if (this.e) {
            qVar = new b4.n(qVar, this.d);
        }
        this.f = qVar;
        qVar.f(new e3.t(-9223372036854775807L));
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(e3.p pVar, e3.s sVar) {
        String n4;
        this.f.getClass();
        int length = (int) pVar.getLength();
        int i3 = this.h;
        byte[] bArr = this.g;
        if (i3 == bArr.length) {
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
        y yVar = new y(this.g);
        k4.i.d(yVar);
        String n10 = yVar.n(StandardCharsets.UTF_8);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(n10)) {
                while (true) {
                    String n11 = yVar.n(StandardCharsets.UTF_8);
                    if (n11 == null) {
                        break;
                    }
                    if (k4.i.a.matcher(n11).matches()) {
                        do {
                            n4 = yVar.n(StandardCharsets.UTF_8);
                            if (n4 != null) {
                            }
                        } while (!n4.isEmpty());
                    } else {
                        Matcher matcher2 = k4.h.a.matcher(n11);
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
                long c2 = k4.i.c(group);
                String str = n0.a;
                long b10 = this.b.b(n0.a0((j10 + c2) - j11, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                e3.i0 g7 = g(b10 - c2);
                byte[] bArr3 = this.g;
                int i12 = this.h;
                y yVar2 = this.c;
                yVar2.L(i12, bArr3);
                g7.e(this.h, yVar2);
                g7.d(b10, 1, this.h, 0, null);
                return -1;
            }
            if (n10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(n10);
                if (!matcher3.find()) {
                    throw v0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n10));
                }
                Matcher matcher4 = j.matcher(n10);
                if (!matcher4.find()) {
                    throw v0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n10));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j11 = k4.i.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String str2 = n0.a;
                j10 = n0.a0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            n10 = yVar.n(StandardCharsets.UTF_8);
        }
    }

    public final e3.i0 g(long j10) {
        e3.i0 i02 = this.f.i0(0, 3);
        u uVar = new u();
        uVar.r = u0.n("text/vtt");
        uVar.d = this.a;
        uVar.w = j10;
        f1.w(uVar, i02);
        this.f.L();
        return i02;
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
