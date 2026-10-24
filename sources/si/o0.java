package si;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class o0 {
    public static z3.b a(z3.m mVar, byte[] bArr, int i10) {
        e9.k0 t10 = e9.n0.t();
        mVar.f(bArr, 0, i10, z3.l.c, new yh.q0(t10, 2));
        return new z3.b(t10.f());
    }

    public static /* synthetic */ int b(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static float c(float f7, float f10, float f11, float f12) {
        return (f7 * f10) + f11 + f12;
    }

    public static int d(Float f7, float f10) {
        return AndroidUtilities.dp(f7.floatValue() * f10);
    }

    public static Bundle e(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static ja.c f(int i10, n4.s sVar) {
        z7.s sVar2 = new z7.s(i10);
        if (((HashMap) sVar.c) == null) {
            sVar.c = new HashMap();
        }
        ((HashMap) sVar.c).put(z7.w.class, sVar2);
        return new ja.c((String) sVar.b, ((HashMap) sVar.c) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) sVar.c)));
    }

    public static Object g(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder i(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static UnsupportedOperationException j(Parcel parcel) {
        f8.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap k(Class cls, v7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap l(Class cls, w7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap m(Class cls, x7.z zVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zVar);
        return hashMap;
    }

    public static HashMap n(Class cls, z7.s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static v7.e o(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new v7.e(i10);
    }

    public static w7.a p(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new w7.a(i10);
    }

    public static x7.z q(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new x7.z(i10);
    }

    public static z7.s r(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new z7.s(i10);
    }

    public static void s(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static boolean t(String str) {
        return new File(str).exists();
    }

    public static String u(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "ERROR" : "CANCELLED" : "AUDIO_REMOVED" : "TRIMMED";
    }

    public static /* synthetic */ String w(int i10) {
        switch (i10) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }
}
