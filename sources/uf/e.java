package uf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e extends b {
    public long[] l;
    public long[][] m;
    public int n;

    public e(b bVar, long j10) {
        this.d = new ArrayList();
        this.e = 0L;
        this.f = Long.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0;
        this.j = 0;
        int binarySearch = Arrays.binarySearch(bVar.a, j10);
        int i10 = binarySearch - 4;
        int i11 = binarySearch + 4;
        if (i10 < 0) {
            i11 += -i10;
            i10 = 0;
        }
        long[] jArr = bVar.a;
        if (i11 > jArr.length - 1) {
            i10 -= i11 - jArr.length;
            i11 = jArr.length - 1;
        }
        i10 = i10 < 0 ? 0 : i10;
        int i12 = (i11 - i10) + 1;
        this.a = new long[i12];
        this.b = new float[i12];
        this.d = new ArrayList();
        for (int i13 = 0; i13 < bVar.d.size(); i13++) {
            a aVar = new a();
            aVar.a = new long[i12];
            aVar.c = ((a) bVar.d.get(i13)).c;
            aVar.d = ((a) bVar.d.get(i13)).d;
            aVar.g = ((a) bVar.d.get(i13)).g;
            aVar.h = ((a) bVar.d.get(i13)).h;
            aVar.i = ((a) bVar.d.get(i13)).i;
            this.d.add(aVar);
        }
        int i14 = 0;
        while (i10 <= i11) {
            this.a[i14] = bVar.a[i10];
            for (int i15 = 0; i15 < this.d.size(); i15++) {
                ((a) this.d.get(i15)).a[i14] = ((a) bVar.d.get(i15)).a[i10];
            }
            i14++;
            i10++;
        }
        this.k = 86400000L;
        e();
    }

    @Override // uf.b
    public final void e() {
        super.e();
        this.n = 0;
        int length = this.b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i10 = length / max;
        this.m = (long[][]) Array.newInstance((Class<?>) Long.TYPE, size, i10);
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                long j10 = ((a) this.d.get(i12)).a[i11];
                if (j10 > jArr[i12]) {
                    jArr[i12] = j10;
                }
            }
            if (i11 % max == 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    this.m[i13][this.n] = jArr[i13];
                    jArr[i13] = 0;
                }
                int i14 = this.n + 1;
                this.n = i14;
                if (i14 >= i10) {
                    return;
                }
            }
        }
    }
}
