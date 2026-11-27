// default package

import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pe8 {
    public byte a;
    public Object b;
    public Object c;

    public pe8() {
        this.b = DesugarCollections.synchronizedMap(new qs(0));
        this.a = (byte) 0;
    }

    public final void a(String str, c36 c36Var) {
        Map map = (Map) this.b;
        if (map.containsKey(str)) {
            lq5.j(qu6.o("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
            return;
        }
        map.put(str, c36Var);
        if (this.a > 0) {
            new b99(Looper.getMainLooper(), (byte) 4).post(new uy1((Object) this, (Object) c36Var, (Object) str, (byte) 5));
        }
    }

    public final void b(Bundle bundle) {
        this.a = (byte) 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            ((c36) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((c36) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pe8(int i) {
        this.a = i;
    }
}
