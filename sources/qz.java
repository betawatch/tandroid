// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
