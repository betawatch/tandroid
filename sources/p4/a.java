package p4;

import android.net.Uri;
import h5.d0;
import j3.g;
import java.util.Arrays;
import org.telegram.ui.cl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements g {
    public static final String B;
    public static final String C;
    public static final cl0 D;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f;
    public final long h;
    public final boolean n;

    static {
        int i10 = d0.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = Integer.toString(7, 36);
        D = new cl0(14);
    }

    public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z4) {
        h5.a.f(iArr.length == uriArr.length);
        this.a = j10;
        this.b = i10;
        this.c = i11;
        this.e = iArr;
        this.d = uriArr;
        this.f = jArr;
        this.h = j11;
        this.n = z4;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i12 >= iArr.length || this.n || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && this.h == aVar.h && this.n == aVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.b * 31) + this.c) * 31;
        long j10 = this.a;
        int hashCode = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31;
        long j11 = this.h;
        return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.n ? 1 : 0);
    }
}
