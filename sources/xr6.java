// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xr6 extends b4 {
    public static final Parcelable.Creator<xr6> CREATOR = new igd((byte) 12);
    public int a;
    public String b;
    public ArrayList c;
    public ArrayList d;
    public double e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.a;
            if (i == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("title", this.b);
            }
            ArrayList arrayList = this.c;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    jSONArray.put(((ir6) obj).d());
                }
                jSONObject.put("sections", jSONArray);
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                jSONObject.put("containerImages", b5d.b(this.d));
            }
            jSONObject.put("containerDuration", this.e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr6)) {
            return false;
        }
        xr6 xr6Var = (xr6) obj;
        return this.a == xr6Var.a && TextUtils.equals(this.b, xr6Var.b) && cqe.a(this.c, xr6Var.c) && cqe.a(this.d, xr6Var.d) && this.e == xr6Var.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 3, this.b);
        ArrayList arrayList = this.c;
        jte.p(parcel, 4, arrayList == null ? null : DesugarCollections.unmodifiableList(arrayList));
        ArrayList arrayList2 = this.d;
        jte.p(parcel, 5, arrayList2 != null ? DesugarCollections.unmodifiableList(arrayList2) : null);
        double d = this.e;
        jte.q(parcel, 6, 8);
        parcel.writeDouble(d);
        jte.s(parcel, r);
    }
}
