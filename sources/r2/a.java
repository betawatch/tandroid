package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3.m b;

    public /* synthetic */ a(l lVar, a3.m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j10) {
        switch (this.a) {
            case 0:
                a3.m mVar = this.b;
                Handler handler = mVar.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    mVar.a(j3);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    break;
                }
            default:
                a3.m mVar2 = this.b;
                Handler handler2 = mVar2.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    mVar2.a(j3);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                    break;
                }
        }
    }
}
