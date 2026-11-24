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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yt6 extends b4 {
    public static final Parcelable.Creator<yt6> CREATOR = new jid((byte) 12);
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
                    jSONArray.put(((it6) obj).d());
                }
                jSONObject.put("sections", jSONArray);
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                jSONObject.put("containerImages", d7d.b(this.d));
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
        if (!(obj instanceof yt6)) {
            return false;
        }
        yt6 yt6Var = (yt6) obj;
        return this.a == yt6Var.a && TextUtils.equals(this.b, yt6Var.b) && fse.a(this.c, yt6Var.c) && fse.a(this.d, yt6Var.d) && this.e == yt6Var.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.l(parcel, 3, this.b);
        ArrayList arrayList = this.c;
        mve.p(parcel, 4, arrayList == null ? null : DesugarCollections.unmodifiableList(arrayList));
        ArrayList arrayList2 = this.d;
        mve.p(parcel, 5, arrayList2 != null ? DesugarCollections.unmodifiableList(arrayList2) : null);
        double d = this.e;
        mve.q(parcel, 6, 8);
        parcel.writeDouble(d);
        mve.s(parcel, r);
    }
}
