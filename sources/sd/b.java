package sd;

import com.google.android.gms.common.api.internal.n1;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
