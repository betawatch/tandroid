// default package

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class v4f {
    public static final he6 d = new he6("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public v4f(String str, Bundle bundle) {
        this.a = str;
        this.b = v3f.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = v3f.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p8f a(e1f e1fVar, int i) {
        int i2;
        Map map;
        int i3;
        n8f b = b(e1fVar);
        b8f m = c8f.m(b.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                xve.h(num);
                i2 = num.intValue();
                m.c();
                c8f.r((c8f) m.b, i2);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        xve.h(num2);
                        i3 = num2.intValue();
                        m.c();
                        c8f.s((c8f) m.b, i3);
                        b.e((c8f) m.a());
                        return (p8f) b.a();
                    }
                }
                i3 = i + 10000;
                m.c();
                c8f.s((c8f) m.b, i3);
                b.e((c8f) m.a());
                return (p8f) b.a();
            }
        }
        i2 = i + 10000;
        m.c();
        c8f.r((c8f) m.b, i2);
        map = this.b;
        if (map != null) {
        }
        i3 = i + 10000;
        m.c();
        c8f.s((c8f) m.b, i3);
        b.e((c8f) m.a());
        return (p8f) b.a();
    }

    public final n8f b(e1f e1fVar) {
        long j;
        n8f m = p8f.m();
        long j2 = e1fVar.d;
        m.c();
        p8f.t((p8f) m.b, j2);
        int i = e1fVar.e;
        e1fVar.e = i + 1;
        m.c();
        p8f.o((p8f) m.b, i);
        String str = e1fVar.c;
        if (str != null) {
            m.c();
            p8f.y((p8f) m.b, str);
        }
        String str2 = e1fVar.h;
        if (str2 != null) {
            m.c();
            p8f.u((p8f) m.b, str2);
        }
        x7f l = z7f.l();
        l.c();
        z7f.n((z7f) l.b, e);
        l.c();
        z7f.m((z7f) l.b, this.a);
        z7f z7fVar = (z7f) l.a();
        m.c();
        p8f.r((p8f) m.b, z7fVar);
        b8f l2 = c8f.l();
        if (e1fVar.b != null) {
            waf l3 = yaf.l();
            String str3 = e1fVar.b;
            l3.c();
            yaf.m((yaf) l3.b, str3);
            yaf yafVar = (yaf) l3.a();
            l2.c();
            c8f.o((c8f) l2.b, yafVar);
        }
        l2.c();
        c8f.p((c8f) l2.b, false);
        String str4 = e1fVar.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e2) {
                Object[] objArr = {str4};
                he6 he6Var = d;
                Log.w(he6Var.a, he6Var.d("receiverSessionId %s is not valid for hash", objArr), e2);
                j = 0;
            }
            l2.c();
            c8f.q((c8f) l2.b, j);
        }
        int i2 = e1fVar.g;
        l2.c();
        c8f.t((c8f) l2.b, i2);
        boolean z = e1fVar.a.c == 2;
        l2.c();
        c8f.u((c8f) l2.b, z);
        boolean z2 = e1fVar.i;
        l2.c();
        c8f.x((c8f) l2.b, z2);
        m.c();
        p8f.p((p8f) m.b, (c8f) l2.a());
        return m;
    }
}
