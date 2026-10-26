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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z40 extends org.telegram.ui.Components.vw0 {
    public boolean l0;
    public final RectF m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final HashMap r0;
    public final /* synthetic */ v50 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.s0 = v50Var;
        this.l0 = false;
        this.m0 = new RectF();
        this.r0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.i4 i4Var;
        float f11;
        float y3;
        float x9;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.i4 i4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x10;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z11;
        Shader.TileMode tileMode;
        v50 v50Var = this.s0;
        t50 t50Var = v50Var.B1;
        View view = v50Var.K2;
        View view2 = v50Var.J2;
        ArrayList arrayList2 = v50Var.Y1;
        nh.h hVar = v50Var.c0;
        Paint paint = v50Var.C0;
        i30 i30Var = v50Var.m2;
        p30 p30Var = v50Var.C2;
        m30 m30Var = v50Var.a2;
        b50 b50Var = v50Var.Q;
        if (v50Var.s2 || v50Var.F2) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (v50Var.Q2 == null) {
                    v50Var.Q2 = new RenderNode("CallActivity.Blur");
                    v50Var.R2 = org.telegram.ui.Components.vw0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.vw0.getBlurRadius();
                    RenderNode renderNode = v50Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = v50Var.Q2;
                    float f15 = v50Var.R2;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / v50Var.R2);
                int round2 = Math.round(getMeasuredHeight() / v50Var.R2);
                v50Var.s2 = true;
                v50Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = v50Var.Q2.beginRecording();
                float f16 = 1.0f / v50Var.R2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                v50Var.Q2.endRecording();
                v50Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < b50Var.getChildCount(); i11++) {
            View childAt = b50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                z11 = true;
                ((org.telegram.ui.Cells.i4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != b50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((b50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (m30Var.r == null) {
            for (int i12 = 0; i12 < i30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.b30) i30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (i30Var.getVisibility() == 0) {
            HashMap hashMap = this.r0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < b50Var.getChildCount()) {
                View childAt2 = b50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        b50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != m30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.i4) {
                        b50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.i4 i4Var3 = (org.telegram.ui.Cells.i4) childAt2;
                            hashMap.put(i4Var3.getParticipant(), i4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < i30Var.getChildCount()) {
                org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) i30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(b30Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(b30Var.getParticipant());
                }
                float f17 = m30Var.c;
                HashMap hashMap2 = hashMap;
                if (!v50Var.N2.k()) {
                    b30Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x10 = (b50Var.getX() + lVar3.getLeft()) - m30Var.getLeft();
                        f12 = (b50Var.getY() + lVar3.getTop()) - m30Var.getTop();
                        f13 = i30Var.getX() + b30Var.getLeft();
                        f14 = i30Var.getY() + b30Var.getTop();
                    } else {
                        x10 = ((b50Var.getX() + r14.getLeft()) - m30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((b50Var.getY() + r14.getTop()) - m30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x11 = i30Var.getX() + b30Var.getLeft() + (b30Var.getMeasuredWidth() >> 1);
                        float y11 = i30Var.getY() + b30Var.getTop() + (b30Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.i4) view3).setDrawAvatar(false);
                        f12 = y10;
                        f13 = x11;
                        f14 = y11;
                    }
                    float f18 = 1.0f - f17;
                    b30Var.setTranslationX((x10 - f13) * f18);
                    b30Var.setTranslationY((f12 - f14) * f18);
                    b30Var.setScaleX(1.0f);
                    b30Var.setScaleY(1.0f);
                    b30Var.setProgressToFullscreen(f17);
                } else {
                    b30Var.setScaleX(1.0f);
                    b30Var.setScaleY(1.0f);
                    b30Var.setTranslationX(0.0f);
                    b30Var.setTranslationY(0.0f);
                    b30Var.setProgressToFullscreen(1.0f);
                    if (b30Var.getRenderer() == null) {
                        b30Var.setAlpha(f17);
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
            org.telegram.ui.Components.mm0 mm0Var = v50Var.n2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.P) {
                arrayList = arrayList2;
            } else {
                tVar.y0 = false;
                float f19 = m30Var.c;
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
                            mm0Var = b50Var;
                        }
                        float x12 = ((mm0Var.getX() + lVar5.getX()) - tVar.getLeft()) - m30Var.getLeft();
                        float y12 = ((mm0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - m30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        tVar.setTranslationX((x12 * f20) + f21);
                        tVar.setTranslationY((y12 * f20) + f21);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.b30 b30Var2 = tVar.d;
                    if (b30Var2 != null) {
                        b30Var2.setAlpha(f19);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f19);
                    } else if (!tVar.E) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.b30 b30Var3 = tVar.d;
                    if (b30Var3 != null) {
                        i30Var.getClass();
                        if (RecyclerView.R(b30Var3) == -1) {
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
                        tVar.setTranslationX((i30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((i30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    mm0Var = b50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (v50.G3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            mm0Var = b50Var;
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
                            tVar.setTranslationX(((mm0Var.getX() + lVar8.getX()) - tVar.getLeft()) - m30Var.getLeft());
                            tVar.setTranslationY(((mm0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - m30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.E) {
                                if (!v50.G3) {
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
        if (v50.G3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - m30Var.c);
            view.setAlpha(1.0f - m30Var.c);
        }
        if (m30Var.L0) {
            b50Var.setAlpha(f10 - m30Var.c);
        } else {
            b50Var.setAlpha(f10);
        }
        if (t50Var != null) {
            t50Var.setAlpha(f10 - m30Var.c);
            t50Var.setTranslationY(m30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (v50Var.F2) {
            return;
        }
        boolean z12 = v50Var.f2;
        RectF rectF = this.m0;
        if (!z12) {
            if (v50Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), v50Var.W2);
                float y13 = b50Var.getY();
                b50Var.getY();
                b50Var.getMeasuredHeight();
                if (!v50Var.b3) {
                    if (v50Var.a3 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = v50Var.Z2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(m30Var.getX() + v50Var.Z2.getX(), m30Var.getY() + v50Var.Z2.getY());
                        v50Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(m30Var.getX() + i30Var.getX() + v50Var.a3.getX(), m30Var.getY() + i30Var.getY() + v50Var.a3.getY());
                    if (v50Var.a3.getRenderer() == null || !v50Var.a3.getRenderer().v || v50Var.a3.getRenderer().b) {
                        v50Var.a3.draw(canvas);
                    } else {
                        v50Var.a3.getRenderer().draw(canvas);
                    }
                    v50Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = b50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = b50Var.getChildAt(i16);
                    if (childAt3 == v50Var.X2) {
                        float max = Math.max(b50Var.getLeft(), childAt3.getX() + b50Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + b50Var.getY());
                        float min = Math.min(b50Var.getRight(), childAt3.getX() + b50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(b50Var.getY() + b50Var.getMeasuredHeight(), childAt3.getY() + b50Var.getY() + v50Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + b50Var.getLeft(), childAt3.getY() + b50Var.getY());
                            float alpha = v50Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((v50Var.X2.getClipHeight() - v50Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.ds.g.getInterpolation(1.0f - alpha))) + v50Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.i4 i4Var4 = v50Var.X2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.b6[] b6VarArr = i4Var4.d;
                            if (TextUtils.isEmpty(b6VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            b6VarArr[4].setFullAlpha(alpha);
                            b6VarArr[4].h(0, 0);
                            i4Var4.invalidate();
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
        if (v50Var.X2 != null) {
            if (v50Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), v50Var.W2);
            }
            float y14 = b50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = b50Var.getChildCount();
            float y15 = b50Var.getY() + b50Var.getMeasuredHeight();
            if (v50Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        i4Var = null;
                        break;
                    }
                    View childAt4 = b50Var.getChildAt(i17);
                    i4Var = v50Var.X2;
                    if (childAt4 == i4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                i4Var = v50Var.X2;
            }
            if (i4Var != null && y14 < y15) {
                canvas3.save();
                if (v50Var.a3 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - v50Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * v50Var.d2) + ((1.0f - v50Var.d2) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (v50Var.b3) {
                    y3 = ((1.0f - v50Var.d2) * (i4Var.getY() + b50Var.getY())) + ((p30Var.getMeasuredWidth() + p30Var.getTop()) * v50Var.d2);
                    x9 = ((1.0f - v50Var.d2) * (i4Var.getX() + b50Var.getLeft())) + (v50Var.d2 * p30Var.getLeft());
                } else {
                    y3 = p30Var.getMeasuredWidth() + p30Var.getTop();
                    x9 = p30Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x9, f23);
                if (v50Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    i4Var2 = i4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    i4Var2 = i4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, i4Var.getMeasuredWidth(), i4Var.getClipHeight(), (int) (v50Var.d2 * f11), 31);
                }
                float clipHeight = (int) (((i4Var2.getClipHeight() - i4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.ds.g.getInterpolation(1.0f - v50Var.d2))) + i4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, i4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.i4 i4Var5 = i4Var2;
                i4Var5.setProgressToAvatarPreview(v50Var.b3 ? v50Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - v50Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                i4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (v50Var.e2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - v50Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (v50Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, v50Var.e2.getMeasuredWidth() + measuredWidth, v50Var.e2.getMeasuredHeight() + f24, (int) (v50Var.d2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    v50Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    v50Var.e2.setTranslationY(f24 - r4.getTop());
                    float f25 = (v50Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (v50Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    v50Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (v50Var.c2.n) {
                return;
            }
            canvas3.save();
            if (v50Var.b3 && v50Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - v50Var.d2) * y14, getMeasuredWidth(), (v50Var.d2 * getMeasuredHeight()) + ((1.0f - v50Var.d2) * y15));
            }
            canvas3.scale(p30Var.getScaleX(), p30Var.getScaleY(), p30Var.getX(), p30Var.getY());
            canvas3.translate(p30Var.getX(), p30Var.getY());
            p30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        v50 v50Var = this.s0;
        z20 z20Var = v50Var.e;
        i30 i30Var = v50Var.m2;
        b50 b50Var = v50Var.Q;
        m30 m30Var = v50Var.a2;
        if (v50Var.s2) {
            if (view == b50Var) {
                int childCount = b50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = b50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == m30Var || view == z20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (v50.G3 || m30Var.c != 1.0f || (view != v50Var.O && view != v50Var.g0 && view != v50Var.N && view != v50Var.e1 && view != v50Var.z1 && view != v50Var.U0)) {
            if (v50Var.F2 && view == m30Var) {
                canvas.save();
                canvas.translate(i30Var.getX() + m30Var.getX(), i30Var.getY() + m30Var.getY());
                i30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != v50Var.C2 && view != v50Var.e2 && view != v50Var.X2 && (!v50Var.l2 || !v50Var.g2 || (view != b50Var && view != z20Var && view != v50Var.c0))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.Z.onDetachedFromWindow();
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
        v50 v50Var = this.s0;
        ImageReceiver imageReceiver = v50Var.Z;
        Drawable drawable = v50Var.f0;
        m30 m30Var = v50Var.a2;
        float f10 = v50Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        v50Var.R1();
        if (m30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.y6.t0.setColor(v50Var.V1);
                i16 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.m0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.y6.t0);
            }
            org.telegram.ui.ActionBar.y6.t0.setColor(Color.argb((int) (v50Var.O.getAlpha() * 255.0f), (int) (Color.red(v50Var.V1) * 0.8f), (int) (Color.green(v50Var.V1) * 0.8f), (int) (Color.blue(v50Var.V1) * 0.8f)));
            float statusBarHeight = v50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.y6.t0);
            g40 g40Var = v50Var.z0;
            if (g40Var != null) {
                org.telegram.ui.ActionBar.y6.t0.setColor(g40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, v50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.y6.t0);
            }
        }
        if (m30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.y6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false), (int) (m30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.t0);
        }
        if (v50Var.r1() && LiteMode.isEnabled(512)) {
            if (m30Var.c < 0.15d) {
                if (!v50Var.z2) {
                    v50Var.z2 = true;
                    v50Var.z1();
                }
            } else if (v50Var.z2) {
                v50Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(v50Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        v50 v50Var = this.s0;
        p30 p30Var = v50Var.C2;
        if (v50Var.X2 != null && motionEvent.getAction() == 0) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x10 = v50Var.e2.getX();
            float y10 = v50Var.e2.getY();
            float x11 = v50Var.e2.getX() + v50Var.e2.getMeasuredWidth();
            float y11 = v50Var.e2.getY() + v50Var.e2.getMeasuredHeight();
            RectF rectF = this.m0;
            rectF.set(x10, y10, x11, y11);
            boolean z10 = !rectF.contains(x9, y3);
            rectF.set(p30Var.getX(), p30Var.getY(), p30Var.getX() + p30Var.getMeasuredWidth(), p30Var.getY() + p30Var.getMeasuredWidth() + v50Var.X2.getMeasuredHeight());
            if (rectF.contains(x9, y3)) {
                z10 = false;
            }
            if (z10) {
                v50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || v50Var.y0 == 0.0f || motionEvent.getY() >= v50Var.y0 - AndroidUtilities.dp(37.0f) || v50Var.O.getAlpha() != 0.0f || v50Var.f2 || v50Var.z0 != null || v50Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        v50 v50Var = this.s0;
        if (v50Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        v50Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.vw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        v50 v50Var = this.s0;
        View view = v50Var.K2;
        View view2 = v50Var.J2;
        z20 z20Var = v50Var.e;
        m30 m30Var = v50Var.a2;
        b50 b50Var = v50Var.Q;
        if (v50.G3 && this.p0 != v50Var.I2 && this.q0) {
            f7 = b50Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.p0 = v50Var.I2;
        m30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        m30Var.s = false;
        v50.J0(v50Var);
        this.q0 = true;
        if (!z11 || b50Var.getLeft() == f7) {
            return;
        }
        float left = f7 - b50Var.getLeft();
        b50Var.setTranslationX(left);
        z20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = b50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
        duration.setInterpolator(dsVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        z20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int z11;
        v50 v50Var = this.s0;
        w30 w30Var = v50Var.G;
        f30 f30Var = v50Var.N;
        LinearLayout linearLayout = v50Var.z1;
        r40 r40Var = v50Var.O;
        b60 b60Var = v50Var.o2;
        org.telegram.ui.Components.c30 c30Var = v50Var.p2;
        org.telegram.ui.Components.xz xzVar = v50Var.Y;
        org.telegram.ui.Components.voip.w2 w2Var = v50Var.w;
        org.telegram.ui.ActionBar.b6 b6Var = v50Var.U;
        View view = v50Var.g0;
        z20 z20Var = v50Var.e;
        View view2 = v50Var.K2;
        View view3 = v50Var.J2;
        ArrayList arrayList = v50Var.Y1;
        org.telegram.ui.ActionBar.b6 b6Var2 = v50Var.W;
        u30 u30Var = v50Var.H;
        ArrayList arrayList2 = v50Var.Z1;
        org.telegram.ui.Components.mm0 mm0Var = v50Var.n2;
        b50 b50Var = v50Var.Q;
        m30 m30Var = v50Var.a2;
        i30 i30Var = v50Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.l0 = true;
        boolean z12 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        m30Var.getClass();
        boolean z13 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !v50Var.r1();
        if (v50.F3 != z12) {
            v50.F3 = z12;
            if (w2Var.getMeasuredWidth() == 0) {
                int i13 = w2Var.getLayoutParams().width;
            }
            v50.H0(v50Var);
            xzVar.z1(v50.F3 ? 6 : 2);
            b50Var.a0();
            i30Var.a0();
            this.o0 = true;
            TextView textView = v50Var.S;
            if (textView != null) {
                textView.setVisibility(!v50.F3 ? 0 : 8);
            }
            if (v50Var.q1() == z12 && v50Var.r1() && !m30Var.b && !v50Var.a1.visibleVideoParticipants.isEmpty()) {
                v50Var.e1(v50Var.a1.visibleVideoParticipants.get(0));
                m30Var.e();
            }
        }
        if (v50.G3 != z13) {
            v50.G3 = z13;
            mm0Var.setVisibility(z13 ? 0 : 8);
            b50Var.a0();
            i30Var.a0();
            z10 = true;
            this.o0 = true;
        } else {
            z10 = true;
        }
        if (this.o0) {
            v50Var.O0(z10);
            v50Var.P.l();
            c30Var.G(mm0Var, false);
            if (v50.G3) {
                b60Var.I(mm0Var, false);
            }
            mm0Var.setVisibility(v50.G3 ? 0 : 8);
            b60Var.H(mm0Var, v50.G3 && !m30Var.b, true);
            boolean z14 = v50.G3;
            v50Var.P2 = !z14 || m30Var.b;
            boolean z15 = !z14 && m30Var.b;
            c30Var.F(i30Var, z15);
            i30Var.setVisibility(z15 ? 0 : 8);
            b50Var.setVisibility((v50.G3 || !m30Var.b) ? 0 : 8);
            xzVar.z1(v50.F3 ? 6 : 2);
            v50Var.O1(false, false);
            b50Var.a0();
            i30Var.a0();
            AndroidUtilities.updateVisibleRows(b50Var);
            this.o0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            m30Var.setIsTablet(v50.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (v50Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m30Var.getLayoutParams();
        if (v50.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) v50Var.j0[i15].getLayoutParams();
            if (v50.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (mm0Var != null) {
            ((FrameLayout.LayoutParams) mm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (u30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) u30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(v50Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) b50Var.getLayoutParams();
        if (v50.G3) {
            layoutParams3.gravity = v50Var.I2 ? 5 : 1;
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
            if (v50.F3) {
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
        if (!v50.F3 || v50.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (v50.G3) {
                layoutParams4.gravity = v50Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (v50.G3) {
                layoutParams5.gravity = v50Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (v50.F3) {
            i30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            i30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) z20Var.getLayoutParams();
        if (v50.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = v50Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (v50.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!v50.F3 || v50.G3) {
            ((FrameLayout.LayoutParams) r40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) f30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) r40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) f30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) i30Var.getLayoutParams();
        if (v50.F3) {
            if (((s4.c0) i30Var.getLayoutManager()).o != 1) {
                ((s4.c0) i30Var.getLayoutManager()).k1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) i30Var.getLayoutManager()).o != 0) {
                ((s4.c0) i30Var.getLayoutManager()).k1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        w30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) w30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (u30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) u30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (v50.G3) {
            z11 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            z11 = org.telegram.messenger.t.z(8.0f, paddingTop - max, 0);
        }
        if (b50Var.getPaddingTop() != z11 || b50Var.getPaddingBottom() != dp) {
            b50Var.setPadding(i12, z11, i12, dp);
        }
        t50 t50Var = v50Var.B1;
        if (t50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) t50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = v50.I0(v50Var);
            if (I0 != null) {
                int measuredHeight = ((z20Var.getMeasuredHeight() / 2) + z20Var.getTop()) - (v50Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + z11;
                layoutParams9.topMargin = ic.a.A(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        k50 k50Var = v50Var.U0;
        if (k50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) k50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = v50.I0(v50Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (b6Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - z11)) / 2) + z11;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) b6Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) v50Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    b6Var.setVisibility(0);
                    b6Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            b6Var.setVisibility(4);
            b6Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(m30Var.b, true);
        }
        this.l0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.n0) {
            this.n0 = measuredHeight3;
            v50Var.d1(false);
        }
        v50Var.r2.f = getMeasuredWidth();
        v50Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.s0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.s0.R1();
    }
}
