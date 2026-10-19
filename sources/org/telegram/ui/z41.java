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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class z41 extends org.telegram.ui.Components.im0 {
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public boolean a3;
    public final LongSparseArray b3;
    public final /* synthetic */ x51 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z41(x51 x51Var, Context context) {
        super(context, null);
        this.c3 = x51Var;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.b3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, this.n2));
    }

    public static void x1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((y41) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.r5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.im0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f7, float f10) {
        if (view instanceof g51) {
            g51 g51Var = (g51) view;
            if (!g51Var.a) {
                Drawable drawable = g51Var.E;
                if (drawable instanceof org.telegram.ui.Components.r5) {
                }
            }
            setSelectorDrawableColor(i0.a.o(this.c3.f1, 30));
            return true;
        }
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, this.n2));
        return true;
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        y41 y41Var;
        int i10;
        View view;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver;
        boolean z10;
        Canvas canvas2 = canvas;
        if (getVisibility() != 0) {
            return;
        }
        this.a3 = false;
        int saveCount = canvas2.getSaveCount();
        x51 x51Var = this.c3;
        int i11 = x51Var.W;
        int i12 = 14;
        if (i11 != 6 && i11 != 14 && i11 != 13) {
            Rect rect = this.E1;
            if (!rect.isEmpty()) {
                this.B1.setBounds(rect);
                canvas2.save();
                q0.a aVar = this.m2;
                if (aVar != null) {
                    aVar.accept(canvas2);
                }
                this.B1.draw(canvas2);
                canvas2.restore();
            }
        }
        int i13 = 0;
        while (true) {
            sparseArray = this.V2;
            int size = sparseArray.size();
            arrayList = this.W2;
            if (i13 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i13++;
        }
        sparseArray.clear();
        boolean z11 = x51Var.P1 > 0 && SystemClock.elapsedRealtime() - x51Var.P1 < x51Var.g() && x51Var.M1 != null && x51Var.N1 >= 0;
        if (this.b3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof g51) {
                    g51 g51Var = (g51) childAt;
                    x51 x51Var2 = g51Var.V;
                    int i15 = x51Var2.W;
                    if (g51Var.isPressed()) {
                        float f7 = g51Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            g51Var.N = Utilities.clamp(f7 + 0.16f, 1.0f, 0.0f);
                            g51Var.invalidate();
                        }
                    }
                    int i16 = g51Var.c;
                    int y3 = x51Var.w1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(g51Var.getX(), g51Var.getY());
                    if (g51Var.w != null) {
                        ai.de collectionParticles = x51Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, g51Var.getWidth(), g51Var.getHeight());
                        if (z13) {
                            z10 = z13;
                        } else {
                            collectionParticles.d();
                            z10 = true;
                        }
                        canvas2.save();
                        int i17 = i16 % 6;
                        boolean z14 = z10;
                        view = childAt;
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, g51Var.getWidth() / 2.0f, g51Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, g51Var.getWidth() / 2.0f, g51Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, g51Var.w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = g51Var.L;
                    if ((z15 || g51Var.M || g51Var.S > 0.0f) && !g51Var.b) {
                        if (z15 || g51Var.M) {
                            float f10 = g51Var.R;
                            if (f10 < 1.0f) {
                                g51Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!g51Var.L && !g51Var.M) {
                            float f11 = g51Var.R;
                            if (f11 > 0.0f) {
                                g51Var.R = f11 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        g51Var.S = Utilities.clamp(g51Var.L ? org.telegram.ui.Components.bs.h.getInterpolation(g51Var.R) : 1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - g51Var.R), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, g51Var.getMeasuredWidth(), g51Var.getMeasuredHeight());
                        float f12 = dp;
                        rectF.inset(f12, f12);
                        if (!g51Var.a) {
                            Drawable drawable = g51Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.r5) || !((org.telegram.ui.Components.r5) drawable).c()) {
                                paint = x51Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (g51Var.getAlpha() * alpha * g51Var.S));
                                float f13 = dp2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = x51Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (g51Var.getAlpha() * alpha2 * g51Var.S));
                        float f132 = dp2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (g51Var.getBackground() != null) {
                        g51Var.getBackground().setBounds((int) g51Var.getX(), (int) g51Var.getY(), g51Var.getWidth() + ((int) g51Var.getX()), g51Var.getHeight() + ((int) g51Var.getY()));
                        g51Var.getBackground().setAlpha((int) (g51Var.getAlpha() * 255));
                        g51Var.getBackground().draw(canvas2);
                        g51Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) i2.e.A(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(g51Var);
                    f51 f51Var = g51Var.J;
                    if (f51Var != null && f51Var.getVisibility() == 0 && g51Var.J.getImageReceiver() == null && (imageReceiver = g51Var.r) != null) {
                        g51Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = x51Var.N1;
                    List list = x51.Z1;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.bs.g.getInterpolation(w7.r.a((SystemClock.elapsedRealtime() - x51Var.P1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            x51Var.M1.draw(canvas2);
                            canvas2.restore();
                            i14 = i10 + 1;
                            z12 = z16;
                            i12 = 14;
                        }
                    }
                }
                i14 = i10 + 1;
                z12 = z16;
                i12 = 14;
            }
        }
        ArrayList arrayList6 = this.Z2;
        arrayList6.clear();
        ArrayList arrayList7 = this.Y2;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i19 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.X2;
            if (i19 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
            g51 g51Var2 = (g51) arrayList8.get(0);
            int R2 = RecyclerView.R(g51Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    y41Var = null;
                    break;
                } else {
                    if (((y41) arrayList6.get(i20)).M == R2) {
                        y41Var = (y41) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (y41Var == null) {
                if (arrayList2.isEmpty()) {
                    y41Var = new y41(this);
                    y41Var.l(7);
                } else {
                    y41Var = (y41) i2.e.A(1, arrayList2);
                }
                y41Var.M = R2;
                y41Var.e();
            }
            arrayList7.add(y41Var);
            y41Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(g51Var2.getLeft(), g51Var2.getY());
            y41Var.N = g51Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (g51Var2.getLeft() * 2);
            int measuredHeight = g51Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                y41Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((y41) arrayList6.get(i21));
                ((y41) arrayList6.get(i21)).O = null;
                ((y41) arrayList6.get(i21)).k();
            } else {
                ((y41) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof g51) {
                g51 g51Var3 = (g51) childAt2;
                f51 f51Var2 = g51Var3.J;
                if (f51Var2 != null && f51Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((g51Var3.getX() + g51Var3.getMeasuredWidth()) - g51Var3.J.getMeasuredWidth()), (int) ((g51Var3.getY() + g51Var3.getMeasuredHeight()) - g51Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = g51Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.r5 ? ((org.telegram.ui.Components.r5) drawable2).k : g51Var3.h;
                    f51 f51Var3 = g51Var3.J;
                    if (!f51Var3.h) {
                        f51Var3.setImageReceiver(imageReceiver2);
                    }
                    g51Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (g51Var3.K != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f16 = dp3;
                    canvas2.translate((int) ((g51Var3.getX() + g51Var3.getMeasuredWidth()) - f16), (int) ((g51Var3.getY() + g51Var3.getMeasuredHeight()) - f16));
                    g51Var3.K.setBounds(0, 0, dp3, dp3);
                    g51Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != x51Var.M1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = ah.x0.c;
        if (runnable != null) {
            runnable.run();
            ah.x0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.im0
    public final void f1() {
        if (ah.x0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ah.x0.b(this) || this.a3) {
            return;
        }
        this.a3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x51 x51Var = this.c3;
        if (this == x51Var.h0) {
            x51Var.V0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x51 x51Var = this.c3;
        if (this == x51Var.h0) {
            x51Var.V0.onDetachedFromWindow();
        }
        x1(this.X2);
        x1(this.Y2);
        x1(this.Z2);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
