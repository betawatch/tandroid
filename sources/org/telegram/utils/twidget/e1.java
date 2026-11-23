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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class e1 {
    public static void a(h1 h1Var, cc.e eVar, j jVar, int i7, r7 r7Var, RectF rectF, float[] fArr, g1 g1Var, float f10) {
        RenderEffect c10 = c(r7Var, f10, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (c10 == null || !((Matrix) eVar.f).invert(matrix) || rectF.isEmpty()) {
            return;
        }
        if (h1Var.q(eVar, new RectF(rectF), h1.j(r7Var, new RectF(rectF)))) {
            int floor = (int) Math.floor(r3.left * f10);
            int floor2 = (int) Math.floor(r3.top * f10);
            int ceil = (int) Math.ceil(r3.right * f10);
            int ceil2 = (int) Math.ceil(r3.bottom * f10);
            if (h1Var.p((ceil2 - floor2) * (ceil - floor))) {
                h1Var.w++;
                RenderNode renderNode = new RenderNode("widget-backdrop");
                renderNode.setPosition(floor, floor2, ceil, ceil2);
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.translate(-floor, -floor2);
                beginRecording.scale(f10, f10);
                beginRecording.concat(matrix);
                h1Var.e(beginRecording, jVar, i7, g1Var, f10, false);
                renderNode.endRecording();
                renderNode.setRenderEffect(c10);
                Canvas canvas = (Canvas) eVar.d;
                canvas.save();
                Path path = h1Var.f;
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
        }
    }

    public static Canvas b(h1 h1Var, f1 f1Var, RectF rectF, r7 r7Var, float f10) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect c10 = c(r7Var, f10, tileMode);
        if (c10 == null) {
            return null;
        }
        int floor = ((int) Math.floor(rectF.left * f10)) - 1;
        int floor2 = ((int) Math.floor(rectF.top * f10)) - 1;
        int ceil = ((int) Math.ceil(rectF.right * f10)) + 1;
        int ceil2 = ((int) Math.ceil(rectF.bottom * f10)) + 1;
        if (!h1Var.p((ceil2 - floor2) * (ceil - floor))) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        f1Var.d = floor;
        f1Var.e = floor2;
        renderNode.setPosition(floor, floor2, ceil, ceil2);
        renderNode.setRenderEffect(c10);
        f1Var.c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-f1Var.d, -f1Var.e);
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

    public static void d(f1 f1Var, float f10) {
        RenderNode d = n2.a0.d(f1Var.c);
        d.endRecording();
        f1Var.a.save();
        float f11 = 1.0f / f10;
        f1Var.a.scale(f11, f11);
        f1Var.a.drawRenderNode(d);
        f1Var.a.restore();
    }
}
