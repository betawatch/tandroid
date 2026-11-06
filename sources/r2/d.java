package r2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d extends LinkedHashMap {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(float f10, int i7, int i10, boolean z9) {
        super(i7, f10, z9);
        this.a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Matcher b(String str, Pattern pattern, d dVar) {
        Matcher matcher = (Matcher) dVar.get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        dVar.put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
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
