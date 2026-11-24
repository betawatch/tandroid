// default package

import android.content.SharedPreferences;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class sr2 extends fr2 {
    public final Set d;
    public final int e;
    public volatile Set f;

    public sr2(String str, Set set, int i) {
        super(str);
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(set));
        this.d = unmodifiableSet;
        this.e = i;
        this.f = unmodifiableSet;
    }

    @Override // fr2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        String str;
        if (!(jSONValue instanceof TLRPC.TL_jsonArray)) {
            return false;
        }
        TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
        HashSet hashSet = new HashSet();
        int size = tL_jsonArray.value.size();
        for (int i = 0; i < size; i++) {
            TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i);
            if ((jSONValue2 instanceof TLRPC.TL_jsonString) && (str = ((TLRPC.TL_jsonString) jSONValue2).value) != null) {
                hashSet.add(str);
            }
        }
        if (hashSet.equals(this.f)) {
            return false;
        }
        this.f = DesugarCollections.unmodifiableSet(hashSet);
        editor.putStringSet(e(), new HashSet(hashSet));
        return true;
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

    @Override // fr2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            Set<String> stringSet = sharedPreferences.getStringSet(e(), null);
            this.f = stringSet == null ? this.d : DesugarCollections.unmodifiableSet(new HashSet(stringSet));
        } catch (ClassCastException e) {
            fa4.g(e, true);
            this.f = this.d;
        }
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
