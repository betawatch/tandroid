package w5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.x1;
import j7.f5;
import java.util.Arrays;
import u6.p;

/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(12);
    public final d2 a;
    public byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final y7.a[] h;
    public final boolean n;
    public final x1 r;

    public c(d2 d2Var, x1 x1Var) {
        this.a = d2Var;
        this.r = x1Var;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.l(this.a, cVar.a) && Arrays.equals(this.b, cVar.b) && Arrays.equals(this.c, cVar.c) && Arrays.equals(this.d, cVar.d) && m.l(this.r, cVar.r) && m.l(null, null) && m.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f, cVar.f) && Arrays.equals(this.h, cVar.h) && this.n == cVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.r, null, null, this.e, this.f, this.h, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.r);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.n);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.a, i10);
        f5.c(parcel, 3, this.b);
        f5.g(parcel, 4, this.c);
        f5.m(parcel, 5, this.d);
        f5.g(parcel, 6, this.e);
        f5.d(parcel, 7, this.f);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        f5.o(parcel, 9, this.h, i10);
        f5.r(parcel, q10);
    }

    public c(d2 d2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z4, y7.a[] aVarArr) {
        this.a = d2Var;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.r = null;
        this.e = iArr2;
        this.f = bArr2;
        this.h = aVarArr;
        this.n = z4;
    }
}
