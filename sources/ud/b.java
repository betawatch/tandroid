package ud;

import com.google.android.gms.common.api.internal.m1;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b extends a {
    public final m1 b = new m1(2);

    @Override // ud.a
    public final Random a() {
        Object obj = this.b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
