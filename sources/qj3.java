// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qj3 extends sl0 implements j6b {
    public static final /* synthetic */ int C3 = 0;
    public int A3;
    public final /* synthetic */ uj3 B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final tj3 n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public ji3 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public ibc z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj3(uj3 uj3Var, Context context, tj3 tj3Var) {
        super(context, null);
        this.B3 = uj3Var;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = tj3Var;
        this.i3 = hl.L(200.0f);
    }

    @Override // sl0
    public final int A1() {
        return hl.L(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r4.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(ji3 ji3Var, float f, boolean z) {
        uj3 uj3Var;
        ViewGroup viewGroup = ji3Var == null ? this.s3 : this;
        if (viewGroup == null) {
            this.s3 = ji3Var;
            return;
        }
        boolean z2 = false;
        of3 of3Var = null;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        of3 of3Var2 = null;
        while (true) {
            int childCount = viewGroup.getChildCount();
            uj3Var = this.B3;
            if (i >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof of3) {
                of3 of3Var3 = (of3) childAt;
                if (of3Var3.getDialogId() == uj3Var.H3.getCurrentFragmetDialogId()) {
                    of3Var = of3Var3;
                }
                if (childAt.getTop() >= 0 && of3Var3.getDialogId() != 0 && childAt.getTop() < i2) {
                    i2 = of3Var3.getTop();
                    of3Var2 = of3Var3;
                }
            }
            i++;
        }
        if (of3Var != null) {
            if (hl.L(70.0f) * getAdapter().b() > getMeasuredHeight()) {
            }
        }
        of3Var = of3Var2;
        this.s3 = ji3Var;
        if (of3Var != null) {
            if (ji3Var != null) {
                ji3Var.setPadding(getPaddingLeft(), this.g3, getPaddingLeft(), getPaddingBottom());
                int G = ((gk3) ji3Var.getAdapter()).G(of3Var.getDialogId());
                int top = (int) ((of3Var.getTop() - viewGroup.getPaddingTop()) + f);
                if (G >= 0) {
                    tj3 tj3Var = this.n3;
                    if (tj3Var.s == 0 && tj3Var.w == 2 && uj3Var.y3()) {
                        z2 = true;
                    }
                    int L = hl.L(xea.l1 ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (G * L)) - G;
                    if (z2) {
                        paddingTop += L;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((x46) ji3Var.getLayoutManager()).g1(G, top);
                }
            }
            int G2 = ((gk3) getAdapter()).G(of3Var.getDialogId());
            int top2 = of3Var.getTop() - viewGroup.getPaddingTop();
            if (z) {
                top2 -= (int) uj3Var.O;
            }
            if (G2 >= 0) {
                ((x46) getLayoutManager()).g1(G2, top2);
            }
        }
    }

    public final void D1(boolean z, of3 of3Var) {
        xea.m1 = !xea.m1;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("archiveHidden", xea.m1);
        edit.apply();
        uj3 uj3Var = this.B3;
        UndoView w3 = uj3Var.w3();
        if (!xea.m1) {
            w3.l(0L, 7, null, null);
            E1();
            if (!z || of3Var == null) {
                return;
            }
            of3Var.c0();
            of3Var.invalidate();
            return;
        }
        if (of3Var != null) {
            uj3Var.g2 = true;
            uj3Var.d1 = true;
            int top = (of3Var.getTop() - getPaddingTop()) + of3Var.getMeasuredHeight();
            if (uj3Var.L && !uj3Var.F0.g()) {
                uj3Var.S = true;
                top += hl.L(81.0f);
            }
            y0(0, top, k43.g);
            if (z) {
                uj3Var.f1 = true;
            } else {
                E1();
            }
        }
        w3.l(0L, 6, null, null);
    }

    public final void E1() {
        byte b = xea.m1 ? (byte) 2 : (byte) 0;
        tj3 tj3Var = this.n3;
        tj3Var.w = b;
        xh3 xh3Var = tj3Var.n;
        if (xh3Var != null) {
            xh3Var.X = b != 0;
        }
    }

    @Override // d79
    public final boolean H0(View view) {
        return !(view instanceof mf5) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setTranslationY(uj3.H4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // j6b
    public final void b(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.O);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02c4  */
    @Override // sl0, d79, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f;
        vnb vnbVar;
        int i;
        su7 su7Var;
        float f2;
        float f3;
        Paint paint2;
        LongSparseArray longSparseArray;
        float f4;
        boolean z;
        float f5;
        float f6;
        Paint paint3;
        vnb vnbVar2;
        float f7;
        int i2;
        int i3;
        of3 of3Var;
        int i4;
        of3 of3Var2;
        int i5;
        int i6;
        int i7;
        View view;
        int S;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f8 = this.p3;
        vnb vnbVar3 = this.o2;
        Paint paint4 = this.q3;
        boolean z2 = true;
        boolean z3 = false;
        if (f8 > 0.0f) {
            canvas2.clipRect(0, 0, hl.U1(this.p3, getMeasuredWidth(), hl.L(rm9.getRightPaddingSize())), getMeasuredHeight());
            paint4.setColor(aob.v0(aob.s9, vnbVar3));
            paint4.setAlpha((int) (paint4.getAlpha() * this.p3));
            canvas2.drawRect(0.0f, 0.0f, hl.L(rm9.getRightPaddingSize()), getMeasuredHeight(), paint4);
            paint = paint4;
            int alpha = aob.j0.getAlpha();
            aob.j0.setAlpha((int) (this.p3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(hl.L(rm9.getRightPaddingSize()), 0.0f, hl.L(rm9.getRightPaddingSize()) - 1, getMeasuredHeight(), aob.j0);
            aob.j0.setAlpha(alpha);
        } else {
            paint = paint4;
        }
        if (this.s3 != null) {
            if (this.t3 == null) {
                this.t3 = new LongSparseArray();
            }
            for (int i8 = 0; i8 < this.s3.getChildCount(); i8++) {
                View childAt = this.s3.getChildAt(i8);
                if ((childAt instanceof of3) && childAt.getBottom() > 0) {
                    this.t3.put(((of3) childAt).getDialogId(), childAt);
                }
            }
        }
        uj3 uj3Var = this.B3;
        float f9 = uj3Var.F ? 0.0f : uj3Var.O;
        int i9 = TLObject.FLAG_31;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        of3 of3Var3 = null;
        float f10 = 2.1474836E9f;
        float f11 = -2.1474836E9f;
        while (i11 < getChildCount()) {
            View childAt2 = getChildAt(i11);
            if (childAt2 instanceof of3) {
                of3 of3Var4 = (of3) childAt2;
                f7 = 1.0f;
                of3Var4.setRightFragmentOpenedProgress(this.p3);
                if (hl.O1()) {
                    vnbVar2 = vnbVar3;
                    of3Var4.setDialogSelected(of3Var4.getDialogId() == uj3Var.r2.a ? z2 : z3);
                } else {
                    vnbVar2 = vnbVar3;
                }
                LongSparseArray longSparseArray2 = this.t3;
                if (longSparseArray2 != null && this.s3 != null) {
                    View view2 = (View) longSparseArray2.get(of3Var4.getDialogId());
                    this.t3.delete(of3Var4.getDialogId());
                    if (view2 != null) {
                        this.s3.getClass();
                        int T = RecyclerView.T(view2);
                        if (T > i9) {
                            i9 = T;
                        }
                        if (T < i10) {
                            i10 = T;
                        }
                        of3Var4.D0 = ((getPaddingTop() + (view2.getTop() - this.s3.getPaddingTop())) - of3Var4.getTop()) * this.p3;
                        if (of3Var4.getTop() + of3Var4.D0 < f10) {
                            f10 = (of3Var4.getTop() + of3Var4.D0) - f9;
                        }
                        float U1 = hl.U1(this.p3, of3Var4.getMeasuredHeight(), view2.getMeasuredHeight()) + of3Var4.getTop() + of3Var4.D0;
                        if (U1 > f11) {
                            f11 = U1 - f9;
                        }
                    }
                }
                if (this.k3 && of3Var4.j0(0, true) && (S = RecyclerView.S(of3Var4)) >= 0) {
                    getAdapter().g(S);
                }
                if (of3Var4.getDialogId() == uj3Var.H3.getCurrentFragmetDialogId()) {
                    of3Var3 = of3Var4;
                    of3Var = of3Var3;
                } else {
                    of3Var = of3Var4;
                }
                i2 = i9;
                i3 = i10;
            } else {
                vnbVar2 = vnbVar3;
                f7 = 1.0f;
                i2 = i9;
                i3 = i10;
                of3Var = null;
            }
            if (this.s3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (of3Var != null) {
                    of3Var.n = -f9;
                    view = childAt2;
                    i4 = i11;
                    of3Var2 = of3Var3;
                    i5 = i2;
                    i6 = i3;
                    i7 = save;
                } else {
                    i5 = i2;
                    i7 = save;
                    i6 = i3;
                    of3Var2 = of3Var3;
                    i4 = i11;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f7 - this.p3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (of3Var != null && of3Var != of3Var2) {
                    of3Var.D0 = 0.0f;
                    of3Var.n = 0.0f;
                }
                canvas2.restoreToCount(i7);
            } else {
                i4 = i11;
                of3Var2 = of3Var3;
                i5 = i2;
                i6 = i3;
            }
            i11 = i4 + 1;
            of3Var3 = of3Var2;
            i9 = i5;
            vnbVar3 = vnbVar2;
            i10 = i6;
            z2 = true;
            z3 = false;
        }
        vnb vnbVar4 = vnbVar3;
        if (of3Var3 != null) {
            ImageReceiver imageReceiver = of3Var3.Z1;
            canvas2.save();
            this.v3 = of3Var3.getY() + of3Var3.D0 + imageReceiver.M0;
            of3Var3.D0 = 0.0f;
            of3Var3.n = 0.0f;
            float f12 = this.w3;
            if (f12 != 1.0f) {
                float f13 = f12 + 0.08f;
                this.w3 = f13;
                f4 = 1.0f;
                this.w3 = Utilities.i(f13, 1.0f, 0.0f);
                invalidate();
            } else {
                f4 = 1.0f;
            }
            float interpolation = k43.f.getInterpolation(this.w3);
            if (interpolation != f4) {
                float f14 = this.x3;
                if (f14 != -2.1474836E9f) {
                    if (Math.abs(f14 - this.v3) < getMeasuredHeight() * 0.4f) {
                        this.v3 = hl.R1(this.x3, this.v3, interpolation);
                    } else {
                        z = true;
                        if (this.y3 || !(z || this.x3 == -2.1474836E9f)) {
                            f5 = 1.0f;
                            interpolation = this.p3;
                        } else {
                            f5 = 1.0f;
                        }
                        f6 = f5 - interpolation;
                        if (f6 != f5) {
                            f = -2.1474836E9f;
                            this.v3 = -2.1474836E9f;
                        } else {
                            f = -2.1474836E9f;
                        }
                        float f15 = (-hl.L(5.0f)) * f6;
                        RectF rectF = hl.P;
                        rectF.set((-hl.L(4.0f)) + f15, this.v3 - hl.L(1.0f), hl.L(4.0f) + f15, this.v3 + imageReceiver.O0 + hl.L(1.0f));
                        paint3 = this.u3;
                        if (paint3 == null) {
                            paint3 = new Paint(1);
                            this.u3 = paint3;
                        }
                        vnbVar = vnbVar4;
                        paint3.setColor(aob.v0(aob.Fi, vnbVar));
                        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), this.u3);
                        canvas2.restore();
                    }
                }
            }
            z = false;
            if (this.y3) {
            }
            f5 = 1.0f;
            interpolation = this.p3;
            f6 = f5 - interpolation;
            if (f6 != f5) {
            }
            float f152 = (-hl.L(5.0f)) * f6;
            RectF rectF2 = hl.P;
            rectF2.set((-hl.L(4.0f)) + f152, this.v3 - hl.L(1.0f), hl.L(4.0f) + f152, this.v3 + imageReceiver.O0 + hl.L(1.0f));
            paint3 = this.u3;
            if (paint3 == null) {
            }
            vnbVar = vnbVar4;
            paint3.setColor(aob.v0(aob.Fi, vnbVar));
            canvas2.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), this.u3);
            canvas2.restore();
        } else {
            f = -2.1474836E9f;
            vnbVar = vnbVar4;
            this.v3 = -2.1474836E9f;
        }
        boolean z4 = false;
        if (this.t3 != null) {
            float f16 = 2.1474836E9f;
            for (int i12 = 0; i12 < this.t3.size(); i12++) {
                View view3 = (View) this.t3.valueAt(i12);
                this.s3.getClass();
                int T2 = RecyclerView.T(view3);
                if (T2 < i10 && view3.getTop() > f) {
                    f = view3.getTop();
                }
                if (T2 > i9 && view3.getBottom() < f16) {
                    f16 = view3.getBottom();
                }
            }
            int i13 = 0;
            while (true) {
                int size = this.t3.size();
                longSparseArray = this.t3;
                if (i13 >= size) {
                    break;
                }
                View view4 = (View) longSparseArray.valueAt(i13);
                if (view4 instanceof of3) {
                    this.s3.getClass();
                    int T3 = RecyclerView.T(view4);
                    of3 of3Var5 = (of3) view4;
                    of3Var5.k0 = false;
                    of3Var5.C();
                    of3Var5.k0 = true;
                    of3Var5.setRightFragmentOpenedProgress(this.p3);
                    int save2 = canvas2.save();
                    if (T3 > i9) {
                        canvas2.translate(view4.getX(), (f11 + view4.getBottom()) - f16);
                    } else {
                        canvas2.translate(view4.getX(), (f11 + view4.getTop()) - f);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(save2);
                }
                i13++;
            }
            longSparseArray.clear();
            z4 = false;
        }
        this.k3 = z4;
        if (this.s3 != null) {
            invalidate();
        }
        if (this.s3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint.setColor(aob.v0(aob.d6, vnbVar));
            int i14 = 0;
            while (i14 < getChildCount()) {
                View childAt3 = getChildAt(i14);
                if (((childAt3 instanceof of3) && ((of3) childAt3).r) || ((childAt3 instanceof fk3) && ((fk3) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x = childAt3.getX();
                        float y = childAt3.getY();
                        float x2 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y2 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.r3;
                        rectF3.set(x, y, x2, y2);
                        canvas2.saveLayerAlpha(rectF3, (int) (childAt3.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    canvas2.translate(childAt3.getX(), childAt3.getY());
                    paint2 = paint;
                    canvas2.drawRect(0.0f, 0.0f, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight(), paint2);
                    childAt3.draw(canvas2);
                    canvas2.restore();
                } else {
                    paint2 = paint;
                }
                i14++;
                paint = paint2;
            }
            invalidate();
        }
        of3 of3Var6 = uj3Var.Y0;
        if (of3Var6 != null && (su7Var = uj3Var.X0) != null) {
            int measuredHeight = (uj3Var.Y0.getMeasuredHeight() / 2) + of3Var6.getTop();
            Paint paint5 = su7Var.b;
            View view5 = su7Var.c;
            RectF rectF4 = su7Var.f;
            Paint paint6 = su7Var.a;
            int L = hl.L(110.0f);
            int L2 = hl.L(xea.l1 ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * su7Var.h) - uh9.y(62.0f, 3, L);
            int i15 = L / 2;
            int i16 = measuredHeight - i15;
            paint6.setColor(aob.w0(null, aob.d6, false));
            int i17 = L2 / 2;
            float f17 = measuredHeight - i17;
            float f18 = i15 + measuredWidth;
            float f19 = i17 + measuredHeight + 1;
            canvas.drawRect(0.0f, f17, f18, f19, paint6);
            paint6.setColor(-69120);
            float f20 = L + measuredWidth;
            rectF4.set(measuredWidth, i16, f20, i16 + L);
            float f21 = su7Var.g;
            float f22 = 35.0f;
            int e = (int) (f21 < 0.5f ? uh9.e(f21, 0.5f, 1.0f, 35.0f) : ((f21 - 0.5f) * 35.0f) / 0.5f);
            float f23 = e;
            float f24 = 360 - (e << 1);
            canvas.drawArc(rectF4, f23, f24, true, paint5);
            canvas.drawArc(rectF4, f23, f24, true, paint6);
            paint6.setColor(-16777216);
            float f25 = 8.0f;
            canvas.drawCircle(f18 - hl.L(8.0f), (L / 4) + i16, hl.L(8.0f), paint6);
            canvas.save();
            float f26 = 20.0f;
            canvas.translate(hl.L(20.0f) + f20, measuredHeight - hl.L(25.0f));
            int i18 = 0;
            for (int i19 = 3; i18 < i19; i19 = 3) {
                Path path = su7Var.j;
                float f27 = f25;
                if (path != null) {
                    f2 = f26;
                    if (su7Var.k == su7Var.l) {
                        f3 = f22;
                        canvas.drawPath(su7Var.j, paint5);
                        if (i18 != 0) {
                            paint6.setColor(-90112);
                        } else if (i18 == 1) {
                            paint6.setColor(-85326);
                        } else {
                            paint6.setColor(-16720161);
                        }
                        canvas.drawPath(su7Var.j, paint6);
                        paint6.setColor(-1);
                        rectF4.set(hl.L(f27), hl.L(14.0f), hl.L(f2), hl.L(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(hl.L(24.0f), hl.L(14.0f), hl.L(36.0f), hl.L(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        paint6.setColor(-16777216);
                        rectF4.set(hl.L(14.0f), hl.L(18.0f), hl.L(19.0f), hl.L(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(hl.L(30.0f), hl.L(18.0f), hl.L(f3), hl.L(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        canvas.translate(hl.L(62.0f), 0.0f);
                        i18++;
                        f22 = f3;
                        f25 = f27;
                        f26 = f2;
                    }
                } else {
                    f2 = f26;
                    path = new Path();
                    su7Var.j = path;
                }
                path.reset();
                boolean z5 = su7Var.k;
                su7Var.l = z5;
                Path path2 = su7Var.j;
                if (z5) {
                    path2.moveTo(0.0f, hl.L(50.0f));
                    su7Var.j.lineTo(0.0f, hl.L(24.0f));
                    rectF4.set(0.0f, 0.0f, hl.L(42.0f), hl.L(24.0f));
                    su7Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    su7Var.j.lineTo(hl.L(42.0f), hl.L(50.0f));
                    su7Var.j.lineTo(hl.L(r4), hl.L(43.0f));
                    su7Var.j.lineTo(hl.L(28.0f), hl.L(50.0f));
                    su7Var.j.lineTo(hl.L(21.0f), hl.L(43.0f));
                    su7Var.j.lineTo(hl.L(14.0f), hl.L(50.0f));
                    su7Var.j.lineTo(hl.L(7.0f), hl.L(43.0f));
                    f3 = f22;
                } else {
                    f3 = f22;
                    path2.moveTo(0.0f, hl.L(43.0f));
                    su7Var.j.lineTo(0.0f, hl.L(24.0f));
                    rectF4.set(0.0f, 0.0f, hl.L(42.0f), hl.L(24.0f));
                    su7Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    su7Var.j.lineTo(hl.L(42.0f), hl.L(43.0f));
                    su7Var.j.lineTo(hl.L(f3), hl.L(50.0f));
                    su7Var.j.lineTo(hl.L(28.0f), hl.L(43.0f));
                    su7Var.j.lineTo(hl.L(21.0f), hl.L(50.0f));
                    su7Var.j.lineTo(hl.L(14.0f), hl.L(43.0f));
                    su7Var.j.lineTo(hl.L(7.0f), hl.L(50.0f));
                }
                su7Var.j.close();
                canvas.drawPath(su7Var.j, paint5);
                if (i18 != 0) {
                }
                canvas.drawPath(su7Var.j, paint6);
                paint6.setColor(-1);
                rectF4.set(hl.L(f27), hl.L(14.0f), hl.L(f2), hl.L(28.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(hl.L(24.0f), hl.L(14.0f), hl.L(36.0f), hl.L(28.0f));
                canvas.drawOval(rectF4, paint6);
                paint6.setColor(-16777216);
                rectF4.set(hl.L(14.0f), hl.L(18.0f), hl.L(19.0f), hl.L(24.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(hl.L(30.0f), hl.L(18.0f), hl.L(f3), hl.L(24.0f));
                canvas.drawOval(rectF4, paint6);
                canvas.translate(hl.L(62.0f), 0.0f);
                i18++;
                f22 = f3;
                f25 = f27;
                f26 = f2;
            }
            canvas.restore();
            if (su7Var.h >= 1.0f) {
                su7Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - su7Var.e;
            su7Var.e = currentTimeMillis;
            if (j > 17) {
                j = 17;
            }
            float f28 = su7Var.g;
            if (f28 >= 1.0f) {
                su7Var.g = 0.0f;
                f28 = 0.0f;
            }
            float f29 = j;
            float f30 = (f29 / 400.0f) + f28;
            su7Var.g = f30;
            if (f30 > 1.0f) {
                su7Var.g = 1.0f;
            }
            float f31 = (f29 / 2000.0f) + su7Var.h;
            su7Var.h = f31;
            if (f31 > 1.0f) {
                su7Var.h = 1.0f;
            }
            float f32 = (f29 / 200.0f) + su7Var.i;
            su7Var.i = f32;
            if (f32 >= 1.0f) {
                su7Var.k = !su7Var.k;
                su7Var.i = 0.0f;
            }
            view5.invalidate();
        }
        ibc ibcVar = this.z3;
        if (ibcVar == null) {
            i = ((e) uj3Var).currentAccount;
            ibc[] ibcVarArr = ibc.f;
            if (ibcVarArr[i] == null) {
                ibcVarArr[i] = new ibc(i);
            }
            ibcVar = ibcVarArr[i];
            this.z3 = ibcVar;
        }
        ibcVar.a(this);
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.B3.O) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // sl0, d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof of3) && ((of3) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public float getViewOffset() {
        return uj3.H4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        tj3 tj3Var = this.n3;
        if (tj3Var.n != null && uj3.H4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            tj3Var.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.W1) {
            return false;
        }
        uj3 uj3Var = this.B3;
        if (uj3Var.d1 || this.n3.y.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            aVar = ((e) uj3Var).actionBar;
            uj3Var.e1 = !aVar.z();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o3 = getPaddingTop();
        this.B3.A3 = 0.0f;
        this.n3.getClass();
    }

    @Override // sl0, d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        tj3[] tj3VarArr;
        AnimatorSet animatorSet;
        tj3 tj3Var = this.n3;
        int K0 = tj3Var.c.K0();
        uj3 uj3Var = this.B3;
        if (K0 != -1 && tj3Var.e.E == 0 && tj3Var.c.y < 0 && tj3Var.a.getScrollState() != 1) {
            f89 L = tj3Var.a.L(K0);
            if (L == null) {
                L = tj3Var.a.M(K0, false);
            }
            if (L != null) {
                int top = L.a.getTop();
                if (tj3Var.s == 0 && uj3Var.y3() && tj3Var.w == 2) {
                    K0 = Math.max(1, K0);
                }
                this.m3 = true;
                tj3Var.c.g1(K0, (int) ((top - this.o3) + uj3Var.A3 + 0.0f));
                this.m3 = false;
            }
        } else if (K0 == -1 && this.l3) {
            tj3Var.c.g1((tj3Var.s == 0 && uj3Var.y3()) ? 1 : 0, (int) uj3Var.O);
        }
        this.m3 = true;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((e) uj3Var).actionBar;
        int i3 = currentActionBarHeight + (aVar.getOccupyStatusBar() ? hl.m : 0);
        if (uj3Var.L && !uj3Var.P) {
            i3 += hl.L(81.0f);
        }
        if (!uj3Var.P) {
            i3 += hl.L(48.0f);
        }
        this.A3 = 0;
        float p3 = uj3Var.p3(false);
        xj3 xj3Var = uj3Var.L1;
        float f = xj3Var != null ? xj3Var.getMetadata().c.a : 0.0f;
        float L2 = hl.L(50.0f);
        ij3 ij3Var = uj3Var.A0;
        int unreadOnlyBannerHeight = (int) ((L2 + (ij3Var != null ? ij3Var.getUnreadOnlyBannerHeight() : 0.0f)) * p3);
        int i4 = i3 + unreadOnlyBannerHeight;
        this.A3 += unreadOnlyBannerHeight;
        xj3 xj3Var2 = uj3Var.L1;
        if (xj3Var2 != null) {
            int c = (int) xj3Var2.c(hl.R1(hl.L(14.0f), hl.L(7.0f), p3));
            i4 += c;
            this.A3 += c;
        }
        int L3 = i4 - hl.L(Math.max(p3, f) * 5.0f);
        this.A3 -= hl.L(Math.max(p3, f) * 5.0f);
        int F2 = uj3Var.F2();
        if (L3 != this.g3 || F2 != getPaddingBottom()) {
            setTopGlowOffset(L3);
            setPadding(0, L3, 0, F2);
            boolean z = uj3Var.L;
            tk4 tk4Var = tj3Var.x;
            if (z) {
                tk4Var.setPaddingTop(L3 - hl.L(81.0f));
            } else {
                tk4Var.setPaddingTop(L3);
            }
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (getChildAt(i5) instanceof fk3) {
                    getChildAt(i5).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && uj3Var.getMessagesController().R1) {
            if (tj3Var.s == 0 && uj3Var.y3()) {
                this.m3 = true;
                ((x46) getLayoutManager()).g1(1, (int) uj3Var.O);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i, i2);
        if (uj3Var.n2 || L3 == 0 || (tj3VarArr = uj3Var.f0) == null || tj3VarArr.length <= 1 || uj3Var.o3 || (animatorSet = uj3Var.i3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f89 f89Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!this.W1) {
            uj3 uj3Var = this.B3;
            if (!uj3Var.d1 && !uj3Var.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                tj3 tj3Var = this.n3;
                if (action == 1 || action == 3) {
                    lu5 lu5Var = tj3Var.e;
                    if (lu5Var.E != 0) {
                        sj3 sj3Var = tj3Var.f;
                        if (sj3Var.f) {
                            sj3Var.g = true;
                            if (lu5Var.i(null, 4) != 0 && (f89Var = tj3Var.f.e) != null) {
                                View view = f89Var.a;
                                if (view instanceof of3) {
                                    of3 of3Var = (of3) view;
                                    long dialogId = of3Var.getDialogId();
                                    if (wf3.C(dialogId)) {
                                        D1(false, of3Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (xc2.Y(uj3Var.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                uj3Var.K4(arrayList, jn7.v1, true, false, null);
                                            } else {
                                                i = ((e) uj3Var).currentAccount;
                                                if (xea.m(i) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    uj3Var.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    uj3Var.K4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i2 = ((e) uj3Var).currentAccount;
                                                    if (xea.m(i2) != 3) {
                                                        i3 = ((e) uj3Var).currentAccount;
                                                        if (xea.m(i3) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            uj3Var.Q2 = !uj3Var.H3(dialog) ? 1 : 0;
                                                            uj3Var.K4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i4 = ((e) uj3Var).currentAccount;
                                                            if (xea.m(i4) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                uj3Var.K4(arrayList4, jn7.m1, true, false, null);
                                                            }
                                                        }
                                                    } else if (uj3Var.getMessagesController().p2(dialogId, 0L, null)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i5 = ((e) uj3Var).currentAccount;
                                                        uj3Var.R2 = !uc7.s1(i5).p2(dialogId, 0L, null) ? 1 : 0;
                                                        uj3Var.S2 = uj3Var.R2 > 0 ? 0 : 1;
                                                        uj3Var.K4(arrayList5, jn7.o1, true, false, null);
                                                    } else {
                                                        ip7.n(yac.t0).T(dialogId, 3, 0L);
                                                        if (d31.a(uj3Var)) {
                                                            d31.z(uj3Var, 3, 0, null).j();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (tj3Var.s == 0 && ((action == 1 || action == 3) && tj3Var.w == 2 && uj3Var.y3() && ((x46) getLayoutManager()).K0() == 0)) {
                    int paddingTop = getPaddingTop();
                    of3 n3 = uj3.n3(tj3Var);
                    if (n3 != null) {
                        int L = (int) (hl.L(xea.l1 ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = n3.getMeasuredHeight() + (n3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - uj3Var.f3;
                        if (measuredHeight < L || currentTimeMillis < 200) {
                            uj3Var.g2 = true;
                            y0(0, measuredHeight, k43.h);
                            i6 = 2;
                            tj3Var.w = (byte) 2;
                        } else {
                            if (tj3Var.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    uj3Var.g2 = true;
                                    y0(0, n3.getTop() - paddingTop, k43.h);
                                }
                                if (!uj3Var.h3) {
                                    uj3Var.h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    xh3 xh3Var = tj3Var.n;
                                    if (xh3Var != null) {
                                        xh3Var.a(true);
                                    }
                                }
                                n3.i0();
                                tj3Var.w = (byte) 1;
                                if (hl.A1()) {
                                    hl.g2(ob6.M0(2131754919, null));
                                }
                            }
                            i6 = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i6];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new az1(this, (byte) 17));
                            ofFloat.setDuration(Math.max(100L, (long) uh9.x(getViewOffset(), hl.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(k43.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new cn2(this, (byte) 10));
                            ofFloat.start();
                        }
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // sl0, d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m3) {
            return;
        }
        super.requestLayout();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(j79 j79Var) {
        super.setAdapter(j79Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f) {
        this.p3 = f;
        invalidate();
    }

    public void setViewsOffset(float f) {
        View m;
        uj3.H4 = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setTranslationY(f);
        }
        if (this.D1 != -1 && (m = getLayoutManager().m(this.D1)) != null) {
            int left = m.getLeft();
            int top = (int) (m.getTop() + f);
            int right = m.getRight();
            int bottom = (int) (m.getBottom() + f);
            Rect rect = this.F1;
            rect.set(left, top, right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }

    @Override // d79
    public final boolean x1() {
        return true;
    }
}
