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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w40 extends org.telegram.ui.Components.zu0 {
    public boolean s0;
    public final RectF t0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public final HashMap y0;
    public final /* synthetic */ s50 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.z0 = s50Var;
        this.s0 = false;
        this.t0 = new RectF();
        this.y0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.b4 b4Var;
        float f11;
        float y10;
        float x8;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.b4 b4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x10;
        float f12;
        float f13;
        float f14;
        int i10;
        Shader.TileMode tileMode;
        s50 s50Var = this.z0;
        q50 q50Var = s50Var.x1;
        View view = s50Var.G2;
        View view2 = s50Var.F2;
        ArrayList arrayList2 = s50Var.U1;
        ug.i iVar = s50Var.Y;
        Paint paint = s50Var.y0;
        f30 f30Var = s50Var.i2;
        m30 m30Var = s50Var.y2;
        j30 j30Var = s50Var.W1;
        y40 y40Var = s50Var.M;
        if (!s50Var.o2 && !s50Var.B2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (s50Var.M2 == null) {
                    s50Var.M2 = new RenderNode("CallActivity.Blur");
                    s50Var.N2 = org.telegram.ui.Components.zu0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.zu0.getBlurRadius();
                    RenderNode renderNode = s50Var.M2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    iVar.setBlurRoot(this);
                    RenderNode renderNode2 = s50Var.M2;
                    float f15 = s50Var.N2;
                    iVar.S0 = renderNode2;
                    iVar.T0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / s50Var.N2);
                int round2 = Math.round(getMeasuredHeight() / s50Var.N2);
                s50Var.o2 = true;
                s50Var.M2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = s50Var.M2.beginRecording();
                float f16 = 1.0f / s50Var.N2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                s50Var.M2.endRecording();
                s50Var.o2 = false;
            }
        }
        for (int i11 = 0; i11 < y40Var.getChildCount(); i11++) {
            View childAt = y40Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                ((org.telegram.ui.Cells.b4) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != y40Var.getMeasuredWidth()) {
                    childAt.setTranslationX((y40Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (j30Var.r == null) {
            for (int i12 = 0; i12 < f30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.e20) f30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (f30Var.getVisibility() == 0) {
            HashMap hashMap = this.y0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < y40Var.getChildCount()) {
                View childAt2 = y40Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        y40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != j30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.b4) {
                        y40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.b4 b4Var3 = (org.telegram.ui.Cells.b4) childAt2;
                            hashMap.put(b4Var3.getParticipant(), b4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < f30Var.getChildCount()) {
                org.telegram.ui.Components.e20 e20Var = (org.telegram.ui.Components.e20) f30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(e20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(e20Var.getParticipant());
                }
                float f17 = j30Var.c;
                HashMap hashMap2 = hashMap;
                if (!s50Var.J2.k()) {
                    e20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x10 = (y40Var.getX() + lVar3.getLeft()) - j30Var.getLeft();
                        f12 = (y40Var.getY() + lVar3.getTop()) - j30Var.getTop();
                        f13 = f30Var.getX() + e20Var.getLeft();
                        f14 = f30Var.getY() + e20Var.getTop();
                    } else {
                        x10 = ((y40Var.getX() + r14.getLeft()) - j30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((y40Var.getY() + r14.getTop()) - j30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x11 = f30Var.getX() + e20Var.getLeft() + (e20Var.getMeasuredWidth() >> 1);
                        float y12 = f30Var.getY() + e20Var.getTop() + (e20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.b4) view3).setDrawAvatar(false);
                        f12 = y11;
                        f13 = x11;
                        f14 = y12;
                    }
                    float f18 = 1.0f - f17;
                    e20Var.setTranslationX((x10 - f13) * f18);
                    e20Var.setTranslationY((f12 - f14) * f18);
                    e20Var.setScaleX(1.0f);
                    e20Var.setScaleY(1.0f);
                    e20Var.setProgressToFullscreen(f17);
                } else {
                    e20Var.setScaleX(1.0f);
                    e20Var.setScaleY(1.0f);
                    e20Var.setTranslationX(0.0f);
                    e20Var.setTranslationY(0.0f);
                    e20Var.setProgressToFullscreen(1.0f);
                    if (e20Var.getRenderer() == null) {
                        e20Var.setAlpha(f17);
                    }
                }
                i14++;
                hashMap = hashMap2;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList2.get(i15);
            org.telegram.ui.Components.zk0 zk0Var = s50Var.j2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.L) {
                arrayList = arrayList2;
            } else {
                tVar.u0 = false;
                float f19 = j30Var.c;
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
                            zk0Var = y40Var;
                        }
                        float x12 = ((zk0Var.getX() + lVar5.getX()) - tVar.getLeft()) - j30Var.getLeft();
                        float y13 = ((zk0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - j30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        tVar.setTranslationX((x12 * f20) + f21);
                        tVar.setTranslationY((y13 * f20) + f21);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.e20 e20Var2 = tVar.d;
                    if (e20Var2 != null) {
                        e20Var2.setAlpha(f19);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f19);
                    } else if (!tVar.A) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.e20 e20Var3 = tVar.d;
                    if (e20Var3 != null) {
                        f30Var.getClass();
                        if (RecyclerView.R(e20Var3) == -1) {
                            tVar.setAlpha(tVar.d.getAlpha());
                        } else if (tVar.c == null) {
                            if (tVar.v && !tVar.A) {
                                tVar.setAlpha(f19);
                            }
                            tVar.d.setAlpha(f19);
                            f19 = 1.0f;
                        } else {
                            tVar.d.setAlpha(1.0f);
                            if (tVar.v && !tVar.A) {
                                tVar.setAlpha(1.0f);
                            }
                        }
                        tVar.setTranslationX((f30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((f30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    zk0Var = y40Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (s50.C3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            zk0Var = y40Var;
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
                            tVar.setTranslationX(((zk0Var.getX() + lVar8.getX()) - tVar.getLeft()) - j30Var.getLeft());
                            tVar.setTranslationY(((zk0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - j30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.A) {
                                if (!s50.C3) {
                                    tVar.u0 = true;
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
        if (s50.C3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - j30Var.c);
            view.setAlpha(1.0f - j30Var.c);
        }
        if (j30Var.H0) {
            y40Var.setAlpha(f10 - j30Var.c);
        } else {
            y40Var.setAlpha(f10);
        }
        if (q50Var != null) {
            q50Var.setAlpha(f10 - j30Var.c);
            q50Var.setTranslationY(j30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (s50Var.B2) {
            return;
        }
        boolean z11 = s50Var.b2;
        RectF rectF = this.t0;
        if (!z11) {
            if (s50Var.T2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), s50Var.S2);
                float y14 = y40Var.getY();
                y40Var.getY();
                y40Var.getMeasuredHeight();
                if (!s50Var.X2) {
                    if (s50Var.W2 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = s50Var.V2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(j30Var.getX() + s50Var.V2.getX(), j30Var.getY() + s50Var.V2.getY());
                        s50Var.V2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(j30Var.getX() + f30Var.getX() + s50Var.W2.getX(), j30Var.getY() + f30Var.getY() + s50Var.W2.getY());
                    if (s50Var.W2.getRenderer() == null || !s50Var.W2.getRenderer().v || s50Var.W2.getRenderer().b) {
                        s50Var.W2.draw(canvas);
                    } else {
                        s50Var.W2.getRenderer().draw(canvas);
                    }
                    s50Var.W2.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = y40Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = y40Var.getChildAt(i16);
                    if (childAt3 == s50Var.T2) {
                        float max = Math.max(y40Var.getLeft(), childAt3.getX() + y40Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + y40Var.getY());
                        float min = Math.min(y40Var.getRight(), childAt3.getX() + y40Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(y40Var.getY() + y40Var.getMeasuredHeight(), childAt3.getY() + y40Var.getY() + s50Var.T2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + y40Var.getLeft(), childAt3.getY() + y40Var.getY());
                            float alpha = s50Var.S2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((s50Var.T2.getClipHeight() - s50Var.T2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.er.g.getInterpolation(1.0f - alpha))) + s50Var.T2.getMeasuredHeight()));
                            org.telegram.ui.Cells.b4 b4Var4 = s50Var.T2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.h5[] h5VarArr = b4Var4.d;
                            if (TextUtils.isEmpty(h5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            h5VarArr[4].setFullAlpha(alpha);
                            h5VarArr[4].h(0, 0);
                            b4Var4.invalidate();
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
        if (s50Var.T2 != null) {
            if (s50Var.c2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), s50Var.S2);
            }
            float y15 = y40Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = y40Var.getChildCount();
            float y16 = y40Var.getY() + y40Var.getMeasuredHeight();
            if (s50Var.X2) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        b4Var = null;
                        break;
                    }
                    View childAt4 = y40Var.getChildAt(i17);
                    b4Var = s50Var.T2;
                    if (childAt4 == b4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                b4Var = s50Var.T2;
            }
            if (b4Var != null && y15 < y16) {
                canvas3.save();
                if (s50Var.W2 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - s50Var.Z1) * y15, getMeasuredWidth(), (getMeasuredHeight() * s50Var.Z1) + ((1.0f - s50Var.Z1) * y16));
                } else {
                    f11 = 255.0f;
                }
                if (s50Var.X2) {
                    y10 = ((1.0f - s50Var.Z1) * (b4Var.getY() + y40Var.getY())) + ((m30Var.getMeasuredWidth() + m30Var.getTop()) * s50Var.Z1);
                    x8 = ((1.0f - s50Var.Z1) * (b4Var.getX() + y40Var.getLeft())) + (s50Var.Z1 * m30Var.getLeft());
                } else {
                    y10 = m30Var.getMeasuredWidth() + m30Var.getTop();
                    x8 = m30Var.getLeft();
                }
                float f23 = y10;
                canvas3.translate(x8, f23);
                if (s50Var.X2) {
                    fArr = fArr2;
                    path = path2;
                    b4Var2 = b4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    b4Var2 = b4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, b4Var.getMeasuredWidth(), b4Var.getClipHeight(), (int) (s50Var.Z1 * f11), 31);
                }
                float clipHeight = (int) (((b4Var2.getClipHeight() - b4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.er.g.getInterpolation(1.0f - s50Var.Z1))) + b4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, b4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.b4 b4Var5 = b4Var2;
                b4Var5.setProgressToAvatarPreview(s50Var.X2 ? s50Var.Z1 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - s50Var.Z1) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                b4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (s50Var.a2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - s50Var.a2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (s50Var.Z1 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, s50Var.a2.getMeasuredWidth() + measuredWidth, s50Var.a2.getMeasuredHeight() + f24, (int) (s50Var.Z1 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    s50Var.a2.setTranslationX(measuredWidth - r4.getLeft());
                    s50Var.a2.setTranslationY(f24 - r4.getTop());
                    float f25 = (s50Var.Z1 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (s50Var.a2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    s50Var.a2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (s50Var.Y1.n) {
                return;
            }
            canvas3.save();
            if (s50Var.X2 && s50Var.W2 == null) {
                canvas3.clipRect(0.0f, (1.0f - s50Var.Z1) * y15, getMeasuredWidth(), (s50Var.Z1 * getMeasuredHeight()) + ((1.0f - s50Var.Z1) * y16));
            }
            canvas3.scale(m30Var.getScaleX(), m30Var.getScaleY(), m30Var.getX(), m30Var.getY());
            canvas3.translate(m30Var.getX(), m30Var.getY());
            m30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        s50 s50Var = this.z0;
        v20 v20Var = s50Var.e;
        f30 f30Var = s50Var.i2;
        y40 y40Var = s50Var.M;
        j30 j30Var = s50Var.W1;
        if (s50Var.o2) {
            if (view == y40Var) {
                int childCount = y40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = y40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == j30Var || view == v20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (s50.C3 || j30Var.c != 1.0f || (view != s50Var.K && view != s50Var.c0 && view != s50Var.J && view != s50Var.a1 && view != s50Var.v1 && view != s50Var.Q0)) {
            if (s50Var.B2 && view == j30Var) {
                canvas.save();
                canvas.translate(f30Var.getX() + j30Var.getX(), f30Var.getY() + j30Var.getY());
                f30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != s50Var.y2 && view != s50Var.a2 && view != s50Var.T2 && (!s50Var.h2 || !s50Var.c2 || (view != y40Var && view != v20Var && view != s50Var.Y))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0.V.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.V.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
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
        s50 s50Var = this.z0;
        ImageReceiver imageReceiver = s50Var.V;
        Drawable drawable = s50Var.b0;
        j30 j30Var = s50Var.W1;
        float f11 = s50Var.u0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingTop;
        if (i11 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        s50Var.Q1();
        if (j30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.g6.t0.setColor(s50Var.R1);
                i16 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingTop;
                float f12 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingLeft;
                float f13 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.t0;
                rectF.set(i16, f12, f13, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.g6.t0);
            }
            org.telegram.ui.ActionBar.g6.t0.setColor(Color.argb((int) (s50Var.K.getAlpha() * 255.0f), (int) (Color.red(s50Var.R1) * 0.8f), (int) (Color.green(s50Var.R1) * 0.8f), (int) (Color.blue(s50Var.R1) * 0.8f)));
            float statusBarHeight = s50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.g6.t0);
            d40 d40Var = s50Var.v0;
            if (d40Var != null) {
                org.telegram.ui.ActionBar.g6.t0.setColor(d40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingLeft;
                float f14 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingLeft;
                canvas.drawRect(f14, 0.0f, measuredWidth3 - i15, s50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.g6.t0);
            }
        }
        if (j30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.g6.t0.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gg, false), (int) (j30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.t0);
        }
        if (s50Var.r1() && LiteMode.isEnabled(512)) {
            if (j30Var.c < 0.15d) {
                if (!s50Var.v2) {
                    s50Var.v2 = true;
                    s50Var.z1();
                }
            } else if (s50Var.v2) {
                s50Var.v2 = false;
                AndroidUtilities.cancelRunOnUIThread(s50Var.w2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        s50 s50Var = this.z0;
        m30 m30Var = s50Var.y2;
        if (s50Var.T2 != null && motionEvent.getAction() == 0) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x10 = s50Var.a2.getX();
            float y11 = s50Var.a2.getY();
            float x11 = s50Var.a2.getX() + s50Var.a2.getMeasuredWidth();
            float y12 = s50Var.a2.getY() + s50Var.a2.getMeasuredHeight();
            RectF rectF = this.t0;
            rectF.set(x10, y11, x11, y12);
            boolean z10 = !rectF.contains(x8, y10);
            rectF.set(m30Var.getX(), m30Var.getY(), m30Var.getX() + m30Var.getMeasuredWidth(), m30Var.getY() + m30Var.getMeasuredWidth() + s50Var.T2.getMeasuredHeight());
            if (rectF.contains(x8, y10)) {
                z10 = false;
            }
            if (z10) {
                s50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || s50Var.u0 == 0.0f || motionEvent.getY() >= s50Var.u0 - AndroidUtilities.dp(37.0f) || s50Var.K.getAlpha() != 0.0f || s50Var.b2 || s50Var.v0 != null || s50Var.W1.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        s50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        s50 s50Var = this.z0;
        if (s50Var.T2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        s50Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f10;
        boolean z11;
        s50 s50Var = this.z0;
        View view = s50Var.G2;
        View view2 = s50Var.F2;
        v20 v20Var = s50Var.e;
        j30 j30Var = s50Var.W1;
        y40 y40Var = s50Var.M;
        if (s50.C3 && this.w0 != s50Var.E2 && this.x0) {
            f10 = y40Var.getX();
            z11 = true;
        } else {
            f10 = 0.0f;
            z11 = false;
        }
        this.w0 = s50Var.E2;
        j30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        j30Var.s = false;
        s50.J0(s50Var);
        this.x0 = true;
        if (!z11 || y40Var.getLeft() == f10) {
            return;
        }
        float left = f10 - y40Var.getLeft();
        y40Var.setTranslationX(left);
        v20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = y40Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f;
        duration.setInterpolator(erVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
        v20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f10;
        int dp;
        float f11;
        int i12;
        int b10;
        s50 s50Var = this.z0;
        t30 t30Var = s50Var.C;
        c30 c30Var = s50Var.J;
        LinearLayout linearLayout = s50Var.v1;
        o40 o40Var = s50Var.K;
        y50 y50Var = s50Var.k2;
        org.telegram.ui.Components.f20 f20Var = s50Var.l2;
        org.telegram.ui.Components.cz czVar = s50Var.U;
        org.telegram.ui.Components.voip.u2 u2Var = s50Var.w;
        org.telegram.ui.ActionBar.h5 h5Var = s50Var.Q;
        View view = s50Var.c0;
        v20 v20Var = s50Var.e;
        View view2 = s50Var.G2;
        View view3 = s50Var.F2;
        ArrayList arrayList = s50Var.U1;
        org.telegram.ui.ActionBar.h5 h5Var2 = s50Var.S;
        r30 r30Var = s50Var.D;
        ArrayList arrayList2 = s50Var.V1;
        org.telegram.ui.Components.zk0 zk0Var = s50Var.j2;
        y40 y40Var = s50Var.M;
        j30 j30Var = s50Var.W1;
        f30 f30Var = s50Var.i2;
        int size = View.MeasureSpec.getSize(i11);
        this.s0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        j30Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !s50Var.r1();
        if (s50.B3 != z11) {
            s50.B3 = z11;
            if (u2Var.getMeasuredWidth() == 0) {
                int i13 = u2Var.getLayoutParams().width;
            }
            s50.H0(s50Var);
            czVar.y1(s50.B3 ? 6 : 2);
            y40Var.a0();
            f30Var.a0();
            this.v0 = true;
            TextView textView = s50Var.O;
            if (textView != null) {
                textView.setVisibility(!s50.B3 ? 0 : 8);
            }
            if (s50Var.q1() == z11 && s50Var.r1() && !j30Var.b && !s50Var.W0.visibleVideoParticipants.isEmpty()) {
                s50Var.e1(s50Var.W0.visibleVideoParticipants.get(0));
                j30Var.e();
            }
        }
        if (s50.C3 != z12) {
            s50.C3 = z12;
            zk0Var.setVisibility(z12 ? 0 : 8);
            y40Var.a0();
            f30Var.a0();
            z10 = true;
            this.v0 = true;
        } else {
            z10 = true;
        }
        if (this.v0) {
            s50Var.O0(z10);
            s50Var.L.l();
            f20Var.G(zk0Var, false);
            if (s50.C3) {
                y50Var.I(zk0Var, false);
            }
            zk0Var.setVisibility(s50.C3 ? 0 : 8);
            y50Var.H(zk0Var, s50.C3 && !j30Var.b, true);
            boolean z13 = s50.C3;
            s50Var.L2 = !z13 || j30Var.b;
            boolean z14 = !z13 && j30Var.b;
            f20Var.F(f30Var, z14);
            f30Var.setVisibility(z14 ? 0 : 8);
            y40Var.setVisibility((s50.C3 || !j30Var.b) ? 0 : 8);
            czVar.y1(s50.B3 ? 6 : 2);
            s50Var.N1(false, false);
            y40Var.a0();
            f30Var.a0();
            AndroidUtilities.updateVisibleRows(y40Var);
            this.v0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            j30Var.setIsTablet(s50.C3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (s50Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j30Var.getLayoutParams();
        if (s50.C3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s50Var.f0[i15].getLayoutParams();
            if (s50.C3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (zk0Var != null) {
            ((FrameLayout.LayoutParams) zk0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (r30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) r30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(s50Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) y40Var.getLayoutParams();
        if (s50.C3) {
            layoutParams3.gravity = s50Var.E2 ? 5 : 1;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp3 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp3;
            layoutParams3.rightMargin = dp3;
            layoutParams3.bottomMargin = dp2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp = AndroidUtilities.dp(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (s50.B3) {
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
        if (!s50.B3 || s50.C3) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (s50.C3) {
                layoutParams4.gravity = s50Var.E2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (s50.C3) {
                layoutParams5.gravity = s50Var.E2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (s50.B3) {
            f30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            f30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) v20Var.getLayoutParams();
        if (s50.C3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = s50Var.E2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (s50.B3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!s50.B3 || s50.C3) {
            ((FrameLayout.LayoutParams) o40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) o40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) f30Var.getLayoutParams();
        if (s50.B3) {
            if (((f2.k0) f30Var.getLayoutManager()).o != 1) {
                ((f2.k0) f30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.k0) f30Var.getLayoutManager()).o != 0) {
                ((f2.k0) f30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        t30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (r30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) r30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (s50.C3) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.y1.b(8.0f, paddingTop - max, 0);
        }
        if (y40Var.getPaddingTop() != b10 || y40Var.getPaddingBottom() != dp) {
            y40Var.setPadding(i12, b10, i12, dp);
        }
        q50 q50Var = s50Var.x1;
        if (q50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) q50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = s50.I0(s50Var);
            if (I0 != null) {
                int measuredHeight = ((v20Var.getMeasuredHeight() / 2) + v20Var.getTop()) - (s50Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = i0.a.B(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        h50 h50Var = s50Var.Q0;
        if (h50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) h50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = s50.I0(s50Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (h5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) h5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) s50Var.R.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    h5Var.setVisibility(0);
                    h5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            h5Var.setVisibility(4);
            h5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(j30Var.b, true);
        }
        this.s0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.u0) {
            this.u0 = measuredHeight3;
            s50Var.d1(false);
        }
        s50Var.n2.f = getMeasuredWidth();
        s50Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.z0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.z0.Q1();
    }
}
