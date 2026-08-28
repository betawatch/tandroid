package y3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5.i b;

    public /* synthetic */ a(k kVar, e5.i iVar, int i9) {
        this.a = i9;
        this.b = iVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.a) {
            case 0:
                e5.i iVar = this.b;
                Handler handler = iVar.a;
                if (f0.a >= 30) {
                    iVar.a(j10);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
            default:
                e5.i iVar2 = this.b;
                Handler handler2 = iVar2.a;
                if (f0.a >= 30) {
                    iVar2.a(j10);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
        }
    }
}
