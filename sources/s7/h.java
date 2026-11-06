package s7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import q4.x;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(19);
    public final int a;
    public final Bundle b;

    public h(int i7, Bundle bundle) {
        this.a = i7;
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
            if (!bundle.containsKey(str) || !q6.m.k(bundle2.getString(str), bundle.getString(str))) {
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.b(parcel, 2, this.b);
        xb.s(parcel, r10);
    }
}
