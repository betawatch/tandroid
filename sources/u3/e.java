package u3;

import android.util.SparseArray;
import c3.b0;
import c3.c0;
import c3.d0;
import c3.j;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final j a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public e(SparseArray sparseArray, long j10, int i10, long j11, long j12) {
        j jVar;
        int i11;
        this.b = sparseArray;
        this.c = j10;
        this.d = i10;
        List list = (List) sparseArray.get(i10);
        if (list == null || list.isEmpty()) {
            jVar = null;
        } else {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                d dVar = (d) list.get(i13);
                jArr3[i13] = dVar.a;
                jArr[i13] = dVar.b;
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArr[i12] = (int) (jArr[i14] - jArr[i12]);
                jArr2[i12] = jArr3[i14] - jArr3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArr3[i15] >= j10) {
                i15--;
            }
            iArr[i15] = (int) ((j11 + j12) - jArr[i15]);
            jArr2[i15] = j10 - jArr3[i15];
            if (i15 < i11) {
                e2.a.l("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArr = Arrays.copyOf(iArr, i16);
                jArr = Arrays.copyOf(jArr, i16);
                jArr2 = Arrays.copyOf(jArr2, i16);
                jArr3 = Arrays.copyOf(jArr3, i16);
            }
            jVar = new j(iArr, jArr, jArr2, jArr3);
        }
        this.a = jVar;
    }

    @Override // c3.c0
    public final boolean d() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // c3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.c0
    public final b0 f(long j10) {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.f(j10);
        }
        d0 d0Var = d0.c;
        return new b0(d0Var, d0Var);
    }

    @Override // c3.c0
    public final long h() {
        return this.c;
    }
}
