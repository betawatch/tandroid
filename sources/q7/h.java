package q7;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import n4.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(27);
    public final int a;
    public final Bundle b;

    public h(int i10, Bundle bundle) {
        this.a = i10;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        Bundle bundle = hVar.b;
        if (this.a != hVar.a) {
            return false;
        }
        Bundle bundle2 = this.b;
        if (bundle2 == null) {
            return bundle == null;
        }
        if (bundle == null || bundle2.size() != bundle.size()) {
            return false;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str) || !o6.l.l(bundle2.getString(str), bundle.getString(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = bundle.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.b(parcel, 2, this.b);
        df.r(parcel, q5);
    }
}
