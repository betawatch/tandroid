package x3;

import android.util.SparseArray;
import f3.b0;
import f3.c0;
import f3.d0;
import f3.j;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d implements c0 {
    public final j a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public d(SparseArray sparseArray, long j3, int i7, long j10, long j11) {
        j jVar;
        int i10;
        this.b = sparseArray;
        this.c = j3;
        this.d = i7;
        List list = (List) sparseArray.get(i7);
        if (list == null || list.isEmpty()) {
            jVar = null;
        } else {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = (c) list.get(i12);
                jArr3[i12] = cVar.a;
                jArr[i12] = cVar.b;
            }
            while (true) {
                i10 = size - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArr[i11] = (int) (jArr[i13] - jArr[i11]);
                jArr2[i11] = jArr3[i13] - jArr3[i11];
                i11 = i13;
            }
            int i14 = i10;
            while (i14 > 0 && jArr3[i14] >= j3) {
                i14--;
            }
            iArr[i14] = (int) ((j10 + j11) - jArr[i14]);
            jArr2[i14] = j3 - jArr3[i14];
            if (i14 < i10) {
                h2.a.l("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i15 = i14 + 1;
                iArr = Arrays.copyOf(iArr, i15);
                jArr = Arrays.copyOf(jArr, i15);
                jArr2 = Arrays.copyOf(jArr2, i15);
                jArr3 = Arrays.copyOf(jArr3, i15);
            }
            jVar = new j(iArr, jArr, jArr2, jArr3);
        }
        this.a = jVar;
    }

    @Override // f3.c0
    public final boolean d() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // f3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.f(j3);
        }
        d0 d0Var = d0.c;
        return new b0(d0Var, d0Var);
    }

    @Override // f3.c0
    public final long h() {
        return this.c;
    }
}
