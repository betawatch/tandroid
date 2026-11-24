// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pz extends BroadcastReceiver {
    public final t54 a;
    public final cdb b;
    public final /* synthetic */ xf4 c;

    public pz(xf4 xf4Var, cdb cdbVar, t54 t54Var) {
        this.c = xf4Var;
        this.b = cdbVar;
        this.a = t54Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new oz(this, (byte) 0));
        }
    }
}
