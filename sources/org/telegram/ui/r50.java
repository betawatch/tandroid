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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class r50 extends org.telegram.ui.Components.ow0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final /* synthetic */ n60 D0;
    public boolean w0;
    public final RectF x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = n60Var;
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
        org.telegram.ui.Cells.e4 e4Var;
        float f11;
        float y3;
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
        int i10;
        boolean z11;
        Shader.TileMode tileMode;
        n60 n60Var = this.D0;
        l60 l60Var = n60Var.B1;
        View view = n60Var.K2;
        View view2 = n60Var.J2;
        ArrayList arrayList2 = n60Var.Y1;
        mh.h hVar = n60Var.c0;
        Paint paint = n60Var.C0;
        a40 a40Var = n60Var.m2;
        h40 h40Var = n60Var.C2;
        e40 e40Var = n60Var.a2;
        t50 t50Var = n60Var.Q;
        if (n60Var.s2 || n60Var.F2) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (n60Var.Q2 == null) {
                    n60Var.Q2 = new RenderNode("CallActivity.Blur");
                    n60Var.R2 = org.telegram.ui.Components.ow0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.ow0.getBlurRadius();
                    RenderNode renderNode = n60Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = n60Var.Q2;
                    float f15 = n60Var.R2;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / n60Var.R2);
                int round2 = Math.round(getMeasuredHeight() / n60Var.R2);
                n60Var.s2 = true;
                n60Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = n60Var.Q2.beginRecording();
                float f16 = 1.0f / n60Var.R2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                n60Var.Q2.endRecording();
                n60Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < t50Var.getChildCount(); i11++) {
            View childAt = t50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                z11 = true;
                ((org.telegram.ui.Cells.e4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != t50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((t50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (e40Var.r == null) {
            for (int i12 = 0; i12 < a40Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.e30) a40Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (a40Var.getVisibility() == 0) {
            HashMap hashMap = this.C0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < t50Var.getChildCount()) {
                View childAt2 = t50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        t50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != e40Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                        t50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.e4 e4Var3 = (org.telegram.ui.Cells.e4) childAt2;
                            hashMap.put(e4Var3.getParticipant(), e4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < a40Var.getChildCount()) {
                org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) a40Var.getChildAt(i14);
                View view3 = (View) hashMap.get(e30Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(e30Var.getParticipant());
                }
                float f17 = e40Var.c;
                HashMap hashMap2 = hashMap;
                if (!n60Var.N2.k()) {
                    e30Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (t50Var.getX() + lVar3.getLeft()) - e40Var.getLeft();
                        f12 = (t50Var.getY() + lVar3.getTop()) - e40Var.getTop();
                        f13 = a40Var.getX() + e30Var.getLeft();
                        f14 = a40Var.getY() + e30Var.getTop();
                    } else {
                        x11 = ((t50Var.getX() + r14.getLeft()) - e40Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((t50Var.getY() + r14.getTop()) - e40Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = a40Var.getX() + e30Var.getLeft() + (e30Var.getMeasuredWidth() >> 1);
                        float y11 = a40Var.getY() + e30Var.getTop() + (e30Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.e4) view3).setDrawAvatar(false);
                        f12 = y10;
                        f13 = x12;
                        f14 = y11;
                    }
                    float f18 = 1.0f - f17;
                    e30Var.setTranslationX((x11 - f13) * f18);
                    e30Var.setTranslationY((f12 - f14) * f18);
                    e30Var.setScaleX(1.0f);
                    e30Var.setScaleY(1.0f);
                    e30Var.setProgressToFullscreen(f17);
                } else {
                    e30Var.setScaleX(1.0f);
                    e30Var.setScaleY(1.0f);
                    e30Var.setTranslationX(0.0f);
                    e30Var.setTranslationY(0.0f);
                    e30Var.setProgressToFullscreen(1.0f);
                    if (e30Var.getRenderer() == null) {
                        e30Var.setAlpha(f17);
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
            org.telegram.ui.Components.mm0 mm0Var = n60Var.n2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.P) {
                arrayList = arrayList2;
            } else {
                tVar.y0 = false;
                float f19 = e40Var.c;
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
                            mm0Var = t50Var;
                        }
                        float x13 = ((mm0Var.getX() + lVar5.getX()) - tVar.getLeft()) - e40Var.getLeft();
                        float y12 = ((mm0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - e40Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        tVar.setTranslationX((x13 * f20) + f21);
                        tVar.setTranslationY((y12 * f20) + f21);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.e30 e30Var2 = tVar.d;
                    if (e30Var2 != null) {
                        e30Var2.setAlpha(f19);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f19);
                    } else if (!tVar.E) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.e30 e30Var3 = tVar.d;
                    if (e30Var3 != null) {
                        a40Var.getClass();
                        if (RecyclerView.R(e30Var3) == -1) {
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
                        tVar.setTranslationX((a40Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((a40Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    mm0Var = t50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (n60.G3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            mm0Var = t50Var;
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
                            tVar.setTranslationX(((mm0Var.getX() + lVar8.getX()) - tVar.getLeft()) - e40Var.getLeft());
                            tVar.setTranslationY(((mm0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - e40Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.E) {
                                if (!n60.G3) {
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
        if (n60.G3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - e40Var.c);
            view.setAlpha(1.0f - e40Var.c);
        }
        if (e40Var.L0) {
            t50Var.setAlpha(f10 - e40Var.c);
        } else {
            t50Var.setAlpha(f10);
        }
        if (l60Var != null) {
            l60Var.setAlpha(f10 - e40Var.c);
            l60Var.setTranslationY(e40Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (n60Var.F2) {
            return;
        }
        boolean z12 = n60Var.f2;
        RectF rectF = this.x0;
        if (!z12) {
            if (n60Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), n60Var.W2);
                float y13 = t50Var.getY();
                t50Var.getY();
                t50Var.getMeasuredHeight();
                if (!n60Var.b3) {
                    if (n60Var.a3 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = n60Var.Z2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(e40Var.getX() + n60Var.Z2.getX(), e40Var.getY() + n60Var.Z2.getY());
                        n60Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(e40Var.getX() + a40Var.getX() + n60Var.a3.getX(), e40Var.getY() + a40Var.getY() + n60Var.a3.getY());
                    if (n60Var.a3.getRenderer() == null || !n60Var.a3.getRenderer().v || n60Var.a3.getRenderer().b) {
                        n60Var.a3.draw(canvas);
                    } else {
                        n60Var.a3.getRenderer().draw(canvas);
                    }
                    n60Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = t50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = t50Var.getChildAt(i16);
                    if (childAt3 == n60Var.X2) {
                        float max = Math.max(t50Var.getLeft(), childAt3.getX() + t50Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + t50Var.getY());
                        float min = Math.min(t50Var.getRight(), childAt3.getX() + t50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(t50Var.getY() + t50Var.getMeasuredHeight(), childAt3.getY() + t50Var.getY() + n60Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + t50Var.getLeft(), childAt3.getY() + t50Var.getY());
                            float alpha = n60Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((n60Var.X2.getClipHeight() - n60Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.es.g.getInterpolation(1.0f - alpha))) + n60Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.e4 e4Var4 = n60Var.X2;
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
        if (n60Var.X2 != null) {
            if (n60Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), n60Var.W2);
            }
            float y14 = t50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = t50Var.getChildCount();
            float y15 = t50Var.getY() + t50Var.getMeasuredHeight();
            if (n60Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        e4Var = null;
                        break;
                    }
                    View childAt4 = t50Var.getChildAt(i17);
                    e4Var = n60Var.X2;
                    if (childAt4 == e4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                e4Var = n60Var.X2;
            }
            if (e4Var != null && y14 < y15) {
                canvas3.save();
                if (n60Var.a3 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - n60Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * n60Var.d2) + ((1.0f - n60Var.d2) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (n60Var.b3) {
                    y3 = ((1.0f - n60Var.d2) * (e4Var.getY() + t50Var.getY())) + ((h40Var.getMeasuredWidth() + h40Var.getTop()) * n60Var.d2);
                    x10 = ((1.0f - n60Var.d2) * (e4Var.getX() + t50Var.getLeft())) + (n60Var.d2 * h40Var.getLeft());
                } else {
                    y3 = h40Var.getMeasuredWidth() + h40Var.getTop();
                    x10 = h40Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x10, f23);
                if (n60Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    e4Var2 = e4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    e4Var2 = e4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, e4Var.getMeasuredWidth(), e4Var.getClipHeight(), (int) (n60Var.d2 * f11), 31);
                }
                float clipHeight = (int) (((e4Var2.getClipHeight() - e4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.es.g.getInterpolation(1.0f - n60Var.d2))) + e4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, e4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.e4 e4Var5 = e4Var2;
                e4Var5.setProgressToAvatarPreview(n60Var.b3 ? n60Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - n60Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                e4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (n60Var.e2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - n60Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (n60Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, n60Var.e2.getMeasuredWidth() + measuredWidth, n60Var.e2.getMeasuredHeight() + f24, (int) (n60Var.d2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    n60Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    n60Var.e2.setTranslationY(f24 - r4.getTop());
                    float f25 = (n60Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (n60Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    n60Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (n60Var.c2.n) {
                return;
            }
            canvas3.save();
            if (n60Var.b3 && n60Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - n60Var.d2) * y14, getMeasuredWidth(), (n60Var.d2 * getMeasuredHeight()) + ((1.0f - n60Var.d2) * y15));
            }
            canvas3.scale(h40Var.getScaleX(), h40Var.getScaleY(), h40Var.getX(), h40Var.getY());
            canvas3.translate(h40Var.getX(), h40Var.getY());
            h40Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        n60 n60Var = this.D0;
        r30 r30Var = n60Var.e;
        a40 a40Var = n60Var.m2;
        t50 t50Var = n60Var.Q;
        e40 e40Var = n60Var.a2;
        if (n60Var.s2) {
            if (view == t50Var) {
                int childCount = t50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = t50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == e40Var || view == r30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (n60.G3 || e40Var.c != 1.0f || (view != n60Var.O && view != n60Var.g0 && view != n60Var.N && view != n60Var.e1 && view != n60Var.z1 && view != n60Var.U0)) {
            if (n60Var.F2 && view == e40Var) {
                canvas.save();
                canvas.translate(a40Var.getX() + e40Var.getX(), a40Var.getY() + e40Var.getY());
                a40Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != n60Var.C2 && view != n60Var.e2 && view != n60Var.X2 && (!n60Var.l2 || !n60Var.g2 || (view != t50Var && view != r30Var && view != n60Var.c0))) {
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
        n60 n60Var = this.D0;
        ImageReceiver imageReceiver = n60Var.Z;
        Drawable drawable = n60Var.f0;
        e40 e40Var = n60Var.a2;
        float f10 = n60Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        n60Var.R1();
        if (e40Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.g6.t0.setColor(n60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.x0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.g6.t0);
            }
            org.telegram.ui.ActionBar.g6.t0.setColor(Color.argb((int) (n60Var.O.getAlpha() * 255.0f), (int) (Color.red(n60Var.V1) * 0.8f), (int) (Color.green(n60Var.V1) * 0.8f), (int) (Color.blue(n60Var.V1) * 0.8f)));
            float statusBarHeight = n60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.g6.t0);
            y40 y40Var = n60Var.z0;
            if (y40Var != null) {
                org.telegram.ui.ActionBar.g6.t0.setColor(y40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, n60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.g6.t0);
            }
        }
        if (e40Var.c != 0.0f) {
            org.telegram.ui.ActionBar.g6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.gg, false), (int) (e40Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.t0);
        }
        if (n60Var.s1() && LiteMode.isEnabled(512)) {
            if (e40Var.c < 0.15d) {
                if (!n60Var.z2) {
                    n60Var.z2 = true;
                    n60Var.A1();
                }
            } else if (n60Var.z2) {
                n60Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(n60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n60 n60Var = this.D0;
        h40 h40Var = n60Var.C2;
        if (n60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = n60Var.e2.getX();
            float y10 = n60Var.e2.getY();
            float x12 = n60Var.e2.getX() + n60Var.e2.getMeasuredWidth();
            float y11 = n60Var.e2.getY() + n60Var.e2.getMeasuredHeight();
            RectF rectF = this.x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(h40Var.getX(), h40Var.getY(), h40Var.getX() + h40Var.getMeasuredWidth(), h40Var.getY() + h40Var.getMeasuredWidth() + n60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                n60Var.e1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || n60Var.y0 == 0.0f || motionEvent.getY() >= n60Var.y0 - AndroidUtilities.dp(37.0f) || n60Var.O.getAlpha() != 0.0f || n60Var.f2 || n60Var.z0 != null || n60Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        n60Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        n60 n60Var = this.D0;
        if (n60Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        n60Var.e1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        n60 n60Var = this.D0;
        View view = n60Var.K2;
        View view2 = n60Var.J2;
        r30 r30Var = n60Var.e;
        e40 e40Var = n60Var.a2;
        t50 t50Var = n60Var.Q;
        if (n60.G3 && this.A0 != n60Var.I2 && this.B0) {
            f7 = t50Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = n60Var.I2;
        e40Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        e40Var.s = false;
        n60.K0(n60Var);
        this.B0 = true;
        if (!z11 || t50Var.getLeft() == f7) {
            return;
        }
        float left = f7 - t50Var.getLeft();
        t50Var.setTranslationX(left);
        r30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = t50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
        duration.setInterpolator(esVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(esVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(esVar).start();
        r30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(esVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int y3;
        n60 n60Var = this.D0;
        o40 o40Var = n60Var.G;
        x30 x30Var = n60Var.N;
        LinearLayout linearLayout = n60Var.z1;
        j50 j50Var = n60Var.O;
        s60 s60Var = n60Var.o2;
        org.telegram.ui.Components.f30 f30Var = n60Var.p2;
        org.telegram.ui.Components.a00 a00Var = n60Var.Y;
        org.telegram.ui.Components.voip.u2 u2Var = n60Var.w;
        org.telegram.ui.ActionBar.h5 h5Var = n60Var.U;
        View view = n60Var.g0;
        r30 r30Var = n60Var.e;
        View view2 = n60Var.K2;
        View view3 = n60Var.J2;
        ArrayList arrayList = n60Var.Y1;
        org.telegram.ui.ActionBar.h5 h5Var2 = n60Var.W;
        m40 m40Var = n60Var.H;
        ArrayList arrayList2 = n60Var.Z1;
        org.telegram.ui.Components.mm0 mm0Var = n60Var.n2;
        t50 t50Var = n60Var.Q;
        e40 e40Var = n60Var.a2;
        a40 a40Var = n60Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.w0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        e40Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !n60Var.s1();
        if (n60.F3 != z11) {
            n60.F3 = z11;
            if (u2Var.getMeasuredWidth() == 0) {
                int i13 = u2Var.getLayoutParams().width;
            }
            n60.I0(n60Var);
            a00Var.y1(n60.F3 ? 6 : 2);
            t50Var.a0();
            a40Var.a0();
            this.z0 = true;
            TextView textView = n60Var.S;
            if (textView != null) {
                textView.setVisibility(!n60.F3 ? 0 : 8);
            }
            if (n60Var.r1() == z11 && n60Var.s1() && !e40Var.b && !n60Var.a1.visibleVideoParticipants.isEmpty()) {
                n60Var.f1(n60Var.a1.visibleVideoParticipants.get(0));
                e40Var.e();
            }
        }
        if (n60.G3 != z12) {
            n60.G3 = z12;
            mm0Var.setVisibility(z12 ? 0 : 8);
            t50Var.a0();
            a40Var.a0();
            z10 = true;
            this.z0 = true;
        } else {
            z10 = true;
        }
        if (this.z0) {
            n60Var.P0(z10);
            n60Var.P.l();
            f30Var.G(mm0Var, false);
            if (n60.G3) {
                s60Var.I(mm0Var, false);
            }
            mm0Var.setVisibility(n60.G3 ? 0 : 8);
            s60Var.H(mm0Var, n60.G3 && !e40Var.b, true);
            boolean z13 = n60.G3;
            n60Var.P2 = !z13 || e40Var.b;
            boolean z14 = !z13 && e40Var.b;
            f30Var.F(a40Var, z14);
            a40Var.setVisibility(z14 ? 0 : 8);
            t50Var.setVisibility((n60.G3 || !e40Var.b) ? 0 : 8);
            a00Var.y1(n60.F3 ? 6 : 2);
            n60Var.O1(false, false);
            t50Var.a0();
            a40Var.a0();
            AndroidUtilities.updateVisibleRows(t50Var);
            this.z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            e40Var.setIsTablet(n60.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (n60Var.s1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e40Var.getLayoutParams();
        if (n60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) n60Var.j0[i15].getLayoutParams();
            if (n60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (mm0Var != null) {
            ((FrameLayout.LayoutParams) mm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (m40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) m40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(n60Var.s1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) t50Var.getLayoutParams();
        if (n60.G3) {
            layoutParams3.gravity = n60Var.I2 ? 5 : 1;
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
            if (n60.F3) {
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
        if (!n60.F3 || n60.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (n60.G3) {
                layoutParams4.gravity = n60Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (n60.G3) {
                layoutParams5.gravity = n60Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (n60.F3) {
            a40Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            a40Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
        if (n60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = n60Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (n60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!n60.F3 || n60.G3) {
            ((FrameLayout.LayoutParams) j50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) x30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) j50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) x30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) a40Var.getLayoutParams();
        if (n60.F3) {
            if (((s4.b0) a40Var.getLayoutManager()).o != 1) {
                ((s4.b0) a40Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.b0) a40Var.getLayoutManager()).o != 0) {
                ((s4.b0) a40Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        o40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) o40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (m40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) m40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (n60.G3) {
            y3 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            y3 = org.telegram.messenger.g0.y(8.0f, paddingTop - max, 0);
        }
        if (t50Var.getPaddingTop() != y3 || t50Var.getPaddingBottom() != dp) {
            t50Var.setPadding(i12, y3, i12, dp);
        }
        l60 l60Var = n60Var.B1;
        if (l60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) l60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J0 = n60.J0(n60Var);
            if (J0 != null) {
                int measuredHeight = ((r30Var.getMeasuredHeight() / 2) + r30Var.getTop()) - (n60Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = J0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + y3;
                layoutParams9.topMargin = i2.d.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        c60 c60Var = n60Var.U0;
        if (c60Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) c60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J02 = n60.J0(n60Var);
            if (J02 != null) {
                layoutParams10.height = J02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = J02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (h5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - y3)) / 2) + y3;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) h5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) n60Var.V.getLayoutParams();
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
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(e40Var.b, true);
        }
        this.w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.y0) {
            this.y0 = measuredHeight3;
            n60Var.e1(false);
        }
        n60Var.r2.f = getMeasuredWidth();
        n60Var.Z0();
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
