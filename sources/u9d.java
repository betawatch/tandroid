// default package

import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class u9d {
    public static final he6 a = new he6("MetadataUtils", null);
    public static final String[] b;
    public static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Calendar a(String str) {
        String substring;
        String substring2;
        String str2;
        boolean isEmpty = TextUtils.isEmpty(str);
        he6 he6Var = a;
        if (isEmpty) {
            he6Var.b("Input string is empty or null", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            he6Var.b("Input string is empty or null", new Object[0]);
        } else {
            try {
                substring = str.substring(0, 8);
            } catch (IndexOutOfBoundsException e) {
                Log.e(he6Var.a, he6Var.d("Error extracting the date", new Object[0]), e);
            }
            if (!TextUtils.isEmpty(substring)) {
                he6Var.b("Invalid date format", new Object[0]);
                return null;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    he6Var.b("string is empty or null", new Object[0]);
                } else {
                    int indexOf = str.indexOf(84);
                    int i = indexOf + 1;
                    if (indexOf == 8) {
                        try {
                            substring2 = str.substring(i);
                            if (substring2.length() != 6) {
                                char charAt = substring2.charAt(6);
                                String[] strArr = b;
                                if (charAt == '+' || charAt == '-') {
                                    int length = substring2.length();
                                    if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                                        substring2 = substring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                                    }
                                } else if (charAt == 'Z' && substring2.length() == strArr[0].length() + 6) {
                                    substring2 = substring2.substring(0, substring2.length() - 1).concat("+0000");
                                }
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            Log.e(he6Var.a, he6Var.d("Error extracting the time substring: %s", new Object[0]), e2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            substring = qd4.p(substring, "T", substring2);
                            str2 = substring2.length() == 6 ? "yyyyMMdd'T'HHmmss" : c;
                        } else {
                            str2 = "yyyyMMdd";
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new SimpleDateFormat(str2).parse(substring));
                        return calendar;
                    }
                    he6Var.b("T delimeter is not found", new Object[0]);
                }
                calendar.setTime(new SimpleDateFormat(str2).parse(substring));
                return calendar;
            } catch (ParseException e3) {
                Log.e(he6Var.a, he6Var.d("Error parsing string", new Object[0]), e3);
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

    public static JSONArray b(ArrayList arrayList) {
        arrayList.getClass();
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kxc kxcVar = (kxc) obj;
            kxcVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", kxcVar.b.toString());
                jSONObject.put("width", kxcVar.c);
                jSONObject.put("height", kxcVar.d);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(ArrayList arrayList, JSONArray jSONArray) {
        try {
            arrayList.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(new kxc(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
