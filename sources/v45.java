// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class v45 {
    public final long a;
    public final List b;
    public final long c;

    public v45(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (i < jSONArray.length()) {
            u45 u45Var = new u45(jSONArray.getJSONObject(i));
            long j2 = u45Var.e;
            long j3 = j + j2;
            if (!((j2 ^ j) < 0) && !((j ^ j3) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(u45Var);
            i++;
            j = j3;
        }
        this.c = j;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String[] a() {
        List list = this.b;
        String[] strArr = new String[list.size() * 5];
        for (int i = 0; i < list.size(); i++) {
            u45 u45Var = (u45) list.get(i);
            int i2 = i * 5;
            strArr[i2] = u45Var.a;
            strArr[i2 + 1] = Long.toString(u45Var.e);
            strArr[i2 + 2] = u45Var.b;
            strArr[i2 + 3] = u45Var.c;
            strArr[i2 + 4] = u45Var.f ? "1" : "0";
        }
        return strArr;
    }
}
