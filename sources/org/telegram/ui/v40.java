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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v40 extends org.telegram.ui.Components.hv0 {
    public boolean s0;
    public final RectF t0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public final HashMap y0;
    public final /* synthetic */ r50 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v40(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.z0 = r50Var;
        this.s0 = false;
        this.t0 = new RectF();
        this.y0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.c4 c4Var;
        float f10;
        float y8;
        float x4;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.c4 c4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x10;
        float f11;
        float f12;
        float f13;
        int i10;
        Shader.TileMode tileMode;
        r50 r50Var = this.z0;
        p50 p50Var = r50Var.x1;
        View view = r50Var.G2;
        View view2 = r50Var.F2;
        ArrayList arrayList2 = r50Var.U1;
        wg.h hVar = r50Var.Y;
        Paint paint = r50Var.y0;
        f30 f30Var = r50Var.i2;
        m30 m30Var = r50Var.y2;
        j30 j30Var = r50Var.W1;
        x40 x40Var = r50Var.M;
        if (!r50Var.o2 && !r50Var.B2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (r50Var.M2 == null) {
                    r50Var.M2 = new RenderNode("CallActivity.Blur");
                    r50Var.N2 = org.telegram.ui.Components.hv0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.hv0.getBlurRadius();
                    RenderNode renderNode = r50Var.M2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = r50Var.M2;
                    float f14 = r50Var.N2;
                    hVar.S0 = renderNode2;
                    hVar.T0 = f14;
                }
                int round = Math.round(getMeasuredWidth() / r50Var.N2);
                int round2 = Math.round(getMeasuredHeight() / r50Var.N2);
                r50Var.o2 = true;
                r50Var.M2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = r50Var.M2.beginRecording();
                float f15 = 1.0f / r50Var.N2;
                beginRecording.scale(f15, f15);
                dispatchDraw(beginRecording);
                r50Var.M2.endRecording();
                r50Var.o2 = false;
            }
        }
        for (int i11 = 0; i11 < x40Var.getChildCount(); i11++) {
            View childAt = x40Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.c4) {
                ((org.telegram.ui.Cells.c4) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != x40Var.getMeasuredWidth()) {
                    childAt.setTranslationX((x40Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (j30Var.r == null) {
            for (int i12 = 0; i12 < f30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.n20) f30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (f30Var.getVisibility() == 0) {
            HashMap hashMap = this.y0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < x40Var.getChildCount()) {
                View childAt2 = x40Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        x40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != j30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.c4) {
                        x40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.c4 c4Var3 = (org.telegram.ui.Cells.c4) childAt2;
                            hashMap.put(c4Var3.getParticipant(), c4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < f30Var.getChildCount()) {
                org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) f30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(n20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(n20Var.getParticipant());
                }
                float f16 = j30Var.c;
                HashMap hashMap2 = hashMap;
                if (!r50Var.J2.k()) {
                    n20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x10 = (x40Var.getX() + lVar3.getLeft()) - j30Var.getLeft();
                        f11 = (x40Var.getY() + lVar3.getTop()) - j30Var.getTop();
                        f12 = f30Var.getX() + n20Var.getLeft();
                        f13 = f30Var.getY() + n20Var.getTop();
                    } else {
                        x10 = ((x40Var.getX() + r14.getLeft()) - j30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((x40Var.getY() + r14.getTop()) - j30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x11 = f30Var.getX() + n20Var.getLeft() + (n20Var.getMeasuredWidth() >> 1);
                        float y11 = f30Var.getY() + n20Var.getTop() + (n20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.c4) view3).setDrawAvatar(false);
                        f11 = y10;
                        f12 = x11;
                        f13 = y11;
                    }
                    float f17 = 1.0f - f16;
                    n20Var.setTranslationX((x10 - f12) * f17);
                    n20Var.setTranslationY((f11 - f13) * f17);
                    n20Var.setScaleX(1.0f);
                    n20Var.setScaleY(1.0f);
                    n20Var.setProgressToFullscreen(f16);
                } else {
                    n20Var.setScaleX(1.0f);
                    n20Var.setScaleY(1.0f);
                    n20Var.setTranslationX(0.0f);
                    n20Var.setTranslationY(0.0f);
                    n20Var.setProgressToFullscreen(1.0f);
                    if (n20Var.getRenderer() == null) {
                        n20Var.setAlpha(f16);
                    }
                }
                i14++;
                hashMap = hashMap2;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList2.get(i15);
            org.telegram.ui.Components.jl0 jl0Var = r50Var.j2;
            org.telegram.ui.Components.voip.p pVar = uVar.a;
            if (uVar.h || uVar.f || uVar.L) {
                arrayList = arrayList2;
            } else {
                uVar.u0 = false;
                float f18 = j30Var.c;
                arrayList = arrayList2;
                if (uVar.r || uVar.b) {
                    org.telegram.ui.Components.voip.l lVar4 = uVar.c;
                    org.telegram.ui.Components.voip.l lVar5 = lVar4;
                    if (lVar4 == null && uVar.e == null) {
                        uVar.setTranslationX(0.0f);
                        uVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.l lVar6 = uVar.e;
                        if (lVar6 != null) {
                            lVar5 = lVar6;
                        }
                        if (lVar6 == null) {
                            jl0Var = x40Var;
                        }
                        float x12 = ((jl0Var.getX() + lVar5.getX()) - uVar.getLeft()) - j30Var.getLeft();
                        float y12 = ((jl0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - j30Var.getTop();
                        float f19 = 1.0f - f18;
                        float f20 = f18 * 0.0f;
                        uVar.setTranslationX((x12 * f19) + f20);
                        uVar.setTranslationY((y12 * f19) + f20);
                    }
                    pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.n20 n20Var2 = uVar.d;
                    if (n20Var2 != null) {
                        n20Var2.setAlpha(f18);
                    }
                    if (!uVar.b && uVar.c == null && uVar.e == null) {
                        uVar.setAlpha(f18);
                    } else if (!uVar.A) {
                        uVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.n20 n20Var3 = uVar.d;
                    if (n20Var3 != null) {
                        f30Var.getClass();
                        if (RecyclerView.R(n20Var3) == -1) {
                            uVar.setAlpha(uVar.d.getAlpha());
                        } else if (uVar.c == null) {
                            if (uVar.v && !uVar.A) {
                                uVar.setAlpha(f18);
                            }
                            uVar.d.setAlpha(f18);
                            f18 = 1.0f;
                        } else {
                            uVar.d.setAlpha(1.0f);
                            if (uVar.v && !uVar.A) {
                                uVar.setAlpha(1.0f);
                            }
                        }
                        uVar.setTranslationX((f30Var.getX() + uVar.d.getX()) - uVar.getLeft());
                        float f21 = 1.0f - f18;
                        uVar.setTranslationY((f30Var.getY() + (uVar.d.getY() + (AndroidUtilities.dp(2.0f) * f21))) - uVar.getTop());
                        pVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f21) + (AndroidUtilities.dp(13.0f) * f18));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = uVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || uVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = uVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    jl0Var = x40Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (r50.C3) {
                                    lVar = lVar9;
                                    if (!uVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            jl0Var = x40Var;
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
                            uVar.setTranslationX(((jl0Var.getX() + lVar8.getX()) - uVar.getLeft()) - j30Var.getLeft());
                            uVar.setTranslationY(((jl0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - j30Var.getTop());
                            pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (uVar.v && !uVar.A) {
                                if (!r50.C3) {
                                    uVar.u0 = true;
                                    uVar.setAlpha(lVar8.getAlpha() * (1.0f - f18));
                                } else if (uVar.c != null && uVar.e == null) {
                                    uVar.setAlpha(lVar8.getAlpha() * f18);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (r50.C3) {
            f9 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f9 = 1.0f;
            view2.setAlpha(1.0f - j30Var.c);
            view.setAlpha(1.0f - j30Var.c);
        }
        if (j30Var.H0) {
            x40Var.setAlpha(f9 - j30Var.c);
        } else {
            x40Var.setAlpha(f9);
        }
        if (p50Var != null) {
            p50Var.setAlpha(f9 - j30Var.c);
            p50Var.setTranslationY(j30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (r50Var.B2) {
            return;
        }
        boolean z11 = r50Var.b2;
        RectF rectF = this.t0;
        if (!z11) {
            if (r50Var.T2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), r50Var.S2);
                float y13 = x40Var.getY();
                x40Var.getY();
                x40Var.getMeasuredHeight();
                if (!r50Var.X2) {
                    if (r50Var.W2 == null) {
                        org.telegram.ui.Components.voip.u uVar2 = r50Var.V2;
                        if (uVar2 == null || !uVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(j30Var.getX() + r50Var.V2.getX(), j30Var.getY() + r50Var.V2.getY());
                        r50Var.V2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(j30Var.getX() + f30Var.getX() + r50Var.W2.getX(), j30Var.getY() + f30Var.getY() + r50Var.W2.getY());
                    if (r50Var.W2.getRenderer() == null || !r50Var.W2.getRenderer().v || r50Var.W2.getRenderer().b) {
                        r50Var.W2.draw(canvas);
                    } else {
                        r50Var.W2.getRenderer().draw(canvas);
                    }
                    r50Var.W2.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = x40Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = x40Var.getChildAt(i16);
                    if (childAt3 == r50Var.T2) {
                        float max = Math.max(x40Var.getLeft(), childAt3.getX() + x40Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + x40Var.getY());
                        float min = Math.min(x40Var.getRight(), childAt3.getX() + x40Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(x40Var.getY() + x40Var.getMeasuredHeight(), childAt3.getY() + x40Var.getY() + r50Var.T2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + x40Var.getLeft(), childAt3.getY() + x40Var.getY());
                            float alpha = r50Var.S2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((r50Var.T2.getClipHeight() - r50Var.T2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.jr.g.getInterpolation(1.0f - alpha))) + r50Var.T2.getMeasuredHeight()));
                            org.telegram.ui.Cells.c4 c4Var4 = r50Var.T2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.h5[] h5VarArr = c4Var4.d;
                            if (TextUtils.isEmpty(h5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            h5VarArr[4].setFullAlpha(alpha);
                            h5VarArr[4].h(0, 0);
                            c4Var4.invalidate();
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
        if (r50Var.T2 != null) {
            if (r50Var.c2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), r50Var.S2);
            }
            float y14 = x40Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = x40Var.getChildCount();
            float y15 = x40Var.getY() + x40Var.getMeasuredHeight();
            if (r50Var.X2) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        c4Var = null;
                        break;
                    }
                    View childAt4 = x40Var.getChildAt(i17);
                    c4Var = r50Var.T2;
                    if (childAt4 == c4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                c4Var = r50Var.T2;
            }
            if (c4Var != null && y14 < y15) {
                canvas3.save();
                if (r50Var.W2 == null) {
                    f10 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - r50Var.Z1) * y14, getMeasuredWidth(), (getMeasuredHeight() * r50Var.Z1) + ((1.0f - r50Var.Z1) * y15));
                } else {
                    f10 = 255.0f;
                }
                if (r50Var.X2) {
                    y8 = ((1.0f - r50Var.Z1) * (c4Var.getY() + x40Var.getY())) + ((m30Var.getMeasuredWidth() + m30Var.getTop()) * r50Var.Z1);
                    x4 = ((1.0f - r50Var.Z1) * (c4Var.getX() + x40Var.getLeft())) + (r50Var.Z1 * m30Var.getLeft());
                } else {
                    y8 = m30Var.getMeasuredWidth() + m30Var.getTop();
                    x4 = m30Var.getLeft();
                }
                float f22 = y8;
                canvas3.translate(x4, f22);
                if (r50Var.X2) {
                    fArr = fArr2;
                    path = path2;
                    c4Var2 = c4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    c4Var2 = c4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, c4Var.getMeasuredWidth(), c4Var.getClipHeight(), (int) (r50Var.Z1 * f10), 31);
                }
                float clipHeight = (int) (((c4Var2.getClipHeight() - c4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.jr.g.getInterpolation(1.0f - r50Var.Z1))) + c4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, c4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.c4 c4Var5 = c4Var2;
                c4Var5.setProgressToAvatarPreview(r50Var.X2 ? r50Var.Z1 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - r50Var.Z1) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                c4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (r50Var.a2 != null) {
                    float f23 = f22 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - r50Var.a2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (r50Var.Z1 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f23, r50Var.a2.getMeasuredWidth() + measuredWidth, r50Var.a2.getMeasuredHeight() + f23, (int) (r50Var.Z1 * f10), 31);
                    } else {
                        canvas3.save();
                    }
                    r50Var.a2.setTranslationX(measuredWidth - r4.getLeft());
                    r50Var.a2.setTranslationY(f23 - r4.getTop());
                    float f24 = (r50Var.Z1 * 0.2f) + 0.8f;
                    canvas3.scale(f24, f24, (r50Var.a2.getMeasuredWidth() / 2.0f) + measuredWidth, f23);
                    canvas3.translate(measuredWidth, f23);
                    r50Var.a2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (r50Var.Y1.n) {
                return;
            }
            canvas3.save();
            if (r50Var.X2 && r50Var.W2 == null) {
                canvas3.clipRect(0.0f, (1.0f - r50Var.Z1) * y14, getMeasuredWidth(), (r50Var.Z1 * getMeasuredHeight()) + ((1.0f - r50Var.Z1) * y15));
            }
            canvas3.scale(m30Var.getScaleX(), m30Var.getScaleY(), m30Var.getX(), m30Var.getY());
            canvas3.translate(m30Var.getX(), m30Var.getY());
            m30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r50 r50Var = this.z0;
        w20 w20Var = r50Var.e;
        f30 f30Var = r50Var.i2;
        x40 x40Var = r50Var.M;
        j30 j30Var = r50Var.W1;
        if (r50Var.o2) {
            if (view == x40Var) {
                int childCount = x40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = x40Var.getChildAt(i10);
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
        } else if (r50.C3 || j30Var.c != 1.0f || (view != r50Var.K && view != r50Var.c0 && view != r50Var.J && view != r50Var.a1 && view != r50Var.v1 && view != r50Var.Q0)) {
            if (r50Var.B2 && view == j30Var) {
                canvas.save();
                canvas.translate(f30Var.getX() + j30Var.getX(), f30Var.getY() + j30Var.getY());
                f30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != r50Var.y2 && view != r50Var.a2 && view != r50Var.T2 && (!r50Var.h2 || !r50Var.c2 || (view != x40Var && view != w20Var && view != r50Var.Y))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0.V.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.V.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f9;
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
        r50 r50Var = this.z0;
        ImageReceiver imageReceiver = r50Var.V;
        Drawable drawable = r50Var.b0;
        j30 j30Var = r50Var.W1;
        float f10 = r50Var.u0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f9 = 1.0f - min;
        } else {
            f9 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        r50Var.Q1();
        if (j30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f9 != 1.0f) {
                org.telegram.ui.ActionBar.g6.t0.setColor(r50Var.R1);
                i16 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.t0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f9, AndroidUtilities.dp(12.0f) * f9, org.telegram.ui.ActionBar.g6.t0);
            }
            org.telegram.ui.ActionBar.g6.t0.setColor(Color.argb((int) (r50Var.K.getAlpha() * 255.0f), (int) (Color.red(r50Var.R1) * 0.8f), (int) (Color.green(r50Var.R1) * 0.8f), (int) (Color.blue(r50Var.R1) * 0.8f)));
            float statusBarHeight = r50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.g6.t0);
            d40 d40Var = r50Var.v0;
            if (d40Var != null) {
                org.telegram.ui.ActionBar.g6.t0.setColor(d40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, r50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.g6.t0);
            }
        }
        if (j30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.g6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gg, false), (int) (j30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.t0);
        }
        if (r50Var.r1() && LiteMode.isEnabled(512)) {
            if (j30Var.c < 0.15d) {
                if (!r50Var.v2) {
                    r50Var.v2 = true;
                    r50Var.z1();
                }
            } else if (r50Var.v2) {
                r50Var.v2 = false;
                AndroidUtilities.cancelRunOnUIThread(r50Var.w2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        r50 r50Var = this.z0;
        m30 m30Var = r50Var.y2;
        if (r50Var.T2 != null && motionEvent.getAction() == 0) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            float x10 = r50Var.a2.getX();
            float y10 = r50Var.a2.getY();
            float x11 = r50Var.a2.getX() + r50Var.a2.getMeasuredWidth();
            float y11 = r50Var.a2.getY() + r50Var.a2.getMeasuredHeight();
            RectF rectF = this.t0;
            rectF.set(x10, y10, x11, y11);
            boolean z10 = !rectF.contains(x4, y8);
            rectF.set(m30Var.getX(), m30Var.getY(), m30Var.getX() + m30Var.getMeasuredWidth(), m30Var.getY() + m30Var.getMeasuredWidth() + r50Var.T2.getMeasuredHeight());
            if (rectF.contains(x4, y8)) {
                z10 = false;
            }
            if (z10) {
                r50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || r50Var.u0 == 0.0f || motionEvent.getY() >= r50Var.u0 - AndroidUtilities.dp(37.0f) || r50Var.K.getAlpha() != 0.0f || r50Var.b2 || r50Var.v0 != null || r50Var.W1.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        r50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        r50 r50Var = this.z0;
        if (r50Var.T2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        r50Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f9;
        boolean z11;
        r50 r50Var = this.z0;
        View view = r50Var.G2;
        View view2 = r50Var.F2;
        w20 w20Var = r50Var.e;
        j30 j30Var = r50Var.W1;
        x40 x40Var = r50Var.M;
        if (r50.C3 && this.w0 != r50Var.E2 && this.x0) {
            f9 = x40Var.getX();
            z11 = true;
        } else {
            f9 = 0.0f;
            z11 = false;
        }
        this.w0 = r50Var.E2;
        j30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        j30Var.s = false;
        r50.J0(r50Var);
        this.x0 = true;
        if (!z11 || x40Var.getLeft() == f9) {
            return;
        }
        float left = f9 - x40Var.getLeft();
        x40Var.setTranslationX(left);
        w20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = x40Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
        duration.setInterpolator(jrVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(jrVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(jrVar).start();
        w20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(jrVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f9;
        int dp;
        float f10;
        int i12;
        int b10;
        r50 r50Var = this.z0;
        t30 t30Var = r50Var.C;
        c30 c30Var = r50Var.J;
        LinearLayout linearLayout = r50Var.v1;
        n40 n40Var = r50Var.K;
        x50 x50Var = r50Var.k2;
        org.telegram.ui.Components.o20 o20Var = r50Var.l2;
        org.telegram.ui.Components.jz jzVar = r50Var.U;
        org.telegram.ui.Components.voip.x2 x2Var = r50Var.w;
        org.telegram.ui.ActionBar.h5 h5Var = r50Var.Q;
        View view = r50Var.c0;
        w20 w20Var = r50Var.e;
        View view2 = r50Var.G2;
        View view3 = r50Var.F2;
        ArrayList arrayList = r50Var.U1;
        org.telegram.ui.ActionBar.h5 h5Var2 = r50Var.S;
        r30 r30Var = r50Var.D;
        ArrayList arrayList2 = r50Var.V1;
        org.telegram.ui.Components.jl0 jl0Var = r50Var.j2;
        x40 x40Var = r50Var.M;
        j30 j30Var = r50Var.W1;
        f30 f30Var = r50Var.i2;
        int size = View.MeasureSpec.getSize(i11);
        this.s0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        j30Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !r50Var.r1();
        if (r50.B3 != z11) {
            r50.B3 = z11;
            if (x2Var.getMeasuredWidth() == 0) {
                int i13 = x2Var.getLayoutParams().width;
            }
            r50.H0(r50Var);
            jzVar.y1(r50.B3 ? 6 : 2);
            x40Var.a0();
            f30Var.a0();
            this.v0 = true;
            TextView textView = r50Var.O;
            if (textView != null) {
                textView.setVisibility(!r50.B3 ? 0 : 8);
            }
            if (r50Var.q1() == z11 && r50Var.r1() && !j30Var.b && !r50Var.W0.visibleVideoParticipants.isEmpty()) {
                r50Var.e1(r50Var.W0.visibleVideoParticipants.get(0));
                j30Var.e();
            }
        }
        if (r50.C3 != z12) {
            r50.C3 = z12;
            jl0Var.setVisibility(z12 ? 0 : 8);
            x40Var.a0();
            f30Var.a0();
            z10 = true;
            this.v0 = true;
        } else {
            z10 = true;
        }
        if (this.v0) {
            r50Var.O0(z10);
            r50Var.L.l();
            o20Var.G(jl0Var, false);
            if (r50.C3) {
                x50Var.I(jl0Var, false);
            }
            jl0Var.setVisibility(r50.C3 ? 0 : 8);
            x50Var.H(jl0Var, r50.C3 && !j30Var.b, true);
            boolean z13 = r50.C3;
            r50Var.L2 = !z13 || j30Var.b;
            boolean z14 = !z13 && j30Var.b;
            o20Var.F(f30Var, z14);
            f30Var.setVisibility(z14 ? 0 : 8);
            x40Var.setVisibility((r50.C3 || !j30Var.b) ? 0 : 8);
            jzVar.y1(r50.B3 ? 6 : 2);
            r50Var.N1(false, false);
            x40Var.a0();
            f30Var.a0();
            AndroidUtilities.updateVisibleRows(x40Var);
            this.v0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            j30Var.setIsTablet(r50.C3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (r50Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j30Var.getLayoutParams();
        if (r50.C3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r50Var.f0[i15].getLayoutParams();
            if (r50.C3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (jl0Var != null) {
            ((FrameLayout.LayoutParams) jl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (r30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) r30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(r50Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) x40Var.getLayoutParams();
        if (r50.C3) {
            layoutParams3.gravity = r50Var.E2 ? 5 : 1;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp3 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp3;
            layoutParams3.rightMargin = dp3;
            layoutParams3.bottomMargin = dp2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            dp = AndroidUtilities.dp(60.0f);
            f9 = 90.0f;
        } else {
            f9 = 90.0f;
            if (r50.B3) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                dp = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                dp = AndroidUtilities.dp(60.0f);
                layoutParams3.bottomMargin = dp2;
                layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int dp4 = AndroidUtilities.dp(14.0f);
                layoutParams3.leftMargin = dp4;
                layoutParams3.rightMargin = dp4;
            }
        }
        if (!r50.B3 || r50.C3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (r50.C3) {
                layoutParams4.gravity = r50Var.E2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (r50.C3) {
                layoutParams5.gravity = r50Var.E2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (r50.B3) {
            f30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            f30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) w20Var.getLayoutParams();
        if (r50.C3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = r50Var.E2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (r50.B3) {
            layoutParams6.width = AndroidUtilities.dp(f9);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!r50.B3 || r50.C3) {
            ((FrameLayout.LayoutParams) n40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) n40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f9);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f9);
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f9);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f9);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) f30Var.getLayoutParams();
        if (r50.B3) {
            if (((f2.j0) f30Var.getLayoutManager()).o != 1) {
                ((f2.j0) f30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.j0) f30Var.getLayoutManager()).o != 0) {
                ((f2.j0) f30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        t30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (r30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) r30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (r50.C3) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.x3.b(8.0f, paddingTop - max, 0);
        }
        if (x40Var.getPaddingTop() != b10 || x40Var.getPaddingBottom() != dp) {
            x40Var.setPadding(i12, b10, i12, dp);
        }
        p50 p50Var = r50Var.x1;
        if (p50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) p50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = r50.I0(r50Var);
            if (I0 != null) {
                int measuredHeight = ((w20Var.getMeasuredHeight() / 2) + w20Var.getTop()) - (r50Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = j7.l1.e(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        g50 g50Var = r50Var.Q0;
        if (g50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) g50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = r50.I0(r50Var);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) r50Var.R.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
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
            ((org.telegram.ui.Components.voip.u) arrayList.get(i16)).g(j30Var.b, true);
        }
        this.s0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.u0) {
            this.u0 = measuredHeight3;
            r50Var.d1(false);
        }
        r50Var.n2.f = getMeasuredWidth();
        r50Var.Y0();
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
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.z0.Q1();
    }
}
