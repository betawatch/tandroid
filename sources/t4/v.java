package t4;

import android.text.TextUtils;
import h5.c0;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class v implements r3.k {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final c0 b;
    public r3.m d;
    public int f;
    public final w c = new w();
    public byte[] e = new byte[1024];

    public v(String str, c0 c0Var) {
        this.a = str;
        this.b = c0Var;
    }

    public final r3.v a(long j10) {
        r3.v i22 = this.d.i2(0, 3);
        m0 m0Var = new m0();
        m0Var.o = "text/vtt";
        m0Var.c = this.a;
        m0Var.s = j10;
        i22.b(new n0(m0Var));
        this.d.i1();
        return i22;
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // r3.k
    public final void e(r3.m mVar) {
        this.d = mVar;
        mVar.m2(new r3.n(-9223372036854775807L));
    }

    @Override // r3.k
    public final int h(r3.l lVar, jb jbVar) {
        String h9;
        this.d.getClass();
        int i10 = (int) ((r3.h) lVar).c;
        int i11 = this.f;
        byte[] bArr = this.e;
        if (i11 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i12 = this.f;
        int read = ((r3.h) lVar).read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f + read;
            this.f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        w wVar = new w(this.e);
        e5.m.d(wVar);
        String h10 = wVar.h(r8.d.c);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(h10)) {
                while (true) {
                    String h11 = wVar.h(r8.d.c);
                    if (h11 == null) {
                        break;
                    }
                    if (e5.m.a.matcher(h11).matches()) {
                        do {
                            h9 = wVar.h(r8.d.c);
                            if (h9 != null) {
                            }
                        } while (!h9.isEmpty());
                    } else {
                        Matcher matcher2 = e5.k.a.matcher(h11);
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
                long c3 = e5.m.c(group);
                long b10 = this.b.b(((((j10 + c3) - j11) * 90000) / 1000000) % 8589934592L);
                r3.v a2 = a(b10 - c3);
                byte[] bArr3 = this.e;
                int i14 = this.f;
                w wVar2 = this.c;
                wVar2.D(i14, bArr3);
                a2.d(this.f, wVar2);
                a2.c(b10, 1, this.f, 0, null);
                return -1;
            }
            if (h10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = g.matcher(h10);
                if (!matcher3.find()) {
                    throw r1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(h10), null);
                }
                Matcher matcher4 = h.matcher(h10);
                if (!matcher4.find()) {
                    throw r1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(h10), null);
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j11 = e5.m.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                j10 = (Long.parseLong(group3) * 1000000) / 90000;
            }
            h10 = wVar.h(r8.d.c);
        }
    }

    @Override // r3.k
    public final boolean i(r3.l lVar) {
        r3.h hVar = (r3.h) lVar;
        hVar.f(this.e, 0, 6, false);
        byte[] bArr = this.e;
        w wVar = this.c;
        wVar.D(6, bArr);
        if (e5.m.a(wVar)) {
            return true;
        }
        hVar.f(this.e, 6, 3, false);
        wVar.D(9, this.e);
        return e5.m.a(wVar);
    }

    @Override // r3.k
    public final void release() {
    }
}
