// default package

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tgb extends ArrayList {
    public final Class a;
    public final Class b;

    public tgb(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wm9 h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            objArr[i] = ((Pair) get(i)).first;
            objArr2[i] = ((Pair) get(i)).second;
        }
        return new wm9(objArr, objArr2);
    }
}
