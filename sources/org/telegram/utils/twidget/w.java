package org.telegram.utils.twidget;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class w extends LinkedHashMap {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(float f10, int i7, int i10, boolean z10) {
        super(i7, f10, z10);
        this.a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Matcher b(String str, Pattern pattern, w wVar) {
        Matcher matcher = (Matcher) wVar.get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        wVar.put(pattern, matcher2);
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
