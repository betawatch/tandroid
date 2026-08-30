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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class r51 extends org.telegram.ui.Components.sl0 {
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public boolean Z2;
    public final LongSparseArray a3;
    public final /* synthetic */ q61 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(q61 q61Var, Context context) {
        super(context, null);
        this.b3 = q61Var;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.a3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.m2));
    }

    public static void w1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((q51) arrayList.get(i10)).f();
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
        if (view instanceof y51) {
            y51 y51Var = (y51) view;
            if (!y51Var.a) {
                Drawable drawable = y51Var.B;
                if (drawable instanceof org.telegram.ui.Components.l5) {
                }
            }
            setSelectorDrawableColor(i0.a.k(this.b3.c1, 30));
            return true;
        }
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.m2));
        return true;
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        q51 q51Var;
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
        q61 q61Var = this.b3;
        int i11 = q61Var.T;
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
        boolean z10 = q61Var.M1 > 0 && SystemClock.elapsedRealtime() - q61Var.M1 < q61Var.g() && q61Var.J1 != null && q61Var.K1 >= 0;
        if (this.a3 != null) {
            int i14 = 0;
            boolean z11 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof y51) {
                    y51 y51Var = (y51) childAt;
                    q61 q61Var2 = y51Var.S;
                    int i15 = q61Var2.T;
                    if (y51Var.isPressed()) {
                        float f10 = y51Var.K;
                        if (f10 != 1.0f && i15 != i12) {
                            y51Var.K = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                            y51Var.invalidate();
                        }
                    }
                    int i16 = y51Var.c;
                    int y10 = q61Var.t1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y10);
                    canvas2.save();
                    canvas2.translate(y51Var.getX(), y51Var.getY());
                    if (y51Var.w != null) {
                        lh.wa collectionParticles = q61Var.getCollectionParticles();
                        i10 = i14;
                        boolean z12 = z11;
                        collectionParticles.f(0, 0, y51Var.getWidth(), y51Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, y51Var.getWidth() / 2.0f, y51Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, y51Var.getWidth() / 2.0f, y51Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, y51Var.w.intValue());
                        canvas2.restore();
                        z11 = z13;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z14 = y51Var.I;
                    if ((z14 || y51Var.J || y51Var.P > 0.0f) && !y51Var.b) {
                        if (z14 || y51Var.J) {
                            float f11 = y51Var.O;
                            if (f11 < 1.0f) {
                                y51Var.O = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f11;
                                invalidate();
                            }
                        }
                        if (!y51Var.I && !y51Var.J) {
                            float f12 = y51Var.O;
                            if (f12 > 0.0f) {
                                y51Var.O = f12 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        y51Var.P = Utilities.clamp(y51Var.I ? org.telegram.ui.Components.nr.h.getInterpolation(y51Var.O) : 1.0f - org.telegram.ui.Components.nr.h.getInterpolation(1.0f - y51Var.O), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, y51Var.getMeasuredWidth(), y51Var.getMeasuredHeight());
                        float f13 = dp;
                        rectF.inset(f13, f13);
                        if (!y51Var.a) {
                            Drawable drawable = y51Var.B;
                            if (!(drawable instanceof org.telegram.ui.Components.l5) || !((org.telegram.ui.Components.l5) drawable).c()) {
                                paint = q61Var2.I;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (y51Var.getAlpha() * alpha * y51Var.P));
                                float f14 = dp2;
                                canvas2.drawRoundRect(rectF, f14, f14, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = q61Var2.J;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (y51Var.getAlpha() * alpha2 * y51Var.P));
                        float f142 = dp2;
                        canvas2.drawRoundRect(rectF, f142, f142, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (y51Var.getBackground() != null) {
                        y51Var.getBackground().setBounds((int) y51Var.getX(), (int) y51Var.getY(), y51Var.getWidth() + ((int) y51Var.getX()), y51Var.getHeight() + ((int) y51Var.getY()));
                        y51Var.getBackground().setAlpha((int) (y51Var.getAlpha() * 255));
                        y51Var.getBackground().draw(canvas2);
                        y51Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) e2.c.g(1, arrayList) : new ArrayList();
                        sparseArray.put(y10, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(y51Var);
                    x51 x51Var = y51Var.G;
                    if (x51Var != null && x51Var.getVisibility() == 0 && y51Var.G.getImageReceiver() == null && (imageReceiver = y51Var.r) != null) {
                        y51Var.G.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z15 = z11;
                if (z10 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = q61Var.K1;
                    List list = q61.W1;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.nr.g.getInterpolation(k7.n.a((SystemClock.elapsedRealtime() - q61Var.M1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f15 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f15), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f16 = (f15 * 0.5f) + 0.5f;
                            canvas2.scale(f16, f16, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            q61Var.J1.draw(canvas2);
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
            y51 y51Var2 = (y51) arrayList8.get(0);
            int R2 = RecyclerView.R(y51Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    q51Var = null;
                    break;
                } else {
                    if (((q51) arrayList6.get(i20)).J == R2) {
                        q51Var = (q51) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (q51Var == null) {
                if (arrayList2.isEmpty()) {
                    q51Var = new q51(this);
                    q51Var.l(7);
                } else {
                    q51Var = (q51) e2.c.g(1, arrayList2);
                }
                q51Var.J = R2;
                q51Var.e();
            }
            arrayList7.add(q51Var);
            q51Var.L = arrayList8;
            canvas2.save();
            canvas2.translate(y51Var2.getLeft(), y51Var2.getY());
            q51Var.K = y51Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (y51Var2.getLeft() * 2);
            int measuredHeight = y51Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                q51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((q51) arrayList6.get(i21));
                ((q51) arrayList6.get(i21)).L = null;
                ((q51) arrayList6.get(i21)).k();
            } else {
                ((q51) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof y51) {
                y51 y51Var3 = (y51) childAt2;
                x51 x51Var2 = y51Var3.G;
                if (x51Var2 != null && x51Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((y51Var3.getX() + y51Var3.getMeasuredWidth()) - y51Var3.G.getMeasuredWidth()), (int) ((y51Var3.getY() + y51Var3.getMeasuredHeight()) - y51Var3.G.getMeasuredHeight()));
                    Drawable drawable2 = y51Var3.B;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.l5 ? ((org.telegram.ui.Components.l5) drawable2).k : y51Var3.h;
                    x51 x51Var3 = y51Var3.G;
                    if (!x51Var3.h) {
                        x51Var3.setImageReceiver(imageReceiver2);
                    }
                    y51Var3.G.draw(canvas2);
                    canvas2.restore();
                }
                if (y51Var3.H != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f17 = dp3;
                    canvas2.translate((int) ((y51Var3.getX() + y51Var3.getMeasuredWidth()) - f17), (int) ((y51Var3.getY() + y51Var3.getMeasuredHeight()) - f17));
                    y51Var3.H.setBounds(0, 0, dp3, dp3);
                    y51Var3.H.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != q61Var.J1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = mg.g0.c;
        if (runnable != null) {
            runnable.run();
            mg.g0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public final void f1() {
        if (mg.g0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (mg.g0.b(this) || this.Z2) {
            return;
        }
        this.Z2 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q61 q61Var = this.b3;
        if (this == q61Var.e0) {
            q61Var.S0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q61 q61Var = this.b3;
        if (this == q61Var.e0) {
            q61Var.S0.onDetachedFromWindow();
        }
        w1(this.W2);
        w1(this.X2);
        w1(this.Y2);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
