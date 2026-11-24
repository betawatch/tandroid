// default package

import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qh5 implements yzb {
    public static final go4 f;
    public static final go4 g;
    public final yzb a;
    public final go4 b;
    public go4 c;
    public byte[] d;
    public int e;

    static {
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("application/id3");
        f = new go4(fo4Var);
        fo4 fo4Var2 = new fo4();
        fo4Var2.s = wf7.n("application/x-emsg");
        g = new go4(fo4Var2);
    }

    public qh5(yzb yzbVar, int i) {
        this.a = yzbVar;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                u36.j(hg9.j(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // yzb
    public final void a(long j, int i, int i2, int i3, xzb xzbVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        yw7 yw7Var = new yw7(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.t;
        go4 go4Var = this.b;
        String str2 = go4Var.t;
        String str3 = go4Var.t;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.t)) {
                ncd.f("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.t);
                return;
            }
            u54 c = qs.c(yw7Var);
            go4 a = c.a();
            if (a == null || !Objects.equals(str3, a.t)) {
                ncd.f("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c.a());
                return;
            }
            byte[] c2 = c.c();
            c2.getClass();
            yw7Var = new yw7(c2);
        }
        int a2 = yw7Var.a();
        yzb yzbVar = this.a;
        yzbVar.e(a2, yw7Var);
        yzbVar.a(j, i, a2, 0, xzbVar);
    }

    @Override // yzb
    public final void b(yw7 yw7Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            bArr = Arrays.copyOf(bArr, (i3 / 2) + i3);
            this.d = bArr;
        }
        yw7Var.k(this.e, i, bArr);
        this.e += i;
    }

    @Override // yzb
    public final int c(s73 s73Var, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            bArr = Arrays.copyOf(bArr, (i2 / 2) + i2);
            this.d = bArr;
        }
        int read = s73Var.read(bArr, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yzb
    public final /* synthetic */ void e(int i, yw7 yw7Var) {
        mlb.b(this, yw7Var, i);
    }

    @Override // yzb
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override // yzb
    public final void g(go4 go4Var) {
        this.c = go4Var;
        this.a.g(this.b);
    }

    @Override // yzb
    public final void d(long j) {
    }
}
