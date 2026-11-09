package qe;

import a4.k;
import c8.u9;
import c8.v9;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class f {
    public static final g a = new g();

    public static final me.d a(me.d dVar, pb.b module) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(module, "module");
        if (!kotlin.jvm.internal.j.a(dVar.e(), me.e.b)) {
            return dVar.isInline() ? a(dVar.i(0), module) : dVar;
        }
        u9.a(dVar);
        return dVar;
    }

    public static final byte b(char c10) {
        if (c10 < '~') {
            return c.b[c10];
        }
        return (byte) 0;
    }

    public static final void c(k kVar, String str) {
        kVar.m(kVar.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence d(int i7, CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i7 != -1) {
                int i10 = i7 - 30;
                int i11 = i7 + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                m10.append(charSequence.subSequence(i10, i11).toString());
                m10.append(str2);
                return m10.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void e(me.d dVar, pe.b json) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(json, "json");
        if (kotlin.jvm.internal.j.a(dVar.e(), me.f.b)) {
            json.a.getClass();
        }
    }

    public static final j f(me.d desc, pe.b bVar) {
        kotlin.jvm.internal.j.e(desc, "desc");
        v9 e10 = desc.e();
        if (e10 instanceof me.a) {
            return j.f;
        }
        if (kotlin.jvm.internal.j.a(e10, me.f.c)) {
            return j.d;
        }
        if (!kotlin.jvm.internal.j.a(e10, me.f.d)) {
            return j.c;
        }
        me.d a10 = a(desc.i(0), bVar.b);
        v9 e11 = a10.e();
        if ((e11 instanceof me.c) || kotlin.jvm.internal.j.a(e11, me.e.c)) {
            return j.e;
        }
        bVar.a.getClass();
        throw new d("Value of type '" + a10.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + a10.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
