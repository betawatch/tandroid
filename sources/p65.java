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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p65 extends cja {
    public boolean m0;
    public final RectF n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public final HashMap s0;
    public final /* synthetic */ h75 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p65(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.t0 = h75Var;
        this.m0 = false;
        this.n0 = new RectF();
        this.s0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f1  */
    @Override // cja, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z;
        float f2;
        Canvas canvas2;
        Canvas canvas3;
        y95 y95Var;
        float f3;
        float measuredWidth;
        float left;
        float[] fArr;
        Path path;
        y95 y95Var2;
        ArrayList arrayList;
        HashMap hashMap;
        float x;
        float y;
        float x2;
        float y2;
        boolean z2;
        Shader.TileMode tileMode;
        h75 h75Var = this.t0;
        View view = h75Var.A4;
        ArrayList arrayList2 = h75Var.R3;
        b85 b85Var = h75Var.V1;
        Paint paint = h75Var.w2;
        a55 a55Var = h75Var.e4;
        i55 i55Var = h75Var.s4;
        e55 e55Var = h75Var.T3;
        r65 r65Var = h75Var.J1;
        boolean z3 = true;
        if (h75Var.k4 || h75Var.v4 || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || gl.m0) {
            f = 1.0f;
        } else {
            if (h75Var.G4 == null) {
                h75Var.G4 = new RenderNode("CallActivity.Blur");
                h75Var.H4 = cja.getRenderNodeScale();
                ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                float blurRadius = cja.getBlurRadius();
                RenderNode renderNode = h75Var.G4;
                f = 1.0f;
                tileMode = Shader.TileMode.DECAL;
                renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                b85Var.setBlurRoot(this);
                RenderNode renderNode2 = h75Var.G4;
                float f4 = h75Var.H4;
                b85Var.V0 = renderNode2;
                b85Var.W0 = f4;
                t66 t66Var = h75Var.k3;
                t66Var.d = this;
                t66Var.b = renderNode2;
                t66Var.c = f4;
            } else {
                f = 1.0f;
            }
            int round = Math.round(getMeasuredWidth() / h75Var.H4);
            int round2 = Math.round(getMeasuredHeight() / h75Var.H4);
            h75Var.k4 = true;
            h75Var.G4.setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = h75Var.G4.beginRecording();
            float f5 = f / h75Var.H4;
            beginRecording.scale(f5, f5);
            dispatchDraw(beginRecording);
            h75Var.G4.endRecording();
            h75Var.k4 = false;
        }
        for (int i = 0; i < r65Var.getChildCount(); i++) {
            View childAt = r65Var.getChildAt(i);
            if (childAt instanceof y95) {
                ((y95) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof o75)) {
                if (childAt.getMeasuredWidth() != r65Var.getMeasuredWidth()) {
                    childAt.setTranslationX((r65Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (e55Var.r == null) {
            z = true;
            for (int i2 = 0; i2 < a55Var.getChildCount(); i2++) {
                ((m75) a55Var.getChildAt(i2)).setProgressToFullscreen(1.0f);
            }
        } else if (a55Var.getVisibility() == 0) {
            HashMap hashMap2 = this.s0;
            hashMap2.clear();
            int i3 = 0;
            while (i3 < r65Var.getChildCount()) {
                View childAt2 = r65Var.getChildAt(i3);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof o75) {
                        r65Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            o75 o75Var = (o75) childAt2;
                            z2 = z3;
                            if (o75Var.getRenderer() != e55Var.E) {
                                hashMap2.put(o75Var.getParticipant(), childAt2);
                            }
                        }
                    }
                    z2 = z3;
                    if (childAt2 instanceof y95) {
                        r65Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            y95 y95Var3 = (y95) childAt2;
                            hashMap2.put(y95Var3.getParticipant(), y95Var3);
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
            while (i4 < a55Var.getChildCount()) {
                m75 m75Var = (m75) a55Var.getChildAt(i4);
                View view2 = (View) hashMap2.get(m75Var.getVideoParticipant());
                if (view2 == null) {
                    view2 = (View) hashMap2.get(m75Var.getParticipant());
                }
                float f6 = e55Var.c;
                if (!h75Var.D4.k()) {
                    m75Var.setAlpha(f);
                }
                if (view2 != null) {
                    if (view2 instanceof o75) {
                        o75 o75Var2 = (o75) view2;
                        x = (r65Var.getX() + o75Var2.getLeft()) - e55Var.getLeft();
                        y = (r65Var.getY() + o75Var2.getTop()) - e55Var.getTop();
                        x2 = a55Var.getX() + m75Var.getLeft();
                        y2 = a55Var.getY() + m75Var.getTop();
                        hashMap = hashMap2;
                    } else {
                        x = ((r65Var.getX() + r6.getLeft()) - e55Var.getLeft()) + r6.getAvatarImageView().getLeft() + (r6.getAvatarImageView().getMeasuredWidth() >> 1);
                        y = ((r65Var.getY() + r6.getTop()) - e55Var.getTop()) + r6.getAvatarImageView().getTop() + (r6.getAvatarImageView().getMeasuredHeight() >> 1);
                        x2 = a55Var.getX() + m75Var.getLeft() + (m75Var.getMeasuredWidth() >> 1);
                        hashMap = hashMap2;
                        y2 = a55Var.getY() + m75Var.getTop() + (m75Var.getMeasuredHeight() >> 1);
                        ((y95) view2).setDrawAvatar(false);
                    }
                    float f7 = 1.0f - f6;
                    m75Var.setTranslationX((x - x2) * f7);
                    m75Var.setTranslationY((y - y2) * f7);
                    m75Var.setScaleX(1.0f);
                    m75Var.setScaleY(1.0f);
                    m75Var.setProgressToFullscreen(f6);
                } else {
                    hashMap = hashMap2;
                    m75Var.setScaleX(1.0f);
                    m75Var.setScaleY(1.0f);
                    m75Var.setTranslationX(0.0f);
                    m75Var.setTranslationY(0.0f);
                    m75Var.setProgressToFullscreen(1.0f);
                    if (m75Var.getRenderer() == null) {
                        m75Var.setAlpha(f6);
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
            h85 h85Var = (h85) arrayList2.get(i5);
            o39 o39Var = h75Var.f4;
            d85 d85Var = h85Var.a;
            if (!h85Var.h && !h85Var.f && !h85Var.P) {
                h85Var.y0 = false;
                float f8 = e55Var.c;
                if (h85Var.r || h85Var.b) {
                    arrayList = arrayList2;
                    o75 o75Var3 = h85Var.c;
                    if (o75Var3 == null && h85Var.e == null) {
                        h85Var.setTranslationX(0.0f);
                        h85Var.setTranslationY(0.0f);
                    } else {
                        o75 o75Var4 = h85Var.e;
                        if (o75Var4 != null) {
                            o75Var3 = o75Var4;
                        } else {
                            o39Var = r65Var;
                        }
                        float x3 = ((o39Var.getX() + o75Var3.getX()) - h85Var.getLeft()) - e55Var.getLeft();
                        float y3 = ((o39Var.getY() + (o75Var3.getY() + gl.L(2.0f))) - h85Var.getTop()) - e55Var.getTop();
                        float f9 = 1.0f - f8;
                        float f10 = f8 * 0.0f;
                        h85Var.setTranslationX((x3 * f9) + f10);
                        h85Var.setTranslationY((y3 * f9) + f10);
                    }
                    d85Var.setRoundCorners(gl.L(8.0f));
                    m75 m75Var2 = h85Var.d;
                    if (m75Var2 != null) {
                        m75Var2.setAlpha(f8);
                    }
                    if (!h85Var.b && h85Var.c == null && h85Var.e == null) {
                        h85Var.setAlpha(f8);
                    } else if (!h85Var.F) {
                        h85Var.setAlpha(1.0f);
                    }
                } else {
                    m75 m75Var3 = h85Var.d;
                    if (m75Var3 != null) {
                        a55Var.getClass();
                        if (RecyclerView.R(m75Var3) == -1 ? z : false) {
                            h85Var.setAlpha(h85Var.d.getAlpha());
                        } else if (h85Var.c == null) {
                            if (h85Var.w && !h85Var.F) {
                                h85Var.setAlpha(f8);
                            }
                            h85Var.d.setAlpha(f8);
                            f8 = 1.0f;
                        } else {
                            h85Var.d.setAlpha(1.0f);
                            if (h85Var.w && !h85Var.F) {
                                h85Var.setAlpha(1.0f);
                            }
                        }
                        h85Var.setTranslationX((a55Var.getX() + h85Var.d.getX()) - h85Var.getLeft());
                        float f11 = 1.0f - f8;
                        h85Var.setTranslationY((a55Var.getY() + (h85Var.d.getY() + (gl.L(2.0f) * f11))) - h85Var.getTop());
                        d85Var.setRoundCorners((gl.L(8.0f) * f11) + (gl.L(13.0f) * f8));
                    } else {
                        o75 o75Var5 = h85Var.c;
                        if (o75Var5 != null || h85Var.e != null) {
                            o75 o75Var6 = h85Var.e;
                            if (o75Var6 == null) {
                                o39Var = r65Var;
                            } else if (o75Var5 != null) {
                                arrayList = arrayList2;
                                if (!h75.v5 || h85Var.y.b) {
                                    o39Var = r65Var;
                                } else {
                                    o75Var5 = o75Var6;
                                }
                                h85Var.setTranslationX(((o39Var.getX() + o75Var5.getX()) - h85Var.getLeft()) - e55Var.getLeft());
                                h85Var.setTranslationY(((o39Var.getY() + (o75Var5.getY() + gl.L(2.0f))) - h85Var.getTop()) - e55Var.getTop());
                                d85Var.setRoundCorners(gl.L(8.0f));
                                if (h85Var.w && !h85Var.F) {
                                    if (h75.v5) {
                                        h85Var.y0 = z;
                                        h85Var.setAlpha(o75Var5.getAlpha() * (1.0f - f8));
                                    } else if (h85Var.c != null && h85Var.e == null) {
                                        h85Var.setAlpha(o75Var5.getAlpha() * f8);
                                    }
                                }
                            } else {
                                o75Var5 = o75Var6;
                            }
                            arrayList = arrayList2;
                            h85Var.setTranslationX(((o39Var.getX() + o75Var5.getX()) - h85Var.getLeft()) - e55Var.getLeft());
                            h85Var.setTranslationY(((o39Var.getY() + (o75Var5.getY() + gl.L(2.0f))) - h85Var.getTop()) - e55Var.getTop());
                            d85Var.setRoundCorners(gl.L(8.0f));
                            if (h85Var.w) {
                                if (h75.v5) {
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
        boolean z4 = h75.v5;
        View view3 = h75Var.z4;
        if (z4) {
            f2 = 1.0f;
            view3.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f2 = 1.0f;
            view3.setAlpha(1.0f - e55Var.c);
            view.setAlpha(1.0f - e55Var.c);
        }
        if (e55Var.M0) {
            r65Var.setAlpha(f2 - e55Var.c);
        } else {
            r65Var.setAlpha(f2);
        }
        super.dispatchDraw(canvas);
        if (h75Var.v4) {
            return;
        }
        boolean z5 = h75Var.Y3;
        y95 y95Var4 = h75Var.M4;
        RectF rectF = this.n0;
        if (!z5) {
            if (y95Var4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), h75Var.L4);
                float y4 = r65Var.getY();
                r65Var.getY();
                r65Var.getMeasuredHeight();
                if (!h75Var.Q4) {
                    if (h75Var.P4 == null) {
                        h85 h85Var2 = h75Var.O4;
                        if (h85Var2 == null || !h85Var2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(e55Var.getX() + h75Var.O4.getX(), e55Var.getY() + h75Var.O4.getY());
                        h75Var.O4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(e55Var.getX() + a55Var.getX() + h75Var.P4.getX(), e55Var.getY() + a55Var.getY() + h75Var.P4.getY());
                    if (h75Var.P4.getRenderer() == null || !h75Var.P4.getRenderer().w || h75Var.P4.getRenderer().b) {
                        h75Var.P4.draw(canvas);
                    } else {
                        h75Var.P4.getRenderer().draw(canvas);
                    }
                    h75Var.P4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = r65Var.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt3 = r65Var.getChildAt(i6);
                    if (childAt3 == h75Var.M4) {
                        float max = Math.max(r65Var.getLeft(), childAt3.getX() + r65Var.getLeft());
                        float max2 = Math.max(y4, childAt3.getY() + r65Var.getY());
                        float min = Math.min(r65Var.getRight(), childAt3.getX() + r65Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(r65Var.getY() + r65Var.getMeasuredHeight(), childAt3.getY() + r65Var.getY() + h75Var.M4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + r65Var.getLeft(), childAt3.getY() + r65Var.getY());
                            float alpha = h75Var.L4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((h75Var.M4.getClipHeight() - h75Var.M4.getMeasuredHeight()) * (1.0f - s33.g.getInterpolation(1.0f - alpha))) + h75Var.M4.getMeasuredHeight()));
                            y95 y95Var5 = h75Var.M4;
                            paint.getColor();
                            jia[] jiaVarArr = y95Var5.d;
                            if (TextUtils.isEmpty(jiaVarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            jiaVarArr[4].setFullAlpha(alpha);
                            jiaVarArr[4].h(0, 0);
                            y95Var5.invalidate();
                            canvas2.drawRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (y95Var4 != null) {
            if (h75Var.Z3) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), h75Var.L4);
            }
            float y5 = r65Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = r65Var.getChildCount();
            float y6 = r65Var.getY() + r65Var.getMeasuredHeight();
            if (h75Var.Q4) {
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount2) {
                        y95Var = null;
                        break;
                    }
                    View childAt4 = r65Var.getChildAt(i7);
                    y95Var = h75Var.M4;
                    if (childAt4 == y95Var) {
                        break;
                    } else {
                        i7++;
                    }
                }
            } else {
                y95Var = h75Var.M4;
            }
            if (y95Var != null && y5 < y6) {
                canvas3.save();
                if (h75Var.P4 == null) {
                    f3 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - h75Var.W3) * y5, getMeasuredWidth(), (getMeasuredHeight() * h75Var.W3) + ((1.0f - h75Var.W3) * y6));
                } else {
                    f3 = 255.0f;
                }
                if (h75Var.Q4) {
                    measuredWidth = ((i55Var.getMeasuredWidth() + i55Var.getTop()) * h75Var.W3) + ((1.0f - h75Var.W3) * (y95Var.getY() + r65Var.getY()));
                    left = (i55Var.getLeft() * h75Var.W3) + ((1.0f - h75Var.W3) * (y95Var.getX() + r65Var.getLeft()));
                } else {
                    measuredWidth = i55Var.getMeasuredWidth() + i55Var.getTop();
                    left = i55Var.getLeft();
                }
                float f12 = measuredWidth;
                canvas3.translate(left, f12);
                if (h75Var.Q4) {
                    fArr = fArr2;
                    path = path2;
                    y95Var2 = y95Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    y95Var2 = y95Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, y95Var.getMeasuredWidth(), y95Var.getClipHeight(), (int) (h75Var.W3 * f3), 31);
                }
                float clipHeight = (int) (((y95Var2.getClipHeight() - y95Var2.getMeasuredHeight()) * (1.0f - s33.g.getInterpolation(1.0f - h75Var.W3))) + y95Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, y95Var2.getMeasuredWidth(), clipHeight);
                y95 y95Var6 = y95Var2;
                y95Var6.setProgressToAvatarPreview(h75Var.Q4 ? h75Var.W3 : 1.0f);
                for (int i8 = 0; i8 < 4; i8++) {
                    fArr[i8] = (1.0f - h75Var.W3) * gl.L(13.0f);
                    fArr[i8 + 4] = gl.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                y95Var6.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (h75Var.X3 != null) {
                    float f13 = f12 + clipHeight;
                    float measuredWidth2 = (getMeasuredWidth() - h75Var.X3.getMeasuredWidth()) - gl.L(14.0f);
                    if (h75Var.W3 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth2, f13, h75Var.X3.getMeasuredWidth() + measuredWidth2, h75Var.X3.getMeasuredHeight() + f13, (int) (h75Var.W3 * f3), 31);
                    } else {
                        canvas3.save();
                    }
                    h75Var.X3.setTranslationX(measuredWidth2 - r4.getLeft());
                    h75Var.X3.setTranslationY(f13 - r4.getTop());
                    float f14 = (h75Var.W3 * 0.2f) + 0.8f;
                    canvas3.scale(f14, f14, (h75Var.X3.getMeasuredWidth() / 2.0f) + measuredWidth2, f13);
                    canvas3.translate(measuredWidth2, f13);
                    h75Var.X3.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (h75Var.V3.n) {
                return;
            }
            canvas3.save();
            if (h75Var.Q4 && h75Var.P4 == null) {
                canvas3.clipRect(0.0f, (1.0f - h75Var.W3) * y5, getMeasuredWidth(), (getMeasuredHeight() * h75Var.W3) + ((1.0f - h75Var.W3) * y6));
            }
            canvas3.scale(i55Var.getScaleX(), i55Var.getScaleY(), i55Var.getX(), i55Var.getY());
            canvas3.translate(i55Var.getX(), i55Var.getY());
            i55Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        h75 h75Var = this.t0;
        r45 r45Var = h75Var.o1;
        a55 a55Var = h75Var.e4;
        r65 r65Var = h75Var.J1;
        e55 e55Var = h75Var.T3;
        if (h75Var.k4) {
            if (view == r65Var) {
                int childCount = r65Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = r65Var.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == e55Var || view == r45Var) {
                return super.drawChild(canvas, view, j);
            }
        } else if (h75.v5 || e55Var.c != 1.0f || (view != h75Var.H1 && view != h75Var.Z1 && view != h75Var.G1 && view != h75Var.X2 && view != h75Var.u3)) {
            if (h75Var.v4 && view == e55Var) {
                canvas.save();
                canvas.translate(a55Var.getX() + e55Var.getX(), a55Var.getY() + e55Var.getY());
                a55Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != h75Var.s4 && view != h75Var.X3 && view != h75Var.M4 && (!h75Var.d4 || !h75Var.Z3 || (view != r65Var && view != r45Var && view != h75Var.V1 && view != h75Var.k3))) {
                return super.drawChild(canvas, view, j);
            }
        }
        return true;
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t0.S1.I();
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t0.S1.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int L = gl.L(74.0f);
        h75 h75Var = this.t0;
        ImageReceiver imageReceiver = h75Var.S1;
        Drawable drawable = h75Var.Y1;
        e55 e55Var = h75Var.T3;
        float f2 = h75Var.s2 - L;
        int L2 = gl.L(15.0f) + getMeasuredHeight();
        int i = h75Var.t0;
        int i2 = L2 + i;
        if (i + f2 < a.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - h75Var.t0) / ((L - h75Var.t0) - gl.L(14.0f)));
            int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - r2) * min);
            f2 -= currentActionBarHeight;
            i2 += currentActionBarHeight;
            f = 1.0f - min;
        } else {
            f = 1.0f;
        }
        float paddingTop = f2 + getPaddingTop();
        h75Var.O1();
        if (e55Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i2);
            drawable.draw(canvas);
            if (f != 1.0f) {
                bkb.s0.setColor(h75Var.O3);
                float f3 = h75Var.u0;
                float f4 = h75Var.t0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - h75Var.u0;
                float L3 = h75Var.t0 + paddingTop + gl.L(24.0f);
                RectF rectF = this.n0;
                rectF.set(f3, f4, measuredWidth, L3);
                canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
            }
            bkb.s0.setColor(Color.argb((int) (h75Var.H1.getAlpha() * 255.0f), (int) (Color.red(h75Var.O3) * 0.8f), (int) (Color.green(h75Var.O3) * 0.8f), (int) (Color.blue(h75Var.O3) * 0.8f)));
            canvas.drawRect(h75Var.u0, 0.0f, getMeasuredWidth() - h75Var.u0, (int) (h75Var.h0 * 1.0f), bkb.s0);
            a65 a65Var = h75Var.t2;
            if (a65Var != null) {
                bkb.s0.setColor(a65Var.getBackgroundColor());
                canvas.drawRect(h75Var.u0, 0.0f, getMeasuredWidth() - h75Var.u0, (int) (h75Var.h0 * 1.0f), bkb.s0);
            }
        }
        if (e55Var.c != 0.0f) {
            bkb.s0.setColor(bm2.o(bkb.w0(null, bkb.Wg, false), (int) (e55Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), bkb.s0);
        }
        imageReceiver.i0((getMeasuredWidth() / 2.0f) - gl.L(30.0f), (getMeasuredHeight() / 2.0f) - gl.L(30.0f), gl.L(60.0f), gl.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h75 h75Var = this.t0;
        i55 i55Var = h75Var.s4;
        if (h75Var.M4 != null && motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float x2 = h75Var.X3.getX();
            float y2 = h75Var.X3.getY();
            float x3 = h75Var.X3.getX() + h75Var.X3.getMeasuredWidth();
            float y3 = h75Var.X3.getY() + h75Var.X3.getMeasuredHeight();
            RectF rectF = this.n0;
            rectF.set(x2, y2, x3, y3);
            boolean z = !rectF.contains(x, y);
            rectF.set(i55Var.getX(), i55Var.getY(), i55Var.getX() + i55Var.getMeasuredWidth(), i55Var.getY() + i55Var.getMeasuredWidth() + h75Var.M4.getMeasuredHeight());
            if (rectF.contains(x, y)) {
                z = false;
            }
            if (z) {
                h75Var.T0(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || h75Var.s2 == 0.0f || motionEvent.getY() >= h75Var.s2 - gl.L(37.0f) || h75Var.H1.getAlpha() != 0.0f || h75Var.Y3 || h75Var.t2 != null || h75Var.T3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        h75Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        h75 h75Var = this.t0;
        if (h75Var.M4 == null || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        h75Var.T0(true);
        return true;
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        float f;
        h75 h75Var = this.t0;
        View view = h75Var.A4;
        View view2 = h75Var.z4;
        r45 r45Var = h75Var.o1;
        e55 e55Var = h75Var.T3;
        r65 r65Var = h75Var.J1;
        if (h75.v5 && this.q0 != h75Var.y4 && this.r0) {
            f = r65Var.getX();
            z2 = true;
        } else {
            z2 = false;
            f = 0.0f;
        }
        this.q0 = h75Var.y4;
        e55Var.s = true;
        super.onLayout(z, i, i2, i3, i4);
        e55Var.s = false;
        h75Var.F1();
        this.r0 = true;
        if (!z2 || r65Var.getLeft() == f) {
            return;
        }
        float left = f - r65Var.getLeft();
        r65Var.setTranslationX(left);
        r45Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = r65Var.animate().translationX(0.0f).setDuration(350L);
        s33 s33Var = s33.f;
        duration.setInterpolator(s33Var).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(s33Var).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(s33Var).start();
        r45Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(s33Var).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f;
        int L;
        int i3;
        int e;
        h75 h75Var = this.t0;
        q55 q55Var = h75Var.z1;
        x45 x45Var = h75Var.G1;
        LinearLayout linearLayout = h75Var.u3;
        c65 c65Var = h75Var.H1;
        r95 r95Var = h75Var.g4;
        n75 n75Var = h75Var.h4;
        vb4 vb4Var = h75Var.R1;
        dic dicVar = h75Var.v1;
        jia jiaVar = h75Var.N1;
        View view = h75Var.Z1;
        View view2 = h75Var.A4;
        View view3 = h75Var.z4;
        ArrayList arrayList = h75Var.R3;
        jia jiaVar2 = h75Var.P1;
        o55 o55Var = h75Var.A1;
        ArrayList arrayList2 = h75Var.S3;
        o39 o39Var = h75Var.f4;
        e55 e55Var = h75Var.T3;
        r65 r65Var = h75Var.J1;
        a55 a55Var = h75Var.e4;
        int size = View.MeasureSpec.getSize(i2);
        this.m0 = true;
        boolean z2 = View.MeasureSpec.getSize(i) > size && !gl.O1();
        LaunchActivity launchActivity = h75Var.b2;
        if (launchActivity != null && gl.F1(launchActivity)) {
            z2 = h75.u5;
        }
        View.MeasureSpec.getSize(i);
        e55Var.getClass();
        boolean z3 = gl.O1() && View.MeasureSpec.getSize(i) > size && !h75Var.i1();
        if (h75.u5 != z2) {
            h75.u5 = z2;
            if (dicVar.getMeasuredWidth() == 0) {
                int i4 = dicVar.getLayoutParams().width;
            }
            h75Var.W = false;
            vb4Var.x1(h75.u5 ? 6 : 2);
            r65Var.b0();
            a55Var.b0();
            this.p0 = true;
            TextView textView = h75Var.L1;
            if (textView != null) {
                textView.setVisibility(!h75.u5 ? 0 : 8);
            }
        }
        if (h75.v5 != z3) {
            h75.v5 = z3;
            o39Var.setVisibility(z3 ? 0 : 8);
            r65Var.b0();
            a55Var.b0();
            z = true;
            this.p0 = true;
        } else {
            z = true;
        }
        if (this.p0) {
            h75Var.D0(z);
            h75Var.I1.f();
            n75Var.G(o39Var, false);
            if (h75.v5) {
                r95Var.I(o39Var, false);
            }
            o39Var.setVisibility(h75.v5 ? 0 : 8);
            r95Var.H(o39Var, h75.v5 && !e55Var.b, true);
            boolean z4 = h75.v5;
            h75Var.F4 = !z4 || e55Var.b;
            boolean z5 = !z4 && e55Var.b;
            n75Var.F(a55Var, z5);
            a55Var.setVisibility(z5 ? 0 : 8);
            r65Var.setVisibility((h75.v5 || !e55Var.b) ? 0 : 8);
            vb4Var.x1(h75.u5 ? 6 : 2);
            h75Var.L1(false, false);
            r65Var.b0();
            a55Var.b0();
            gl.V3(r65Var);
            this.p0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            e55Var.setIsTablet(h75.v5);
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                ((h85) arrayList2.get(i5)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (h75Var.i1() ? gl.L(72.0f) : gl.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e55Var.getLayoutParams();
        if (h75.v5) {
            layoutParams.topMargin = a.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h75Var.c2[i6].getLayoutParams();
            if (h75.v5) {
                layoutParams2.rightMargin = gl.L(328.0f);
            } else {
                layoutParams2.rightMargin = gl.L(8.0f);
            }
        }
        if (o39Var != null) {
            ((FrameLayout.LayoutParams) o39Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        }
        if (o55Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) o55Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = gl.L(h75Var.i1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r65Var.getLayoutParams();
        if (h75.v5) {
            layoutParams3.gravity = h75Var.y4 ? 5 : 1;
            layoutParams3.width = gl.L(320.0f);
            int L3 = gl.L(4.0f);
            layoutParams3.leftMargin = L3;
            layoutParams3.rightMargin = L3;
            layoutParams3.bottomMargin = L2;
            layoutParams3.topMargin = a.getCurrentActionBarHeight();
            L = gl.L(60.0f);
            f = 90.0f;
        } else {
            f = 90.0f;
            if (h75.u5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = a.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = gl.L(14.0f);
                layoutParams3.rightMargin = gl.L(90.0f);
                layoutParams3.leftMargin = gl.L(14.0f);
                L = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L = gl.L(60.0f);
                layoutParams3.bottomMargin = L2;
                layoutParams3.topMargin = gl.L(14.0f) + a.getCurrentActionBarHeight();
                int L4 = gl.L(14.0f);
                layoutParams3.leftMargin = L4;
                layoutParams3.rightMargin = L4;
            }
        }
        if (!h75.u5 || h75.v5) {
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (h75.v5) {
                layoutParams4.gravity = h75Var.y4 ? 85 : 81;
                layoutParams4.width = gl.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (h75.v5) {
                layoutParams5.gravity = h75Var.y4 ? 85 : 81;
                layoutParams5.width = gl.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
        }
        if (h75.u5) {
            a55Var.setPadding(0, gl.L(9.0f), 0, gl.L(9.0f));
        } else {
            a55Var.setPadding(gl.L(9.0f), 0, gl.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) h75Var.o1.getLayoutParams();
        if (h75.v5) {
            layoutParams6.width = gl.L(320.0f);
            layoutParams6.height = gl.L(120.0f);
            layoutParams6.gravity = h75Var.y4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (h75.u5) {
            layoutParams6.width = gl.L(f);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = gl.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!h75.u5 || h75.v5) {
            ((FrameLayout.LayoutParams) c65Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) x45Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) c65Var.getLayoutParams()).rightMargin = gl.L(f);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = gl.L(f);
            ((FrameLayout.LayoutParams) x45Var.getLayoutParams()).rightMargin = gl.L(f);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = gl.L(f);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) a55Var.getLayoutParams();
        if (h75.u5) {
            if (!((t26) a55Var.getLayoutManager()).o) {
                ((t26) a55Var.getLayoutManager()).i1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = gl.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = gl.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((t26) a55Var.getLayoutManager()).o) {
                ((t26) a55Var.getLayoutManager()).i1(0);
            }
            layoutParams7.height = gl.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = gl.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        q55Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) q55Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (o55Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) o55Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(gl.L(259.0f), (paddingTop / 5) * 3);
        if (h75.v5) {
            e = 0;
            i3 = 0;
        } else {
            i3 = 0;
            e = ls6.e(8.0f, paddingTop - max, 0);
        }
        if (r65Var.getPaddingTop() != e || r65Var.getPaddingBottom() != L) {
            r65Var.setPadding(i3, e, i3, L);
        }
        if (jiaVar2 != null) {
            int L5 = ((gl.L(60.0f) + (paddingTop - e)) / 2) + e;
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) jiaVar.getLayoutParams();
            layoutParams9.topMargin = L5 - gl.L(30.0f);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) jiaVar2.getLayoutParams();
            layoutParams10.topMargin = gl.L(80.0f) + L5;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h75Var.O1.getLayoutParams();
            if (layoutParams9.topMargin >= a.getCurrentActionBarHeight()) {
                if (gl.L(20.0f) + layoutParams10.topMargin <= size - gl.L(231.0f)) {
                    jiaVar.setVisibility(0);
                    jiaVar2.setVisibility(0);
                    layoutParams11.topMargin = L5;
                }
            }
            jiaVar.setVisibility(4);
            jiaVar2.setVisibility(4);
            layoutParams11.topMargin = L5 - gl.L(20.0f);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((h85) arrayList.get(i7)).g(e55Var.b, true);
        }
        this.m0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.o0) {
            this.o0 = measuredHeight;
            h75Var.T0(false);
        }
        h75Var.j4.f = getMeasuredWidth();
        h75Var.O0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.t0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.t0.O1();
    }
}
