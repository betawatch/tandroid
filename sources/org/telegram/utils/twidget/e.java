package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class e extends g {
    public final RenderNode e;

    public e(String str, int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i10, i11, i12, i13);
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
    public final void d(Canvas canvas, float f7) {
        if (this.e.hasDisplayList()) {
            this.e.setAlpha(f7);
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
