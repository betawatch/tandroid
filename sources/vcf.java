// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vcf extends b4 {
    public static final Parcelable.Creator<vcf> CREATOR = new xff((byte) 1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static vcf b(xl3 xl3Var) {
        vcf vcfVar = new vcf();
        pc0 pc0Var = (pc0) xl3Var.b;
        vcfVar.a = pc0Var.a;
        vcfVar.b = pc0Var.b;
        vcfVar.e = pc0Var.c;
        vcfVar.c = 0;
        vcfVar.d = 0L;
        return vcfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i4);
        long j = this.d;
        jte.q(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(i5);
        jte.s(parcel, r);
    }
}
