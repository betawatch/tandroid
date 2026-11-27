// default package

import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.scilab.forge.jlatexmath.ParseException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.tgnet.TLObject;
import org.webrtc.CallSessionFileRotatingLogSink;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rm0 implements dq7, fd, occ, zla, ama, lz0, yma, JavaAudioDeviceModule.SamplesReadyCallback, NativeLifecycleLock.NativeDisposer, ea9, uka, wic, q69, nl0, hj, on5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ rm0(sc1 sc1Var, int i, h31 h31Var) {
        this.a = (byte) 19;
    }

    public static /* bridge */ /* synthetic */ RenderNode g(Object obj) {
        return (RenderNode) obj;
    }

    public static /* synthetic */ void k(String str) {
        throw new ParseException(str);
    }

    @Override // wic
    public final void a(View view, RectF rectF) {
        view.invalidate();
    }

    @Override // uka
    public final float b(RecyclerView recyclerView) {
        return wka.j(recyclerView);
    }

    @Override // dq7
    public final String c(int i) {
        return String.format("%02d", Integer.valueOf(i * 5));
    }

    @Override // ea9
    public final void call() {
        throw null;
    }

    @Override // ama
    public final void d(Object obj, float f) {
        xw0 xw0Var = (xw0) obj;
        xw0Var.c = f;
        xw0Var.f.invalidate();
        xw0Var.Y.setAlpha(f);
        xw0Var.J();
        xw0Var.H();
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeDisposer
    public final void dispose(long j) {
        CallSessionFileRotatingLogSink.lambda$dispose$0(j);
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override // zla
    public final float get(Object obj) {
        return ((xw0) obj).c;
    }

    @Override // uka
    public final RecyclerView h(View view) {
        return ((cj1) view).a;
    }

    @Override // yma
    public final void j(int i) {
        if (i == 0) {
            xea.z(3);
            return;
        }
        if (i == 1) {
            xea.z(0);
        } else if (i == 2) {
            xea.z(1);
        } else if (i == 3) {
            xea.z(2);
        }
    }

    @Override // nl0
    public final int l(vnb vnbVar, boolean z) {
        return TLObject.FLAG_31;
    }

    @Override // uka
    public final /* synthetic */ void o(RecyclerView recyclerView) {
        uh9.d(recyclerView);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public final void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        CallAudioDevice.lambda$createJavaModule$1(audioSamples);
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Drawable t = imageReceiver.t();
        if (t instanceof b29) {
            b29 b29Var = (b29) t;
            b29Var.K(0);
            b29Var.stop();
            b29Var.O(false, 0.0f);
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 1:
                idVar.dismiss();
                break;
            case 2:
                idVar.dismiss();
                break;
            case 6:
                idVar.dismiss();
                break;
            case 7:
                idVar.dismiss();
                break;
            case 14:
                idVar.dismiss();
                break;
            default:
                idVar.dismiss();
                break;
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 27:
                MediaController.z().F0(1, i, z, false);
                break;
            default:
                MediaController.z().F0(1, i, z, false);
                break;
        }
    }

    public /* synthetic */ rm0(byte b) {
        this.a = b;
    }

    public /* synthetic */ rm0(Object obj, byte b) {
        this.a = b;
    }

    @Override // lz0
    public final void cancel() {
    }

    @Override // yma
    public final void m() {
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }
}
