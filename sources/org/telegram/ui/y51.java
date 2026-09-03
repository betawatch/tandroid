package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class y51 extends org.telegram.ui.Components.sl0 {
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public boolean Z2;
    public final LongSparseArray a3;
    public final /* synthetic */ w61 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(w61 w61Var, Context context) {
        super(context, null);
        this.b3 = w61Var;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.a3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, this.m2));
    }

    public static void v1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((x51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.l5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.sl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f10, float f11) {
        if (view instanceof f61) {
            f61 f61Var = (f61) view;
            if (!f61Var.a) {
                Drawable drawable = f61Var.B;
                if (drawable instanceof org.telegram.ui.Components.l5) {
                }
            }
            setSelectorDrawableColor(i0.a.k(this.b3.c1, 30));
            return true;
        }
        setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, this.m2));
        return true;
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        x51 x51Var;
        int i10;
        View view;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver;
        boolean z4;
        Canvas canvas2 = canvas;
        if (getVisibility() != 0) {
            return;
        }
        this.Z2 = false;
        int saveCount = canvas2.getSaveCount();
        w61 w61Var = this.b3;
        int i11 = w61Var.T;
        int i12 = 14;
        if (i11 != 6 && i11 != 14 && i11 != 13) {
            Rect rect = this.D1;
            if (!rect.isEmpty()) {
                this.A1.setBounds(rect);
                canvas2.save();
                q0.a aVar = this.l2;
                if (aVar != null) {
                    aVar.accept(canvas2);
                }
                this.A1.draw(canvas2);
                canvas2.restore();
            }
        }
        int i13 = 0;
        while (true) {
            sparseArray = this.U2;
            int size = sparseArray.size();
            arrayList = this.V2;
            if (i13 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i13++;
        }
        sparseArray.clear();
        boolean z10 = w61Var.M1 > 0 && SystemClock.elapsedRealtime() - w61Var.M1 < w61Var.g() && w61Var.J1 != null && w61Var.K1 >= 0;
        if (this.a3 != null) {
            int i14 = 0;
            boolean z11 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof f61) {
                    f61 f61Var = (f61) childAt;
                    w61 w61Var2 = f61Var.S;
                    int i15 = w61Var2.T;
                    if (f61Var.isPressed()) {
                        float f10 = f61Var.K;
                        if (f10 != 1.0f && i15 != i12) {
                            f61Var.K = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                            f61Var.invalidate();
                        }
                    }
                    int i16 = f61Var.c;
                    int y10 = w61Var.t1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y10);
                    canvas2.save();
                    canvas2.translate(f61Var.getX(), f61Var.getY());
                    if (f61Var.w != null) {
                        mh.wa collectionParticles = w61Var.getCollectionParticles();
                        i10 = i14;
                        boolean z12 = z11;
                        collectionParticles.f(0, 0, f61Var.getWidth(), f61Var.getHeight());
                        if (z12) {
                            z4 = z12;
                        } else {
                            collectionParticles.d();
                            z4 = true;
                        }
                        canvas2.save();
                        int i17 = i16 % 6;
                        boolean z13 = z4;
                        view = childAt;
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, f61Var.getWidth() / 2.0f, f61Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, f61Var.getWidth() / 2.0f, f61Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, f61Var.w.intValue());
                        canvas2.restore();
                        z11 = z13;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z14 = f61Var.I;
                    if ((z14 || f61Var.J || f61Var.P > 0.0f) && !f61Var.b) {
                        if (z14 || f61Var.J) {
                            float f11 = f61Var.O;
                            if (f11 < 1.0f) {
                                f61Var.O = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f11;
                                invalidate();
                            }
                        }
                        if (!f61Var.I && !f61Var.J) {
                            float f12 = f61Var.O;
                            if (f12 > 0.0f) {
                                f61Var.O = f12 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        f61Var.P = Utilities.clamp(f61Var.I ? org.telegram.ui.Components.pr.h.getInterpolation(f61Var.O) : 1.0f - org.telegram.ui.Components.pr.h.getInterpolation(1.0f - f61Var.O), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, f61Var.getMeasuredWidth(), f61Var.getMeasuredHeight());
                        float f13 = dp;
                        rectF.inset(f13, f13);
                        if (!f61Var.a) {
                            Drawable drawable = f61Var.B;
                            if (!(drawable instanceof org.telegram.ui.Components.l5) || !((org.telegram.ui.Components.l5) drawable).c()) {
                                paint = w61Var2.I;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (f61Var.getAlpha() * alpha * f61Var.P));
                                float f14 = dp2;
                                canvas2.drawRoundRect(rectF, f14, f14, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = w61Var2.J;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (f61Var.getAlpha() * alpha2 * f61Var.P));
                        float f142 = dp2;
                        canvas2.drawRoundRect(rectF, f142, f142, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (f61Var.getBackground() != null) {
                        f61Var.getBackground().setBounds((int) f61Var.getX(), (int) f61Var.getY(), f61Var.getWidth() + ((int) f61Var.getX()), f61Var.getHeight() + ((int) f61Var.getY()));
                        f61Var.getBackground().setAlpha((int) (f61Var.getAlpha() * 255));
                        f61Var.getBackground().draw(canvas2);
                        f61Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) e2.c.g(1, arrayList) : new ArrayList();
                        sparseArray.put(y10, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(f61Var);
                    e61 e61Var = f61Var.G;
                    if (e61Var != null && e61Var.getVisibility() == 0 && f61Var.G.getImageReceiver() == null && (imageReceiver = f61Var.r) != null) {
                        f61Var.G.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z15 = z11;
                if (z10 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = w61Var.K1;
                    List list = w61.W1;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.pr.g.getInterpolation(k7.o.a((SystemClock.elapsedRealtime() - w61Var.M1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f15 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f15), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f16 = (f15 * 0.5f) + 0.5f;
                            canvas2.scale(f16, f16, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            w61Var.J1.draw(canvas2);
                            canvas2.restore();
                            i14 = i10 + 1;
                            z11 = z15;
                            i12 = 14;
                        }
                    }
                }
                i14 = i10 + 1;
                z11 = z15;
                i12 = 14;
            }
        }
        ArrayList arrayList6 = this.Y2;
        arrayList6.clear();
        ArrayList arrayList7 = this.X2;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i19 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.W2;
            if (i19 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
            f61 f61Var2 = (f61) arrayList8.get(0);
            int R2 = RecyclerView.R(f61Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    x51Var = null;
                    break;
                } else {
                    if (((x51) arrayList6.get(i20)).J == R2) {
                        x51Var = (x51) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (x51Var == null) {
                if (arrayList2.isEmpty()) {
                    x51Var = new x51(this);
                    x51Var.l(7);
                } else {
                    x51Var = (x51) e2.c.g(1, arrayList2);
                }
                x51Var.J = R2;
                x51Var.e();
            }
            arrayList7.add(x51Var);
            x51Var.L = arrayList8;
            canvas2.save();
            canvas2.translate(f61Var2.getLeft(), f61Var2.getY());
            x51Var.K = f61Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (f61Var2.getLeft() * 2);
            int measuredHeight = f61Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                x51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((x51) arrayList6.get(i21));
                ((x51) arrayList6.get(i21)).L = null;
                ((x51) arrayList6.get(i21)).k();
            } else {
                ((x51) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof f61) {
                f61 f61Var3 = (f61) childAt2;
                e61 e61Var2 = f61Var3.G;
                if (e61Var2 != null && e61Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((f61Var3.getX() + f61Var3.getMeasuredWidth()) - f61Var3.G.getMeasuredWidth()), (int) ((f61Var3.getY() + f61Var3.getMeasuredHeight()) - f61Var3.G.getMeasuredHeight()));
                    Drawable drawable2 = f61Var3.B;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.l5 ? ((org.telegram.ui.Components.l5) drawable2).k : f61Var3.h;
                    e61 e61Var3 = f61Var3.G;
                    if (!e61Var3.h) {
                        e61Var3.setImageReceiver(imageReceiver2);
                    }
                    f61Var3.G.draw(canvas2);
                    canvas2.restore();
                }
                if (f61Var3.H != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f17 = dp3;
                    canvas2.translate((int) ((f61Var3.getX() + f61Var3.getMeasuredWidth()) - f17), (int) ((f61Var3.getY() + f61Var3.getMeasuredHeight()) - f17));
                    f61Var3.H.setBounds(0, 0, dp3, dp3);
                    f61Var3.H.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != w61Var.J1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = ng.g0.c;
        if (runnable != null) {
            runnable.run();
            ng.g0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public final void e1() {
        if (ng.g0.b(this)) {
            return;
        }
        super.e1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ng.g0.b(this) || this.Z2) {
            return;
        }
        this.Z2 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w61 w61Var = this.b3;
        if (this == w61Var.e0) {
            w61Var.S0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w61 w61Var = this.b3;
        if (this == w61Var.e0) {
            w61Var.S0.onDetachedFromWindow();
        }
        v1(this.W2);
        v1(this.X2);
        v1(this.Y2);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ng.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
