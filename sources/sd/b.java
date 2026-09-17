package sd;

import com.google.android.gms.common.api.internal.n1;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
