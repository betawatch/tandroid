package x3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import f5.w;
import i7.i0;
import i7.j0;
import j3.t0;
import java.util.Arrays;
import l4.v0;
import o3.p;
import v5.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends i {
    public FlacStreamMetadata n;
    public v0 o;

    @Override // x3.i
    public final long b(w wVar) {
        byte[] bArr = wVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            wVar.D(4);
            wVar.x();
        }
        int b10 = i0.b(i10, wVar);
        wVar.C(0);
        return b10;
    }

    @Override // x3.i
    public final boolean c(w wVar, long j10, n nVar) {
        byte[] bArr = wVar.a;
        FlacStreamMetadata flacStreamMetadata = this.n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.n = flacStreamMetadata2;
            nVar.b = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArr, 9, wVar.c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            v0 v0Var = this.o;
            if (v0Var != null) {
                v0Var.a = j10;
                nVar.c = v0Var;
            }
            ((t0) nVar.b).getClass();
            return false;
        }
        p b11 = j0.b(wVar);
        FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(b11);
        this.n = copyWithSeekTable;
        v0 v0Var2 = new v0();
        v0Var2.c = copyWithSeekTable;
        v0Var2.d = b11;
        v0Var2.a = -1L;
        v0Var2.b = -1L;
        this.o = v0Var2;
        return true;
    }

    @Override // x3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = null;
            this.o = null;
        }
    }
}
