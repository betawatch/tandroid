// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xac extends b4 {
    public static final Parcelable.Creator<xac> CREATOR = new lbd((byte) 22);
    public final ArrayList a;

    public xac(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final JSONArray b() {
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.a;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    yac yacVar = (yac) arrayList.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) yacVar.c);
                    jSONArray2.put((int) yacVar.b);
                    jSONArray2.put((int) yacVar.c);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            rjb.k("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xac)) {
            return false;
        }
        ArrayList arrayList = ((xac) obj).a;
        ArrayList arrayList2 = this.a;
        return arrayList2 == null ? arrayList == null : arrayList != null && arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2);
    }

    public final int hashCode() {
        ArrayList arrayList = this.a;
        return Arrays.hashCode(new Object[]{arrayList == null ? null : new HashSet(arrayList)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.p(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
