package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class e extends g {
    public final RenderNode e;

    public e(String str, int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i7, i10, i11, i12);
    }

    @Override // org.telegram.utils.twidget.g
    public final Canvas a() {
        return this.e.beginRecording(this.c - this.a, this.d - this.b);
    }

    @Override // org.telegram.utils.twidget.g
    public final boolean b(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @Override // org.telegram.utils.twidget.g
    public final void c() {
        this.e.discardDisplayList();
    }

    @Override // org.telegram.utils.twidget.g
    public final void d(Canvas canvas, float f10) {
        if (this.e.hasDisplayList()) {
            this.e.setAlpha(f10);
            canvas.drawRenderNode(this.e);
        }
    }

    @Override // org.telegram.utils.twidget.g
    public final void e() {
        this.e.endRecording();
    }

    @Override // org.telegram.utils.twidget.g
    public final boolean f() {
        return this.e.hasDisplayList();
    }

    @Override // org.telegram.utils.twidget.g
    public final void g() {
        this.e.setUseCompositingLayer(true, null);
    }
}
