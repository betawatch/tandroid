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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ww9 extends o39 {
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public boolean k3;
    public final LongSparseArray l3;
    public final /* synthetic */ tx9 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww9(tx9 tx9Var, Context context) {
        super(context, null);
        this.m3 = tx9Var;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(gl.L(4.0f));
        zkb.l(this, 20, bkb.h6, this.o2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            ((vw9) arrayList.get(i)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((vl) r1).c() != false) goto L10;
     */
    @Override // o39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I0(View view, float f, float f2) {
        if (view instanceof dx9) {
            dx9 dx9Var = (dx9) view;
            if (!dx9Var.a) {
                Drawable drawable = dx9Var.F;
                if (drawable instanceof vl) {
                }
            }
            setSelectorDrawableColor(bm2.o(this.m3.g1, 30));
            return true;
        }
        zkb.l(this, 20, bkb.h6, this.o2);
        return true;
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        vw9 vw9Var;
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
            tx9 tx9Var = this.m3;
            int i2 = tx9Var.a0;
            int i3 = 14;
            if (i2 != 6 && i2 != 14 && i2 != 13) {
                Rect rect = this.F1;
                if (!rect.isEmpty()) {
                    this.C1.setBounds(rect);
                    canvas2.save();
                    vs2 vs2Var = this.n2;
                    if (vs2Var != null) {
                        vs2Var.accept(canvas2);
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
            boolean z3 = tx9Var.R1 > 0 && SystemClock.elapsedRealtime() - tx9Var.R1 < tx9Var.e() && tx9Var.O1 != null && tx9Var.P1 >= 0;
            if (this.l3 != null) {
                int i5 = 0;
                boolean z4 = false;
                while (i5 < getChildCount()) {
                    View childAt = getChildAt(i5);
                    if (childAt instanceof dx9) {
                        dx9 dx9Var = (dx9) childAt;
                        tx9 tx9Var2 = dx9Var.W;
                        int i6 = tx9Var2.a0;
                        if (dx9Var.isPressed()) {
                            float f3 = dx9Var.O;
                            if (f3 != 1.0f && i6 != i3) {
                                dx9Var.O = Utilities.i(f3 + 0.16f, 1.0f, 0.0f);
                                dx9Var.invalidate();
                            }
                        }
                        int i7 = dx9Var.c;
                        int y = tx9Var.y1 ? (int) childAt.getY() : childAt.getTop();
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(y);
                        canvas2.save();
                        canvas2.translate(dx9Var.getX(), dx9Var.getY());
                        if (dx9Var.x != null) {
                            vva collectionParticles = tx9Var.getCollectionParticles();
                            i = i5;
                            boolean z5 = z4;
                            collectionParticles.f(0, 0, dx9Var.getWidth(), dx9Var.getHeight());
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
                            canvas2.scale(f2, f, dx9Var.getWidth() / 2.0f, dx9Var.getHeight() / 2.0f);
                            canvas2.rotate((i7 % 4) * 90, dx9Var.getWidth() / 2.0f, dx9Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, dx9Var.x.intValue());
                            canvas2.restore();
                            z4 = z2;
                        } else {
                            i = i5;
                            view = childAt;
                        }
                        boolean z6 = dx9Var.M;
                        if ((z6 || dx9Var.N || dx9Var.T > 0.0f) && !dx9Var.b) {
                            if (z6 || dx9Var.N) {
                                float f4 = dx9Var.S;
                                if (f4 < 1.0f) {
                                    dx9Var.S = ((1000.0f / gl.r) / 240.0f) + f4;
                                    invalidate();
                                }
                            }
                            if (!dx9Var.M && !dx9Var.N) {
                                float f5 = dx9Var.S;
                                if (f5 > 0.0f) {
                                    dx9Var.S = f5 - ((1000.0f / gl.r) / 240.0f);
                                    invalidate();
                                }
                            }
                            dx9Var.T = Utilities.i(dx9Var.M ? s33.h.getInterpolation(dx9Var.S) : 1.0f - s33.h.getInterpolation(1.0f - dx9Var.S), 1.0f, 0.0f);
                            int L = gl.L(i6 == 6 ? 1.5f : 1.0f);
                            int L2 = gl.L(i6 == 6 ? 6.0f : 4.0f);
                            RectF rectF = gl.P;
                            rectF.set(0.0f, 0.0f, dx9Var.getMeasuredWidth(), dx9Var.getMeasuredHeight());
                            float f6 = L;
                            rectF.inset(f6, f6);
                            if (!dx9Var.a) {
                                Drawable drawable = dx9Var.F;
                                if (!(drawable instanceof vl) || !((vl) drawable).c()) {
                                    paint = tx9Var2.M;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (dx9Var.getAlpha() * alpha * dx9Var.T));
                                    float f7 = L2;
                                    canvas2.drawRoundRect(rectF, f7, f7, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = tx9Var2.N;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (dx9Var.getAlpha() * alpha2 * dx9Var.T));
                            float f72 = L2;
                            canvas2.drawRoundRect(rectF, f72, f72, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (dx9Var.getBackground() != null) {
                            dx9Var.getBackground().setBounds((int) dx9Var.getX(), (int) dx9Var.getY(), dx9Var.getWidth() + ((int) dx9Var.getX()), dx9Var.getHeight() + ((int) dx9Var.getY()));
                            dx9Var.getBackground().setAlpha((int) (dx9Var.getAlpha() * 255.0f));
                            dx9Var.getBackground().draw(canvas2);
                            dx9Var.getBackground().setAlpha(kk7.d4);
                        }
                        if (arrayList5 == null) {
                            arrayList3 = !arrayList.isEmpty() ? (ArrayList) tb4.l(1, arrayList) : new ArrayList();
                            sparseArray.put(y, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(dx9Var);
                        cx9 cx9Var = dx9Var.K;
                        if (cx9Var != null && cx9Var.getVisibility() == 0 && dx9Var.K.getImageReceiver() == null && (imageReceiver = dx9Var.r) != null) {
                            dx9Var.K.setImageReceiver(imageReceiver);
                        }
                    } else {
                        i = i5;
                        view = childAt;
                    }
                    boolean z7 = z4;
                    if (z3 && view != null && RecyclerView.R(view) == tx9Var.P1 - 1) {
                        float interpolation = s33.g.getInterpolation(moe.a((SystemClock.elapsedRealtime() - tx9Var.R1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f8 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (f8 * 255.0f), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f9 = (f8 * 0.5f) + 0.5f;
                            canvas2.scale(f9, f9, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            tx9Var.O1.draw(canvas2);
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
                dx9 dx9Var2 = (dx9) arrayList8.get(0);
                int R = RecyclerView.R(dx9Var2);
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList6.size()) {
                        vw9Var = null;
                        break;
                    } else {
                        if (((vw9) arrayList6.get(i9)).N == R) {
                            vw9Var = (vw9) arrayList6.get(i9);
                            arrayList6.remove(i9);
                            break;
                        }
                        i9++;
                    }
                }
                if (vw9Var == null) {
                    if (arrayList2.isEmpty()) {
                        vw9Var = new vw9(this);
                        vw9Var.l(7);
                    } else {
                        vw9Var = (vw9) tb4.l(1, arrayList2);
                    }
                    vw9Var.N = R;
                    vw9Var.e();
                }
                arrayList7.add(vw9Var);
                vw9Var.P = arrayList8;
                canvas2.save();
                canvas2.translate(dx9Var2.getLeft(), dx9Var2.getY());
                vw9Var.O = dx9Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (dx9Var2.getLeft() << 1);
                int measuredHeight = dx9Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    vw9Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i8++;
            }
            for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((vw9) arrayList6.get(i10));
                    ((vw9) arrayList6.get(i10)).P = null;
                    ((vw9) arrayList6.get(i10)).k();
                } else {
                    ((vw9) arrayList6.get(i10)).f();
                }
            }
            arrayList6.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt2 = getChildAt(i11);
                if (childAt2 instanceof dx9) {
                    dx9 dx9Var3 = (dx9) childAt2;
                    cx9 cx9Var2 = dx9Var3.K;
                    if (cx9Var2 != null && cx9Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((dx9Var3.getX() + dx9Var3.getMeasuredWidth()) - dx9Var3.K.getMeasuredWidth()), (int) ((dx9Var3.getY() + dx9Var3.getMeasuredHeight()) - dx9Var3.K.getMeasuredHeight()));
                        Drawable drawable2 = dx9Var3.F;
                        ImageReceiver imageReceiver2 = drawable2 instanceof vl ? ((vl) drawable2).k : dx9Var3.h;
                        cx9 cx9Var3 = dx9Var3.K;
                        if (!cx9Var3.h) {
                            cx9Var3.setImageReceiver(imageReceiver2);
                        }
                        dx9Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                    if (dx9Var3.L != null) {
                        canvas2.save();
                        int L3 = gl.L(17.0f);
                        float f10 = L3;
                        canvas2.translate((int) ((dx9Var3.getX() + dx9Var3.getMeasuredWidth()) - f10), (int) ((dx9Var3.getY() + dx9Var3.getMeasuredHeight()) - f10));
                        dx9Var3.L.setBounds(0, 0, L3, L3);
                        dx9Var3.L.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != tx9Var.O1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = pg5.c;
            if (runnable != null) {
                runnable.run();
                pg5.c = null;
            }
        }
    }

    @Override // o39
    public final void h1() {
        if (pg5.b(this)) {
            return;
        }
        super.h1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (pg5.b(this) || this.k3) {
            return;
        }
        this.k3 = true;
        super.invalidate();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tx9 tx9Var = this.m3;
        if (this == tx9Var.i0) {
            tx9Var.W0.I();
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tx9 tx9Var = this.m3;
        if (this == tx9Var.i0) {
            tx9Var.W0.K();
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
        if (pg5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }
}
