package r5;

import aa.d;
import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q5.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static final b a = new b("MetadataUtils", null);
    public static final String[] b;
    public static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Calendar a(String str) {
        String substring;
        String substring2;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        b bVar = a;
        if (isEmpty) {
            bVar.b("Input string is empty or null", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            bVar.b("Input string is empty or null", new Object[0]);
        } else {
            try {
                substring = str.substring(0, 8);
            } catch (IndexOutOfBoundsException e10) {
                Log.e(bVar.a, bVar.d("Error extracting the date", new Object[0]), e10);
            }
            if (!TextUtils.isEmpty(substring)) {
                bVar.b("Invalid date format", new Object[0]);
                return null;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    bVar.b("string is empty or null", new Object[0]);
                } else {
                    int indexOf = str.indexOf(84);
                    int i9 = indexOf + 1;
                    if (indexOf == 8) {
                        try {
                            substring2 = str.substring(i9);
                            if (substring2.length() != 6) {
                                char charAt = substring2.charAt(6);
                                String[] strArr = b;
                                if (charAt == '+' || charAt == '-') {
                                    int length = substring2.length();
                                    if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                                        substring2 = substring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                                    }
                                } else if (charAt == 'Z' && substring2.length() == strArr[0].length() + 6) {
                                    substring2 = String.valueOf(substring2.substring(0, substring2.length() - 1)).concat("+0000");
                                }
                            }
                        } catch (IndexOutOfBoundsException e11) {
                            Log.e(bVar.a, bVar.d("Error extracting the time substring: %s", new Object[0]), e11);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            substring = d.z(substring, "T", substring2);
                            str2 = substring2.length() == 6 ? "yyyyMMdd'T'HHmmss" : c;
                        } else {
                            str2 = "yyyyMMdd";
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new SimpleDateFormat(str2).parse(substring));
                        return calendar;
                    }
                    bVar.b("T delimeter is not found", new Object[0]);
                }
                calendar.setTime(new SimpleDateFormat(str2).parse(substring));
                return calendar;
            } catch (ParseException e12) {
                Log.e(bVar.a, bVar.d("Error parsing string", new Object[0]), e12);
                return null;
            }
            substring2 = null;
            if (TextUtils.isEmpty(substring2)) {
            }
            Calendar calendar2 = Calendar.getInstance();
        }
        substring = null;
        if (!TextUtils.isEmpty(substring)) {
        }
    }

    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w5.a aVar = (w5.a) it.next();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVar.b.toString());
                jSONObject.put("width", aVar.c);
                jSONObject.put("height", aVar.d);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                try {
                    list.add(new w5.a(jSONArray.getJSONObject(i9)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
