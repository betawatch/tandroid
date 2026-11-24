// default package

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class tm6 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final kv6 e;

    public tm6(Context context, kv6 kv6Var) {
        this.e = kv6Var;
        MediaController mediaController = new MediaController(context, kv6Var.b);
        this.a = mediaController;
        if (kv6Var.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new x03(this));
        }
    }
}
