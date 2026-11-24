// default package

import android.content.Context;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zjc extends TextureViewRenderer {
    public final /* synthetic */ akc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjc(akc akcVar, Context context) {
        super(context);
        this.a = akcVar;
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
