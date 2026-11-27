// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qz extends BroadcastReceiver {
    public final n64 a;
    public final xgb b;
    public final /* synthetic */ vh4 c;

    public qz(vh4 vh4Var, xgb xgbVar, n64 n64Var) {
        this.c = vh4Var;
        this.b = xgbVar;
        this.a = n64Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new pz(this, (byte) 0));
        }
    }
}
