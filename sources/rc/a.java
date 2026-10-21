package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class a extends c {
    public final /* synthetic */ int a;
    public Object b;

    @Override // rc.c
    public final void b(String str) {
        switch (this.a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.b) + ":" + str);
                break;
            default:
                ((Logger) this.b).log(Level.FINE, str);
                break;
        }
    }
}
