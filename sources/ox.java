// default package

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ox implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uk6 b;

    public /* synthetic */ ox(ek6 ek6Var, uk6 uk6Var, byte b) {
        this.a = b;
        this.b = uk6Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        byte b = this.a;
        uk6 uk6Var = this.b;
        switch (b) {
            case 0:
                Handler handler = uk6Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    uk6Var.a(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                Handler handler2 = uk6Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    uk6Var.a(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
