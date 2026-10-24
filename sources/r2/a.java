package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3.m b;

    public /* synthetic */ a(l lVar, a3.m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.a) {
            case 0:
                a3.m mVar = this.b;
                Handler handler = mVar.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    mVar.a(j10);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
            default:
                a3.m mVar2 = this.b;
                Handler handler2 = mVar2.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    mVar2.a(j10);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
        }
    }
}
