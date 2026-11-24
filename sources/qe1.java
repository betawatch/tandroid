// default package

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qe1 {
    public static final Pattern a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    public static final Random b = new Random(SystemClock.elapsedRealtime());

    public static String a(String str, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            u36.j("Namespace cannot be null or empty");
            return;
        }
        if (str.length() > 128) {
            u36.j("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            u36.j("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else {
            if (str.length() != 11) {
                return;
            }
            u36.j("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    public static ArrayList c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            i = td4.g(iArr[i], i, 1, arrayList);
        }
        return arrayList;
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj2 != null && obj.equals(obj2);
    }

    public static int[] e(AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }
}
