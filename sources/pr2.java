// default package

import android.content.SharedPreferences;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class pr2 extends fr2 {
    public final Set d;
    public final int e;
    public volatile Set f;

    public pr2(String str, Set set, int i) {
        super(str);
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(set));
        this.d = unmodifiableSet;
        this.e = i;
        this.f = unmodifiableSet;
    }

    @Override // fr2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i = 0; i < size; i++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i);
                if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                    double d = ((TLRPC.TL_jsonNumber) jSONValue2).value;
                    if (d == Math.rint(d) && Math.abs(d) < 9.223372036854776E18d) {
                        hashSet.add(Long.valueOf((long) d));
                    }
                } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    String str = ((TLRPC.TL_jsonString) jSONValue2).value;
                    Long l = null;
                    if (str != null) {
                        try {
                            l = Long.valueOf(Long.parseLong(str));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (l != null) {
                        hashSet.add(l);
                    }
                }
            }
            if (!hashSet.equals(this.f)) {
                this.f = DesugarCollections.unmodifiableSet(hashSet);
                HashSet hashSet2 = new HashSet();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    hashSet2.add(Long.toString(((Long) it.next()).longValue()));
                }
                editor.putStringSet(e(), hashSet2);
                return true;
            }
        }
        return false;
    }

    @Override // fr2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e != 2 || this.f.equals(this.d)) {
            return false;
        }
        this.f = this.d;
        editor.remove(e());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019 A[SYNTHETIC] */
    @Override // fr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(SharedPreferences sharedPreferences) {
        Long valueOf;
        try {
            Set<String> stringSet = sharedPreferences.getStringSet(e(), null);
            if (stringSet == null) {
                this.f = this.d;
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : stringSet) {
                if (str != null) {
                    try {
                        valueOf = Long.valueOf(Long.parseLong(str));
                    } catch (NumberFormatException unused) {
                    }
                    if (valueOf == null) {
                        hashSet.add(valueOf);
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
            this.f = DesugarCollections.unmodifiableSet(hashSet);
        } catch (ClassCastException e) {
            fa4.g(e, true);
            this.f = this.d;
        }
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
