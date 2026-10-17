package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
