// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
