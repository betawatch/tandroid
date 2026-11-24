// default package

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class teb extends ArrayList {
    public final Class a;
    public final Class b;

    public teb(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vk9 h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            objArr[i] = ((Pair) get(i)).first;
            objArr2[i] = ((Pair) get(i)).second;
        }
        return new vk9(objArr, objArr2);
    }
}
