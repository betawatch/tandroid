package u2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
