// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zt6 extends b4 {
    public static final Parcelable.Creator<zt6> CREATOR = new jid(14);
    public String a;
    public String b;
    public int c;
    public String d;
    public yt6 e;
    public int f;
    public ArrayList h;
    public int n;
    public long r;
    public boolean s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.a)) {
                jSONObject.put("id", this.a);
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("entity", this.b);
            }
            switch (this.c) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("name", this.d);
            }
            yt6 yt6Var = this.e;
            if (yt6Var != null) {
                jSONObject.put("containerMetadata", yt6Var.b());
            }
            String b = rqe.b(Integer.valueOf(this.f));
            if (b != null) {
                jSONObject.put("repeatMode", b);
            }
            ArrayList arrayList = this.h;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    jSONArray.put(((au6) obj).c());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.n);
            long j = this.r;
            if (j != -1) {
                Pattern pattern = qe1.a;
                jSONObject.put("startTime", j / 1000.0d);
            }
            jSONObject.put("shuffle", this.s);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt6)) {
            return false;
        }
        zt6 zt6Var = (zt6) obj;
        return TextUtils.equals(this.a, zt6Var.a) && TextUtils.equals(this.b, zt6Var.b) && this.c == zt6Var.c && TextUtils.equals(this.d, zt6Var.d) && fse.a(this.e, zt6Var.e) && this.f == zt6Var.f && fse.a(this.h, zt6Var.h) && this.n == zt6Var.n && this.r == zt6Var.r && this.s == zt6Var.s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.h, Integer.valueOf(this.n), Long.valueOf(this.r), Boolean.valueOf(this.s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        int i2 = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i2);
        mve.l(parcel, 5, this.d);
        mve.k(parcel, 6, this.e, i);
        int i3 = this.f;
        mve.q(parcel, 7, 4);
        parcel.writeInt(i3);
        ArrayList arrayList = this.h;
        mve.p(parcel, 8, arrayList == null ? null : DesugarCollections.unmodifiableList(arrayList));
        int i4 = this.n;
        mve.q(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.r;
        mve.q(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.s;
        mve.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.s(parcel, r);
    }
}
