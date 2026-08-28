package s5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.internal.clearcut.y1;
import g7.p8;
import java.util.Arrays;
import q7.j;
import x5.l;

/* loaded from: classes.dex */
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new j(8);
    public final e2 a;
    public byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final u7.a[] h;
    public final boolean n;
    public final y1 r;

    public c(e2 e2Var, y1 y1Var) {
        this.a = e2Var;
        this.r = y1Var;
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
            if (l.l(this.a, cVar.a) && Arrays.equals(this.b, cVar.b) && Arrays.equals(this.c, cVar.c) && Arrays.equals(this.d, cVar.d) && l.l(this.r, cVar.r) && l.l(null, null) && l.l(null, null) && Arrays.equals(this.e, cVar.e) && Arrays.deepEquals(this.f, cVar.f) && Arrays.equals(this.h, cVar.h) && this.n == cVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.r, null, null, this.e, this.f, this.h, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb2.append(bArr == null ? null : new String(bArr));
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.d));
        sb2.append(", LogEvent: ");
        sb2.append(this.r);
        sb2.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb2.append(Arrays.toString(this.e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.n);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.a, i9);
        p8.c(parcel, 3, this.b);
        p8.g(parcel, 4, this.c);
        p8.m(parcel, 5, this.d);
        p8.g(parcel, 6, this.e);
        p8.d(parcel, 7, this.f);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        p8.o(parcel, 9, this.h, i9);
        p8.r(parcel, q10);
    }

    public c(e2 e2Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, u7.a[] aVarArr) {
        this.a = e2Var;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.r = null;
        this.e = iArr2;
        this.f = bArr2;
        this.h = aVarArr;
        this.n = z10;
    }
}
