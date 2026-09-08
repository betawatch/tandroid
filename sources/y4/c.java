package y4;

import a0.f;
import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // y4.b
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.j;
        if (i10 == this.f) {
            i10 = this.g;
        }
        return new c(parcel, dataPosition, i10, a4.a.s(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // y4.b
    public final boolean e(int i10) {
        while (this.j < this.g) {
            int i11 = this.k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i10;
    }

    @Override // y4.b
    public final void i(int i10) {
        int i11 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i10;
        this.g = i11;
        this.j = i10;
        this.h = str;
    }
}
