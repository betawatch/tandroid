package org.telegram.utils.twidget;

import android.icu.text.Collator;
import android.icu.text.DateFormat;
import android.icu.text.ListFormatter;
import android.icu.text.NumberFormat;
import android.icu.text.PluralRules;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.Currency;
import android.icu.util.TimeZone;
import android.os.Build;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class u {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static DateFormat a(JSONObject jSONObject, String str, Locale locale) {
        boolean z10;
        int i10;
        boolean z11;
        String optString = jSONObject.optString("dateStyle");
        optString.getClass();
        int i11 = 2;
        boolean z12 = true;
        switch (optString.hashCode()) {
            case -1078030475:
                if (optString.equals("medium")) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case 3154575:
                if (optString.equals("full")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case 3327612:
                if (optString.equals("long")) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case 109413500:
                if (optString.equals("short")) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        switch (z10) {
            case false:
                i10 = 2;
                break;
            case true:
                i10 = 0;
                break;
            case true:
                i10 = 1;
                break;
            case true:
                i10 = 3;
                break;
            default:
                i10 = -1;
                break;
        }
        String optString2 = jSONObject.optString("timeStyle");
        optString2.getClass();
        switch (optString2.hashCode()) {
            case -1078030475:
                if (optString2.equals("medium")) {
                    z11 = false;
                    break;
                }
                z11 = -1;
                break;
            case 3154575:
                if (optString2.equals("full")) {
                    z11 = true;
                    break;
                }
                z11 = -1;
                break;
            case 3327612:
                if (optString2.equals("long")) {
                    z11 = 2;
                    break;
                }
                z11 = -1;
                break;
            case 109413500:
                if (optString2.equals("short")) {
                    z11 = 3;
                    break;
                }
                z11 = -1;
                break;
            default:
                z11 = -1;
                break;
        }
        switch (z11) {
            case false:
                break;
            case true:
                i11 = 0;
                break;
            case true:
                i11 = 1;
                break;
            case true:
                i11 = 3;
                break;
            default:
                i11 = -1;
                break;
        }
        DateFormat dateInstance = (i10 < 0 || i11 < 0) ? i10 >= 0 ? DateFormat.getDateInstance(i10, locale) : i11 >= 0 ? DateFormat.getTimeInstance(i11, locale) : null : DateFormat.getDateTimeInstance(i10, i11, locale);
        if (dateInstance == null) {
            StringBuilder sb2 = new StringBuilder();
            String optString3 = jSONObject.optString("era");
            if (!optString3.isEmpty()) {
                sb2.append(optString3.equals("long") ? "GGGG" : optString3.equals("narrow") ? "GGGGG" : "G");
            }
            String optString4 = jSONObject.optString("year");
            if (!optString4.isEmpty()) {
                sb2.append(optString4.equals("2-digit") ? "yy" : "y");
            }
            String optString5 = jSONObject.optString("month");
            if (!optString5.isEmpty()) {
                sb2.append(optString5.equals("long") ? "MMMM" : optString5.equals("short") ? "MMM" : optString5.equals("narrow") ? "MMMMM" : optString5.equals("2-digit") ? "MM" : "M");
            }
            String optString6 = jSONObject.optString("weekday");
            if (!optString6.isEmpty()) {
                sb2.append(optString6.equals("long") ? "EEEE" : optString6.equals("narrow") ? "EEEEE" : "EEE");
            }
            String optString7 = jSONObject.optString("day");
            if (!optString7.isEmpty()) {
                sb2.append(optString7.equals("2-digit") ? "dd" : "d");
            }
            String optString8 = jSONObject.optString("hour");
            if (!optString8.isEmpty()) {
                sb2.append(c(jSONObject, optString8.equals("2-digit")));
            }
            if (jSONObject.has("minute")) {
                sb2.append("mm");
            }
            if (jSONObject.has("second")) {
                sb2.append("ss");
            }
            if (sb2.length() == 0) {
                boolean equals = str.equals("toLocaleTimeString");
                if (!str.equals("toLocaleTimeString") && !str.equals("toLocaleString")) {
                    z12 = false;
                }
                if (!equals) {
                    sb2.append("yMd");
                }
                if (z12) {
                    sb2.append(c(jSONObject, false));
                    sb2.append("mmss");
                }
            }
            String optString9 = jSONObject.optString("timeZoneName");
            if (!optString9.isEmpty()) {
                sb2.append(optString9.equals("long") ? "zzzz" : "z");
            }
            dateInstance = DateFormat.getInstanceForSkeleton(sb2.toString(), locale);
        }
        String optString10 = jSONObject.optString("timeZone");
        if (!optString10.isEmpty()) {
            dateInstance.setTimeZone(TimeZone.getTimeZone(optString10));
        }
        return dateInstance;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
    
        if (r13.equals("date") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d6, code lost:
    
        if (r2.equals("day") == false) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x01da. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0281 A[Catch: Exception -> 0x02a7, TryCatch #1 {Exception -> 0x02a7, blocks: (B:6:0x0016, B:8:0x0025, B:9:0x002a, B:11:0x0035, B:12:0x0044, B:14:0x004a, B:15:0x0053, B:16:0x0067, B:18:0x006c, B:20:0x0074, B:22:0x0091, B:25:0x00fa, B:27:0x009a, B:29:0x00a2, B:31:0x00ab, B:33:0x00b3, B:35:0x00bc, B:40:0x00ca, B:42:0x00d5, B:44:0x00db, B:46:0x00e9, B:48:0x00f2, B:50:0x010f, B:52:0x0117, B:54:0x0126, B:55:0x012f, B:58:0x013f, B:60:0x0145, B:61:0x0187, B:65:0x019d, B:67:0x01a3, B:75:0x01de, B:78:0x01ef, B:79:0x0203, B:81:0x01f6, B:84:0x01ff, B:85:0x01e1, B:86:0x01e4, B:87:0x01e7, B:99:0x020a, B:101:0x0212, B:102:0x021b, B:104:0x0217, B:105:0x014a, B:107:0x0150, B:108:0x0155, B:110:0x015b, B:111:0x015e, B:113:0x0166, B:114:0x016b, B:116:0x0171, B:117:0x0176, B:119:0x017e, B:120:0x0183, B:121:0x0220, B:123:0x0228, B:125:0x0231, B:127:0x0239, B:132:0x0277, B:133:0x027b, B:135:0x0281, B:136:0x0288, B:138:0x028e, B:139:0x0295, B:141:0x029b, B:142:0x02a2, B:144:0x024e, B:146:0x0254, B:152:0x026a, B:154:0x0272, B:155:0x004f, B:156:0x0038, B:158:0x003c), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028e A[Catch: Exception -> 0x02a7, TryCatch #1 {Exception -> 0x02a7, blocks: (B:6:0x0016, B:8:0x0025, B:9:0x002a, B:11:0x0035, B:12:0x0044, B:14:0x004a, B:15:0x0053, B:16:0x0067, B:18:0x006c, B:20:0x0074, B:22:0x0091, B:25:0x00fa, B:27:0x009a, B:29:0x00a2, B:31:0x00ab, B:33:0x00b3, B:35:0x00bc, B:40:0x00ca, B:42:0x00d5, B:44:0x00db, B:46:0x00e9, B:48:0x00f2, B:50:0x010f, B:52:0x0117, B:54:0x0126, B:55:0x012f, B:58:0x013f, B:60:0x0145, B:61:0x0187, B:65:0x019d, B:67:0x01a3, B:75:0x01de, B:78:0x01ef, B:79:0x0203, B:81:0x01f6, B:84:0x01ff, B:85:0x01e1, B:86:0x01e4, B:87:0x01e7, B:99:0x020a, B:101:0x0212, B:102:0x021b, B:104:0x0217, B:105:0x014a, B:107:0x0150, B:108:0x0155, B:110:0x015b, B:111:0x015e, B:113:0x0166, B:114:0x016b, B:116:0x0171, B:117:0x0176, B:119:0x017e, B:120:0x0183, B:121:0x0220, B:123:0x0228, B:125:0x0231, B:127:0x0239, B:132:0x0277, B:133:0x027b, B:135:0x0281, B:136:0x0288, B:138:0x028e, B:139:0x0295, B:141:0x029b, B:142:0x02a2, B:144:0x024e, B:146:0x0254, B:152:0x026a, B:154:0x0272, B:155:0x004f, B:156:0x0038, B:158:0x003c), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029b A[Catch: Exception -> 0x02a7, TryCatch #1 {Exception -> 0x02a7, blocks: (B:6:0x0016, B:8:0x0025, B:9:0x002a, B:11:0x0035, B:12:0x0044, B:14:0x004a, B:15:0x0053, B:16:0x0067, B:18:0x006c, B:20:0x0074, B:22:0x0091, B:25:0x00fa, B:27:0x009a, B:29:0x00a2, B:31:0x00ab, B:33:0x00b3, B:35:0x00bc, B:40:0x00ca, B:42:0x00d5, B:44:0x00db, B:46:0x00e9, B:48:0x00f2, B:50:0x010f, B:52:0x0117, B:54:0x0126, B:55:0x012f, B:58:0x013f, B:60:0x0145, B:61:0x0187, B:65:0x019d, B:67:0x01a3, B:75:0x01de, B:78:0x01ef, B:79:0x0203, B:81:0x01f6, B:84:0x01ff, B:85:0x01e1, B:86:0x01e4, B:87:0x01e7, B:99:0x020a, B:101:0x0212, B:102:0x021b, B:104:0x0217, B:105:0x014a, B:107:0x0150, B:108:0x0155, B:110:0x015b, B:111:0x015e, B:113:0x0166, B:114:0x016b, B:116:0x0171, B:117:0x0176, B:119:0x017e, B:120:0x0183, B:121:0x0220, B:123:0x0228, B:125:0x0231, B:127:0x0239, B:132:0x0277, B:133:0x027b, B:135:0x0281, B:136:0x0288, B:138:0x028e, B:139:0x0295, B:141:0x029b, B:142:0x02a2, B:144:0x024e, B:146:0x0254, B:152:0x026a, B:154:0x0272, B:155:0x004f, B:156:0x0038, B:158:0x003c), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ef A[Catch: Exception -> 0x02a7, TryCatch #1 {Exception -> 0x02a7, blocks: (B:6:0x0016, B:8:0x0025, B:9:0x002a, B:11:0x0035, B:12:0x0044, B:14:0x004a, B:15:0x0053, B:16:0x0067, B:18:0x006c, B:20:0x0074, B:22:0x0091, B:25:0x00fa, B:27:0x009a, B:29:0x00a2, B:31:0x00ab, B:33:0x00b3, B:35:0x00bc, B:40:0x00ca, B:42:0x00d5, B:44:0x00db, B:46:0x00e9, B:48:0x00f2, B:50:0x010f, B:52:0x0117, B:54:0x0126, B:55:0x012f, B:58:0x013f, B:60:0x0145, B:61:0x0187, B:65:0x019d, B:67:0x01a3, B:75:0x01de, B:78:0x01ef, B:79:0x0203, B:81:0x01f6, B:84:0x01ff, B:85:0x01e1, B:86:0x01e4, B:87:0x01e7, B:99:0x020a, B:101:0x0212, B:102:0x021b, B:104:0x0217, B:105:0x014a, B:107:0x0150, B:108:0x0155, B:110:0x015b, B:111:0x015e, B:113:0x0166, B:114:0x016b, B:116:0x0171, B:117:0x0176, B:119:0x017e, B:120:0x0183, B:121:0x0220, B:123:0x0228, B:125:0x0231, B:127:0x0239, B:132:0x0277, B:133:0x027b, B:135:0x0281, B:136:0x0288, B:138:0x028e, B:139:0x0295, B:141:0x029b, B:142:0x02a2, B:144:0x024e, B:146:0x0254, B:152:0x026a, B:154:0x0272, B:155:0x004f, B:156:0x0038, B:158:0x003c), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str) {
        NumberFormat percentInstance;
        RelativeDateTimeFormatter.RelativeUnit relativeUnit;
        String str2;
        RelativeDateTimeFormatter.AbsoluteUnit absoluteUnit;
        RelativeDateTimeFormatter.Direction direction;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("opts");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                Object opt = jSONObject.opt("locale");
                int i11 = 0;
                String optString = opt instanceof String ? (String) opt : opt instanceof JSONArray ? ((JSONArray) opt).optString(0, "") : "";
                Locale locale = optString.isEmpty() ? Locale.getDefault() : Locale.forLanguageTag(optString);
                double optDouble = jSONObject.optDouble("value", 0.0d);
                String optString2 = jSONObject.optString("kind");
                switch (optString2.hashCode()) {
                    case -1034364087:
                        if (optString2.equals("number")) {
                            String optString3 = optJSONObject.optString("style");
                            int hashCode = optString3.hashCode();
                            if (hashCode != -678927291) {
                                if (hashCode == 575402001 && optString3.equals("currency")) {
                                    percentInstance = NumberFormat.getCurrencyInstance(locale);
                                    String optString4 = optJSONObject.optString("currency");
                                    if (!optString4.isEmpty()) {
                                        try {
                                            percentInstance.setCurrency(Currency.getInstance(optString4));
                                        } catch (Exception unused) {
                                        }
                                    }
                                    if (optJSONObject.has("minimumFractionDigits")) {
                                        percentInstance.setMinimumFractionDigits(optJSONObject.optInt("minimumFractionDigits"));
                                    }
                                    if (optJSONObject.has("maximumFractionDigits")) {
                                        percentInstance.setMaximumFractionDigits(optJSONObject.optInt("maximumFractionDigits"));
                                    }
                                    if (optJSONObject.has("useGrouping")) {
                                        percentInstance.setGroupingUsed(optJSONObject.optBoolean("useGrouping"));
                                    }
                                    return percentInstance.format(optDouble);
                                }
                            } else if (optString3.equals("percent")) {
                                percentInstance = NumberFormat.getPercentInstance(locale);
                                if (optJSONObject.has("minimumFractionDigits")) {
                                }
                                if (optJSONObject.has("maximumFractionDigits")) {
                                }
                                if (optJSONObject.has("useGrouping")) {
                                }
                                return percentInstance.format(optDouble);
                            }
                            percentInstance = NumberFormat.getNumberInstance(locale);
                            if (optJSONObject.has("minimumFractionDigits")) {
                            }
                            if (optJSONObject.has("maximumFractionDigits")) {
                            }
                            if (optJSONObject.has("useGrouping")) {
                            }
                            return percentInstance.format(optDouble);
                        }
                        break;
                    case -985163900:
                        if (optString2.equals("plural")) {
                            return PluralRules.forLocale(locale).select(optDouble);
                        }
                        break;
                    case -554435892:
                        if (optString2.equals("relative")) {
                            String optString5 = jSONObject.optString("unit", "second");
                            if (optString5.endsWith("s")) {
                                optString5 = optString5.substring(0, optString5.length() - 1);
                            }
                            switch (optString5.hashCode()) {
                                case -1074026988:
                                    if (optString5.equals("minute")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MINUTES;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 99228:
                                    if (optString5.equals("day")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.DAYS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 3208676:
                                    if (optString5.equals("hour")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.HOURS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 3645428:
                                    if (optString5.equals("week")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.WEEKS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 3704893:
                                    if (optString5.equals("year")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.YEARS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 104080000:
                                    if (optString5.equals("month")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MONTHS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                default:
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                            }
                            RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(locale);
                            if (optJSONObject.optString("numeric").equals("auto")) {
                                if (optDouble != 0.0d || !optString5.equals("second")) {
                                    switch (optString5.hashCode()) {
                                        case 99228:
                                            break;
                                        case 3645428:
                                            if (optString5.equals("week")) {
                                                i11 = 1;
                                                break;
                                            }
                                            i11 = -1;
                                            break;
                                        case 3704893:
                                            if (optString5.equals("year")) {
                                                i11 = 2;
                                                break;
                                            }
                                            i11 = -1;
                                            break;
                                        case 104080000:
                                            if (optString5.equals("month")) {
                                                i11 = 3;
                                                break;
                                            }
                                            i11 = -1;
                                            break;
                                        default:
                                            i11 = -1;
                                            break;
                                    }
                                    str2 = null;
                                    switch (i11) {
                                        case 0:
                                            absoluteUnit = RelativeDateTimeFormatter.AbsoluteUnit.DAY;
                                            if (optDouble != -1.0d) {
                                                direction = RelativeDateTimeFormatter.Direction.LAST;
                                            } else if (optDouble == 0.0d) {
                                                direction = RelativeDateTimeFormatter.Direction.THIS;
                                            } else if (optDouble == 1.0d) {
                                                direction = RelativeDateTimeFormatter.Direction.NEXT;
                                            }
                                            str2 = relativeDateTimeFormatter.format(direction, absoluteUnit);
                                            break;
                                        case 1:
                                            absoluteUnit = RelativeDateTimeFormatter.AbsoluteUnit.WEEK;
                                            if (optDouble != -1.0d) {
                                            }
                                            str2 = relativeDateTimeFormatter.format(direction, absoluteUnit);
                                            break;
                                        case 2:
                                            absoluteUnit = RelativeDateTimeFormatter.AbsoluteUnit.YEAR;
                                            if (optDouble != -1.0d) {
                                            }
                                            str2 = relativeDateTimeFormatter.format(direction, absoluteUnit);
                                            break;
                                        case 3:
                                            absoluteUnit = RelativeDateTimeFormatter.AbsoluteUnit.MONTH;
                                            if (optDouble != -1.0d) {
                                            }
                                            str2 = relativeDateTimeFormatter.format(direction, absoluteUnit);
                                            break;
                                    }
                                } else {
                                    str2 = relativeDateTimeFormatter.format(RelativeDateTimeFormatter.Direction.PLAIN, RelativeDateTimeFormatter.AbsoluteUnit.NOW);
                                }
                                if (str2 != null) {
                                    return str2;
                                }
                            }
                            return relativeDateTimeFormatter.format(Math.abs(optDouble), optDouble < 0.0d ? RelativeDateTimeFormatter.Direction.LAST : RelativeDateTimeFormatter.Direction.NEXT, relativeUnit);
                        }
                        break;
                    case 3076014:
                        break;
                    case 3322014:
                        if (optString2.equals("list") && i10 >= 26) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            if (optJSONArray != null) {
                                while (i11 < optJSONArray.length()) {
                                    arrayList.add(String.valueOf(optJSONArray.opt(i11)));
                                    i11++;
                                }
                            }
                            return ListFormatter.getInstance(locale).format(arrayList);
                        }
                        break;
                    case 103164673:
                        if (optString2.equals("lower")) {
                            return jSONObject.optString("value").toLowerCase(locale);
                        }
                        break;
                    case 111499426:
                        if (optString2.equals("upper")) {
                            return jSONObject.optString("value").toUpperCase(locale);
                        }
                        break;
                    case 346468911:
                        if (optString2.equals("dateMethod")) {
                            return a(optJSONObject, jSONObject.optString("method"), locale).format(new Date((long) optDouble));
                        }
                        break;
                    case 950484197:
                        if (optString2.equals("compare")) {
                            return Integer.toString(Integer.signum(Collator.getInstance(locale).compare(jSONObject.optString("a"), jSONObject.optString("b"))));
                        }
                        break;
                }
            } catch (Exception unused2) {
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4.optBoolean("hour12") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(JSONObject jSONObject, boolean z10) {
        String str = "H";
        if (!jSONObject.has("hour12")) {
            String optString = jSONObject.optString("hourCycle");
            if (!optString.equals("h11") && !optString.equals("h12")) {
                if (!optString.equals("h23") && !optString.equals("h24")) {
                    str = "j";
                }
            }
            str = "h";
        }
        return z10 ? str.concat(str) : str;
    }
}
