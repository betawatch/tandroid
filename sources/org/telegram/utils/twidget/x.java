package org.telegram.utils.twidget;

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
import m4.v0;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class x {
    public static void a(a0 a0Var, cc.f fVar, JSONArray jSONArray, int i10, JSONObject jSONObject, z zVar, float f7) {
        JSONArray optJSONArray = jSONObject.optJSONArray("fl");
        RenderEffect c10 = optJSONArray == null ? null : c(optJSONArray, f7, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (c10 == null || !((Matrix) fVar.d).invert(matrix)) {
            return;
        }
        if (a0.k(jSONObject, "r", new RectF()).isEmpty()) {
            return;
        }
        RenderNode renderNode = new RenderNode("widget-backdrop");
        renderNode.setPosition((int) Math.floor(r2.left * f7), (int) Math.floor(r2.top * f7), (int) Math.ceil(r2.right * f7), (int) Math.ceil(r2.bottom * f7));
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-r3, -r4);
        beginRecording.scale(f7, f7);
        beginRecording.concat(matrix);
        a0Var.f(beginRecording, jSONArray, i10, zVar, f7, false);
        renderNode.endRecording();
        renderNode.setRenderEffect(c10);
        Canvas canvas = (Canvas) fVar.c;
        canvas.save();
        Path path = a0Var.f;
        a0Var.l(jSONObject, "r", path);
        canvas.clipPath(path);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        float f10 = 1.0f / f7;
        canvas.scale(f10, f10);
        canvas.drawRenderNode(renderNode);
        canvas.restore();
    }

    public static Canvas b(y yVar, RectF rectF, JSONArray jSONArray, float f7) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect c10 = c(jSONArray, f7, tileMode);
        if (c10 == null) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        yVar.d = ((int) Math.floor(rectF.left * f7)) - 1;
        int floor = ((int) Math.floor(rectF.top * f7)) - 1;
        yVar.e = floor;
        renderNode.setPosition(yVar.d, floor, ((int) Math.ceil(rectF.right * f7)) + 1, ((int) Math.ceil(rectF.bottom * f7)) + 1);
        renderNode.setRenderEffect(c10);
        yVar.c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-yVar.d, -yVar.e);
        beginRecording.scale(f7, f7);
        return beginRecording;
    }

    public static RenderEffect c(JSONArray jSONArray, float f7, Shader.TileMode tileMode) {
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray optJSONArray = jSONArray.optJSONArray(i10);
            if (optJSONArray != null) {
                float optDouble = (float) optJSONArray.optDouble(1);
                int optInt = optJSONArray.optInt(0);
                if (optInt == 0) {
                    float f10 = optDouble * f7;
                    float f11 = f10 > 0.5f ? (f10 - 0.5f) / 0.57735f : 0.0f;
                    if (f11 > 0.0f) {
                        renderEffect = renderEffect == null ? RenderEffect.createBlurEffect(f11, f11, tileMode) : RenderEffect.createBlurEffect(f11, f11, renderEffect, tileMode);
                    }
                } else if (optInt != 1) {
                    if (optInt == 9) {
                        if (renderEffect == null) {
                            renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                        }
                        RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(((float) optJSONArray.optDouble(2)) * f7, ((float) optJSONArray.optDouble(3)) * f7, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter((int) optJSONArray.optLong(4), PorterDuff.Mode.SRC_IN), renderEffect));
                        float f12 = (optDouble / 2.0f) * f7;
                        float f13 = f12 > 0.5f ? (f12 - 0.5f) / 0.57735f : 0.0f;
                        if (f13 > 0.0f) {
                            tileMode2 = Shader.TileMode.DECAL;
                            createOffsetEffect = RenderEffect.createBlurEffect(f13, f13, createOffsetEffect, tileMode2);
                        }
                        blendMode = BlendMode.SRC_OVER;
                        renderEffect = RenderEffect.createBlendModeEffect(createOffsetEffect, renderEffect, blendMode);
                    }
                } else if (renderEffect == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setScale(optDouble, optDouble, optDouble, 1.0f);
                    renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                } else {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setScale(optDouble, optDouble, optDouble, 1.0f);
                    renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix2), renderEffect);
                }
            }
        }
        return renderEffect;
    }

    public static void d(y yVar, float f7) {
        RenderNode b10 = v0.b(yVar.c);
        b10.endRecording();
        yVar.a.save();
        float f10 = 1.0f / f7;
        yVar.a.scale(f10, f10);
        yVar.a.drawRenderNode(b10);
        yVar.a.restore();
    }
}
