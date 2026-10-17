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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class w40 extends org.telegram.ui.Components.jw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final /* synthetic */ s50 D0;
    public boolean w0;
    public final RectF x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = s50Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.C0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
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
        s50 s50Var = this.D0;
        q50 q50Var = s50Var.B1;
        View view = s50Var.K2;
        View view2 = s50Var.J2;
        ArrayList arrayList2 = s50Var.Y1;
        mh.h hVar = s50Var.c0;
        Paint paint = s50Var.C0;
        f30 f30Var = s50Var.m2;
        m30 m30Var = s50Var.C2;
        j30 j30Var = s50Var.a2;
        y40 y40Var = s50Var.Q;
        if (s50Var.s2 || s50Var.F2) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (s50Var.Q2 == null) {
                    s50Var.Q2 = new RenderNode("CallActivity.Blur");
                    s50Var.R2 = org.telegram.ui.Components.jw0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.jw0.getBlurRadius();
                    RenderNode renderNode = s50Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = s50Var.Q2;
                    float f15 = s50Var.R2;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / s50Var.R2);
                int round2 = Math.round(getMeasuredHeight() / s50Var.R2);
                s50Var.s2 = true;
                s50Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = s50Var.Q2.beginRecording();
                float f16 = 1.0f / s50Var.R2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                s50Var.Q2.endRecording();
                s50Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < y40Var.getChildCount(); i11++) {
            View childAt = y40Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                z11 = true;
                ((org.telegram.ui.Cells.d4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
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
                ((org.telegram.ui.Components.z20) f30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (f30Var.getVisibility() == 0) {
            HashMap hashMap = this.C0;
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
                    if (childAt2 instanceof org.telegram.ui.Cells.d4) {
                        y40Var.getClass();
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
            while (i14 < f30Var.getChildCount()) {
                org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) f30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(z20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(z20Var.getParticipant());
                }
                float f17 = j30Var.c;
                HashMap hashMap2 = hashMap;
                if (!s50Var.N2.k()) {
                    z20Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (y40Var.getX() + lVar3.getLeft()) - j30Var.getLeft();
                        f12 = (y40Var.getY() + lVar3.getTop()) - j30Var.getTop();
                        f13 = f30Var.getX() + z20Var.getLeft();
                        f14 = f30Var.getY() + z20Var.getTop();
                    } else {
                        x11 = ((y40Var.getX() + r14.getLeft()) - j30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((y40Var.getY() + r14.getTop()) - j30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = f30Var.getX() + z20Var.getLeft() + (z20Var.getMeasuredWidth() >> 1);
                        float y11 = f30Var.getY() + z20Var.getTop() + (z20Var.getMeasuredHeight() >> 1);
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
            org.telegram.ui.Components.im0 im0Var = s50Var.n2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.P) {
                arrayList = arrayList2;
            } else {
                tVar.y0 = false;
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
                            im0Var = y40Var;
                        }
                        float x13 = ((im0Var.getX() + lVar5.getX()) - tVar.getLeft()) - j30Var.getLeft();
                        float y12 = ((im0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - j30Var.getTop();
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
                        f30Var.getClass();
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
                                    im0Var = y40Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (s50.G3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            im0Var = y40Var;
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
                            tVar.setTranslationX(((im0Var.getX() + lVar8.getX()) - tVar.getLeft()) - j30Var.getLeft());
                            tVar.setTranslationY(((im0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - j30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.E) {
                                if (!s50.G3) {
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
        if (s50.G3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - j30Var.c);
            view.setAlpha(1.0f - j30Var.c);
        }
        if (j30Var.L0) {
            y40Var.setAlpha(f10 - j30Var.c);
        } else {
            y40Var.setAlpha(f10);
        }
        if (q50Var != null) {
            q50Var.setAlpha(f10 - j30Var.c);
            q50Var.setTranslationY(j30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (s50Var.F2) {
            return;
        }
        boolean z12 = s50Var.f2;
        RectF rectF = this.x0;
        if (!z12) {
            if (s50Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), s50Var.W2);
                float y13 = y40Var.getY();
                y40Var.getY();
                y40Var.getMeasuredHeight();
                if (!s50Var.b3) {
                    if (s50Var.a3 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = s50Var.Z2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(j30Var.getX() + s50Var.Z2.getX(), j30Var.getY() + s50Var.Z2.getY());
                        s50Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(j30Var.getX() + f30Var.getX() + s50Var.a3.getX(), j30Var.getY() + f30Var.getY() + s50Var.a3.getY());
                    if (s50Var.a3.getRenderer() == null || !s50Var.a3.getRenderer().v || s50Var.a3.getRenderer().b) {
                        s50Var.a3.draw(canvas);
                    } else {
                        s50Var.a3.getRenderer().draw(canvas);
                    }
                    s50Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = y40Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = y40Var.getChildAt(i16);
                    if (childAt3 == s50Var.X2) {
                        float max = Math.max(y40Var.getLeft(), childAt3.getX() + y40Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + y40Var.getY());
                        float min = Math.min(y40Var.getRight(), childAt3.getX() + y40Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(y40Var.getY() + y40Var.getMeasuredHeight(), childAt3.getY() + y40Var.getY() + s50Var.X2.getClipHeight());
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
                            float alpha = s50Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((s50Var.X2.getClipHeight() - s50Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.bs.g.getInterpolation(1.0f - alpha))) + s50Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.d4 d4Var4 = s50Var.X2;
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
        if (s50Var.X2 != null) {
            if (s50Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), s50Var.W2);
            }
            float y14 = y40Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = y40Var.getChildCount();
            float y15 = y40Var.getY() + y40Var.getMeasuredHeight();
            if (s50Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        d4Var = null;
                        break;
                    }
                    View childAt4 = y40Var.getChildAt(i17);
                    d4Var = s50Var.X2;
                    if (childAt4 == d4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                d4Var = s50Var.X2;
            }
            if (d4Var != null && y14 < y15) {
                canvas3.save();
                if (s50Var.a3 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - s50Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * s50Var.d2) + ((1.0f - s50Var.d2) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (s50Var.b3) {
                    y3 = ((1.0f - s50Var.d2) * (d4Var.getY() + y40Var.getY())) + ((m30Var.getMeasuredWidth() + m30Var.getTop()) * s50Var.d2);
                    x10 = ((1.0f - s50Var.d2) * (d4Var.getX() + y40Var.getLeft())) + (s50Var.d2 * m30Var.getLeft());
                } else {
                    y3 = m30Var.getMeasuredWidth() + m30Var.getTop();
                    x10 = m30Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x10, f23);
                if (s50Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    d4Var2 = d4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    d4Var2 = d4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, d4Var.getMeasuredWidth(), d4Var.getClipHeight(), (int) (s50Var.d2 * f11), 31);
                }
                float clipHeight = (int) (((d4Var2.getClipHeight() - d4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.bs.g.getInterpolation(1.0f - s50Var.d2))) + d4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, d4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.d4 d4Var5 = d4Var2;
                d4Var5.setProgressToAvatarPreview(s50Var.b3 ? s50Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - s50Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                d4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (s50Var.e2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - s50Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (s50Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, s50Var.e2.getMeasuredWidth() + measuredWidth, s50Var.e2.getMeasuredHeight() + f24, (int) (s50Var.d2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    s50Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    s50Var.e2.setTranslationY(f24 - r4.getTop());
                    float f25 = (s50Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (s50Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    s50Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (s50Var.c2.n) {
                return;
            }
            canvas3.save();
            if (s50Var.b3 && s50Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - s50Var.d2) * y14, getMeasuredWidth(), (s50Var.d2 * getMeasuredHeight()) + ((1.0f - s50Var.d2) * y15));
            }
            canvas3.scale(m30Var.getScaleX(), m30Var.getScaleY(), m30Var.getX(), m30Var.getY());
            canvas3.translate(m30Var.getX(), m30Var.getY());
            m30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        s50 s50Var = this.D0;
        w20 w20Var = s50Var.e;
        f30 f30Var = s50Var.m2;
        y40 y40Var = s50Var.Q;
        j30 j30Var = s50Var.a2;
        if (s50Var.s2) {
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
            if (view == j30Var || view == w20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (s50.G3 || j30Var.c != 1.0f || (view != s50Var.O && view != s50Var.g0 && view != s50Var.N && view != s50Var.e1 && view != s50Var.z1 && view != s50Var.U0)) {
            if (s50Var.F2 && view == j30Var) {
                canvas.save();
                canvas.translate(f30Var.getX() + j30Var.getX(), f30Var.getY() + j30Var.getY());
                f30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != s50Var.C2 && view != s50Var.e2 && view != s50Var.X2 && (!s50Var.l2 || !s50Var.g2 || (view != y40Var && view != w20Var && view != s50Var.c0))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
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
        s50 s50Var = this.D0;
        ImageReceiver imageReceiver = s50Var.Z;
        Drawable drawable = s50Var.f0;
        j30 j30Var = s50Var.a2;
        float f10 = s50Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        s50Var.R1();
        if (j30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.h6.t0.setColor(s50Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.x0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.t0);
            }
            org.telegram.ui.ActionBar.h6.t0.setColor(Color.argb((int) (s50Var.O.getAlpha() * 255.0f), (int) (Color.red(s50Var.V1) * 0.8f), (int) (Color.green(s50Var.V1) * 0.8f), (int) (Color.blue(s50Var.V1) * 0.8f)));
            float statusBarHeight = s50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.h6.t0);
            d40 d40Var = s50Var.z0;
            if (d40Var != null) {
                org.telegram.ui.ActionBar.h6.t0.setColor(d40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, s50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.h6.t0);
            }
        }
        if (j30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.h6.t0.setColor(i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false), (int) (j30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.t0);
        }
        if (s50Var.s1() && LiteMode.isEnabled(512)) {
            if (j30Var.c < 0.15d) {
                if (!s50Var.z2) {
                    s50Var.z2 = true;
                    s50Var.A1();
                }
            } else if (s50Var.z2) {
                s50Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(s50Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        s50 s50Var = this.D0;
        m30 m30Var = s50Var.C2;
        if (s50Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = s50Var.e2.getX();
            float y10 = s50Var.e2.getY();
            float x12 = s50Var.e2.getX() + s50Var.e2.getMeasuredWidth();
            float y11 = s50Var.e2.getY() + s50Var.e2.getMeasuredHeight();
            RectF rectF = this.x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(m30Var.getX(), m30Var.getY(), m30Var.getX() + m30Var.getMeasuredWidth(), m30Var.getY() + m30Var.getMeasuredWidth() + s50Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                s50Var.e1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || s50Var.y0 == 0.0f || motionEvent.getY() >= s50Var.y0 - AndroidUtilities.dp(37.0f) || s50Var.O.getAlpha() != 0.0f || s50Var.f2 || s50Var.z0 != null || s50Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        s50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        s50 s50Var = this.D0;
        if (s50Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        s50Var.e1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        s50 s50Var = this.D0;
        View view = s50Var.K2;
        View view2 = s50Var.J2;
        w20 w20Var = s50Var.e;
        j30 j30Var = s50Var.a2;
        y40 y40Var = s50Var.Q;
        if (s50.G3 && this.A0 != s50Var.I2 && this.B0) {
            f7 = y40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = s50Var.I2;
        j30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        j30Var.s = false;
        s50.K0(s50Var);
        this.B0 = true;
        if (!z11 || y40Var.getLeft() == f7) {
            return;
        }
        float left = f7 - y40Var.getLeft();
        y40Var.setTranslationX(left);
        w20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = y40Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
        duration.setInterpolator(bsVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
        w20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int y3;
        s50 s50Var = this.D0;
        t30 t30Var = s50Var.G;
        c30 c30Var = s50Var.N;
        LinearLayout linearLayout = s50Var.z1;
        o40 o40Var = s50Var.O;
        x50 x50Var = s50Var.o2;
        org.telegram.ui.Components.a30 a30Var = s50Var.p2;
        org.telegram.ui.Components.xz xzVar = s50Var.Y;
        org.telegram.ui.Components.voip.t2 t2Var = s50Var.w;
        org.telegram.ui.ActionBar.j5 j5Var = s50Var.U;
        View view = s50Var.g0;
        w20 w20Var = s50Var.e;
        View view2 = s50Var.K2;
        View view3 = s50Var.J2;
        ArrayList arrayList = s50Var.Y1;
        org.telegram.ui.ActionBar.j5 j5Var2 = s50Var.W;
        r30 r30Var = s50Var.H;
        ArrayList arrayList2 = s50Var.Z1;
        org.telegram.ui.Components.im0 im0Var = s50Var.n2;
        y40 y40Var = s50Var.Q;
        j30 j30Var = s50Var.a2;
        f30 f30Var = s50Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.w0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        j30Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !s50Var.s1();
        if (s50.F3 != z11) {
            s50.F3 = z11;
            if (t2Var.getMeasuredWidth() == 0) {
                int i13 = t2Var.getLayoutParams().width;
            }
            s50.I0(s50Var);
            xzVar.y1(s50.F3 ? 6 : 2);
            y40Var.a0();
            f30Var.a0();
            this.z0 = true;
            TextView textView = s50Var.S;
            if (textView != null) {
                textView.setVisibility(!s50.F3 ? 0 : 8);
            }
            if (s50Var.r1() == z11 && s50Var.s1() && !j30Var.b && !s50Var.a1.visibleVideoParticipants.isEmpty()) {
                s50Var.f1(s50Var.a1.visibleVideoParticipants.get(0));
                j30Var.e();
            }
        }
        if (s50.G3 != z12) {
            s50.G3 = z12;
            im0Var.setVisibility(z12 ? 0 : 8);
            y40Var.a0();
            f30Var.a0();
            z10 = true;
            this.z0 = true;
        } else {
            z10 = true;
        }
        if (this.z0) {
            s50Var.P0(z10);
            s50Var.P.l();
            a30Var.G(im0Var, false);
            if (s50.G3) {
                x50Var.I(im0Var, false);
            }
            im0Var.setVisibility(s50.G3 ? 0 : 8);
            x50Var.H(im0Var, s50.G3 && !j30Var.b, true);
            boolean z13 = s50.G3;
            s50Var.P2 = !z13 || j30Var.b;
            boolean z14 = !z13 && j30Var.b;
            a30Var.F(f30Var, z14);
            f30Var.setVisibility(z14 ? 0 : 8);
            y40Var.setVisibility((s50.G3 || !j30Var.b) ? 0 : 8);
            xzVar.y1(s50.F3 ? 6 : 2);
            s50Var.O1(false, false);
            y40Var.a0();
            f30Var.a0();
            AndroidUtilities.updateVisibleRows(y40Var);
            this.z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            j30Var.setIsTablet(s50.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (s50Var.s1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j30Var.getLayoutParams();
        if (s50.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s50Var.j0[i15].getLayoutParams();
            if (s50.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (im0Var != null) {
            ((FrameLayout.LayoutParams) im0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (r30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) r30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(s50Var.s1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) y40Var.getLayoutParams();
        if (s50.G3) {
            layoutParams3.gravity = s50Var.I2 ? 5 : 1;
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
            if (s50.F3) {
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
        if (!s50.F3 || s50.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (s50.G3) {
                layoutParams4.gravity = s50Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (s50.G3) {
                layoutParams5.gravity = s50Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (s50.F3) {
            f30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            f30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) w20Var.getLayoutParams();
        if (s50.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = s50Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (s50.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!s50.F3 || s50.G3) {
            ((FrameLayout.LayoutParams) o40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) o40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) f30Var.getLayoutParams();
        if (s50.F3) {
            if (((s4.b0) f30Var.getLayoutManager()).o != 1) {
                ((s4.b0) f30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.b0) f30Var.getLayoutManager()).o != 0) {
                ((s4.b0) f30Var.getLayoutManager()).j1(0);
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
        if (s50.G3) {
            y3 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            y3 = org.telegram.messenger.q.y(8.0f, paddingTop - max, 0);
        }
        if (y40Var.getPaddingTop() != y3 || y40Var.getPaddingBottom() != dp) {
            y40Var.setPadding(i12, y3, i12, dp);
        }
        q50 q50Var = s50Var.B1;
        if (q50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) q50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J0 = s50.J0(s50Var);
            if (J0 != null) {
                int measuredHeight = ((w20Var.getMeasuredHeight() / 2) + w20Var.getTop()) - (s50Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = J0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + y3;
                layoutParams9.topMargin = i0.a.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        h50 h50Var = s50Var.U0;
        if (h50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) h50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J02 = s50.J0(s50Var);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) s50Var.V.getLayoutParams();
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
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(j30Var.b, true);
        }
        this.w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.y0) {
            this.y0 = measuredHeight3;
            s50Var.e1(false);
        }
        s50Var.r2.f = getMeasuredWidth();
        s50Var.Z0();
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
