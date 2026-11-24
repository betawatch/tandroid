// default package

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class zfe {
    public static boolean a(Context context) {
        if (context != null && DictationAsr.D()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = bo3.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            bo3.b(linkedHashMap, context);
            ArrayList arrayList2 = new ArrayList(linkedHashMap.values());
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                String language = Locale.forLanguageTag((String) obj).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                    arrayList.add(language);
                }
            }
            if (arrayList.size() > 1) {
                arrayList.remove("en");
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (DictationAsr.L((String) obj2) != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
