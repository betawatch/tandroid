package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class b0 extends d0 {
    public final RenderNode e;
    public Bitmap f;
    public Paint g;
    public Rect h;

    public b0(String str, int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i7, i10, i11, i12);
    }

    @Override // org.telegram.utils.twidget.d0
    public final Canvas a() {
        return this.e.beginRecording(this.c - this.a, this.d - this.b);
    }

    @Override // org.telegram.utils.twidget.d0
    public final void b() {
        this.e.discardDisplayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    @Override // org.telegram.utils.twidget.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, float f10) {
        long j3;
        long j10;
        Bitmap bitmap;
        HardwareRenderer hardwareRenderer;
        ImageReader imageReader;
        Image acquireNextImage;
        if (this.e.hasDisplayList()) {
            if (canvas.isHardwareAccelerated()) {
                this.e.setAlpha(f10);
                canvas.drawRenderNode(this.e);
                return;
            }
            if (f10 <= 0.0f) {
                return;
            }
            int i7 = this.c;
            int i10 = this.a;
            long j11 = i7 - i10;
            int i11 = this.d;
            int i12 = this.b;
            long j12 = i11 - i12;
            if (j11 <= 0 || j12 <= 0 || j11 > 2147483647L || j12 > 2147483647L) {
                return;
            }
            if (this.f == null) {
                double d = j11;
                double d2 = j12;
                double min = Math.min(Math.min(1.0d, Math.sqrt(1.6777216E7d / (d * d2))), 8192.0d / Math.max(j11, j12));
                int max = (int) Math.max(1.0d, Math.floor(d * min));
                int max2 = (int) Math.max(1.0d, Math.floor(d2 * min));
                RenderNode renderNode = this.e;
                float f11 = max / j11;
                float f12 = max2 / j12;
                if (max <= 0 || max2 <= 0) {
                    j3 = j11;
                    j10 = j12;
                } else {
                    j3 = j11;
                    try {
                        imageReader = ImageReader.newInstance(max, max2, 1, 1, 768L);
                        try {
                            try {
                                hardwareRenderer = new HardwareRenderer();
                                try {
                                    hardwareRenderer.setOpaque(false);
                                    hardwareRenderer.setSurface(imageReader.getSurface());
                                    j10 = j12;
                                    try {
                                        RenderNode renderNode2 = new RenderNode("widget-sandbox-software");
                                        renderNode2.setPosition(0, 0, max, max2);
                                        RecordingCanvas beginRecording = renderNode2.beginRecording(max, max2);
                                        beginRecording.scale(f11, f12);
                                        beginRecording.translate(-i10, -i12);
                                        renderNode.setAlpha(1.0f);
                                        beginRecording.drawRenderNode(renderNode);
                                        renderNode2.endRecording();
                                        hardwareRenderer.setContentRoot(renderNode2);
                                        hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                                        acquireNextImage = imageReader.acquireNextImage();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        imageReader = imageReader;
                                        try {
                                            a8.g(th, true);
                                            if (hardwareRenderer != null) {
                                            }
                                            if (imageReader != null) {
                                            }
                                            bitmap = null;
                                            this.f = bitmap;
                                            if (bitmap == null) {
                                            }
                                            if (this.g == null) {
                                            }
                                            this.g.setAlpha(Math.round(Math.min(1.0f, f10) * 255.0f));
                                            if (this.f.getWidth() != j3) {
                                            }
                                            if (this.h == null) {
                                            }
                                            this.h.set(i10, i12, i7, i11);
                                            canvas.drawBitmap(this.f, (Rect) null, this.h, this.g);
                                        } catch (Throwable th3) {
                                            if (hardwareRenderer != null) {
                                                hardwareRenderer.destroy();
                                            }
                                            if (imageReader != null) {
                                                imageReader.close();
                                            }
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j10 = j12;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                j10 = j12;
                                imageReader = imageReader;
                                hardwareRenderer = null;
                                a8.g(th, true);
                                if (hardwareRenderer != null) {
                                    hardwareRenderer.destroy();
                                }
                                if (imageReader != null) {
                                    imageReader.close();
                                }
                                bitmap = null;
                                this.f = bitmap;
                                if (bitmap == null) {
                                }
                                if (this.g == null) {
                                }
                                this.g.setAlpha(Math.round(Math.min(1.0f, f10) * 255.0f));
                                if (this.f.getWidth() != j3) {
                                }
                                if (this.h == null) {
                                }
                                this.h.set(i10, i12, i7, i11);
                                canvas.drawBitmap(this.f, (Rect) null, this.h, this.g);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            j10 = j12;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        j10 = j12;
                        hardwareRenderer = null;
                        imageReader = null;
                    }
                    if (acquireNextImage != null) {
                        try {
                            HardwareBuffer hardwareBuffer = acquireNextImage.getHardwareBuffer();
                            if (hardwareBuffer != null) {
                                try {
                                    Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                                    bitmap = wrapHardwareBuffer == null ? null : wrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false);
                                    hardwareRenderer.destroy();
                                    imageReader.close();
                                    this.f = bitmap;
                                    if (bitmap == null) {
                                        return;
                                    }
                                } finally {
                                    hardwareBuffer.close();
                                }
                            }
                        } finally {
                            acquireNextImage.close();
                        }
                    }
                    hardwareRenderer.destroy();
                    imageReader.close();
                }
                bitmap = null;
                this.f = bitmap;
                if (bitmap == null) {
                }
            } else {
                j3 = j11;
                j10 = j12;
            }
            if (this.g == null) {
                this.g = new Paint(2);
            }
            this.g.setAlpha(Math.round(Math.min(1.0f, f10) * 255.0f));
            if (this.f.getWidth() != j3 && this.f.getHeight() == j10) {
                canvas.drawBitmap(this.f, i10, i12, this.g);
                return;
            }
            if (this.h == null) {
                this.h = new Rect();
            }
            this.h.set(i10, i12, i7, i11);
            canvas.drawBitmap(this.f, (Rect) null, this.h, this.g);
        }
    }

    @Override // org.telegram.utils.twidget.d0
    public final void d() {
        this.e.endRecording();
    }

    @Override // org.telegram.utils.twidget.d0
    public final boolean e() {
        return this.e.hasDisplayList();
    }

    @Override // org.telegram.utils.twidget.d0
    public final void f() {
        long j3 = this.c - this.a;
        long j10 = this.d - this.b;
        this.e.setUseCompositingLayer(j3 > 0 && j10 > 0 && j3 <= 4096 && j10 <= 4096 && j3 * j10 <= 8388608, null);
    }
}
