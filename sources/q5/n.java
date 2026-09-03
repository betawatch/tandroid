package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import k7.e8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n extends c6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String a;
    public String b;
    public int c;
    public String d;
    public m e;
    public int f;
    public List h;
    public int n;
    public long r;
    public boolean s;

    public final JSONObject e() {
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
            m mVar = this.e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.e());
            }
            String b10 = e8.b(Integer.valueOf(this.f));
            if (b10 != null) {
                jSONObject.put("repeatMode", b10);
            }
            List list = this.h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((o) it.next()).f());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.n);
            long j10 = this.r;
            if (j10 != -1) {
                Pattern pattern = u5.a.a;
                jSONObject.put("startTime", j10 / 1000.0d);
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
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return TextUtils.equals(this.a, nVar.a) && TextUtils.equals(this.b, nVar.b) && this.c == nVar.c && TextUtils.equals(this.d, nVar.d) && b6.m.l(this.e, nVar.e) && this.f == nVar.f && b6.m.l(this.h, nVar.h) && this.n == nVar.n && this.r == nVar.r && this.s == nVar.s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.h, Integer.valueOf(this.n), Long.valueOf(this.r), Boolean.valueOf(this.s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        int i11 = this.c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 5, this.d);
        f5.k(parcel, 6, this.e, i10);
        int i12 = this.f;
        f5.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        f5.p(parcel, 8, list == null ? null : DesugarCollections.unmodifiableList(list));
        int i13 = this.n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.r;
        f5.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z4 = this.s;
        f5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.r(parcel, q10);
    }
}
