package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class u40 extends org.telegram.ui.Components.lw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final /* synthetic */ q50 D0;
    public boolean w0;
    public final RectF x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = q50Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.C0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.d4 d4Var;
        float f11;
        float y3;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.d4 d4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x11;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z11;
        Shader.TileMode tileMode;
        q50 q50Var = this.D0;
        o50 o50Var = q50Var.B1;
        View view = q50Var.K2;
        View view2 = q50Var.J2;
        ArrayList arrayList2 = q50Var.Y1;
        mh.h hVar = q50Var.c0;
        Paint paint = q50Var.C0;
        d30 d30Var = q50Var.m2;
        k30 k30Var = q50Var.C2;
        h30 h30Var = q50Var.a2;
        w40 w40Var = q50Var.Q;
        if (q50Var.s2 || q50Var.F2) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (q50Var.Q2 == null) {
                    q50Var.Q2 = new RenderNode("CallActivity.Blur");
                    q50Var.R2 = org.telegram.ui.Components.lw0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.lw0.getBlurRadius();
                    RenderNode renderNode = q50Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = q50Var.Q2;
                    float f15 = q50Var.R2;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / q50Var.R2);
                int round2 = Math.round(getMeasuredHeight() / q50Var.R2);
                q50Var.s2 = true;
                q50Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = q50Var.Q2.beginRecording();
                float f16 = 1.0f / q50Var.R2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                q50Var.Q2.endRecording();
                q50Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < w40Var.getChildCount(); i11++) {
            View childAt = w40Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                z11 = true;
                ((org.telegram.ui.Cells.d4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != w40Var.getMeasuredWidth()) {
                    childAt.setTranslationX((w40Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (h30Var.r == null) {
            for (int i12 = 0; i12 < d30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.z20) d30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (d30Var.getVisibility() == 0) {
            HashMap hashMap = this.C0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < w40Var.getChildCount()) {
                View childAt2 = w40Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        w40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != h30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.d4) {
                        w40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.d4 d4Var3 = (org.telegram.ui.Cells.d4) childAt2;
                            hashMap.put(d4Var3.getParticipant(), d4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < d30Var.getChildCount()) {
                org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) d30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(z20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(z20Var.getParticipant());
                }
                float f17 = h30Var.c;
                HashMap hashMap2 = hashMap;
                if (!q50Var.N2.k()) {
                    z20Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (w40Var.getX() + lVar3.getLeft()) - h30Var.getLeft();
                        f12 = (w40Var.getY() + lVar3.getTop()) - h30Var.getTop();
                        f13 = d30Var.getX() + z20Var.getLeft();
                        f14 = d30Var.getY() + z20Var.getTop();
                    } else {
                        x11 = ((w40Var.getX() + r14.getLeft()) - h30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((w40Var.getY() + r14.getTop()) - h30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = d30Var.getX() + z20Var.getLeft() + (z20Var.getMeasuredWidth() >> 1);
                        float y11 = d30Var.getY() + z20Var.getTop() + (z20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.d4) view3).setDrawAvatar(false);
                        f12 = y10;
                        f13 = x12;
                        f14 = y11;
                    }
                    float f18 = 1.0f - f17;
                    z20Var.setTranslationX((x11 - f13) * f18);
                    z20Var.setTranslationY((f12 - f14) * f18);
                    z20Var.setScaleX(1.0f);
                    z20Var.setScaleY(1.0f);
                    z20Var.setProgressToFullscreen(f17);
                } else {
                    z20Var.setScaleX(1.0f);
                    z20Var.setScaleY(1.0f);
                    z20Var.setTranslationX(0.0f);
                    z20Var.setTranslationY(0.0f);
                    z20Var.setProgressToFullscreen(1.0f);
                    if (z20Var.getRenderer() == null) {
                        z20Var.setAlpha(f17);
                    }
                }
                i14++;
                hashMap = hashMap2;
                f7 = 1.0f;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList2.get(i15);
            org.telegram.ui.Components.jm0 jm0Var = q50Var.n2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.P) {
                arrayList = arrayList2;
            } else {
                tVar.y0 = false;
                float f19 = h30Var.c;
                arrayList = arrayList2;
                if (tVar.r || tVar.b) {
                    org.telegram.ui.Components.voip.l lVar4 = tVar.c;
                    org.telegram.ui.Components.voip.l lVar5 = lVar4;
                    if (lVar4 == null && tVar.e == null) {
                        tVar.setTranslationX(0.0f);
                        tVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.l lVar6 = tVar.e;
                        if (lVar6 != null) {
                            lVar5 = lVar6;
                        }
                        if (lVar6 == null) {
                            jm0Var = w40Var;
                        }
                        float x13 = ((jm0Var.getX() + lVar5.getX()) - tVar.getLeft()) - h30Var.getLeft();
                        float y12 = ((jm0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - h30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        tVar.setTranslationX((x13 * f20) + f21);
                        tVar.setTranslationY((y12 * f20) + f21);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.z20 z20Var2 = tVar.d;
                    if (z20Var2 != null) {
                        z20Var2.setAlpha(f19);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f19);
                    } else if (!tVar.E) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.z20 z20Var3 = tVar.d;
                    if (z20Var3 != null) {
                        d30Var.getClass();
                        if (RecyclerView.R(z20Var3) == -1) {
                            tVar.setAlpha(tVar.d.getAlpha());
                        } else if (tVar.c == null) {
                            if (tVar.v && !tVar.E) {
                                tVar.setAlpha(f19);
                            }
                            tVar.d.setAlpha(f19);
                            f19 = 1.0f;
                        } else {
                            tVar.d.setAlpha(1.0f);
                            if (tVar.v && !tVar.E) {
                                tVar.setAlpha(1.0f);
                            }
                        }
                        tVar.setTranslationX((d30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((d30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    jm0Var = w40Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (q50.G3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            jm0Var = w40Var;
                                        }
                                    }
                                } else {
                                    lVar = lVar9;
                                }
                                z10 = false;
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                            tVar.setTranslationX(((jm0Var.getX() + lVar8.getX()) - tVar.getLeft()) - h30Var.getLeft());
                            tVar.setTranslationY(((jm0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - h30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.E) {
                                if (!q50.G3) {
                                    tVar.y0 = true;
                                    tVar.setAlpha(lVar8.getAlpha() * (1.0f - f19));
                                } else if (tVar.c != null && tVar.e == null) {
                                    tVar.setAlpha(lVar8.getAlpha() * f19);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (q50.G3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - h30Var.c);
            view.setAlpha(1.0f - h30Var.c);
        }
        if (h30Var.L0) {
            w40Var.setAlpha(f10 - h30Var.c);
        } else {
            w40Var.setAlpha(f10);
        }
        if (o50Var != null) {
            o50Var.setAlpha(f10 - h30Var.c);
            o50Var.setTranslationY(h30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (q50Var.F2) {
            return;
        }
        boolean z12 = q50Var.f2;
        RectF rectF = this.x0;
        if (!z12) {
            if (q50Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), q50Var.W2);
                float y13 = w40Var.getY();
                w40Var.getY();
                w40Var.getMeasuredHeight();
                if (!q50Var.b3) {
                    if (q50Var.a3 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = q50Var.Z2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(h30Var.getX() + q50Var.Z2.getX(), h30Var.getY() + q50Var.Z2.getY());
                        q50Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(h30Var.getX() + d30Var.getX() + q50Var.a3.getX(), h30Var.getY() + d30Var.getY() + q50Var.a3.getY());
                    if (q50Var.a3.getRenderer() == null || !q50Var.a3.getRenderer().v || q50Var.a3.getRenderer().b) {
                        q50Var.a3.draw(canvas);
                    } else {
                        q50Var.a3.getRenderer().draw(canvas);
                    }
                    q50Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = w40Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = w40Var.getChildAt(i16);
                    if (childAt3 == q50Var.X2) {
                        float max = Math.max(w40Var.getLeft(), childAt3.getX() + w40Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + w40Var.getY());
                        float min = Math.min(w40Var.getRight(), childAt3.getX() + w40Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(w40Var.getY() + w40Var.getMeasuredHeight(), childAt3.getY() + w40Var.getY() + q50Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + w40Var.getLeft(), childAt3.getY() + w40Var.getY());
                            float alpha = q50Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((q50Var.X2.getClipHeight() - q50Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.bs.g.getInterpolation(1.0f - alpha))) + q50Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.d4 d4Var4 = q50Var.X2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.j5[] j5VarArr = d4Var4.d;
                            if (TextUtils.isEmpty(j5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            j5VarArr[4].setFullAlpha(alpha);
                            j5VarArr[4].h(0, 0);
                            d4Var4.invalidate();
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (q50Var.X2 != null) {
            if (q50Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), q50Var.W2);
            }
            float y14 = w40Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = w40Var.getChildCount();
            float y15 = w40Var.getY() + w40Var.getMeasuredHeight();
            if (q50Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        d4Var = null;
                        break;
                    }
                    View childAt4 = w40Var.getChildAt(i17);
                    d4Var = q50Var.X2;
                    if (childAt4 == d4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                d4Var = q50Var.X2;
            }
            if (d4Var != null && y14 < y15) {
                canvas3.save();
                if (q50Var.a3 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - q50Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * q50Var.d2) + ((1.0f - q50Var.d2) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (q50Var.b3) {
                    y3 = ((1.0f - q50Var.d2) * (d4Var.getY() + w40Var.getY())) + ((k30Var.getMeasuredWidth() + k30Var.getTop()) * q50Var.d2);
                    x10 = ((1.0f - q50Var.d2) * (d4Var.getX() + w40Var.getLeft())) + (q50Var.d2 * k30Var.getLeft());
                } else {
                    y3 = k30Var.getMeasuredWidth() + k30Var.getTop();
                    x10 = k30Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x10, f23);
                if (q50Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    d4Var2 = d4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    d4Var2 = d4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, d4Var.getMeasuredWidth(), d4Var.getClipHeight(), (int) (q50Var.d2 * f11), 31);
                }
                float clipHeight = (int) (((d4Var2.getClipHeight() - d4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.bs.g.getInterpolation(1.0f - q50Var.d2))) + d4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, d4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.d4 d4Var5 = d4Var2;
                d4Var5.setProgressToAvatarPreview(q50Var.b3 ? q50Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - q50Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                d4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (q50Var.e2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - q50Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (q50Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, q50Var.e2.getMeasuredWidth() + measuredWidth, q50Var.e2.getMeasuredHeight() + f24, (int) (q50Var.d2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    q50Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    q50Var.e2.setTranslationY(f24 - r4.getTop());
                    float f25 = (q50Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (q50Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    q50Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (q50Var.c2.n) {
                return;
            }
            canvas3.save();
            if (q50Var.b3 && q50Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - q50Var.d2) * y14, getMeasuredWidth(), (q50Var.d2 * getMeasuredHeight()) + ((1.0f - q50Var.d2) * y15));
            }
            canvas3.scale(k30Var.getScaleX(), k30Var.getScaleY(), k30Var.getX(), k30Var.getY());
            canvas3.translate(k30Var.getX(), k30Var.getY());
            k30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        q50 q50Var = this.D0;
        u20 u20Var = q50Var.e;
        d30 d30Var = q50Var.m2;
        w40 w40Var = q50Var.Q;
        h30 h30Var = q50Var.a2;
        if (q50Var.s2) {
            if (view == w40Var) {
                int childCount = w40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = w40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == h30Var || view == u20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (q50.G3 || h30Var.c != 1.0f || (view != q50Var.O && view != q50Var.g0 && view != q50Var.N && view != q50Var.e1 && view != q50Var.z1 && view != q50Var.U0)) {
            if (q50Var.F2 && view == h30Var) {
                canvas.save();
                canvas.translate(d30Var.getX() + h30Var.getX(), d30Var.getY() + h30Var.getY());
                d30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != q50Var.C2 && view != q50Var.e2 && view != q50Var.X2 && (!q50Var.l2 || !q50Var.g2 || (view != w40Var && view != u20Var && view != q50Var.c0))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0.Z.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int dp = AndroidUtilities.dp(74.0f);
        q50 q50Var = this.D0;
        ImageReceiver imageReceiver = q50Var.Z;
        Drawable drawable = q50Var.f0;
        h30 h30Var = q50Var.a2;
        float f10 = q50Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        q50Var.R1();
        if (h30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.h6.t0.setColor(q50Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.x0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.t0);
            }
            org.telegram.ui.ActionBar.h6.t0.setColor(Color.argb((int) (q50Var.O.getAlpha() * 255.0f), (int) (Color.red(q50Var.V1) * 0.8f), (int) (Color.green(q50Var.V1) * 0.8f), (int) (Color.blue(q50Var.V1) * 0.8f)));
            float statusBarHeight = q50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.h6.t0);
            b40 b40Var = q50Var.z0;
            if (b40Var != null) {
                org.telegram.ui.ActionBar.h6.t0.setColor(b40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, q50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.h6.t0);
            }
        }
        if (h30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.h6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false), (int) (h30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.t0);
        }
        if (q50Var.s1() && LiteMode.isEnabled(512)) {
            if (h30Var.c < 0.15d) {
                if (!q50Var.z2) {
                    q50Var.z2 = true;
                    q50Var.A1();
                }
            } else if (q50Var.z2) {
                q50Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(q50Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q50 q50Var = this.D0;
        k30 k30Var = q50Var.C2;
        if (q50Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = q50Var.e2.getX();
            float y10 = q50Var.e2.getY();
            float x12 = q50Var.e2.getX() + q50Var.e2.getMeasuredWidth();
            float y11 = q50Var.e2.getY() + q50Var.e2.getMeasuredHeight();
            RectF rectF = this.x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(k30Var.getX(), k30Var.getY(), k30Var.getX() + k30Var.getMeasuredWidth(), k30Var.getY() + k30Var.getMeasuredWidth() + q50Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                q50Var.e1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || q50Var.y0 == 0.0f || motionEvent.getY() >= q50Var.y0 - AndroidUtilities.dp(37.0f) || q50Var.O.getAlpha() != 0.0f || q50Var.f2 || q50Var.z0 != null || q50Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        q50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        q50 q50Var = this.D0;
        if (q50Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        q50Var.e1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.lw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        q50 q50Var = this.D0;
        View view = q50Var.K2;
        View view2 = q50Var.J2;
        u20 u20Var = q50Var.e;
        h30 h30Var = q50Var.a2;
        w40 w40Var = q50Var.Q;
        if (q50.G3 && this.A0 != q50Var.I2 && this.B0) {
            f7 = w40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = q50Var.I2;
        h30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        h30Var.s = false;
        q50.K0(q50Var);
        this.B0 = true;
        if (!z11 || w40Var.getLeft() == f7) {
            return;
        }
        float left = f7 - w40Var.getLeft();
        w40Var.setTranslationX(left);
        u20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = w40Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
        duration.setInterpolator(bsVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
        u20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int y3;
        q50 q50Var = this.D0;
        r30 r30Var = q50Var.G;
        a30 a30Var = q50Var.N;
        LinearLayout linearLayout = q50Var.z1;
        m40 m40Var = q50Var.O;
        w50 w50Var = q50Var.o2;
        org.telegram.ui.Components.a30 a30Var2 = q50Var.p2;
        org.telegram.ui.Components.xz xzVar = q50Var.Y;
        org.telegram.ui.Components.voip.t2 t2Var = q50Var.w;
        org.telegram.ui.ActionBar.j5 j5Var = q50Var.U;
        View view = q50Var.g0;
        u20 u20Var = q50Var.e;
        View view2 = q50Var.K2;
        View view3 = q50Var.J2;
        ArrayList arrayList = q50Var.Y1;
        org.telegram.ui.ActionBar.j5 j5Var2 = q50Var.W;
        p30 p30Var = q50Var.H;
        ArrayList arrayList2 = q50Var.Z1;
        org.telegram.ui.Components.jm0 jm0Var = q50Var.n2;
        w40 w40Var = q50Var.Q;
        h30 h30Var = q50Var.a2;
        d30 d30Var = q50Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.w0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        h30Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !q50Var.s1();
        if (q50.F3 != z11) {
            q50.F3 = z11;
            if (t2Var.getMeasuredWidth() == 0) {
                int i13 = t2Var.getLayoutParams().width;
            }
            q50.I0(q50Var);
            xzVar.y1(q50.F3 ? 6 : 2);
            w40Var.a0();
            d30Var.a0();
            this.z0 = true;
            TextView textView = q50Var.S;
            if (textView != null) {
                textView.setVisibility(!q50.F3 ? 0 : 8);
            }
            if (q50Var.r1() == z11 && q50Var.s1() && !h30Var.b && !q50Var.a1.visibleVideoParticipants.isEmpty()) {
                q50Var.f1(q50Var.a1.visibleVideoParticipants.get(0));
                h30Var.e();
            }
        }
        if (q50.G3 != z12) {
            q50.G3 = z12;
            jm0Var.setVisibility(z12 ? 0 : 8);
            w40Var.a0();
            d30Var.a0();
            z10 = true;
            this.z0 = true;
        } else {
            z10 = true;
        }
        if (this.z0) {
            q50Var.P0(z10);
            q50Var.P.l();
            a30Var2.G(jm0Var, false);
            if (q50.G3) {
                w50Var.I(jm0Var, false);
            }
            jm0Var.setVisibility(q50.G3 ? 0 : 8);
            w50Var.H(jm0Var, q50.G3 && !h30Var.b, true);
            boolean z13 = q50.G3;
            q50Var.P2 = !z13 || h30Var.b;
            boolean z14 = !z13 && h30Var.b;
            a30Var2.F(d30Var, z14);
            d30Var.setVisibility(z14 ? 0 : 8);
            w40Var.setVisibility((q50.G3 || !h30Var.b) ? 0 : 8);
            xzVar.y1(q50.F3 ? 6 : 2);
            q50Var.O1(false, false);
            w40Var.a0();
            d30Var.a0();
            AndroidUtilities.updateVisibleRows(w40Var);
            this.z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            h30Var.setIsTablet(q50.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (q50Var.s1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h30Var.getLayoutParams();
        if (q50.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q50Var.j0[i15].getLayoutParams();
            if (q50.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (jm0Var != null) {
            ((FrameLayout.LayoutParams) jm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (p30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) p30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(q50Var.s1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) w40Var.getLayoutParams();
        if (q50.G3) {
            layoutParams3.gravity = q50Var.I2 ? 5 : 1;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp3 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp3;
            layoutParams3.rightMargin = dp3;
            layoutParams3.bottomMargin = dp2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp = AndroidUtilities.dp(60.0f);
            f7 = 90.0f;
        } else {
            f7 = 90.0f;
            if (q50.F3) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                dp = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                dp = AndroidUtilities.dp(60.0f);
                layoutParams3.bottomMargin = dp2;
                layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp4 = AndroidUtilities.dp(14.0f);
                layoutParams3.leftMargin = dp4;
                layoutParams3.rightMargin = dp4;
            }
        }
        if (!q50.F3 || q50.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (q50.G3) {
                layoutParams4.gravity = q50Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (q50.G3) {
                layoutParams5.gravity = q50Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (q50.F3) {
            d30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            d30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) u20Var.getLayoutParams();
        if (q50.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = q50Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (q50.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!q50.F3 || q50.G3) {
            ((FrameLayout.LayoutParams) m40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) a30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) m40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) a30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) d30Var.getLayoutParams();
        if (q50.F3) {
            if (((s4.b0) d30Var.getLayoutManager()).o != 1) {
                ((s4.b0) d30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.b0) d30Var.getLayoutManager()).o != 0) {
                ((s4.b0) d30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        r30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (p30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) p30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (q50.G3) {
            y3 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            y3 = org.telegram.messenger.g0.y(8.0f, paddingTop - max, 0);
        }
        if (w40Var.getPaddingTop() != y3 || w40Var.getPaddingBottom() != dp) {
            w40Var.setPadding(i12, y3, i12, dp);
        }
        o50 o50Var = q50Var.B1;
        if (o50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) o50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J0 = q50.J0(q50Var);
            if (J0 != null) {
                int measuredHeight = ((u20Var.getMeasuredHeight() / 2) + u20Var.getTop()) - (q50Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = J0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + y3;
                layoutParams9.topMargin = i2.e.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        f50 f50Var = q50Var.U0;
        if (f50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) f50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J02 = q50.J0(q50Var);
            if (J02 != null) {
                layoutParams10.height = J02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = J02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (j5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - y3)) / 2) + y3;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) q50Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    j5Var.setVisibility(0);
                    j5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            j5Var.setVisibility(4);
            j5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(h30Var.b, true);
        }
        this.w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.y0) {
            this.y0 = measuredHeight3;
            q50Var.e1(false);
        }
        q50Var.r2.f = getMeasuredWidth();
        q50Var.Z0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.D0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.D0.R1();
    }
}
