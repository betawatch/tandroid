package q4;

import f5.d0;
import j3.s0;
import j3.t0;
import j7.l1;
import java.io.EOFException;
import java.util.Arrays;
import o3.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p implements w {
    public static final t0 f;
    public static final t0 g;
    public final w a;
    public final t0 b;
    public t0 c;
    public byte[] d;
    public int e;

    static {
        s0 s0Var = new s0();
        s0Var.o = "application/id3";
        f = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.o = "application/x-emsg";
        g = new t0(s0Var2);
    }

    public p(w wVar, int i10) {
        this.a = wVar;
        if (i10 == 1) {
            this.b = f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(l1.k(i10, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // o3.w
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = jVar.read(this.d, this.e, i10);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // o3.w
    public final void b(t0 t0Var) {
        this.c = t0Var;
        this.a.b(this.b);
    }

    @Override // o3.w
    public final void c(long j10, int i10, int i11, int i12, o3.v vVar) {
        this.c.getClass();
        int i13 = this.e - i12;
        f5.w wVar = new f5.w(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.c.B;
        t0 t0Var = this.b;
        String str2 = t0Var.B;
        String str3 = t0Var.B;
        if (!d0.a(str, str2)) {
            if (!"application/x-emsg".equals(this.c.B)) {
                f5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.B);
                return;
            }
            d4.a c3 = c4.b.c(wVar);
            t0 wrappedMetadataFormat = c3.getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !d0.a(str3, wrappedMetadataFormat.B)) {
                f5.a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c3.getWrappedMetadataFormat());
                return;
            }
            byte[] wrappedMetadataBytes = c3.getWrappedMetadataBytes();
            wrappedMetadataBytes.getClass();
            wVar = new f5.w(wrappedMetadataBytes);
        }
        int a2 = wVar.a();
        w wVar2 = this.a;
        wVar2.e(a2, wVar);
        wVar2.c(j10, i10, a2, i12, vVar);
    }

    @Override // o3.w
    public final void d(int i10, f5.w wVar) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        wVar.c(this.e, i10, this.d);
        this.e += i10;
    }

    @Override // o3.w
    public final /* synthetic */ void e(int i10, f5.w wVar) {
        l1.a(this, wVar, i10);
    }
}
