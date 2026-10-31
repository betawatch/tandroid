package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class jg extends o6.a {
    public static final Parcelable.Creator<jg> CREATOR = new dg(2);
    public final List a;
    public final float[] b;
    public final Bitmap c;
    public final List d;

    public jg(ArrayList arrayList, float[] fArr, Bitmap bitmap, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = fArr;
        this.c = bitmap;
        this.d = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.p(parcel, 1, this.a);
        float[] fArr = this.b;
        if (fArr != null) {
            int q10 = w7.h0.q(parcel, 2);
            parcel.writeFloatArray(fArr);
            w7.h0.r(parcel, q10);
        }
        w7.h0.k(parcel, 3, this.c, i10);
        List list = this.d;
        if (list != null) {
            int q11 = w7.h0.q(parcel, 4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(((Float) list.get(i11)).floatValue());
            }
            w7.h0.r(parcel, q11);
        }
        w7.h0.r(parcel, q6);
    }
}
