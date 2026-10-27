package t6;

import a8.bf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
