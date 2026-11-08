package u2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3.k b;

    public /* synthetic */ a(l lVar, d3.k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.a) {
            case 0:
                d3.k kVar = this.b;
                Handler handler = kVar.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    kVar.a(j3);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    break;
                }
            default:
                d3.k kVar2 = this.b;
                Handler handler2 = kVar2.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    kVar2.a(j3);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                    break;
                }
        }
    }
}
