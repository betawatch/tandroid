package org.telegram.utils.twidget;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class v extends LinkedHashMap {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(float f10, int i7, int i10, boolean z9) {
        super(i7, f10, z9);
        this.a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Matcher b(String str, Pattern pattern, v vVar) {
        Matcher matcher = (Matcher) vVar.get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        vVar.put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (size() > 8192) {
                }
                break;
            case 1:
                if (size() > 4) {
                }
                break;
            default:
                if (size() > 32) {
                }
                break;
        }
        return false;
    }
}
