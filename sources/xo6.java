// default package

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class xo6 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final px6 e;

    public xo6(Context context, px6 px6Var) {
        this.e = px6Var;
        MediaController mediaController = new MediaController(context, px6Var.b);
        this.a = mediaController;
        if (px6Var.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new q13(this));
        }
    }
}
