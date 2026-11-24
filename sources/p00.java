// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p00 extends BroadcastReceiver {
    public final c74 a;
    public final dfb b;
    public final /* synthetic */ yh4 c;

    public p00(yh4 yh4Var, dfb dfbVar, c74 c74Var) {
        this.c = yh4Var;
        this.b = dfbVar;
        this.a = c74Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new f00(this, (byte) 2));
        }
    }
}
