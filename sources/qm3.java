// default package

import android.content.Context;
import android.icu.util.ULocale;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class qm3 {
    public static final HashMap a = new HashMap();

    public static void a(LinkedHashMap linkedHashMap, Locale locale) {
        if (locale != null) {
            String language = locale.getLanguage();
            if (TextUtils.isEmpty(language) || "und".equals(language) || linkedHashMap.containsKey(language)) {
                return;
            }
            String country = locale.getCountry();
            if (TextUtils.isEmpty(country) && Build.VERSION.SDK_INT >= 24) {
                country = ULocale.addLikelySubtags(z2.a(language)).getCountry();
            }
            if (country == null) {
                country = "";
            }
            linkedHashMap.put(language, new Locale(language, country).toLanguageTag());
        }
    }

    public static void b(LinkedHashMap linkedHashMap, Context context) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                a(linkedHashMap, d(inputMethodManager.getCurrentInputMethodSubtype()));
                String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    if (TextUtils.equals(inputMethodInfo.getId(), string)) {
                        Iterator<InputMethodSubtype> it = inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true).iterator();
                        while (it.hasNext()) {
                            a(linkedHashMap, d(it.next()));
                        }
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public static ArrayList c(Context context, long j) {
        ArrayList arrayList = (ArrayList) a.get(Long.valueOf(j));
        if (arrayList != null && !arrayList.isEmpty()) {
            return new ArrayList(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap, context);
        return new ArrayList(linkedHashMap.values());
    }

    public static Locale d(InputMethodSubtype inputMethodSubtype) {
        if (inputMethodSubtype == null || !"keyboard".equals(inputMethodSubtype.getMode())) {
            return null;
        }
        String languageTag = Build.VERSION.SDK_INT >= 24 ? inputMethodSubtype.getLanguageTag() : null;
        if (TextUtils.isEmpty(languageTag)) {
            String locale = inputMethodSubtype.getLocale();
            languageTag = locale == null ? null : locale.replace('_', '-');
        }
        if (TextUtils.isEmpty(languageTag)) {
            return null;
        }
        return Locale.forLanguageTag(languageTag);
    }
}
