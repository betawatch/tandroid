package y3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5.h b;

    public /* synthetic */ a(k kVar, e5.h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.a) {
            case 0:
                e5.h hVar = this.b;
                Handler handler = hVar.a;
                if (g0.a >= 30) {
                    hVar.a(j10);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
            default:
                e5.h hVar2 = this.b;
                Handler handler2 = hVar2.a;
                if (g0.a >= 30) {
                    hVar2.a(j10);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
        }
    }
}
