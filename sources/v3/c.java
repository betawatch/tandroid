package v3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d5.y;
import g7.r;
import g7.s;
import h3.t0;
import j4.v0;
import java.util.Arrays;
import m3.p;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends i {
    public FlacStreamMetadata n;
    public v0 o;

    @Override // v3.i
    public final long b(y yVar) {
        byte[] bArr = yVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i9 = (bArr[2] & 255) >> 4;
        if (i9 == 6 || i9 == 7) {
            yVar.D(4);
            yVar.x();
        }
        int b10 = r.b(i9, yVar);
        yVar.C(0);
        return b10;
    }

    @Override // v3.i
    public final boolean c(y yVar, long j10, e3 e3Var) {
        byte[] bArr = yVar.a;
        FlacStreamMetadata flacStreamMetadata = this.n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.n = flacStreamMetadata2;
            e3Var.b = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArr, 9, yVar.c), null);
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
                e3Var.c = v0Var;
            }
            ((t0) e3Var.b).getClass();
            return false;
        }
        p b11 = s.b(yVar);
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

    @Override // v3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.n = null;
            this.o = null;
        }
    }
}
