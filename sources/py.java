// default package

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class py implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xm6 b;

    public /* synthetic */ py(hm6 hm6Var, xm6 xm6Var, byte b) {
        this.a = b;
        this.b = xm6Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        byte b = this.a;
        xm6 xm6Var = this.b;
        switch (b) {
            case 0:
                Handler handler = xm6Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    xm6Var.a(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                Handler handler2 = xm6Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    xm6Var.a(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
