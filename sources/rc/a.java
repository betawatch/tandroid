package rc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
