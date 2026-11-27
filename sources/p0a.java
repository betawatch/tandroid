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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class p0a extends d79 {
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public boolean k3;
    public final LongSparseArray l3;
    public final /* synthetic */ n1a m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0a(n1a n1aVar, Context context) {
        super(context, null);
        this.m3 = n1aVar;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(hl.L(4.0f));
        yob.l(this, 20, aob.i6, this.o2);
    }

    public static void A1(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            ((o0a) arrayList.get(i)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((wl) r1).c() != false) goto L10;
     */
    @Override // d79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J0(View view, float f, float f2) {
        if (view instanceof w0a) {
            w0a w0aVar = (w0a) view;
            if (!w0aVar.a) {
                Drawable drawable = w0aVar.F;
                if (drawable instanceof wl) {
                }
            }
            setSelectorDrawableColor(vm2.o(this.m3.g1, 30));
            return true;
        }
        yob.l(this, 20, aob.i6, this.o2);
        return true;
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        o0a o0aVar;
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
            n1a n1aVar = this.m3;
            int i2 = n1aVar.a0;
            int i3 = 14;
            if (i2 != 6 && i2 != 14 && i2 != 13) {
                Rect rect = this.F1;
                if (!rect.isEmpty()) {
                    this.C1.setBounds(rect);
                    canvas2.save();
                    pt2 pt2Var = this.n2;
                    if (pt2Var != null) {
                        pt2Var.accept(canvas2);
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
            boolean z3 = n1aVar.R1 > 0 && SystemClock.elapsedRealtime() - n1aVar.R1 < n1aVar.e() && n1aVar.O1 != null && n1aVar.P1 >= 0;
            if (this.l3 != null) {
                int i5 = 0;
                boolean z4 = false;
                while (i5 < getChildCount()) {
                    View childAt = getChildAt(i5);
                    if (childAt instanceof w0a) {
                        w0a w0aVar = (w0a) childAt;
                        n1a n1aVar2 = w0aVar.W;
                        int i6 = n1aVar2.a0;
                        if (w0aVar.isPressed()) {
                            float f3 = w0aVar.O;
                            if (f3 != 1.0f && i6 != i3) {
                                w0aVar.O = Utilities.i(f3 + 0.16f, 1.0f, 0.0f);
                                w0aVar.invalidate();
                            }
                        }
                        int i7 = w0aVar.c;
                        int y = n1aVar.y1 ? (int) childAt.getY() : childAt.getTop();
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(y);
                        canvas2.save();
                        canvas2.translate(w0aVar.getX(), w0aVar.getY());
                        if (w0aVar.x != null) {
                            yza collectionParticles = n1aVar.getCollectionParticles();
                            i = i5;
                            boolean z5 = z4;
                            collectionParticles.f(0, 0, w0aVar.getWidth(), w0aVar.getHeight());
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
                            canvas2.scale(f2, f, w0aVar.getWidth() / 2.0f, w0aVar.getHeight() / 2.0f);
                            canvas2.rotate((i7 % 4) * 90, w0aVar.getWidth() / 2.0f, w0aVar.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, w0aVar.x.intValue());
                            canvas2.restore();
                            z4 = z2;
                        } else {
                            i = i5;
                            view = childAt;
                        }
                        boolean z6 = w0aVar.M;
                        if ((z6 || w0aVar.N || w0aVar.T > 0.0f) && !w0aVar.b) {
                            if (z6 || w0aVar.N) {
                                float f4 = w0aVar.S;
                                if (f4 < 1.0f) {
                                    w0aVar.S = ((1000.0f / hl.r) / 240.0f) + f4;
                                    invalidate();
                                }
                            }
                            if (!w0aVar.M && !w0aVar.N) {
                                float f5 = w0aVar.S;
                                if (f5 > 0.0f) {
                                    w0aVar.S = f5 - ((1000.0f / hl.r) / 240.0f);
                                    invalidate();
                                }
                            }
                            w0aVar.T = Utilities.i(w0aVar.M ? k43.h.getInterpolation(w0aVar.S) : 1.0f - k43.h.getInterpolation(1.0f - w0aVar.S), 1.0f, 0.0f);
                            int L = hl.L(i6 == 6 ? 1.5f : 1.0f);
                            int L2 = hl.L(i6 == 6 ? 6.0f : 4.0f);
                            RectF rectF = hl.P;
                            rectF.set(0.0f, 0.0f, w0aVar.getMeasuredWidth(), w0aVar.getMeasuredHeight());
                            float f6 = L;
                            rectF.inset(f6, f6);
                            if (!w0aVar.a) {
                                Drawable drawable = w0aVar.F;
                                if (!(drawable instanceof wl) || !((wl) drawable).c()) {
                                    paint = n1aVar2.M;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (w0aVar.getAlpha() * alpha * w0aVar.T));
                                    float f7 = L2;
                                    canvas2.drawRoundRect(rectF, f7, f7, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = n1aVar2.N;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (w0aVar.getAlpha() * alpha2 * w0aVar.T));
                            float f72 = L2;
                            canvas2.drawRoundRect(rectF, f72, f72, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (w0aVar.getBackground() != null) {
                            w0aVar.getBackground().setBounds((int) w0aVar.getX(), (int) w0aVar.getY(), w0aVar.getWidth() + ((int) w0aVar.getX()), w0aVar.getHeight() + ((int) w0aVar.getY()));
                            w0aVar.getBackground().setAlpha((int) (w0aVar.getAlpha() * 255.0f));
                            w0aVar.getBackground().draw(canvas2);
                            w0aVar.getBackground().setAlpha(jn7.d4);
                        }
                        if (arrayList5 == null) {
                            arrayList3 = !arrayList.isEmpty() ? (ArrayList) qd4.l(1, arrayList) : new ArrayList();
                            sparseArray.put(y, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(w0aVar);
                        v0a v0aVar = w0aVar.K;
                        if (v0aVar != null && v0aVar.getVisibility() == 0 && w0aVar.K.getImageReceiver() == null && (imageReceiver = w0aVar.r) != null) {
                            w0aVar.K.setImageReceiver(imageReceiver);
                        }
                    } else {
                        i = i5;
                        view = childAt;
                    }
                    boolean z7 = z4;
                    if (z3 && view != null && RecyclerView.S(view) == n1aVar.P1 - 1) {
                        float interpolation = k43.g.getInterpolation(ete.a((SystemClock.elapsedRealtime() - n1aVar.R1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f8 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (f8 * 255.0f), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f9 = (f8 * 0.5f) + 0.5f;
                            canvas2.scale(f9, f9, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            n1aVar.O1.draw(canvas2);
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
                w0a w0aVar2 = (w0a) arrayList8.get(0);
                int S = RecyclerView.S(w0aVar2);
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList6.size()) {
                        o0aVar = null;
                        break;
                    } else {
                        if (((o0a) arrayList6.get(i9)).N == S) {
                            o0aVar = (o0a) arrayList6.get(i9);
                            arrayList6.remove(i9);
                            break;
                        }
                        i9++;
                    }
                }
                if (o0aVar == null) {
                    if (arrayList2.isEmpty()) {
                        o0aVar = new o0a(this);
                        o0aVar.l(7);
                    } else {
                        o0aVar = (o0a) qd4.l(1, arrayList2);
                    }
                    o0aVar.N = S;
                    o0aVar.e();
                }
                arrayList7.add(o0aVar);
                o0aVar.P = arrayList8;
                canvas2.save();
                canvas2.translate(w0aVar2.getLeft(), w0aVar2.getY());
                o0aVar.O = w0aVar2.getLeft();
                int measuredWidth = getMeasuredWidth() - (w0aVar2.getLeft() << 1);
                int measuredHeight = w0aVar2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    o0aVar.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i8++;
            }
            for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((o0a) arrayList6.get(i10));
                    ((o0a) arrayList6.get(i10)).P = null;
                    ((o0a) arrayList6.get(i10)).k();
                } else {
                    ((o0a) arrayList6.get(i10)).f();
                }
            }
            arrayList6.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt2 = getChildAt(i11);
                if (childAt2 instanceof w0a) {
                    w0a w0aVar3 = (w0a) childAt2;
                    v0a v0aVar2 = w0aVar3.K;
                    if (v0aVar2 != null && v0aVar2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((w0aVar3.getX() + w0aVar3.getMeasuredWidth()) - w0aVar3.K.getMeasuredWidth()), (int) ((w0aVar3.getY() + w0aVar3.getMeasuredHeight()) - w0aVar3.K.getMeasuredHeight()));
                        Drawable drawable2 = w0aVar3.F;
                        ImageReceiver imageReceiver2 = drawable2 instanceof wl ? ((wl) drawable2).k : w0aVar3.h;
                        v0a v0aVar3 = w0aVar3.K;
                        if (!v0aVar3.h) {
                            v0aVar3.setImageReceiver(imageReceiver2);
                        }
                        w0aVar3.K.draw(canvas2);
                        canvas2.restore();
                    }
                    if (w0aVar3.L != null) {
                        canvas2.save();
                        int L3 = hl.L(17.0f);
                        float f10 = L3;
                        canvas2.translate((int) ((w0aVar3.getX() + w0aVar3.getMeasuredWidth()) - f10), (int) ((w0aVar3.getY() + w0aVar3.getMeasuredHeight()) - f10));
                        w0aVar3.L.setBounds(0, 0, L3, L3);
                        w0aVar3.L.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != n1aVar.O1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ri5.c;
            if (runnable != null) {
                runnable.run();
                ri5.c = null;
            }
        }
    }

    @Override // d79
    public final void i1() {
        if (ri5.b(this)) {
            return;
        }
        super.i1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ri5.b(this) || this.k3) {
            return;
        }
        this.k3 = true;
        super.invalidate();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n1a n1aVar = this.m3;
        if (this == n1aVar.i0) {
            n1aVar.W0.I();
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n1a n1aVar = this.m3;
        if (this == n1aVar.i0) {
            n1aVar.W0.K();
        }
        A1(this.h3);
        A1(this.i3);
        A1(this.j3);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
