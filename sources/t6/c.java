package t6;

import a8.bf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = bf.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z11 = false;
        String str2 = null;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = bf.l(parcel, readInt, l6.c.CREATOR);
            } else if (c10 == 2) {
                z11 = bf.n(parcel, readInt);
            } else if (c10 == 3) {
                str2 = bf.h(parcel, readInt);
            } else if (c10 != 4) {
                bf.y(parcel, readInt);
            } else {
                str = bf.h(parcel, readInt);
            }
        }
        bf.m(parcel, z10);
        return new a(arrayList, z11, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
