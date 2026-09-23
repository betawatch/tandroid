package sd;

import com.google.android.gms.common.api.internal.n1;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class b extends a {
    public final n1 b = new n1(2);

    @Override // sd.a
    public final Random a() {
        Object obj = this.b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
