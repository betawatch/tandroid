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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class u01 extends org.telegram.ui.Components.ck0 {
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public boolean k3;
    public final LongSparseArray l3;
    public final /* synthetic */ r11 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u01(r11 r11Var, Context context) {
        super(context, null);
        this.m3 = r11Var;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.l(this, 20, org.telegram.ui.ActionBar.n6.i6, this.o2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((t01) arrayList.get(i7)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.o5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.ck0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f10, float f11) {
        if (view instanceof b11) {
            b11 b11Var = (b11) view;
            if (!b11Var.a) {
                Drawable drawable = b11Var.F;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                }
            }
            setSelectorDrawableColor(i0.a.o(this.m3.g1, 30));
            return true;
        }
        org.telegram.ui.ActionBar.u6.l(this, 20, org.telegram.ui.ActionBar.n6.i6, this.o2);
        return true;
    }

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        t01 t01Var;
        int i7;
        View view;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver;
        boolean z10;
        Canvas canvas2 = canvas;
        if (getVisibility() != 0) {
            return;
        }
        this.k3 = false;
        int saveCount = canvas2.getSaveCount();
        r11 r11Var = this.m3;
        int i10 = r11Var.a0;
        int i11 = 14;
        if (i10 != 6 && i10 != 14 && i10 != 13) {
            Rect rect = this.F1;
            if (!rect.isEmpty()) {
                this.C1.setBounds(rect);
                canvas2.save();
                q0.a aVar = this.n2;
                if (aVar != null) {
                    aVar.accept(canvas2);
                }
                this.C1.draw(canvas2);
                canvas2.restore();
            }
        }
        int i12 = 0;
        while (true) {
            sparseArray = this.f3;
            int size = sparseArray.size();
            arrayList = this.g3;
            if (i12 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i12);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i12++;
        }
        sparseArray.clear();
        boolean z11 = r11Var.R1 > 0 && SystemClock.elapsedRealtime() - r11Var.R1 < r11Var.g() && r11Var.O1 != null && r11Var.P1 >= 0;
        if (this.l3 != null) {
            int i13 = 0;
            boolean z12 = false;
            while (i13 < getChildCount()) {
                View childAt = getChildAt(i13);
                if (childAt instanceof b11) {
                    b11 b11Var = (b11) childAt;
                    r11 r11Var2 = b11Var.W;
                    int i14 = r11Var2.a0;
                    if (b11Var.isPressed()) {
                        float f10 = b11Var.O;
                        if (f10 != 1.0f && i14 != i11) {
                            b11Var.O = Utilities.i(f10 + 0.16f, 1.0f, 0.0f);
                            b11Var.invalidate();
                        }
                    }
                    int i15 = b11Var.c;
                    int y10 = r11Var.y1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y10);
                    canvas2.save();
                    canvas2.translate(b11Var.getX(), b11Var.getY());
                    if (b11Var.x != null) {
                        di.ec collectionParticles = r11Var.getCollectionParticles();
                        i7 = i13;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, b11Var.getWidth(), b11Var.getHeight());
                        if (z13) {
                            z10 = z13;
                        } else {
                            collectionParticles.d();
                            z10 = true;
                        }
                        canvas2.save();
                        int i16 = i15 % 6;
                        boolean z14 = z10;
                        view = childAt;
                        canvas2.scale(i16 == 2 ? -1.0f : 1.0f, i16 == 2 ? -1.0f : 1.0f, b11Var.getWidth() / 2.0f, b11Var.getHeight() / 2.0f);
                        canvas2.rotate((i15 % 4) * 90, b11Var.getWidth() / 2.0f, b11Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, b11Var.x.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i7 = i13;
                        view = childAt;
                    }
                    boolean z15 = b11Var.M;
                    if ((z15 || b11Var.N || b11Var.T > 0.0f) && !b11Var.b) {
                        if (z15 || b11Var.N) {
                            float f11 = b11Var.S;
                            if (f11 < 1.0f) {
                                b11Var.S = ((1000.0f / org.telegram.messenger.g0.r) / 240.0f) + f11;
                                invalidate();
                            }
                        }
                        if (!b11Var.M && !b11Var.N) {
                            float f12 = b11Var.S;
                            if (f12 > 0.0f) {
                                b11Var.S = f12 - ((1000.0f / org.telegram.messenger.g0.r) / 240.0f);
                                invalidate();
                            }
                        }
                        b11Var.T = Utilities.i(b11Var.M ? org.telegram.ui.Components.lr.h.getInterpolation(b11Var.S) : 1.0f - org.telegram.ui.Components.lr.h.getInterpolation(1.0f - b11Var.S), 1.0f, 0.0f);
                        int L = org.telegram.messenger.g0.L(i14 == 6 ? 1.5f : 1.0f);
                        int L2 = org.telegram.messenger.g0.L(i14 == 6 ? 6.0f : 4.0f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, b11Var.getMeasuredWidth(), b11Var.getMeasuredHeight());
                        float f13 = L;
                        rectF.inset(f13, f13);
                        if (!b11Var.a) {
                            Drawable drawable = b11Var.F;
                            if (!(drawable instanceof org.telegram.ui.Components.o5) || !((org.telegram.ui.Components.o5) drawable).c()) {
                                paint = r11Var2.M;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (b11Var.getAlpha() * alpha * b11Var.T));
                                float f14 = L2;
                                canvas2.drawRoundRect(rectF, f14, f14, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = r11Var2.N;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (b11Var.getAlpha() * alpha2 * b11Var.T));
                        float f142 = L2;
                        canvas2.drawRoundRect(rectF, f142, f142, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (b11Var.getBackground() != null) {
                        b11Var.getBackground().setBounds((int) b11Var.getX(), (int) b11Var.getY(), b11Var.getWidth() + ((int) b11Var.getX()), b11Var.getHeight() + ((int) b11Var.getY()));
                        b11Var.getBackground().setAlpha((int) (b11Var.getAlpha() * org.telegram.messenger.ks.e4));
                        b11Var.getBackground().draw(canvas2);
                        b11Var.getBackground().setAlpha(org.telegram.messenger.ks.e4);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) p5.c.g(1, arrayList) : new ArrayList();
                        sparseArray.put(y10, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(b11Var);
                    a11 a11Var = b11Var.K;
                    if (a11Var != null && a11Var.getVisibility() == 0 && b11Var.K.getImageReceiver() == null && (imageReceiver = b11Var.r) != null) {
                        b11Var.K.setImageReceiver(imageReceiver);
                    }
                } else {
                    i7 = i13;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int R = RecyclerView.R(view);
                    int i17 = r11Var.P1;
                    List list = r11.b2;
                    if (R == i17 - 1) {
                        float interpolation = org.telegram.ui.Components.lr.g.getInterpolation(c8.l9.a((SystemClock.elapsedRealtime() - r11Var.R1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f15 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f15), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f16 = (f15 * 0.5f) + 0.5f;
                            canvas2.scale(f16, f16, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            r11Var.O1.draw(canvas2);
                            canvas2.restore();
                            i13 = i7 + 1;
                            z12 = z16;
                            i11 = 14;
                        }
                    }
                }
                i13 = i7 + 1;
                z12 = z16;
                i11 = 14;
            }
        }
        ArrayList arrayList6 = this.j3;
        arrayList6.clear();
        ArrayList arrayList7 = this.i3;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i18 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.h3;
            if (i18 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i18);
            b11 b11Var2 = (b11) arrayList8.get(0);
            int R2 = RecyclerView.R(b11Var2);
            int i19 = 0;
            while (true) {
                if (i19 >= arrayList6.size()) {
                    t01Var = null;
                    break;
                } else {
                    if (((t01) arrayList6.get(i19)).N == R2) {
                        t01Var = (t01) arrayList6.get(i19);
                        arrayList6.remove(i19);
                        break;
                    }
                    i19++;
                }
            }
            if (t01Var == null) {
                if (arrayList2.isEmpty()) {
                    t01Var = new t01(this);
                    t01Var.l(7);
                } else {
                    t01Var = (t01) p5.c.g(1, arrayList2);
                }
                t01Var.N = R2;
                t01Var.e();
            }
            arrayList7.add(t01Var);
            t01Var.P = arrayList8;
            canvas2.save();
            canvas2.translate(b11Var2.getLeft(), b11Var2.getY());
            t01Var.O = b11Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (b11Var2.getLeft() * 2);
            int measuredHeight = b11Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                t01Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i18++;
        }
        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((t01) arrayList6.get(i20));
                ((t01) arrayList6.get(i20)).P = null;
                ((t01) arrayList6.get(i20)).k();
            } else {
                ((t01) arrayList6.get(i20)).f();
            }
        }
        arrayList6.clear();
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2 instanceof b11) {
                b11 b11Var3 = (b11) childAt2;
                a11 a11Var2 = b11Var3.K;
                if (a11Var2 != null && a11Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((b11Var3.getX() + b11Var3.getMeasuredWidth()) - b11Var3.K.getMeasuredWidth()), (int) ((b11Var3.getY() + b11Var3.getMeasuredHeight()) - b11Var3.K.getMeasuredHeight()));
                    Drawable drawable2 = b11Var3.F;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.o5 ? ((org.telegram.ui.Components.o5) drawable2).k : b11Var3.h;
                    a11 a11Var3 = b11Var3.K;
                    if (!a11Var3.h) {
                        a11Var3.setImageReceiver(imageReceiver2);
                    }
                    b11Var3.K.draw(canvas2);
                    canvas2.restore();
                }
                if (b11Var3.L != null) {
                    canvas2.save();
                    int L3 = org.telegram.messenger.g0.L(17.0f);
                    float f17 = L3;
                    canvas2.translate((int) ((b11Var3.getX() + b11Var3.getMeasuredWidth()) - f17), (int) ((b11Var3.getY() + b11Var3.getMeasuredHeight()) - f17));
                    b11Var3.L.setBounds(0, 0, L3, L3);
                    b11Var3.L.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != r11Var.O1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = ch.f0.c;
        if (runnable != null) {
            runnable.run();
            ch.f0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.ck0
    public final void g1() {
        if (ch.f0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ch.f0.b(this) || this.k3) {
            return;
        }
        this.k3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r11 r11Var = this.m3;
        if (this == r11Var.i0) {
            r11Var.W0.P();
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r11 r11Var = this.m3;
        if (this == r11Var.i0) {
            r11Var.W0.R();
        }
        z1(this.h3);
        z1(this.i3);
        z1(this.j3);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
