package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3.l b;

    public /* synthetic */ a(l lVar, a3.l lVar2, int i10) {
        this.a = i10;
        this.b = lVar2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.a) {
            case 0:
                a3.l lVar = this.b;
                Handler handler = lVar.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    lVar.a(j3);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    break;
                }
            default:
                a3.l lVar2 = this.b;
                Handler handler2 = lVar2.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    lVar2.a(j3);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                    break;
                }
        }
    }
}
