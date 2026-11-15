package org.telegram.utils.twidget;

import a8.r7;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public abstract class z0 {
    public static void a(c1 c1Var, n2.o0 o0Var, i iVar, int i7, r7 r7Var, RectF rectF, float[] fArr, b1 b1Var, float f10) {
        RenderEffect c10 = c(r7Var, f10, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (c10 == null || !((Matrix) o0Var.d).invert(matrix) || rectF.isEmpty()) {
            return;
        }
        RenderNode renderNode = new RenderNode("widget-backdrop");
        renderNode.setPosition((int) Math.floor(rectF.left * f10), (int) Math.floor(rectF.top * f10), (int) Math.ceil(rectF.right * f10), (int) Math.ceil(rectF.bottom * f10));
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-r3, -r4);
        beginRecording.scale(f10, f10);
        beginRecording.concat(matrix);
        c1Var.d(beginRecording, iVar, i7, b1Var, f10, false);
        renderNode.endRecording();
        renderNode.setRenderEffect(c10);
        Canvas canvas = (Canvas) o0Var.c;
        canvas.save();
        Path path = c1Var.f;
        path.rewind();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        canvas.clipPath(path);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        float f11 = 1.0f / f10;
        canvas.scale(f11, f11);
        canvas.drawRenderNode(renderNode);
        canvas.restore();
    }

    public static Canvas b(a1 a1Var, RectF rectF, r7 r7Var, float f10) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect c10 = c(r7Var, f10, tileMode);
        if (c10 == null) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        a1Var.d = ((int) Math.floor(rectF.left * f10)) - 1;
        int floor = ((int) Math.floor(rectF.top * f10)) - 1;
        a1Var.e = floor;
        renderNode.setPosition(a1Var.d, floor, ((int) Math.ceil(rectF.right * f10)) + 1, ((int) Math.ceil(rectF.bottom * f10)) + 1);
        renderNode.setRenderEffect(c10);
        a1Var.c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-a1Var.d, -a1Var.e);
        beginRecording.scale(f10, f10);
        return beginRecording;
    }

    public static RenderEffect c(r7 r7Var, float f10, Shader.TileMode tileMode) {
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        int i7 = 0;
        while (true) {
            int[] iArr = (int[]) r7Var.b;
            if (i7 >= iArr.length) {
                return renderEffect;
            }
            float f11 = ((float[]) r7Var.d)[i7];
            int i10 = iArr[i7];
            if (i10 == 0) {
                float f12 = f11 * f10;
                float f13 = f12 > 0.5f ? (f12 - 0.5f) / 0.57735f : 0.0f;
                if (f13 > 0.0f) {
                    renderEffect = renderEffect == null ? RenderEffect.createBlurEffect(f13, f13, tileMode) : RenderEffect.createBlurEffect(f13, f13, renderEffect, tileMode);
                }
            } else if (i10 != 1) {
                if (i10 == 9) {
                    if (renderEffect == null) {
                        renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                    }
                    RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(((float[]) r7Var.e)[i7] * f10, ((float[]) r7Var.f)[i7] * f10, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(((int[]) r7Var.c)[i7], PorterDuff.Mode.SRC_IN), renderEffect));
                    float f14 = (f11 / 2.0f) * f10;
                    float f15 = f14 > 0.5f ? (f14 - 0.5f) / 0.57735f : 0.0f;
                    if (f15 > 0.0f) {
                        tileMode2 = Shader.TileMode.DECAL;
                        createOffsetEffect = RenderEffect.createBlurEffect(f15, f15, createOffsetEffect, tileMode2);
                    }
                    blendMode = BlendMode.SRC_OVER;
                    renderEffect = RenderEffect.createBlendModeEffect(createOffsetEffect, renderEffect, blendMode);
                }
            } else if (renderEffect == null) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setScale(f11, f11, f11, 1.0f);
                renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            } else {
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setScale(f11, f11, f11, 1.0f);
                renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix2), renderEffect);
            }
            i7++;
        }
    }

    public static void d(a1 a1Var, float f10) {
        RenderNode d = n2.a0.d(a1Var.c);
        d.endRecording();
        a1Var.a.save();
        float f11 = 1.0f / f10;
        a1Var.a.scale(f11, f11);
        a1Var.a.drawRenderNode(d);
        a1Var.a.restore();
    }
}
