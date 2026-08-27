package v3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d5.z;
import h3.t0;
import h7.r;
import h7.s;
import j4.u0;
import java.util.Arrays;
import m3.p;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends i {
    public FlacStreamMetadata n;
    public u0 o;

    @Override // v3.i
    public final long b(z zVar) {
        byte[] bArr = zVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            zVar.D(4);
            zVar.x();
        }
        int b10 = r.b(i10, zVar);
        zVar.C(0);
        return b10;
    }

    @Override // v3.i
    public final boolean c(z zVar, long j10, i6 i6Var) {
        byte[] bArr = zVar.a;
        FlacStreamMetadata flacStreamMetadata = this.n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.n = flacStreamMetadata2;
            i6Var.b = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArr, 9, zVar.c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) != 3) {
            if (b10 != -1) {
                return true;
            }
            u0 u0Var = this.o;
            if (u0Var != null) {
                u0Var.a = j10;
                i6Var.c = u0Var;
            }
            ((t0) i6Var.b).getClass();
            return false;
        }
        p b11 = s.b(zVar);
        FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(b11);
        this.n = copyWithSeekTable;
        u0 u0Var2 = new u0();
        u0Var2.c = copyWithSeekTable;
        u0Var2.d = b11;
        u0Var2.a = -1L;
        u0Var2.b = -1L;
        this.o = u0Var2;
        return true;
    }

    @Override // v3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = null;
            this.o = null;
        }
    }
}
