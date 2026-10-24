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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class x40 extends org.telegram.ui.Components.ow0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final /* synthetic */ u50 D0;
    public boolean w0;
    public final RectF x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x40(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = u50Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.C0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
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
        u50 u50Var = this.D0;
        s50 s50Var = u50Var.B1;
        View view = u50Var.K2;
        View view2 = u50Var.J2;
        ArrayList arrayList2 = u50Var.Y1;
        mh.h hVar = u50Var.c0;
        Paint paint = u50Var.C0;
        g30 g30Var = u50Var.m2;
        n30 n30Var = u50Var.C2;
        k30 k30Var = u50Var.a2;
        z40 z40Var = u50Var.Q;
        if (u50Var.s2 || u50Var.F2) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (u50Var.Q2 == null) {
                    u50Var.Q2 = new RenderNode("CallActivity.Blur");
                    u50Var.R2 = org.telegram.ui.Components.ow0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.ow0.getBlurRadius();
                    RenderNode renderNode = u50Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = u50Var.Q2;
                    float f15 = u50Var.R2;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / u50Var.R2);
                int round2 = Math.round(getMeasuredHeight() / u50Var.R2);
                u50Var.s2 = true;
                u50Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = u50Var.Q2.beginRecording();
                float f16 = 1.0f / u50Var.R2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                u50Var.Q2.endRecording();
                u50Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < z40Var.getChildCount(); i11++) {
            View childAt = z40Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                z11 = true;
                ((org.telegram.ui.Cells.d4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != z40Var.getMeasuredWidth()) {
                    childAt.setTranslationX((z40Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (k30Var.r == null) {
            for (int i12 = 0; i12 < g30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.z20) g30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (g30Var.getVisibility() == 0) {
            HashMap hashMap = this.C0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < z40Var.getChildCount()) {
                View childAt2 = z40Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        z40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != k30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.d4) {
                        z40Var.getClass();
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
            while (i14 < g30Var.getChildCount()) {
                org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) g30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(z20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(z20Var.getParticipant());
                }
                float f17 = k30Var.c;
                HashMap hashMap2 = hashMap;
                if (!u50Var.N2.k()) {
                    z20Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (z40Var.getX() + lVar3.getLeft()) - k30Var.getLeft();
                        f12 = (z40Var.getY() + lVar3.getTop()) - k30Var.getTop();
                        f13 = g30Var.getX() + z20Var.getLeft();
                        f14 = g30Var.getY() + z20Var.getTop();
                    } else {
                        x11 = ((z40Var.getX() + r14.getLeft()) - k30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((z40Var.getY() + r14.getTop()) - k30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = g30Var.getX() + z20Var.getLeft() + (z20Var.getMeasuredWidth() >> 1);
                        float y11 = g30Var.getY() + z20Var.getTop() + (z20Var.getMeasuredHeight() >> 1);
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
            org.telegram.ui.Components.mm0 mm0Var = u50Var.n2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.P) {
                arrayList = arrayList2;
            } else {
                tVar.y0 = false;
                float f19 = k30Var.c;
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
                            mm0Var = z40Var;
                        }
                        float x13 = ((mm0Var.getX() + lVar5.getX()) - tVar.getLeft()) - k30Var.getLeft();
                        float y12 = ((mm0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - k30Var.getTop();
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
                        g30Var.getClass();
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
                        tVar.setTranslationX((g30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((g30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    mm0Var = z40Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (u50.G3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            mm0Var = z40Var;
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
                            tVar.setTranslationX(((mm0Var.getX() + lVar8.getX()) - tVar.getLeft()) - k30Var.getLeft());
                            tVar.setTranslationY(((mm0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - k30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.E) {
                                if (!u50.G3) {
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
        if (u50.G3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - k30Var.c);
            view.setAlpha(1.0f - k30Var.c);
        }
        if (k30Var.L0) {
            z40Var.setAlpha(f10 - k30Var.c);
        } else {
            z40Var.setAlpha(f10);
        }
        if (s50Var != null) {
            s50Var.setAlpha(f10 - k30Var.c);
            s50Var.setTranslationY(k30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (u50Var.F2) {
            return;
        }
        boolean z12 = u50Var.f2;
        RectF rectF = this.x0;
        if (!z12) {
            if (u50Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), u50Var.W2);
                float y13 = z40Var.getY();
                z40Var.getY();
                z40Var.getMeasuredHeight();
                if (!u50Var.b3) {
                    if (u50Var.a3 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = u50Var.Z2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(k30Var.getX() + u50Var.Z2.getX(), k30Var.getY() + u50Var.Z2.getY());
                        u50Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(k30Var.getX() + g30Var.getX() + u50Var.a3.getX(), k30Var.getY() + g30Var.getY() + u50Var.a3.getY());
                    if (u50Var.a3.getRenderer() == null || !u50Var.a3.getRenderer().v || u50Var.a3.getRenderer().b) {
                        u50Var.a3.draw(canvas);
                    } else {
                        u50Var.a3.getRenderer().draw(canvas);
                    }
                    u50Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = z40Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = z40Var.getChildAt(i16);
                    if (childAt3 == u50Var.X2) {
                        float max = Math.max(z40Var.getLeft(), childAt3.getX() + z40Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + z40Var.getY());
                        float min = Math.min(z40Var.getRight(), childAt3.getX() + z40Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(z40Var.getY() + z40Var.getMeasuredHeight(), childAt3.getY() + z40Var.getY() + u50Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + z40Var.getLeft(), childAt3.getY() + z40Var.getY());
                            float alpha = u50Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((u50Var.X2.getClipHeight() - u50Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.bs.g.getInterpolation(1.0f - alpha))) + u50Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.d4 d4Var4 = u50Var.X2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.n5[] n5VarArr = d4Var4.d;
                            if (TextUtils.isEmpty(n5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            n5VarArr[4].setFullAlpha(alpha);
                            n5VarArr[4].h(0, 0);
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
        if (u50Var.X2 != null) {
            if (u50Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), u50Var.W2);
            }
            float y14 = z40Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = z40Var.getChildCount();
            float y15 = z40Var.getY() + z40Var.getMeasuredHeight();
            if (u50Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        d4Var = null;
                        break;
                    }
                    View childAt4 = z40Var.getChildAt(i17);
                    d4Var = u50Var.X2;
                    if (childAt4 == d4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                d4Var = u50Var.X2;
            }
            if (d4Var != null && y14 < y15) {
                canvas3.save();
                if (u50Var.a3 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - u50Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * u50Var.d2) + ((1.0f - u50Var.d2) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (u50Var.b3) {
                    y3 = ((1.0f - u50Var.d2) * (d4Var.getY() + z40Var.getY())) + ((n30Var.getMeasuredWidth() + n30Var.getTop()) * u50Var.d2);
                    x10 = ((1.0f - u50Var.d2) * (d4Var.getX() + z40Var.getLeft())) + (u50Var.d2 * n30Var.getLeft());
                } else {
                    y3 = n30Var.getMeasuredWidth() + n30Var.getTop();
                    x10 = n30Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x10, f23);
                if (u50Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    d4Var2 = d4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    d4Var2 = d4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, d4Var.getMeasuredWidth(), d4Var.getClipHeight(), (int) (u50Var.d2 * f11), 31);
                }
                float clipHeight = (int) (((d4Var2.getClipHeight() - d4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.bs.g.getInterpolation(1.0f - u50Var.d2))) + d4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, d4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.d4 d4Var5 = d4Var2;
                d4Var5.setProgressToAvatarPreview(u50Var.b3 ? u50Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - u50Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                d4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (u50Var.e2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - u50Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (u50Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, u50Var.e2.getMeasuredWidth() + measuredWidth, u50Var.e2.getMeasuredHeight() + f24, (int) (u50Var.d2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    u50Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    u50Var.e2.setTranslationY(f24 - r4.getTop());
                    float f25 = (u50Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (u50Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    u50Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (u50Var.c2.n) {
                return;
            }
            canvas3.save();
            if (u50Var.b3 && u50Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - u50Var.d2) * y14, getMeasuredWidth(), (u50Var.d2 * getMeasuredHeight()) + ((1.0f - u50Var.d2) * y15));
            }
            canvas3.scale(n30Var.getScaleX(), n30Var.getScaleY(), n30Var.getX(), n30Var.getY());
            canvas3.translate(n30Var.getX(), n30Var.getY());
            n30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u50 u50Var = this.D0;
        x20 x20Var = u50Var.e;
        g30 g30Var = u50Var.m2;
        z40 z40Var = u50Var.Q;
        k30 k30Var = u50Var.a2;
        if (u50Var.s2) {
            if (view == z40Var) {
                int childCount = z40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = z40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == k30Var || view == x20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (u50.G3 || k30Var.c != 1.0f || (view != u50Var.O && view != u50Var.g0 && view != u50Var.N && view != u50Var.e1 && view != u50Var.z1 && view != u50Var.U0)) {
            if (u50Var.F2 && view == k30Var) {
                canvas.save();
                canvas.translate(g30Var.getX() + k30Var.getX(), g30Var.getY() + k30Var.getY());
                g30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != u50Var.C2 && view != u50Var.e2 && view != u50Var.X2 && (!u50Var.l2 || !u50Var.g2 || (view != z40Var && view != x20Var && view != u50Var.c0))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
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
        u50 u50Var = this.D0;
        ImageReceiver imageReceiver = u50Var.Z;
        Drawable drawable = u50Var.f0;
        k30 k30Var = u50Var.a2;
        float f10 = u50Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        u50Var.R1();
        if (k30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.k6.t0.setColor(u50Var.V1);
                i16 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.x0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.k6.t0);
            }
            org.telegram.ui.ActionBar.k6.t0.setColor(Color.argb((int) (u50Var.O.getAlpha() * 255.0f), (int) (Color.red(u50Var.V1) * 0.8f), (int) (Color.green(u50Var.V1) * 0.8f), (int) (Color.blue(u50Var.V1) * 0.8f)));
            float statusBarHeight = u50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.k6.t0);
            e40 e40Var = u50Var.z0;
            if (e40Var != null) {
                org.telegram.ui.ActionBar.k6.t0.setColor(e40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, u50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.k6.t0);
            }
        }
        if (k30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.k6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.gg, false), (int) (k30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.t0);
        }
        if (u50Var.r1() && LiteMode.isEnabled(512)) {
            if (k30Var.c < 0.15d) {
                if (!u50Var.z2) {
                    u50Var.z2 = true;
                    u50Var.z1();
                }
            } else if (u50Var.z2) {
                u50Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(u50Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        u50 u50Var = this.D0;
        n30 n30Var = u50Var.C2;
        if (u50Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = u50Var.e2.getX();
            float y10 = u50Var.e2.getY();
            float x12 = u50Var.e2.getX() + u50Var.e2.getMeasuredWidth();
            float y11 = u50Var.e2.getY() + u50Var.e2.getMeasuredHeight();
            RectF rectF = this.x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(n30Var.getX(), n30Var.getY(), n30Var.getX() + n30Var.getMeasuredWidth(), n30Var.getY() + n30Var.getMeasuredWidth() + u50Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                u50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || u50Var.y0 == 0.0f || motionEvent.getY() >= u50Var.y0 - AndroidUtilities.dp(37.0f) || u50Var.O.getAlpha() != 0.0f || u50Var.f2 || u50Var.z0 != null || u50Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        u50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        u50 u50Var = this.D0;
        if (u50Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        u50Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        u50 u50Var = this.D0;
        View view = u50Var.K2;
        View view2 = u50Var.J2;
        x20 x20Var = u50Var.e;
        k30 k30Var = u50Var.a2;
        z40 z40Var = u50Var.Q;
        if (u50.G3 && this.A0 != u50Var.I2 && this.B0) {
            f7 = z40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = u50Var.I2;
        k30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        k30Var.s = false;
        u50.J0(u50Var);
        this.B0 = true;
        if (!z11 || z40Var.getLeft() == f7) {
            return;
        }
        float left = f7 - z40Var.getLeft();
        z40Var.setTranslationX(left);
        x20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = z40Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f;
        duration.setInterpolator(bsVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
        x20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int b10;
        u50 u50Var = this.D0;
        u30 u30Var = u50Var.G;
        d30 d30Var = u50Var.N;
        LinearLayout linearLayout = u50Var.z1;
        p40 p40Var = u50Var.O;
        a60 a60Var = u50Var.o2;
        org.telegram.ui.Components.a30 a30Var = u50Var.p2;
        org.telegram.ui.Components.xz xzVar = u50Var.Y;
        org.telegram.ui.Components.voip.t2 t2Var = u50Var.w;
        org.telegram.ui.ActionBar.n5 n5Var = u50Var.U;
        View view = u50Var.g0;
        x20 x20Var = u50Var.e;
        View view2 = u50Var.K2;
        View view3 = u50Var.J2;
        ArrayList arrayList = u50Var.Y1;
        org.telegram.ui.ActionBar.n5 n5Var2 = u50Var.W;
        s30 s30Var = u50Var.H;
        ArrayList arrayList2 = u50Var.Z1;
        org.telegram.ui.Components.mm0 mm0Var = u50Var.n2;
        z40 z40Var = u50Var.Q;
        k30 k30Var = u50Var.a2;
        g30 g30Var = u50Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.w0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        k30Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !u50Var.r1();
        if (u50.F3 != z11) {
            u50.F3 = z11;
            if (t2Var.getMeasuredWidth() == 0) {
                int i13 = t2Var.getLayoutParams().width;
            }
            u50.H0(u50Var);
            xzVar.y1(u50.F3 ? 6 : 2);
            z40Var.a0();
            g30Var.a0();
            this.z0 = true;
            TextView textView = u50Var.S;
            if (textView != null) {
                textView.setVisibility(!u50.F3 ? 0 : 8);
            }
            if (u50Var.q1() == z11 && u50Var.r1() && !k30Var.b && !u50Var.a1.visibleVideoParticipants.isEmpty()) {
                u50Var.e1(u50Var.a1.visibleVideoParticipants.get(0));
                k30Var.e();
            }
        }
        if (u50.G3 != z12) {
            u50.G3 = z12;
            mm0Var.setVisibility(z12 ? 0 : 8);
            z40Var.a0();
            g30Var.a0();
            z10 = true;
            this.z0 = true;
        } else {
            z10 = true;
        }
        if (this.z0) {
            u50Var.O0(z10);
            u50Var.P.l();
            a30Var.G(mm0Var, false);
            if (u50.G3) {
                a60Var.I(mm0Var, false);
            }
            mm0Var.setVisibility(u50.G3 ? 0 : 8);
            a60Var.H(mm0Var, u50.G3 && !k30Var.b, true);
            boolean z13 = u50.G3;
            u50Var.P2 = !z13 || k30Var.b;
            boolean z14 = !z13 && k30Var.b;
            a30Var.F(g30Var, z14);
            g30Var.setVisibility(z14 ? 0 : 8);
            z40Var.setVisibility((u50.G3 || !k30Var.b) ? 0 : 8);
            xzVar.y1(u50.F3 ? 6 : 2);
            u50Var.O1(false, false);
            z40Var.a0();
            g30Var.a0();
            AndroidUtilities.updateVisibleRows(z40Var);
            this.z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            k30Var.setIsTablet(u50.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (u50Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (u50.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) u50Var.j0[i15].getLayoutParams();
            if (u50.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (mm0Var != null) {
            ((FrameLayout.LayoutParams) mm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (s30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) s30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(u50Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) z40Var.getLayoutParams();
        if (u50.G3) {
            layoutParams3.gravity = u50Var.I2 ? 5 : 1;
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
            if (u50.F3) {
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
        if (!u50.F3 || u50.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (u50.G3) {
                layoutParams4.gravity = u50Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (u50.G3) {
                layoutParams5.gravity = u50Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (u50.F3) {
            g30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            g30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) x20Var.getLayoutParams();
        if (u50.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = u50Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (u50.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!u50.F3 || u50.G3) {
            ((FrameLayout.LayoutParams) p40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) d30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) p40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) d30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) g30Var.getLayoutParams();
        if (u50.F3) {
            if (((s4.b0) g30Var.getLayoutManager()).o != 1) {
                ((s4.b0) g30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.b0) g30Var.getLayoutManager()).o != 0) {
                ((s4.b0) g30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        u30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) u30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (s30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) s30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (u50.G3) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.v0.b(8.0f, paddingTop - max, 0);
        }
        if (z40Var.getPaddingTop() != b10 || z40Var.getPaddingBottom() != dp) {
            z40Var.setPadding(i12, b10, i12, dp);
        }
        s50 s50Var = u50Var.B1;
        if (s50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) s50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = u50.I0(u50Var);
            if (I0 != null) {
                int measuredHeight = ((x20Var.getMeasuredHeight() / 2) + x20Var.getTop()) - (u50Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = i2.o1.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        j50 j50Var = u50Var.U0;
        if (j50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) j50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = u50.I0(u50Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (n5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) n5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) u50Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    n5Var.setVisibility(0);
                    n5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            n5Var.setVisibility(4);
            n5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(k30Var.b, true);
        }
        this.w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.y0) {
            this.y0 = measuredHeight3;
            u50Var.d1(false);
        }
        u50Var.r2.f = getMeasuredWidth();
        u50Var.Y0();
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
