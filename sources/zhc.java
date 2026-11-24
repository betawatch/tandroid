// default package

import android.content.Context;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zhc extends TextureViewRenderer {
    public final /* synthetic */ aic a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhc(aic aicVar, Context context) {
        super(context);
        this.a = aicVar;
    }

    @Override // org.webrtc.TextureViewRenderer, org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.a.b();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
