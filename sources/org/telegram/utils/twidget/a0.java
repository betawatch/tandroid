package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class a0 extends c0 {
    public final RenderNode e;
    public Bitmap f;
    public Paint g;

    public a0(String str, int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i7, i10, i11, i12);
    }

    @Override // org.telegram.utils.twidget.c0
    public final Canvas a() {
        return this.e.beginRecording(this.c - this.a, this.d - this.b);
    }

    @Override // org.telegram.utils.twidget.c0
    public final void b() {
        this.e.discardDisplayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        if (r7 != null) goto L23;
     */
    @Override // org.telegram.utils.twidget.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, float f10) {
        ImageReader imageReader;
        HardwareRenderer hardwareRenderer;
        if (this.e.hasDisplayList()) {
            if (canvas.isHardwareAccelerated()) {
                this.e.setAlpha(f10);
                canvas.drawRenderNode(this.e);
                return;
            }
            if (f10 <= 0.0f) {
                return;
            }
            Bitmap bitmap = this.f;
            int i7 = this.b;
            int i10 = this.a;
            if (bitmap == null) {
                RenderNode renderNode = this.e;
                int i11 = this.c - i10;
                int i12 = this.d - i7;
                Bitmap bitmap2 = null;
                if (i11 > 0 && i12 > 0) {
                    try {
                        imageReader = ImageReader.newInstance(i11, i12, 1, 1, 768L);
                        try {
                            hardwareRenderer = new HardwareRenderer();
                            try {
                                hardwareRenderer.setOpaque(false);
                                hardwareRenderer.setSurface(imageReader.getSurface());
                                RenderNode renderNode2 = new RenderNode("widget-sandbox-software");
                                renderNode2.setPosition(0, 0, i11, i12);
                                RecordingCanvas beginRecording = renderNode2.beginRecording(i11, i12);
                                beginRecording.translate(-i10, -i7);
                                renderNode.setAlpha(1.0f);
                                beginRecording.drawRenderNode(renderNode);
                                renderNode2.endRecording();
                                hardwareRenderer.setContentRoot(renderNode2);
                                hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                                Image acquireNextImage = imageReader.acquireNextImage();
                                if (acquireNextImage != null) {
                                    try {
                                        HardwareBuffer hardwareBuffer = acquireNextImage.getHardwareBuffer();
                                        if (hardwareBuffer != null) {
                                            try {
                                                Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                                                Bitmap copy = wrapHardwareBuffer == null ? null : wrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false);
                                                hardwareRenderer.destroy();
                                                imageReader.close();
                                                bitmap2 = copy;
                                            } finally {
                                                hardwareBuffer.close();
                                            }
                                        }
                                    } finally {
                                        acquireNextImage.close();
                                    }
                                }
                                hardwareRenderer.destroy();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    a8.g(th, true);
                                    if (hardwareRenderer != null) {
                                        hardwareRenderer.destroy();
                                    }
                                } finally {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            hardwareRenderer = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        imageReader = null;
                        hardwareRenderer = null;
                    }
                    imageReader.close();
                }
                this.f = bitmap2;
                if (bitmap2 == null) {
                    return;
                }
            }
            if (this.g == null) {
                this.g = new Paint(2);
            }
            this.g.setAlpha(Math.round(Math.min(1.0f, f10) * 255.0f));
            canvas.drawBitmap(this.f, i10, i7, this.g);
        }
    }

    @Override // org.telegram.utils.twidget.c0
    public final void d() {
        this.e.endRecording();
    }

    @Override // org.telegram.utils.twidget.c0
    public final boolean e() {
        return this.e.hasDisplayList();
    }

    @Override // org.telegram.utils.twidget.c0
    public final void f() {
        this.e.setUseCompositingLayer(true, null);
    }
}
