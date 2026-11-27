// default package

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r85 extends wma {
    public boolean g0;
    public final RectF h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final HashMap m0;
    public final /* synthetic */ j95 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r85(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.n0 = j95Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.m0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f1  */
    @Override // wma, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z;
        float f2;
        Canvas canvas2;
        Canvas canvas3;
        zb5 zb5Var;
        float f3;
        float measuredWidth;
        float left;
        float[] fArr;
        Path path;
        zb5 zb5Var2;
        ArrayList arrayList;
        HashMap hashMap;
        float x;
        float y;
        float x2;
        float y2;
        boolean z2;
        Shader.TileMode tileMode;
        j95 j95Var = this.n0;
        View view = j95Var.A4;
        ArrayList arrayList2 = j95Var.R3;
        da5 da5Var = j95Var.V1;
        Paint paint = j95Var.w2;
        c75 c75Var = j95Var.e4;
        k75 k75Var = j95Var.s4;
        g75 g75Var = j95Var.T3;
        t85 t85Var = j95Var.J1;
        boolean z3 = true;
        if (j95Var.k4 || j95Var.v4 || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || hl.m0) {
            f = 1.0f;
        } else {
            if (j95Var.G4 == null) {
                j95Var.G4 = new RenderNode("CallActivity.Blur");
                j95Var.H4 = wma.getRenderNodeScale();
                ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                float blurRadius = wma.getBlurRadius();
                RenderNode renderNode = j95Var.G4;
                f = 1.0f;
                tileMode = Shader.TileMode.DECAL;
                renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                da5Var.setBlurRoot(this);
                RenderNode renderNode2 = j95Var.G4;
                float f4 = j95Var.H4;
                da5Var.V0 = renderNode2;
                da5Var.W0 = f4;
                x86 x86Var = j95Var.k3;
                x86Var.d = this;
                x86Var.b = renderNode2;
                x86Var.c = f4;
            } else {
                f = 1.0f;
            }
            int round = Math.round(getMeasuredWidth() / j95Var.H4);
            int round2 = Math.round(getMeasuredHeight() / j95Var.H4);
            j95Var.k4 = true;
            j95Var.G4.setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = j95Var.G4.beginRecording();
            float f5 = f / j95Var.H4;
            beginRecording.scale(f5, f5);
            dispatchDraw(beginRecording);
            j95Var.G4.endRecording();
            j95Var.k4 = false;
        }
        for (int i = 0; i < t85Var.getChildCount(); i++) {
            View childAt = t85Var.getChildAt(i);
            if (childAt instanceof zb5) {
                ((zb5) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof q95)) {
                if (childAt.getMeasuredWidth() != t85Var.getMeasuredWidth()) {
                    childAt.setTranslationX((t85Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (g75Var.r == null) {
            z = true;
            for (int i2 = 0; i2 < c75Var.getChildCount(); i2++) {
                ((o95) c75Var.getChildAt(i2)).setProgressToFullscreen(1.0f);
            }
        } else if (c75Var.getVisibility() == 0) {
            HashMap hashMap2 = this.m0;
            hashMap2.clear();
            int i3 = 0;
            while (i3 < t85Var.getChildCount()) {
                View childAt2 = t85Var.getChildAt(i3);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof q95) {
                        t85Var.getClass();
                        if (RecyclerView.S(childAt2) >= 0) {
                            q95 q95Var = (q95) childAt2;
                            z2 = z3;
                            if (q95Var.getRenderer() != g75Var.E) {
                                hashMap2.put(q95Var.getParticipant(), childAt2);
                            }
                        }
                    }
                    z2 = z3;
                    if (childAt2 instanceof zb5) {
                        t85Var.getClass();
                        if (RecyclerView.S(childAt2) >= 0) {
                            zb5 zb5Var3 = (zb5) childAt2;
                            hashMap2.put(zb5Var3.getParticipant(), zb5Var3);
                        }
                    }
                } else {
                    z2 = z3;
                }
                i3++;
                z3 = z2;
            }
            z = z3;
            int i4 = 0;
            while (i4 < c75Var.getChildCount()) {
                o95 o95Var = (o95) c75Var.getChildAt(i4);
                View view2 = (View) hashMap2.get(o95Var.getVideoParticipant());
                if (view2 == null) {
                    view2 = (View) hashMap2.get(o95Var.getParticipant());
                }
                float f6 = g75Var.c;
                if (!j95Var.D4.k()) {
                    o95Var.setAlpha(f);
                }
                if (view2 != null) {
                    if (view2 instanceof q95) {
                        q95 q95Var2 = (q95) view2;
                        x = (t85Var.getX() + q95Var2.getLeft()) - g75Var.getLeft();
                        y = (t85Var.getY() + q95Var2.getTop()) - g75Var.getTop();
                        x2 = c75Var.getX() + o95Var.getLeft();
                        y2 = c75Var.getY() + o95Var.getTop();
                        hashMap = hashMap2;
                    } else {
                        x = ((t85Var.getX() + r6.getLeft()) - g75Var.getLeft()) + r6.getAvatarImageView().getLeft() + (r6.getAvatarImageView().getMeasuredWidth() >> 1);
                        y = ((t85Var.getY() + r6.getTop()) - g75Var.getTop()) + r6.getAvatarImageView().getTop() + (r6.getAvatarImageView().getMeasuredHeight() >> 1);
                        x2 = c75Var.getX() + o95Var.getLeft() + (o95Var.getMeasuredWidth() >> 1);
                        hashMap = hashMap2;
                        y2 = c75Var.getY() + o95Var.getTop() + (o95Var.getMeasuredHeight() >> 1);
                        ((zb5) view2).setDrawAvatar(false);
                    }
                    float f7 = 1.0f - f6;
                    o95Var.setTranslationX((x - x2) * f7);
                    o95Var.setTranslationY((y - y2) * f7);
                    o95Var.setScaleX(1.0f);
                    o95Var.setScaleY(1.0f);
                    o95Var.setProgressToFullscreen(f6);
                } else {
                    hashMap = hashMap2;
                    o95Var.setScaleX(1.0f);
                    o95Var.setScaleY(1.0f);
                    o95Var.setTranslationX(0.0f);
                    o95Var.setTranslationY(0.0f);
                    o95Var.setProgressToFullscreen(1.0f);
                    if (o95Var.getRenderer() == null) {
                        o95Var.setAlpha(f6);
                    }
                }
                i4++;
                hashMap2 = hashMap;
                f = 1.0f;
            }
        } else {
            z = true;
        }
        int i5 = 0;
        while (i5 < arrayList2.size()) {
            ka5 ka5Var = (ka5) arrayList2.get(i5);
            d79 d79Var = j95Var.f4;
            ga5 ga5Var = ka5Var.a;
            if (!ka5Var.h && !ka5Var.f && !ka5Var.P) {
                ka5Var.y0 = false;
                float f8 = g75Var.c;
                if (ka5Var.r || ka5Var.b) {
                    arrayList = arrayList2;
                    q95 q95Var3 = ka5Var.c;
                    if (q95Var3 == null && ka5Var.e == null) {
                        ka5Var.setTranslationX(0.0f);
                        ka5Var.setTranslationY(0.0f);
                    } else {
                        q95 q95Var4 = ka5Var.e;
                        if (q95Var4 != null) {
                            q95Var3 = q95Var4;
                        } else {
                            d79Var = t85Var;
                        }
                        float x3 = ((d79Var.getX() + q95Var3.getX()) - ka5Var.getLeft()) - g75Var.getLeft();
                        float y3 = ((d79Var.getY() + (q95Var3.getY() + hl.L(2.0f))) - ka5Var.getTop()) - g75Var.getTop();
                        float f9 = 1.0f - f8;
                        float f10 = f8 * 0.0f;
                        ka5Var.setTranslationX((x3 * f9) + f10);
                        ka5Var.setTranslationY((y3 * f9) + f10);
                    }
                    ga5Var.setRoundCorners(hl.L(8.0f));
                    o95 o95Var2 = ka5Var.d;
                    if (o95Var2 != null) {
                        o95Var2.setAlpha(f8);
                    }
                    if (!ka5Var.b && ka5Var.c == null && ka5Var.e == null) {
                        ka5Var.setAlpha(f8);
                    } else if (!ka5Var.F) {
                        ka5Var.setAlpha(1.0f);
                    }
                } else {
                    o95 o95Var3 = ka5Var.d;
                    if (o95Var3 != null) {
                        c75Var.getClass();
                        if (RecyclerView.S(o95Var3) == -1 ? z : false) {
                            ka5Var.setAlpha(ka5Var.d.getAlpha());
                        } else if (ka5Var.c == null) {
                            if (ka5Var.w && !ka5Var.F) {
                                ka5Var.setAlpha(f8);
                            }
                            ka5Var.d.setAlpha(f8);
                            f8 = 1.0f;
                        } else {
                            ka5Var.d.setAlpha(1.0f);
                            if (ka5Var.w && !ka5Var.F) {
                                ka5Var.setAlpha(1.0f);
                            }
                        }
                        ka5Var.setTranslationX((c75Var.getX() + ka5Var.d.getX()) - ka5Var.getLeft());
                        float f11 = 1.0f - f8;
                        ka5Var.setTranslationY((c75Var.getY() + (ka5Var.d.getY() + (hl.L(2.0f) * f11))) - ka5Var.getTop());
                        ga5Var.setRoundCorners((hl.L(8.0f) * f11) + (hl.L(13.0f) * f8));
                    } else {
                        q95 q95Var5 = ka5Var.c;
                        if (q95Var5 != null || ka5Var.e != null) {
                            q95 q95Var6 = ka5Var.e;
                            if (q95Var6 == null) {
                                d79Var = t85Var;
                            } else if (q95Var5 != null) {
                                arrayList = arrayList2;
                                if (!j95.v5 || ka5Var.y.b) {
                                    d79Var = t85Var;
                                } else {
                                    q95Var5 = q95Var6;
                                }
                                ka5Var.setTranslationX(((d79Var.getX() + q95Var5.getX()) - ka5Var.getLeft()) - g75Var.getLeft());
                                ka5Var.setTranslationY(((d79Var.getY() + (q95Var5.getY() + hl.L(2.0f))) - ka5Var.getTop()) - g75Var.getTop());
                                ga5Var.setRoundCorners(hl.L(8.0f));
                                if (ka5Var.w && !ka5Var.F) {
                                    if (j95.v5) {
                                        ka5Var.y0 = z;
                                        ka5Var.setAlpha(q95Var5.getAlpha() * (1.0f - f8));
                                    } else if (ka5Var.c != null && ka5Var.e == null) {
                                        ka5Var.setAlpha(q95Var5.getAlpha() * f8);
                                    }
                                }
                            } else {
                                q95Var5 = q95Var6;
                            }
                            arrayList = arrayList2;
                            ka5Var.setTranslationX(((d79Var.getX() + q95Var5.getX()) - ka5Var.getLeft()) - g75Var.getLeft());
                            ka5Var.setTranslationY(((d79Var.getY() + (q95Var5.getY() + hl.L(2.0f))) - ka5Var.getTop()) - g75Var.getTop());
                            ga5Var.setRoundCorners(hl.L(8.0f));
                            if (ka5Var.w) {
                                if (j95.v5) {
                                }
                            }
                        }
                    }
                }
                i5++;
                arrayList2 = arrayList;
                z = true;
            }
            arrayList = arrayList2;
            i5++;
            arrayList2 = arrayList;
            z = true;
        }
        boolean z4 = j95.v5;
        View view3 = j95Var.z4;
        if (z4) {
            f2 = 1.0f;
            view3.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f2 = 1.0f;
            view3.setAlpha(1.0f - g75Var.c);
            view.setAlpha(1.0f - g75Var.c);
        }
        if (g75Var.M0) {
            t85Var.setAlpha(f2 - g75Var.c);
        } else {
            t85Var.setAlpha(f2);
        }
        super.dispatchDraw(canvas);
        if (j95Var.v4) {
            return;
        }
        boolean z5 = j95Var.Y3;
        zb5 zb5Var4 = j95Var.M4;
        RectF rectF = this.h0;
        if (!z5) {
            if (zb5Var4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), j95Var.L4);
                float y4 = t85Var.getY();
                t85Var.getY();
                t85Var.getMeasuredHeight();
                if (!j95Var.Q4) {
                    if (j95Var.P4 == null) {
                        ka5 ka5Var2 = j95Var.O4;
                        if (ka5Var2 == null || !ka5Var2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(g75Var.getX() + j95Var.O4.getX(), g75Var.getY() + j95Var.O4.getY());
                        j95Var.O4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(g75Var.getX() + c75Var.getX() + j95Var.P4.getX(), g75Var.getY() + c75Var.getY() + j95Var.P4.getY());
                    if (j95Var.P4.getRenderer() == null || !j95Var.P4.getRenderer().w || j95Var.P4.getRenderer().b) {
                        j95Var.P4.draw(canvas);
                    } else {
                        j95Var.P4.getRenderer().draw(canvas);
                    }
                    j95Var.P4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = t85Var.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt3 = t85Var.getChildAt(i6);
                    if (childAt3 == j95Var.M4) {
                        float max = Math.max(t85Var.getLeft(), childAt3.getX() + t85Var.getLeft());
                        float max2 = Math.max(y4, childAt3.getY() + t85Var.getY());
                        float min = Math.min(t85Var.getRight(), childAt3.getX() + t85Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(t85Var.getY() + t85Var.getMeasuredHeight(), childAt3.getY() + t85Var.getY() + j95Var.M4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + t85Var.getLeft(), childAt3.getY() + t85Var.getY());
                            float alpha = j95Var.L4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((j95Var.M4.getClipHeight() - j95Var.M4.getMeasuredHeight()) * (1.0f - k43.g.getInterpolation(1.0f - alpha))) + j95Var.M4.getMeasuredHeight()));
                            zb5 zb5Var5 = j95Var.M4;
                            paint.getColor();
                            ema[] emaVarArr = zb5Var5.d;
                            if (TextUtils.isEmpty(emaVarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            emaVarArr[4].setFullAlpha(alpha);
                            emaVarArr[4].h(0, 0);
                            zb5Var5.invalidate();
                            canvas2.drawRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (zb5Var4 != null) {
            if (j95Var.Z3) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), j95Var.L4);
            }
            float y5 = t85Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = t85Var.getChildCount();
            float y6 = t85Var.getY() + t85Var.getMeasuredHeight();
            if (j95Var.Q4) {
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount2) {
                        zb5Var = null;
                        break;
                    }
                    View childAt4 = t85Var.getChildAt(i7);
                    zb5Var = j95Var.M4;
                    if (childAt4 == zb5Var) {
                        break;
                    } else {
                        i7++;
                    }
                }
            } else {
                zb5Var = j95Var.M4;
            }
            if (zb5Var != null && y5 < y6) {
                canvas3.save();
                if (j95Var.P4 == null) {
                    f3 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - j95Var.W3) * y5, getMeasuredWidth(), (getMeasuredHeight() * j95Var.W3) + ((1.0f - j95Var.W3) * y6));
                } else {
                    f3 = 255.0f;
                }
                if (j95Var.Q4) {
                    measuredWidth = ((k75Var.getMeasuredWidth() + k75Var.getTop()) * j95Var.W3) + ((1.0f - j95Var.W3) * (zb5Var.getY() + t85Var.getY()));
                    left = (k75Var.getLeft() * j95Var.W3) + ((1.0f - j95Var.W3) * (zb5Var.getX() + t85Var.getLeft()));
                } else {
                    measuredWidth = k75Var.getMeasuredWidth() + k75Var.getTop();
                    left = k75Var.getLeft();
                }
                float f12 = measuredWidth;
                canvas3.translate(left, f12);
                if (j95Var.Q4) {
                    fArr = fArr2;
                    path = path2;
                    zb5Var2 = zb5Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    zb5Var2 = zb5Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, zb5Var.getMeasuredWidth(), zb5Var.getClipHeight(), (int) (j95Var.W3 * f3), 31);
                }
                float clipHeight = (int) (((zb5Var2.getClipHeight() - zb5Var2.getMeasuredHeight()) * (1.0f - k43.g.getInterpolation(1.0f - j95Var.W3))) + zb5Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, zb5Var2.getMeasuredWidth(), clipHeight);
                zb5 zb5Var6 = zb5Var2;
                zb5Var6.setProgressToAvatarPreview(j95Var.Q4 ? j95Var.W3 : 1.0f);
                for (int i8 = 0; i8 < 4; i8++) {
                    fArr[i8] = (1.0f - j95Var.W3) * hl.L(13.0f);
                    fArr[i8 + 4] = hl.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                zb5Var6.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (j95Var.X3 != null) {
                    float f13 = f12 + clipHeight;
                    float measuredWidth2 = (getMeasuredWidth() - j95Var.X3.getMeasuredWidth()) - hl.L(14.0f);
                    if (j95Var.W3 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth2, f13, j95Var.X3.getMeasuredWidth() + measuredWidth2, j95Var.X3.getMeasuredHeight() + f13, (int) (j95Var.W3 * f3), 31);
                    } else {
                        canvas3.save();
                    }
                    j95Var.X3.setTranslationX(measuredWidth2 - r4.getLeft());
                    j95Var.X3.setTranslationY(f13 - r4.getTop());
                    float f14 = (j95Var.W3 * 0.2f) + 0.8f;
                    canvas3.scale(f14, f14, (j95Var.X3.getMeasuredWidth() / 2.0f) + measuredWidth2, f13);
                    canvas3.translate(measuredWidth2, f13);
                    j95Var.X3.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (j95Var.V3.n) {
                return;
            }
            canvas3.save();
            if (j95Var.Q4 && j95Var.P4 == null) {
                canvas3.clipRect(0.0f, (1.0f - j95Var.W3) * y5, getMeasuredWidth(), (getMeasuredHeight() * j95Var.W3) + ((1.0f - j95Var.W3) * y6));
            }
            canvas3.scale(k75Var.getScaleX(), k75Var.getScaleY(), k75Var.getX(), k75Var.getY());
            canvas3.translate(k75Var.getX(), k75Var.getY());
            k75Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        j95 j95Var = this.n0;
        t65 t65Var = j95Var.o1;
        c75 c75Var = j95Var.e4;
        t85 t85Var = j95Var.J1;
        g75 g75Var = j95Var.T3;
        if (j95Var.k4) {
            if (view == t85Var) {
                int childCount = t85Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = t85Var.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == g75Var || view == t65Var) {
                return super.drawChild(canvas, view, j);
            }
        } else if (j95.v5 || g75Var.c != 1.0f || (view != j95Var.H1 && view != j95Var.Z1 && view != j95Var.G1 && view != j95Var.X2 && view != j95Var.u3)) {
            if (j95Var.v4 && view == g75Var) {
                canvas.save();
                canvas.translate(c75Var.getX() + g75Var.getX(), c75Var.getY() + g75Var.getY());
                c75Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != j95Var.s4 && view != j95Var.X3 && view != j95Var.M4 && (!j95Var.d4 || !j95Var.Z3 || (view != t85Var && view != t65Var && view != j95Var.V1 && view != j95Var.k3))) {
                return super.drawChild(canvas, view, j);
            }
        }
        return true;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n0.S1.I();
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n0.S1.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int L = hl.L(74.0f);
        j95 j95Var = this.n0;
        ImageReceiver imageReceiver = j95Var.S1;
        Drawable drawable = j95Var.Y1;
        g75 g75Var = j95Var.T3;
        float f2 = j95Var.s2 - L;
        int L2 = hl.L(15.0f) + getMeasuredHeight();
        int i = j95Var.t0;
        int i2 = L2 + i;
        if (i + f2 < a.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - j95Var.t0) / ((L - j95Var.t0) - hl.L(14.0f)));
            int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - r2) * min);
            f2 -= currentActionBarHeight;
            i2 += currentActionBarHeight;
            f = 1.0f - min;
        } else {
            f = 1.0f;
        }
        float paddingTop = f2 + getPaddingTop();
        j95Var.P1();
        if (g75Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i2);
            drawable.draw(canvas);
            if (f != 1.0f) {
                aob.s0.setColor(j95Var.O3);
                float f3 = j95Var.u0;
                float f4 = j95Var.t0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - j95Var.u0;
                float L3 = j95Var.t0 + paddingTop + hl.L(24.0f);
                RectF rectF = this.h0;
                rectF.set(f3, f4, measuredWidth, L3);
                canvas.drawRoundRect(rectF, hl.L(12.0f) * f, hl.L(12.0f) * f, aob.s0);
            }
            aob.s0.setColor(Color.argb((int) (j95Var.H1.getAlpha() * 255.0f), (int) (Color.red(j95Var.O3) * 0.8f), (int) (Color.green(j95Var.O3) * 0.8f), (int) (Color.blue(j95Var.O3) * 0.8f)));
            canvas.drawRect(j95Var.u0, 0.0f, getMeasuredWidth() - j95Var.u0, (int) (j95Var.h0 * 1.0f), aob.s0);
            c85 c85Var = j95Var.t2;
            if (c85Var != null) {
                aob.s0.setColor(c85Var.getBackgroundColor());
                canvas.drawRect(j95Var.u0, 0.0f, getMeasuredWidth() - j95Var.u0, (int) (j95Var.h0 * 1.0f), aob.s0);
            }
        }
        if (g75Var.c != 0.0f) {
            aob.s0.setColor(vm2.o(aob.w0(null, aob.Xg, false), (int) (g75Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), aob.s0);
        }
        imageReceiver.i0((getMeasuredWidth() / 2.0f) - hl.L(30.0f), (getMeasuredHeight() / 2.0f) - hl.L(30.0f), hl.L(60.0f), hl.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j95 j95Var = this.n0;
        k75 k75Var = j95Var.s4;
        if (j95Var.M4 != null && motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float x2 = j95Var.X3.getX();
            float y2 = j95Var.X3.getY();
            float x3 = j95Var.X3.getX() + j95Var.X3.getMeasuredWidth();
            float y3 = j95Var.X3.getY() + j95Var.X3.getMeasuredHeight();
            RectF rectF = this.h0;
            rectF.set(x2, y2, x3, y3);
            boolean z = !rectF.contains(x, y);
            rectF.set(k75Var.getX(), k75Var.getY(), k75Var.getX() + k75Var.getMeasuredWidth(), k75Var.getY() + k75Var.getMeasuredWidth() + j95Var.M4.getMeasuredHeight());
            if (rectF.contains(x, y)) {
                z = false;
            }
            if (z) {
                j95Var.U0(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || j95Var.s2 == 0.0f || motionEvent.getY() >= j95Var.s2 - hl.L(37.0f) || j95Var.H1.getAlpha() != 0.0f || j95Var.Y3 || j95Var.t2 != null || j95Var.T3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        j95Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        j95 j95Var = this.n0;
        if (j95Var.M4 == null || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        j95Var.U0(true);
        return true;
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        float f;
        j95 j95Var = this.n0;
        View view = j95Var.A4;
        View view2 = j95Var.z4;
        t65 t65Var = j95Var.o1;
        g75 g75Var = j95Var.T3;
        t85 t85Var = j95Var.J1;
        if (j95.v5 && this.k0 != j95Var.y4 && this.l0) {
            f = t85Var.getX();
            z2 = true;
        } else {
            z2 = false;
            f = 0.0f;
        }
        this.k0 = j95Var.y4;
        g75Var.s = true;
        super.onLayout(z, i, i2, i3, i4);
        g75Var.s = false;
        j95Var.G1();
        this.l0 = true;
        if (!z2 || t85Var.getLeft() == f) {
            return;
        }
        float left = f - t85Var.getLeft();
        t85Var.setTranslationX(left);
        t65Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = t85Var.animate().translationX(0.0f).setDuration(350L);
        k43 k43Var = k43.f;
        duration.setInterpolator(k43Var).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(k43Var).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(k43Var).start();
        t65Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(k43Var).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f;
        int L;
        int i3;
        int e;
        j95 j95Var = this.n0;
        s75 s75Var = j95Var.z1;
        z65 z65Var = j95Var.G1;
        LinearLayout linearLayout = j95Var.u3;
        e85 e85Var = j95Var.H1;
        sb5 sb5Var = j95Var.g4;
        p95 p95Var = j95Var.h4;
        sd4 sd4Var = j95Var.R1;
        kmc kmcVar = j95Var.v1;
        ema emaVar = j95Var.N1;
        View view = j95Var.Z1;
        View view2 = j95Var.A4;
        View view3 = j95Var.z4;
        ArrayList arrayList = j95Var.R3;
        ema emaVar2 = j95Var.P1;
        q75 q75Var = j95Var.A1;
        ArrayList arrayList2 = j95Var.S3;
        d79 d79Var = j95Var.f4;
        g75 g75Var = j95Var.T3;
        t85 t85Var = j95Var.J1;
        c75 c75Var = j95Var.e4;
        int size = View.MeasureSpec.getSize(i2);
        this.g0 = true;
        boolean z2 = View.MeasureSpec.getSize(i) > size && !hl.O1();
        LaunchActivity launchActivity = j95Var.b2;
        if (launchActivity != null && hl.F1(launchActivity)) {
            z2 = j95.u5;
        }
        View.MeasureSpec.getSize(i);
        g75Var.getClass();
        boolean z3 = hl.O1() && View.MeasureSpec.getSize(i) > size && !j95Var.j1();
        if (j95.u5 != z2) {
            j95.u5 = z2;
            if (kmcVar.getMeasuredWidth() == 0) {
                int i4 = kmcVar.getLayoutParams().width;
            }
            j95Var.W = false;
            sd4Var.x1(j95.u5 ? 6 : 2);
            t85Var.c0();
            c75Var.c0();
            this.j0 = true;
            TextView textView = j95Var.L1;
            if (textView != null) {
                textView.setVisibility(!j95.u5 ? 0 : 8);
            }
        }
        if (j95.v5 != z3) {
            j95.v5 = z3;
            d79Var.setVisibility(z3 ? 0 : 8);
            t85Var.c0();
            c75Var.c0();
            z = true;
            this.j0 = true;
        } else {
            z = true;
        }
        if (this.j0) {
            j95Var.E0(z);
            j95Var.I1.f();
            p95Var.G(d79Var, false);
            if (j95.v5) {
                sb5Var.I(d79Var, false);
            }
            d79Var.setVisibility(j95.v5 ? 0 : 8);
            sb5Var.H(d79Var, j95.v5 && !g75Var.b, true);
            boolean z4 = j95.v5;
            j95Var.F4 = !z4 || g75Var.b;
            boolean z5 = !z4 && g75Var.b;
            p95Var.F(c75Var, z5);
            c75Var.setVisibility(z5 ? 0 : 8);
            t85Var.setVisibility((j95.v5 || !g75Var.b) ? 0 : 8);
            sd4Var.x1(j95.u5 ? 6 : 2);
            j95Var.M1(false, false);
            t85Var.c0();
            c75Var.c0();
            hl.V3(t85Var);
            this.j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            g75Var.setIsTablet(j95.v5);
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                ((ka5) arrayList2.get(i5)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (j95Var.j1() ? hl.L(72.0f) : hl.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g75Var.getLayoutParams();
        if (j95.v5) {
            layoutParams.topMargin = a.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j95Var.c2[i6].getLayoutParams();
            if (j95.v5) {
                layoutParams2.rightMargin = hl.L(328.0f);
            } else {
                layoutParams2.rightMargin = hl.L(8.0f);
            }
        }
        if (d79Var != null) {
            ((FrameLayout.LayoutParams) d79Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        }
        if (q75Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) q75Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = hl.L(j95Var.j1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) t85Var.getLayoutParams();
        if (j95.v5) {
            layoutParams3.gravity = j95Var.y4 ? 5 : 1;
            layoutParams3.width = hl.L(320.0f);
            int L3 = hl.L(4.0f);
            layoutParams3.leftMargin = L3;
            layoutParams3.rightMargin = L3;
            layoutParams3.bottomMargin = L2;
            layoutParams3.topMargin = a.getCurrentActionBarHeight();
            L = hl.L(60.0f);
            f = 90.0f;
        } else {
            f = 90.0f;
            if (j95.u5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = a.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = hl.L(14.0f);
                layoutParams3.rightMargin = hl.L(90.0f);
                layoutParams3.leftMargin = hl.L(14.0f);
                L = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L = hl.L(60.0f);
                layoutParams3.bottomMargin = L2;
                layoutParams3.topMargin = hl.L(14.0f) + a.getCurrentActionBarHeight();
                int L4 = hl.L(14.0f);
                layoutParams3.leftMargin = L4;
                layoutParams3.rightMargin = L4;
            }
        }
        if (!j95.u5 || j95.v5) {
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (j95.v5) {
                layoutParams4.gravity = j95Var.y4 ? 85 : 81;
                layoutParams4.width = hl.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (j95.v5) {
                layoutParams5.gravity = j95Var.y4 ? 85 : 81;
                layoutParams5.width = hl.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
        }
        if (j95.u5) {
            c75Var.setPadding(0, hl.L(9.0f), 0, hl.L(9.0f));
        } else {
            c75Var.setPadding(hl.L(9.0f), 0, hl.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) j95Var.o1.getLayoutParams();
        if (j95.v5) {
            layoutParams6.width = hl.L(320.0f);
            layoutParams6.height = hl.L(120.0f);
            layoutParams6.gravity = j95Var.y4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (j95.u5) {
            layoutParams6.width = hl.L(f);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = hl.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!j95.u5 || j95.v5) {
            ((FrameLayout.LayoutParams) e85Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) z65Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) e85Var.getLayoutParams()).rightMargin = hl.L(f);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = hl.L(f);
            ((FrameLayout.LayoutParams) z65Var.getLayoutParams()).rightMargin = hl.L(f);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = hl.L(f);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) c75Var.getLayoutParams();
        if (j95.u5) {
            if (!((x46) c75Var.getLayoutManager()).o) {
                ((x46) c75Var.getLayoutManager()).i1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = hl.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = hl.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((x46) c75Var.getLayoutManager()).o) {
                ((x46) c75Var.getLayoutManager()).i1(0);
            }
            layoutParams7.height = hl.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = hl.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        s75Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) s75Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (q75Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) q75Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(hl.L(259.0f), (paddingTop / 5) * 3);
        if (j95.v5) {
            e = 0;
            i3 = 0;
        } else {
            i3 = 0;
            e = qu6.e(8.0f, paddingTop - max, 0);
        }
        if (t85Var.getPaddingTop() != e || t85Var.getPaddingBottom() != L) {
            t85Var.setPadding(i3, e, i3, L);
        }
        if (emaVar2 != null) {
            int L5 = ((hl.L(60.0f) + (paddingTop - e)) / 2) + e;
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) emaVar.getLayoutParams();
            layoutParams9.topMargin = L5 - hl.L(30.0f);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) emaVar2.getLayoutParams();
            layoutParams10.topMargin = hl.L(80.0f) + L5;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j95Var.O1.getLayoutParams();
            if (layoutParams9.topMargin >= a.getCurrentActionBarHeight()) {
                if (hl.L(20.0f) + layoutParams10.topMargin <= size - hl.L(231.0f)) {
                    emaVar.setVisibility(0);
                    emaVar2.setVisibility(0);
                    layoutParams11.topMargin = L5;
                }
            }
            emaVar.setVisibility(4);
            emaVar2.setVisibility(4);
            layoutParams11.topMargin = L5 - hl.L(20.0f);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((ka5) arrayList.get(i7)).g(g75Var.b, true);
        }
        this.g0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.i0) {
            this.i0 = measuredHeight;
            j95Var.U0(false);
        }
        j95Var.j4.f = getMeasuredWidth();
        j95Var.P0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.n0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.n0.P1();
    }
}
