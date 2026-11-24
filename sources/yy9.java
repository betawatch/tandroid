// default package

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class yy9 extends r59 {
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public boolean k3;
    public final LongSparseArray l3;
    public final /* synthetic */ vz9 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy9(vz9 vz9Var, Context context) {
        super(context, null);
        this.m3 = vz9Var;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(gm.L(4.0f));
        anb.l(this, 20, cmb.h6, this.o2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            ((xy9) arrayList.get(i)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((vm) r1).c() != false) goto L10;
     */
    @Override // r59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I0(View view, float f, float f2) {
        if (view instanceof fz9) {
            fz9 fz9Var = (fz9) view;
            if (!fz9Var.a) {
                Drawable drawable = fz9Var.F;
                if (drawable instanceof vm) {
                }
            }
            setSelectorDrawableColor(on2.p(this.m3.g1, 30));
            return true;
        }
        anb.l(this, 20, cmb.h6, this.o2);
        return true;
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        xy9 xy9Var;
        int i;
        View view;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver;
        boolean z;
        float f;
        boolean z2;
        float f2;
        Canvas canvas2 = canvas;
        if (getVisibility() == 0) {
            this.k3 = false;
            int saveCount = canvas2.getSaveCount();
            vz9 vz9Var = this.m3;
            int i2 = vz9Var.a0;
            int i3 = 14;
            if (i2 != 6 && i2 != 14 && i2 != 13) {
                Rect rect = this.F1;
                if (!rect.isEmpty()) {
                    this.C1.setBounds(rect);
                    canvas2.save();
                    gu2 gu2Var = this.n2;
                    if (gu2Var != null) {
                        gu2Var.accept(canvas2);
                    }
                    this.C1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i4 = 0;
            while (true) {
                sparseArray = this.f3;
                int size = sparseArray.size();
                arrayList = this.g3;
                if (i4 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i4);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i4++;
            }
            sparseArray.clear();
            boolean z3 = vz9Var.R1 > 0 && SystemClock.elapsedRealtime() - vz9Var.R1 < vz9Var.e() && vz9Var.O1 != null && vz9Var.P1 >= 0;
            if (this.l3 != null) {
                int i5 = 0;
                boolean z4 = false;
                while (i5 < getChildCount()) {
                    View childAt = getChildAt(i5);
                    if (childAt instanceof fz9) {
                        fz9 fz9Var = (fz9) childAt;
                        vz9 vz9Var2 = fz9Var.W;
                        int i6 = vz9Var2.a0;
                        if (fz9Var.isPressed()) {
                            float f3 = fz9Var.O;
                            if (f3 != 1.0f && i6 != i3) {
                                fz9Var.O = Utilities.i(f3 + 0.16f, 1.0f, 0.0f);
                                fz9Var.invalidate();
                            }
                        }
                        int i7 = fz9Var.c;
                        int y = vz9Var.y1 ? (int) childAt.getY() : childAt.getTop();
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(y);
                        canvas2.save();
                        canvas2.translate(fz9Var.getX(), fz9Var.getY());
                        if (fz9Var.x != null) {
                            yxa collectionParticles = vz9Var.getCollectionParticles();
                            i = i5;
                            boolean z5 = z4;
                            collectionParticles.f(0, 0, fz9Var.getWidth(), fz9Var.getHeight());
                            if (z5) {
                                z = z5;
                            } else {
                                collectionParticles.d();
                                z = true;
                            }
                            canvas2.save();
                            if (i7 % 6 == 2) {
                                f = -1.0f;
                                f2 = -1.0f;
                                z2 = z;
                            } else {
                                f = 1.0f;
                                z2 = z;
                                f2 = 1.0f;
                            }
                            view = childAt;
                            canvas2.scale(f2, f, fz9Var.getWidth() / 2.0f, fz9Var.getHeight() / 2.0f);
                            canvas2.rotate((i7 % 4) * 90, fz9Var.getWidth() / 2.0f, fz9Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, fz9Var.x.intValue());
                            canvas2.restore();
                            z4 = z2;
                        } else {
                            i = i5;
                            view = childAt;
                        }
                        boolean z6 = fz9Var.M;
                        if ((z6 || fz9Var.N || fz9Var.T > 0.0f) && !fz9Var.b) {
                            if (z6 || fz9Var.N) {
                                float f4 = fz9Var.S;
                                if (f4 < 1.0f) {
                                    fz9Var.S = ((1000.0f / gm.r) / 240.0f) + f4;
                                    invalidate();
                                }
                            }
                            if (!fz9Var.M && !fz9Var.N) {
                                float f5 = fz9Var.S;
                                if (f5 > 0.0f) {
                                    fz9Var.S = f5 - ((1000.0f / gm.r) / 240.0f);
                                    invalidate();
                                }
                            }
                            fz9Var.T = Utilities.i(fz9Var.M ? d53.h.getInterpolation(fz9Var.S) : 1.0f - d53.h.getInterpolation(1.0f - fz9Var.S), 1.0f, 0.0f);
                            int L = gm.L(i6 == 6 ? 1.5f : 1.0f);
                            int L2 = gm.L(i6 == 6 ? 6.0f : 4.0f);
                            RectF rectF = gm.P;
                            rectF.set(0.0f, 0.0f, fz9Var.getMeasuredWidth(), fz9Var.getMeasuredHeight());
                            float f6 = L;
                            rectF.inset(f6, f6);
                            if (!fz9Var.a) {
                                Drawable drawable = fz9Var.F;
                                if (!(drawable instanceof vm) || !((vm) drawable).c()) {
                                    paint = vz9Var2.M;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (fz9Var.getAlpha() * alpha * fz9Var.T));
                                    float f7 = L2;
                                    canvas2.drawRoundRect(rectF, f7, f7, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = vz9Var2.N;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (fz9Var.getAlpha() * alpha2 * fz9Var.T));
                            float f72 = L2;
                            canvas2.drawRoundRect(rectF, f72, f72, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (fz9Var.getBackground() != null) {
                            fz9Var.getBackground().setBounds((int) fz9Var.getX(), (int) fz9Var.getY(), fz9Var.getWidth() + ((int) fz9Var.getX()), fz9Var.getHeight() + ((int) fz9Var.getY()));
                            fz9Var.getBackground().setAlpha((int) (fz9Var.getAlpha() * 255.0f));
                            fz9Var.getBackground().draw(canvas2);
                            fz9Var.getBackground().setAlpha(nm7.d4);
                        }
                        if (arrayList5 == null) {
                            arrayList3 = !arrayList.isEmpty() ? (ArrayList) td4.m(1, arrayList) : new ArrayList();
                            sparseArray.put(y, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(fz9Var);
                        ez9 ez9Var = fz9Var.K;
                        if (ez9Var != null && ez9Var.getVisibility() == 0 && fz9Var.K.getImageReceiver() == null && (imageReceiver = fz9Var.r) != null) {
                            fz9Var.K.setImageReceiver(imageReceiver);
                        }
                    } else {
                        i = i5;
                        view = childAt;
                    }
                    boolean z7 = z4;
                    if (z3 && view != null && RecyclerView.R(view) == vz9Var.P1 - 1) {
                        float interpolation = d53.g.getInterpolation(pqe.a((SystemClock.elapsedRealtime() - vz9Var.R1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f8 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (f8 * 255.0f), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f9 = (f8 * 0.5f) + 0.5f;
                            canvas2.scale(f9, f9, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            vz9Var.O1.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                    i5 = i + 1;
                    z4 = z7;
                    i3 = 14;
                }
            }
            ArrayList arrayList6 = this.j3;
            arrayList6.clear();
            ArrayList arrayList7 = this.i3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i8 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.h3;
                if (i8 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i8);
                fz9 fz9Var2 = (fz9) arrayList8.get(0);
                int R = RecyclerView.R(fz9Var2);
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList6.size()) {
                        xy9Var = null;
                        break;
                    } else {
                        if (((xy9) arrayList6.get(i9)).N == R) {
                            xy9Var = (xy9) arrayList6.get(i9);
                            arrayList6.remove(i9);
                            break;
                        }
                        i9++;
                    }
                }
                if (xy9Var == null) {
                    if (arrayList2.isEmpty()) {
                        xy9Var = new xy9(this);
                        xy9Var.l(7);
                    } else {
                        xy9Var = (xy9) td4.m(1, arrayList2);
                    }
                    xy9Var.N = R;
                    xy9Var.e();
                }
                arrayList7.add(xy9Var);
                xy9Var.P = arrayList8;
                canvas2.save();
                canvas2.translate(fz9Var2.getLeft(), fz9Var2.getY());
                xy9Var.O = fz9Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (fz9Var2.getLeft() << 1);
                int measuredHeight = fz9Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    xy9Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i8++;
            }
            for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((xy9) arrayList6.get(i10));
                    ((xy9) arrayList6.get(i10)).P = null;
                    ((xy9) arrayList6.get(i10)).k();
                } else {
                    ((xy9) arrayList6.get(i10)).f();
                }
            }
            arrayList6.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt2 = getChildAt(i11);
                if (childAt2 instanceof fz9) {
                    fz9 fz9Var3 = (fz9) childAt2;
                    ez9 ez9Var2 = fz9Var3.K;
                    if (ez9Var2 != null && ez9Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((fz9Var3.getX() + fz9Var3.getMeasuredWidth()) - fz9Var3.K.getMeasuredWidth()), (int) ((fz9Var3.getY() + fz9Var3.getMeasuredHeight()) - fz9Var3.K.getMeasuredHeight()));
                        Drawable drawable2 = fz9Var3.F;
                        ImageReceiver imageReceiver2 = drawable2 instanceof vm ? ((vm) drawable2).k : fz9Var3.h;
                        ez9 ez9Var3 = fz9Var3.K;
                        if (!ez9Var3.h) {
                            ez9Var3.setImageReceiver(imageReceiver2);
                        }
                        fz9Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                    if (fz9Var3.L != null) {
                        canvas2.save();
                        int L3 = gm.L(17.0f);
                        float f10 = L3;
                        canvas2.translate((int) ((fz9Var3.getX() + fz9Var3.getMeasuredWidth()) - f10), (int) ((fz9Var3.getY() + fz9Var3.getMeasuredHeight()) - f10));
                        fz9Var3.L.setBounds(0, 0, L3, L3);
                        fz9Var3.L.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != vz9Var.O1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = oi5.c;
            if (runnable != null) {
                runnable.run();
                oi5.c = null;
            }
        }
    }

    @Override // r59
    public final void h1() {
        if (oi5.b(this)) {
            return;
        }
        super.h1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (oi5.b(this) || this.k3) {
            return;
        }
        this.k3 = true;
        super.invalidate();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vz9 vz9Var = this.m3;
        if (this == vz9Var.i0) {
            vz9Var.W0.I();
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vz9 vz9Var = this.m3;
        if (this == vz9Var.i0) {
            vz9Var.W0.K();
        }
        z1(this.h3);
        z1(this.i3);
        z1(this.j3);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
