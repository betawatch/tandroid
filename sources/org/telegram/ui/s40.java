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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s40 extends org.telegram.ui.Components.xu0 {
    public boolean s0;
    public final RectF t0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public final HashMap y0;
    public final /* synthetic */ o50 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.z0 = o50Var;
        this.s0 = false;
        this.t0 = new RectF();
        this.y0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.e4 e4Var;
        float f11;
        float y10;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.e4 e4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x11;
        float f12;
        float f13;
        float f14;
        int i9;
        Shader.TileMode tileMode;
        o50 o50Var = this.z0;
        m50 m50Var = o50Var.x1;
        View view = o50Var.G2;
        View view2 = o50Var.F2;
        ArrayList arrayList2 = o50Var.U1;
        tg.i iVar = o50Var.Y;
        Paint paint = o50Var.y0;
        c30 c30Var = o50Var.i2;
        j30 j30Var = o50Var.y2;
        g30 g30Var = o50Var.W1;
        u40 u40Var = o50Var.M;
        if (!o50Var.o2 && !o50Var.B2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (o50Var.M2 == null) {
                    o50Var.M2 = new RenderNode("CallActivity.Blur");
                    o50Var.N2 = org.telegram.ui.Components.xu0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.xu0.getBlurRadius();
                    RenderNode renderNode = o50Var.M2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    iVar.setBlurRoot(this);
                    RenderNode renderNode2 = o50Var.M2;
                    float f15 = o50Var.N2;
                    iVar.S0 = renderNode2;
                    iVar.T0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / o50Var.N2);
                int round2 = Math.round(getMeasuredHeight() / o50Var.N2);
                o50Var.o2 = true;
                o50Var.M2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = o50Var.M2.beginRecording();
                float f16 = 1.0f / o50Var.N2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                o50Var.M2.endRecording();
                o50Var.o2 = false;
            }
        }
        for (int i10 = 0; i10 < u40Var.getChildCount(); i10++) {
            View childAt = u40Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != u40Var.getMeasuredWidth()) {
                    childAt.setTranslationX((u40Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (g30Var.r == null) {
            for (int i11 = 0; i11 < c30Var.getChildCount(); i11++) {
                ((org.telegram.ui.Components.b20) c30Var.getChildAt(i11)).setProgressToFullscreen(1.0f);
            }
        } else if (c30Var.getVisibility() == 0) {
            HashMap hashMap = this.y0;
            hashMap.clear();
            int i12 = 0;
            while (i12 < u40Var.getChildCount()) {
                View childAt2 = u40Var.getChildAt(i12);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        u40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i9 = i12;
                            if (lVar2.getRenderer() != g30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i9 = i12;
                    if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                        u40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.e4 e4Var3 = (org.telegram.ui.Cells.e4) childAt2;
                            hashMap.put(e4Var3.getParticipant(), e4Var3);
                        }
                    }
                } else {
                    i9 = i12;
                }
                i12 = i9 + 1;
            }
            int i13 = 0;
            while (i13 < c30Var.getChildCount()) {
                org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) c30Var.getChildAt(i13);
                View view3 = (View) hashMap.get(b20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(b20Var.getParticipant());
                }
                float f17 = g30Var.c;
                HashMap hashMap2 = hashMap;
                if (!o50Var.J2.k()) {
                    b20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (u40Var.getX() + lVar3.getLeft()) - g30Var.getLeft();
                        f12 = (u40Var.getY() + lVar3.getTop()) - g30Var.getTop();
                        f13 = c30Var.getX() + b20Var.getLeft();
                        f14 = c30Var.getY() + b20Var.getTop();
                    } else {
                        x11 = ((u40Var.getX() + r14.getLeft()) - g30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((u40Var.getY() + r14.getTop()) - g30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = c30Var.getX() + b20Var.getLeft() + (b20Var.getMeasuredWidth() >> 1);
                        float y12 = c30Var.getY() + b20Var.getTop() + (b20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.e4) view3).setDrawAvatar(false);
                        f12 = y11;
                        f13 = x12;
                        f14 = y12;
                    }
                    float f18 = 1.0f - f17;
                    b20Var.setTranslationX((x11 - f13) * f18);
                    b20Var.setTranslationY((f12 - f14) * f18);
                    b20Var.setScaleX(1.0f);
                    b20Var.setScaleY(1.0f);
                    b20Var.setProgressToFullscreen(f17);
                } else {
                    b20Var.setScaleX(1.0f);
                    b20Var.setScaleY(1.0f);
                    b20Var.setTranslationX(0.0f);
                    b20Var.setTranslationY(0.0f);
                    b20Var.setProgressToFullscreen(1.0f);
                    if (b20Var.getRenderer() == null) {
                        b20Var.setAlpha(f17);
                    }
                }
                i13++;
                hashMap = hashMap2;
            }
        }
        int i14 = 0;
        while (i14 < arrayList2.size()) {
            org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList2.get(i14);
            org.telegram.ui.Components.wk0 wk0Var = o50Var.j2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.L) {
                arrayList = arrayList2;
            } else {
                tVar.u0 = false;
                float f19 = g30Var.c;
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
                            wk0Var = u40Var;
                        }
                        float x13 = ((wk0Var.getX() + lVar5.getX()) - tVar.getLeft()) - g30Var.getLeft();
                        float y13 = ((wk0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - g30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        tVar.setTranslationX((x13 * f20) + f21);
                        tVar.setTranslationY((y13 * f20) + f21);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.b20 b20Var2 = tVar.d;
                    if (b20Var2 != null) {
                        b20Var2.setAlpha(f19);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f19);
                    } else if (!tVar.A) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.b20 b20Var3 = tVar.d;
                    if (b20Var3 != null) {
                        c30Var.getClass();
                        if (RecyclerView.R(b20Var3) == -1) {
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
                        tVar.setTranslationX((c30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((c30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    wk0Var = u40Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (o50.C3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            wk0Var = u40Var;
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
                            tVar.setTranslationX(((wk0Var.getX() + lVar8.getX()) - tVar.getLeft()) - g30Var.getLeft());
                            tVar.setTranslationY(((wk0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - g30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.A) {
                                if (!o50.C3) {
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
            i14++;
            arrayList2 = arrayList;
        }
        if (o50.C3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - g30Var.c);
            view.setAlpha(1.0f - g30Var.c);
        }
        if (g30Var.H0) {
            u40Var.setAlpha(f10 - g30Var.c);
        } else {
            u40Var.setAlpha(f10);
        }
        if (m50Var != null) {
            m50Var.setAlpha(f10 - g30Var.c);
            m50Var.setTranslationY(g30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (o50Var.B2) {
            return;
        }
        boolean z11 = o50Var.b2;
        RectF rectF = this.t0;
        if (!z11) {
            if (o50Var.T2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), o50Var.S2);
                float y14 = u40Var.getY();
                u40Var.getY();
                u40Var.getMeasuredHeight();
                if (!o50Var.X2) {
                    if (o50Var.W2 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = o50Var.V2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(g30Var.getX() + o50Var.V2.getX(), g30Var.getY() + o50Var.V2.getY());
                        o50Var.V2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(g30Var.getX() + c30Var.getX() + o50Var.W2.getX(), g30Var.getY() + c30Var.getY() + o50Var.W2.getY());
                    if (o50Var.W2.getRenderer() == null || !o50Var.W2.getRenderer().v || o50Var.W2.getRenderer().b) {
                        o50Var.W2.draw(canvas);
                    } else {
                        o50Var.W2.getRenderer().draw(canvas);
                    }
                    o50Var.W2.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = u40Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt3 = u40Var.getChildAt(i15);
                    if (childAt3 == o50Var.T2) {
                        float max = Math.max(u40Var.getLeft(), childAt3.getX() + u40Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + u40Var.getY());
                        float min = Math.min(u40Var.getRight(), childAt3.getX() + u40Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(u40Var.getY() + u40Var.getMeasuredHeight(), childAt3.getY() + u40Var.getY() + o50Var.T2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + u40Var.getLeft(), childAt3.getY() + u40Var.getY());
                            float alpha = o50Var.S2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((o50Var.T2.getClipHeight() - o50Var.T2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.gr.g.getInterpolation(1.0f - alpha))) + o50Var.T2.getMeasuredHeight()));
                            org.telegram.ui.Cells.e4 e4Var4 = o50Var.T2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.h5[] h5VarArr = e4Var4.d;
                            if (TextUtils.isEmpty(h5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            h5VarArr[4].setFullAlpha(alpha);
                            h5VarArr[4].h(0, 0);
                            e4Var4.invalidate();
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
        if (o50Var.T2 != null) {
            if (o50Var.c2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), o50Var.S2);
            }
            float y15 = u40Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = u40Var.getChildCount();
            float y16 = u40Var.getY() + u40Var.getMeasuredHeight();
            if (o50Var.X2) {
                int i16 = 0;
                while (true) {
                    if (i16 >= childCount2) {
                        e4Var = null;
                        break;
                    }
                    View childAt4 = u40Var.getChildAt(i16);
                    e4Var = o50Var.T2;
                    if (childAt4 == e4Var) {
                        break;
                    } else {
                        i16++;
                    }
                }
            } else {
                e4Var = o50Var.T2;
            }
            if (e4Var != null && y15 < y16) {
                canvas3.save();
                if (o50Var.W2 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - o50Var.Z1) * y15, getMeasuredWidth(), (getMeasuredHeight() * o50Var.Z1) + ((1.0f - o50Var.Z1) * y16));
                } else {
                    f11 = 255.0f;
                }
                if (o50Var.X2) {
                    y10 = ((1.0f - o50Var.Z1) * (e4Var.getY() + u40Var.getY())) + ((j30Var.getMeasuredWidth() + j30Var.getTop()) * o50Var.Z1);
                    x10 = ((1.0f - o50Var.Z1) * (e4Var.getX() + u40Var.getLeft())) + (o50Var.Z1 * j30Var.getLeft());
                } else {
                    y10 = j30Var.getMeasuredWidth() + j30Var.getTop();
                    x10 = j30Var.getLeft();
                }
                float f23 = y10;
                canvas3.translate(x10, f23);
                if (o50Var.X2) {
                    fArr = fArr2;
                    path = path2;
                    e4Var2 = e4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    e4Var2 = e4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, e4Var.getMeasuredWidth(), e4Var.getClipHeight(), (int) (o50Var.Z1 * f11), 31);
                }
                float clipHeight = (int) (((e4Var2.getClipHeight() - e4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.gr.g.getInterpolation(1.0f - o50Var.Z1))) + e4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, e4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.e4 e4Var5 = e4Var2;
                e4Var5.setProgressToAvatarPreview(o50Var.X2 ? o50Var.Z1 : 1.0f);
                for (int i17 = 0; i17 < 4; i17++) {
                    fArr[i17] = (1.0f - o50Var.Z1) * AndroidUtilities.dp(13.0f);
                    fArr[i17 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                e4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (o50Var.a2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - o50Var.a2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (o50Var.Z1 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, o50Var.a2.getMeasuredWidth() + measuredWidth, o50Var.a2.getMeasuredHeight() + f24, (int) (o50Var.Z1 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    o50Var.a2.setTranslationX(measuredWidth - r4.getLeft());
                    o50Var.a2.setTranslationY(f24 - r4.getTop());
                    float f25 = (o50Var.Z1 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (o50Var.a2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    o50Var.a2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (o50Var.Y1.n) {
                return;
            }
            canvas3.save();
            if (o50Var.X2 && o50Var.W2 == null) {
                canvas3.clipRect(0.0f, (1.0f - o50Var.Z1) * y15, getMeasuredWidth(), (o50Var.Z1 * getMeasuredHeight()) + ((1.0f - o50Var.Z1) * y16));
            }
            canvas3.scale(j30Var.getScaleX(), j30Var.getScaleY(), j30Var.getX(), j30Var.getY());
            canvas3.translate(j30Var.getX(), j30Var.getY());
            j30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        o50 o50Var = this.z0;
        s20 s20Var = o50Var.e;
        c30 c30Var = o50Var.i2;
        u40 u40Var = o50Var.M;
        g30 g30Var = o50Var.W1;
        if (o50Var.o2) {
            if (view == u40Var) {
                int childCount = u40Var.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = u40Var.getChildAt(i9);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == g30Var || view == s20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (o50.C3 || g30Var.c != 1.0f || (view != o50Var.K && view != o50Var.c0 && view != o50Var.J && view != o50Var.a1 && view != o50Var.v1 && view != o50Var.Q0)) {
            if (o50Var.B2 && view == g30Var) {
                canvas.save();
                canvas.translate(c30Var.getX() + g30Var.getX(), c30Var.getY() + g30Var.getY());
                c30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != o50Var.y2 && view != o50Var.a2 && view != o50Var.T2 && (!o50Var.h2 || !o50Var.c2 || (view != u40Var && view != s20Var && view != o50Var.Y))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0.V.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.V.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int dp = AndroidUtilities.dp(74.0f);
        o50 o50Var = this.z0;
        ImageReceiver imageReceiver = o50Var.V;
        Drawable drawable = o50Var.b0;
        g30 g30Var = o50Var.W1;
        float f11 = o50Var.u0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i9 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
        int i21 = i9 + dp2;
        i10 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
        if (i10 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i19 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
            i20 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i20) / ((dp - i19) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i21 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        o50Var.Q1();
        if (g30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i21);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.f6.t0.setColor(o50Var.R1);
                i15 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
                float f12 = i16 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
                float f13 = measuredWidth - i17;
                i18 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
                float dp3 = i18 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.t0;
                rectF.set(i15, f12, f13, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.t0);
            }
            org.telegram.ui.ActionBar.f6.t0.setColor(Color.argb((int) (o50Var.K.getAlpha() * 255.0f), (int) (Color.red(o50Var.R1) * 0.8f), (int) (Color.green(o50Var.R1) * 0.8f), (int) (Color.blue(o50Var.R1) * 0.8f)));
            float statusBarHeight = o50Var.getStatusBarHeight();
            i11 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i12 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
            canvas.drawRect(i11, 0.0f, measuredWidth2 - i12, statusBarHeight, org.telegram.ui.ActionBar.f6.t0);
            a40 a40Var = o50Var.v0;
            if (a40Var != null) {
                org.telegram.ui.ActionBar.f6.t0.setColor(a40Var.getBackgroundColor());
                i13 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
                float f14 = i13;
                int measuredWidth3 = getMeasuredWidth();
                i14 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
                canvas.drawRect(f14, 0.0f, measuredWidth3 - i14, o50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.f6.t0);
            }
        }
        if (g30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.f6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gg, false), (int) (g30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.t0);
        }
        if (o50Var.r1() && LiteMode.isEnabled(512)) {
            if (g30Var.c < 0.15d) {
                if (!o50Var.v2) {
                    o50Var.v2 = true;
                    o50Var.z1();
                }
            } else if (o50Var.v2) {
                o50Var.v2 = false;
                AndroidUtilities.cancelRunOnUIThread(o50Var.w2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o50 o50Var = this.z0;
        j30 j30Var = o50Var.y2;
        if (o50Var.T2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = o50Var.a2.getX();
            float y11 = o50Var.a2.getY();
            float x12 = o50Var.a2.getX() + o50Var.a2.getMeasuredWidth();
            float y12 = o50Var.a2.getY() + o50Var.a2.getMeasuredHeight();
            RectF rectF = this.t0;
            rectF.set(x11, y11, x12, y12);
            boolean z10 = !rectF.contains(x10, y10);
            rectF.set(j30Var.getX(), j30Var.getY(), j30Var.getX() + j30Var.getMeasuredWidth(), j30Var.getY() + j30Var.getMeasuredWidth() + o50Var.T2.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z10 = false;
            }
            if (z10) {
                o50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || o50Var.u0 == 0.0f || motionEvent.getY() >= o50Var.u0 - AndroidUtilities.dp(37.0f) || o50Var.K.getAlpha() != 0.0f || o50Var.b2 || o50Var.v0 != null || o50Var.W1.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        o50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        o50 o50Var = this.z0;
        if (o50Var.T2 == null || i9 != 4) {
            return super.onKeyDown(i9, keyEvent);
        }
        o50Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        float f10;
        boolean z11;
        o50 o50Var = this.z0;
        View view = o50Var.G2;
        View view2 = o50Var.F2;
        s20 s20Var = o50Var.e;
        g30 g30Var = o50Var.W1;
        u40 u40Var = o50Var.M;
        if (o50.C3 && this.w0 != o50Var.E2 && this.x0) {
            f10 = u40Var.getX();
            z11 = true;
        } else {
            f10 = 0.0f;
            z11 = false;
        }
        this.w0 = o50Var.E2;
        g30Var.s = true;
        super.onLayout(z10, i9, i10, i11, i12);
        g30Var.s = false;
        o50.I0(o50Var);
        this.x0 = true;
        if (!z11 || u40Var.getLeft() == f10) {
            return;
        }
        float left = f10 - u40Var.getLeft();
        u40Var.setTranslationX(left);
        s20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = u40Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        duration.setInterpolator(grVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
        s20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        float f10;
        int dp;
        float f11;
        int i11;
        int z11;
        o50 o50Var = this.z0;
        q30 q30Var = o50Var.C;
        z20 z20Var = o50Var.J;
        LinearLayout linearLayout = o50Var.v1;
        k40 k40Var = o50Var.K;
        u50 u50Var = o50Var.k2;
        org.telegram.ui.Components.c20 c20Var = o50Var.l2;
        org.telegram.ui.Components.az azVar = o50Var.U;
        org.telegram.ui.Components.voip.u2 u2Var = o50Var.w;
        org.telegram.ui.ActionBar.h5 h5Var = o50Var.Q;
        View view = o50Var.c0;
        s20 s20Var = o50Var.e;
        View view2 = o50Var.G2;
        View view3 = o50Var.F2;
        ArrayList arrayList = o50Var.U1;
        org.telegram.ui.ActionBar.h5 h5Var2 = o50Var.S;
        o30 o30Var = o50Var.D;
        ArrayList arrayList2 = o50Var.V1;
        org.telegram.ui.Components.wk0 wk0Var = o50Var.j2;
        u40 u40Var = o50Var.M;
        g30 g30Var = o50Var.W1;
        c30 c30Var = o50Var.i2;
        int size = View.MeasureSpec.getSize(i10);
        this.s0 = true;
        boolean z12 = View.MeasureSpec.getSize(i9) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i9);
        g30Var.getClass();
        boolean z13 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i9) > size && !o50Var.r1();
        if (o50.B3 != z12) {
            o50.B3 = z12;
            if (u2Var.getMeasuredWidth() == 0) {
                int i12 = u2Var.getLayoutParams().width;
            }
            o50.G0(o50Var);
            azVar.y1(o50.B3 ? 6 : 2);
            u40Var.a0();
            c30Var.a0();
            this.v0 = true;
            TextView textView = o50Var.O;
            if (textView != null) {
                textView.setVisibility(!o50.B3 ? 0 : 8);
            }
            if (o50Var.q1() == z12 && o50Var.r1() && !g30Var.b && !o50Var.W0.visibleVideoParticipants.isEmpty()) {
                o50Var.e1(o50Var.W0.visibleVideoParticipants.get(0));
                g30Var.e();
            }
        }
        if (o50.C3 != z13) {
            o50.C3 = z13;
            wk0Var.setVisibility(z13 ? 0 : 8);
            u40Var.a0();
            c30Var.a0();
            z10 = true;
            this.v0 = true;
        } else {
            z10 = true;
        }
        if (this.v0) {
            o50Var.O0(z10);
            o50Var.L.l();
            c20Var.G(wk0Var, false);
            if (o50.C3) {
                u50Var.I(wk0Var, false);
            }
            wk0Var.setVisibility(o50.C3 ? 0 : 8);
            u50Var.H(wk0Var, o50.C3 && !g30Var.b, true);
            boolean z14 = o50.C3;
            o50Var.L2 = !z14 || g30Var.b;
            boolean z15 = !z14 && g30Var.b;
            c20Var.F(c30Var, z15);
            c30Var.setVisibility(z15 ? 0 : 8);
            u40Var.setVisibility((o50.C3 || !g30Var.b) ? 0 : 8);
            azVar.y1(o50.B3 ? 6 : 2);
            o50Var.N1(false, false);
            u40Var.a0();
            c30Var.a0();
            AndroidUtilities.updateVisibleRows(u40Var);
            this.v0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            g30Var.setIsTablet(o50.C3);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i13)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (o50Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g30Var.getLayoutParams();
        if (o50.C3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i14 = 0; i14 < 2; i14++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o50Var.f0[i14].getLayoutParams();
            if (o50.C3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (wk0Var != null) {
            ((FrameLayout.LayoutParams) wk0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (o30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) o30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(o50Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) u40Var.getLayoutParams();
        if (o50.C3) {
            layoutParams3.gravity = o50Var.E2 ? 5 : 1;
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
            if (o50.B3) {
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
        if (!o50.B3 || o50.C3) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (o50.C3) {
                layoutParams4.gravity = o50Var.E2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (o50.C3) {
                layoutParams5.gravity = o50Var.E2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (o50.B3) {
            c30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            c30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) s20Var.getLayoutParams();
        if (o50.C3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = o50Var.E2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (o50.B3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!o50.B3 || o50.C3) {
            ((FrameLayout.LayoutParams) k40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) z20Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) k40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) z20Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) c30Var.getLayoutParams();
        if (o50.B3) {
            if (((f2.m0) c30Var.getLayoutManager()).o != 1) {
                ((f2.m0) c30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.m0) c30Var.getLayoutManager()).o != 0) {
                ((f2.m0) c30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        q30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) q30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (o30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) o30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (o50.C3) {
            z11 = 0;
            i11 = 0;
        } else {
            i11 = 0;
            z11 = org.telegram.messenger.l0.z(8.0f, paddingTop - max, 0);
        }
        if (u40Var.getPaddingTop() != z11 || u40Var.getPaddingBottom() != dp) {
            u40Var.setPadding(i11, z11, i11, dp);
        }
        m50 m50Var = o50Var.x1;
        if (m50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) m50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l H0 = o50.H0(o50Var);
            if (H0 != null) {
                int measuredHeight = ((s20Var.getMeasuredHeight() / 2) + s20Var.getTop()) - (o50Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = H0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + z11;
                layoutParams9.topMargin = j3.r0.d(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        d50 d50Var = o50Var.Q0;
        if (d50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) d50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l H02 = o50.H0(o50Var);
            if (H02 != null) {
                layoutParams10.height = H02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = H02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (h5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - z11)) / 2) + z11;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) h5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) o50Var.R.getLayoutParams();
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
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i15)).g(g30Var.b, true);
        }
        this.s0 = false;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.u0) {
            this.u0 = measuredHeight3;
            o50Var.d1(false);
        }
        o50Var.n2.f = getMeasuredWidth();
        o50Var.Y0();
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
