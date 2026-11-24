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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yi3 extends rl0 implements n2b {
    public static final /* synthetic */ int C3 = 0;
    public int A3;
    public final /* synthetic */ cj3 B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final bj3 n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public ph3 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public i7c z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi3(cj3 cj3Var, Context context, bj3 bj3Var) {
        super(context, null);
        this.B3 = cj3Var;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = bj3Var;
        this.i3 = gl.L(200.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r4.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(ph3 ph3Var, float f, boolean z) {
        cj3 cj3Var;
        ViewGroup viewGroup = ph3Var == null ? this.s3 : this;
        if (viewGroup == null) {
            this.s3 = ph3Var;
            return;
        }
        boolean z2 = false;
        ue3 ue3Var = null;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        ue3 ue3Var2 = null;
        while (true) {
            int childCount = viewGroup.getChildCount();
            cj3Var = this.B3;
            if (i >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ue3) {
                ue3 ue3Var3 = (ue3) childAt;
                if (ue3Var3.getDialogId() == cj3Var.H3.getCurrentFragmetDialogId()) {
                    ue3Var = ue3Var3;
                }
                if (childAt.getTop() >= 0 && ue3Var3.getDialogId() != 0 && childAt.getTop() < i2) {
                    i2 = ue3Var3.getTop();
                    ue3Var2 = ue3Var3;
                }
            }
            i++;
        }
        if (ue3Var != null) {
            if (gl.L(70.0f) * getAdapter().b() > getMeasuredHeight()) {
            }
        }
        ue3Var = ue3Var2;
        this.s3 = ph3Var;
        if (ue3Var != null) {
            if (ph3Var != null) {
                ph3Var.setPadding(getPaddingLeft(), this.g3, getPaddingLeft(), getPaddingBottom());
                int G = ((oj3) ph3Var.getAdapter()).G(ue3Var.getDialogId());
                int top = (int) ((ue3Var.getTop() - viewGroup.getPaddingTop()) + f);
                if (G >= 0) {
                    bj3 bj3Var = this.n3;
                    if (bj3Var.s == 0 && bj3Var.w == 2 && cj3Var.w3()) {
                        z2 = true;
                    }
                    int L = gl.L(gba.l1 ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (G * L)) - G;
                    if (z2) {
                        paddingTop += L;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((t26) ph3Var.getLayoutManager()).g1(G, top);
                }
            }
            int G2 = ((oj3) getAdapter()).G(ue3Var.getDialogId());
            int top2 = ue3Var.getTop() - viewGroup.getPaddingTop();
            if (z) {
                top2 -= (int) cj3Var.O;
            }
            if (G2 >= 0) {
                ((t26) getLayoutManager()).g1(G2, top2);
            }
        }
    }

    public final void C1(boolean z, ue3 ue3Var) {
        gba.m1 = !gba.m1;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("archiveHidden", gba.m1);
        edit.apply();
        cj3 cj3Var = this.B3;
        UndoView u3 = cj3Var.u3();
        if (!gba.m1) {
            u3.l(0L, 7, null, null);
            D1();
            if (!z || ue3Var == null) {
                return;
            }
            ue3Var.d0();
            ue3Var.invalidate();
            return;
        }
        if (ue3Var != null) {
            cj3Var.g2 = true;
            cj3Var.d1 = true;
            int top = (ue3Var.getTop() - getPaddingTop()) + ue3Var.getMeasuredHeight();
            if (cj3Var.L && !cj3Var.F0.g()) {
                cj3Var.S = true;
                top += gl.L(81.0f);
            }
            x0(0, top, s33.g);
            if (z) {
                cj3Var.f1 = true;
            } else {
                D1();
            }
        }
        u3.l(0L, 6, null, null);
    }

    public final void D1() {
        byte b = gba.m1 ? (byte) 2 : (byte) 0;
        bj3 bj3Var = this.n3;
        bj3Var.w = b;
        dh3 dh3Var = bj3Var.n;
        if (dh3Var != null) {
            dh3Var.X = b != 0;
        }
    }

    @Override // o39
    public final boolean G0(View view) {
        return !(view instanceof ld5) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setTranslationY(cj3.F4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // n2b
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
    @Override // rl0, o39, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f;
        wjb wjbVar;
        int i;
        mr7 mr7Var;
        float f2;
        float f3;
        Paint paint2;
        LongSparseArray longSparseArray;
        float f4;
        boolean z;
        float f5;
        float f6;
        Paint paint3;
        wjb wjbVar2;
        float f7;
        int i2;
        int i3;
        ue3 ue3Var;
        int i4;
        ue3 ue3Var2;
        int i5;
        int i6;
        int i7;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f8 = this.p3;
        wjb wjbVar3 = this.o2;
        Paint paint4 = this.q3;
        boolean z2 = true;
        boolean z3 = false;
        if (f8 > 0.0f) {
            canvas2.clipRect(0, 0, gl.U1(this.p3, getMeasuredWidth(), gl.L(dj9.getRightPaddingSize())), getMeasuredHeight());
            paint4.setColor(bkb.v0(bkb.r9, wjbVar3));
            paint4.setAlpha((int) (paint4.getAlpha() * this.p3));
            canvas2.drawRect(0.0f, 0.0f, gl.L(dj9.getRightPaddingSize()), getMeasuredHeight(), paint4);
            paint = paint4;
            int alpha = bkb.j0.getAlpha();
            bkb.j0.setAlpha((int) (this.p3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(gl.L(dj9.getRightPaddingSize()), 0.0f, gl.L(dj9.getRightPaddingSize()) - 1, getMeasuredHeight(), bkb.j0);
            bkb.j0.setAlpha(alpha);
        } else {
            paint = paint4;
        }
        if (this.s3 != null) {
            if (this.t3 == null) {
                this.t3 = new LongSparseArray();
            }
            for (int i8 = 0; i8 < this.s3.getChildCount(); i8++) {
                View childAt = this.s3.getChildAt(i8);
                if ((childAt instanceof ue3) && childAt.getBottom() > 0) {
                    this.t3.put(((ue3) childAt).getDialogId(), childAt);
                }
            }
        }
        cj3 cj3Var = this.B3;
        float f9 = cj3Var.F ? 0.0f : cj3Var.O;
        int i9 = TLObject.FLAG_31;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        ue3 ue3Var3 = null;
        float f10 = 2.1474836E9f;
        float f11 = -2.1474836E9f;
        while (i11 < getChildCount()) {
            View childAt2 = getChildAt(i11);
            if (childAt2 instanceof ue3) {
                ue3 ue3Var4 = (ue3) childAt2;
                f7 = 1.0f;
                ue3Var4.setRightFragmentOpenedProgress(this.p3);
                if (gl.O1()) {
                    wjbVar2 = wjbVar3;
                    ue3Var4.setDialogSelected(ue3Var4.getDialogId() == cj3Var.r2.a ? z2 : z3);
                } else {
                    wjbVar2 = wjbVar3;
                }
                LongSparseArray longSparseArray2 = this.t3;
                if (longSparseArray2 != null && this.s3 != null) {
                    View view2 = (View) longSparseArray2.get(ue3Var4.getDialogId());
                    this.t3.delete(ue3Var4.getDialogId());
                    if (view2 != null) {
                        this.s3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i9) {
                            i9 = S;
                        }
                        if (S < i10) {
                            i10 = S;
                        }
                        ue3Var4.D0 = ((getPaddingTop() + (view2.getTop() - this.s3.getPaddingTop())) - ue3Var4.getTop()) * this.p3;
                        if (ue3Var4.getTop() + ue3Var4.D0 < f10) {
                            f10 = (ue3Var4.getTop() + ue3Var4.D0) - f9;
                        }
                        float U1 = gl.U1(this.p3, ue3Var4.getMeasuredHeight(), view2.getMeasuredHeight()) + ue3Var4.getTop() + ue3Var4.D0;
                        if (U1 > f11) {
                            f11 = U1 - f9;
                        }
                    }
                }
                if (this.k3 && ue3Var4.k0(0, true) && (R = RecyclerView.R(ue3Var4)) >= 0) {
                    getAdapter().g(R);
                }
                if (ue3Var4.getDialogId() == cj3Var.H3.getCurrentFragmetDialogId()) {
                    ue3Var3 = ue3Var4;
                    ue3Var = ue3Var3;
                } else {
                    ue3Var = ue3Var4;
                }
                i2 = i9;
                i3 = i10;
            } else {
                wjbVar2 = wjbVar3;
                f7 = 1.0f;
                i2 = i9;
                i3 = i10;
                ue3Var = null;
            }
            if (this.s3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (ue3Var != null) {
                    ue3Var.n = -f9;
                    view = childAt2;
                    i4 = i11;
                    ue3Var2 = ue3Var3;
                    i5 = i2;
                    i6 = i3;
                    i7 = save;
                } else {
                    i5 = i2;
                    i7 = save;
                    i6 = i3;
                    ue3Var2 = ue3Var3;
                    i4 = i11;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f7 - this.p3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (ue3Var != null && ue3Var != ue3Var2) {
                    ue3Var.D0 = 0.0f;
                    ue3Var.n = 0.0f;
                }
                canvas2.restoreToCount(i7);
            } else {
                i4 = i11;
                ue3Var2 = ue3Var3;
                i5 = i2;
                i6 = i3;
            }
            i11 = i4 + 1;
            ue3Var3 = ue3Var2;
            i9 = i5;
            wjbVar3 = wjbVar2;
            i10 = i6;
            z2 = true;
            z3 = false;
        }
        wjb wjbVar4 = wjbVar3;
        if (ue3Var3 != null) {
            ImageReceiver imageReceiver = ue3Var3.Z1;
            canvas2.save();
            this.v3 = ue3Var3.getY() + ue3Var3.D0 + imageReceiver.M0;
            ue3Var3.D0 = 0.0f;
            ue3Var3.n = 0.0f;
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
            float interpolation = s33.f.getInterpolation(this.w3);
            if (interpolation != f4) {
                float f14 = this.x3;
                if (f14 != -2.1474836E9f) {
                    if (Math.abs(f14 - this.v3) < getMeasuredHeight() * 0.4f) {
                        this.v3 = gl.R1(this.x3, this.v3, interpolation);
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
                        float f15 = (-gl.L(5.0f)) * f6;
                        RectF rectF = gl.P;
                        rectF.set((-gl.L(4.0f)) + f15, this.v3 - gl.L(1.0f), gl.L(4.0f) + f15, this.v3 + imageReceiver.O0 + gl.L(1.0f));
                        paint3 = this.u3;
                        if (paint3 == null) {
                            paint3 = new Paint(1);
                            this.u3 = paint3;
                        }
                        wjbVar = wjbVar4;
                        paint3.setColor(bkb.v0(bkb.Ei, wjbVar));
                        canvas2.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), this.u3);
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
            float f152 = (-gl.L(5.0f)) * f6;
            RectF rectF2 = gl.P;
            rectF2.set((-gl.L(4.0f)) + f152, this.v3 - gl.L(1.0f), gl.L(4.0f) + f152, this.v3 + imageReceiver.O0 + gl.L(1.0f));
            paint3 = this.u3;
            if (paint3 == null) {
            }
            wjbVar = wjbVar4;
            paint3.setColor(bkb.v0(bkb.Ei, wjbVar));
            canvas2.drawRoundRect(rectF2, gl.L(4.0f), gl.L(4.0f), this.u3);
            canvas2.restore();
        } else {
            f = -2.1474836E9f;
            wjbVar = wjbVar4;
            this.v3 = -2.1474836E9f;
        }
        boolean z4 = false;
        if (this.t3 != null) {
            float f16 = 2.1474836E9f;
            for (int i12 = 0; i12 < this.t3.size(); i12++) {
                View view3 = (View) this.t3.valueAt(i12);
                this.s3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i10 && view3.getTop() > f) {
                    f = view3.getTop();
                }
                if (S2 > i9 && view3.getBottom() < f16) {
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
                if (view4 instanceof ue3) {
                    this.s3.getClass();
                    int S3 = RecyclerView.S(view4);
                    ue3 ue3Var5 = (ue3) view4;
                    ue3Var5.k0 = false;
                    ue3Var5.z();
                    ue3Var5.k0 = true;
                    ue3Var5.setRightFragmentOpenedProgress(this.p3);
                    int save2 = canvas2.save();
                    if (S3 > i9) {
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
            paint.setColor(bkb.v0(bkb.c6, wjbVar));
            int i14 = 0;
            while (i14 < getChildCount()) {
                View childAt3 = getChildAt(i14);
                if (((childAt3 instanceof ue3) && ((ue3) childAt3).r) || ((childAt3 instanceof nj3) && ((nj3) childAt3).a)) {
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
        ue3 ue3Var6 = cj3Var.Y0;
        if (ue3Var6 != null && (mr7Var = cj3Var.X0) != null) {
            int measuredHeight = (cj3Var.Y0.getMeasuredHeight() / 2) + ue3Var6.getTop();
            Paint paint5 = mr7Var.b;
            View view5 = mr7Var.c;
            RectF rectF4 = mr7Var.f;
            Paint paint6 = mr7Var.a;
            int L = gl.L(110.0f);
            int L2 = gl.L(gba.l1 ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * mr7Var.h) - de9.y(62.0f, 3, L);
            int i15 = L / 2;
            int i16 = measuredHeight - i15;
            paint6.setColor(bkb.w0(null, bkb.c6, false));
            int i17 = L2 / 2;
            float f17 = measuredHeight - i17;
            float f18 = i15 + measuredWidth;
            float f19 = i17 + measuredHeight + 1;
            canvas.drawRect(0.0f, f17, f18, f19, paint6);
            paint6.setColor(-69120);
            float f20 = L + measuredWidth;
            rectF4.set(measuredWidth, i16, f20, i16 + L);
            float f21 = mr7Var.g;
            float f22 = 35.0f;
            int e = (int) (f21 < 0.5f ? de9.e(f21, 0.5f, 1.0f, 35.0f) : ((f21 - 0.5f) * 35.0f) / 0.5f);
            float f23 = e;
            float f24 = 360 - (e << 1);
            canvas.drawArc(rectF4, f23, f24, true, paint5);
            canvas.drawArc(rectF4, f23, f24, true, paint6);
            paint6.setColor(-16777216);
            float f25 = 8.0f;
            canvas.drawCircle(f18 - gl.L(8.0f), (L / 4) + i16, gl.L(8.0f), paint6);
            canvas.save();
            float f26 = 20.0f;
            canvas.translate(gl.L(20.0f) + f20, measuredHeight - gl.L(25.0f));
            int i18 = 0;
            for (int i19 = 3; i18 < i19; i19 = 3) {
                Path path = mr7Var.j;
                float f27 = f25;
                if (path != null) {
                    f2 = f26;
                    if (mr7Var.k == mr7Var.l) {
                        f3 = f22;
                        canvas.drawPath(mr7Var.j, paint5);
                        if (i18 != 0) {
                            paint6.setColor(-90112);
                        } else if (i18 == 1) {
                            paint6.setColor(-85326);
                        } else {
                            paint6.setColor(-16720161);
                        }
                        canvas.drawPath(mr7Var.j, paint6);
                        paint6.setColor(-1);
                        rectF4.set(gl.L(f27), gl.L(14.0f), gl.L(f2), gl.L(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(gl.L(24.0f), gl.L(14.0f), gl.L(36.0f), gl.L(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        paint6.setColor(-16777216);
                        rectF4.set(gl.L(14.0f), gl.L(18.0f), gl.L(19.0f), gl.L(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(gl.L(30.0f), gl.L(18.0f), gl.L(f3), gl.L(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        canvas.translate(gl.L(62.0f), 0.0f);
                        i18++;
                        f22 = f3;
                        f25 = f27;
                        f26 = f2;
                    }
                } else {
                    f2 = f26;
                    path = new Path();
                    mr7Var.j = path;
                }
                path.reset();
                boolean z5 = mr7Var.k;
                mr7Var.l = z5;
                Path path2 = mr7Var.j;
                if (z5) {
                    path2.moveTo(0.0f, gl.L(50.0f));
                    mr7Var.j.lineTo(0.0f, gl.L(24.0f));
                    rectF4.set(0.0f, 0.0f, gl.L(42.0f), gl.L(24.0f));
                    mr7Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    mr7Var.j.lineTo(gl.L(42.0f), gl.L(50.0f));
                    mr7Var.j.lineTo(gl.L(r4), gl.L(43.0f));
                    mr7Var.j.lineTo(gl.L(28.0f), gl.L(50.0f));
                    mr7Var.j.lineTo(gl.L(21.0f), gl.L(43.0f));
                    mr7Var.j.lineTo(gl.L(14.0f), gl.L(50.0f));
                    mr7Var.j.lineTo(gl.L(7.0f), gl.L(43.0f));
                    f3 = f22;
                } else {
                    f3 = f22;
                    path2.moveTo(0.0f, gl.L(43.0f));
                    mr7Var.j.lineTo(0.0f, gl.L(24.0f));
                    rectF4.set(0.0f, 0.0f, gl.L(42.0f), gl.L(24.0f));
                    mr7Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    mr7Var.j.lineTo(gl.L(42.0f), gl.L(43.0f));
                    mr7Var.j.lineTo(gl.L(f3), gl.L(50.0f));
                    mr7Var.j.lineTo(gl.L(28.0f), gl.L(43.0f));
                    mr7Var.j.lineTo(gl.L(21.0f), gl.L(50.0f));
                    mr7Var.j.lineTo(gl.L(14.0f), gl.L(43.0f));
                    mr7Var.j.lineTo(gl.L(7.0f), gl.L(50.0f));
                }
                mr7Var.j.close();
                canvas.drawPath(mr7Var.j, paint5);
                if (i18 != 0) {
                }
                canvas.drawPath(mr7Var.j, paint6);
                paint6.setColor(-1);
                rectF4.set(gl.L(f27), gl.L(14.0f), gl.L(f2), gl.L(28.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(gl.L(24.0f), gl.L(14.0f), gl.L(36.0f), gl.L(28.0f));
                canvas.drawOval(rectF4, paint6);
                paint6.setColor(-16777216);
                rectF4.set(gl.L(14.0f), gl.L(18.0f), gl.L(19.0f), gl.L(24.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(gl.L(30.0f), gl.L(18.0f), gl.L(f3), gl.L(24.0f));
                canvas.drawOval(rectF4, paint6);
                canvas.translate(gl.L(62.0f), 0.0f);
                i18++;
                f22 = f3;
                f25 = f27;
                f26 = f2;
            }
            canvas.restore();
            if (mr7Var.h >= 1.0f) {
                mr7Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - mr7Var.e;
            mr7Var.e = currentTimeMillis;
            if (j > 17) {
                j = 17;
            }
            float f28 = mr7Var.g;
            if (f28 >= 1.0f) {
                mr7Var.g = 0.0f;
                f28 = 0.0f;
            }
            float f29 = j;
            float f30 = (f29 / 400.0f) + f28;
            mr7Var.g = f30;
            if (f30 > 1.0f) {
                mr7Var.g = 1.0f;
            }
            float f31 = (f29 / 2000.0f) + mr7Var.h;
            mr7Var.h = f31;
            if (f31 > 1.0f) {
                mr7Var.h = 1.0f;
            }
            float f32 = (f29 / 200.0f) + mr7Var.i;
            mr7Var.i = f32;
            if (f32 >= 1.0f) {
                mr7Var.k = !mr7Var.k;
                mr7Var.i = 0.0f;
            }
            view5.invalidate();
        }
        i7c i7cVar = this.z3;
        if (i7cVar == null) {
            i = ((d) cj3Var).currentAccount;
            i7c[] i7cVarArr = i7c.f;
            if (i7cVarArr[i] == null) {
                i7cVarArr[i] = new i7c(i);
            }
            i7cVar = i7cVarArr[i];
            this.z3 = i7cVar;
        }
        i7cVar.a(this);
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.B3.O) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // rl0, o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof ue3) && ((ue3) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public float getViewOffset() {
        return cj3.F4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        bj3 bj3Var = this.n3;
        if (bj3Var.n != null && cj3.F4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            bj3Var.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.W1) {
            return false;
        }
        cj3 cj3Var = this.B3;
        if (cj3Var.d1 || this.n3.y.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            aVar = ((d) cj3Var).actionBar;
            cj3Var.e1 = !aVar.y();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o3 = getPaddingTop();
        this.B3.A3 = 0.0f;
        this.n3.getClass();
    }

    @Override // rl0, o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        bj3[] bj3VarArr;
        AnimatorSet animatorSet;
        bj3 bj3Var = this.n3;
        int K0 = bj3Var.c.K0();
        cj3 cj3Var = this.B3;
        if (K0 != -1 && bj3Var.e.E == 0 && bj3Var.c.y < 0 && bj3Var.a.getScrollState() != 1) {
            s49 K = bj3Var.a.K(K0);
            if (K == null) {
                K = bj3Var.a.L(K0, false);
            }
            if (K != null) {
                int top = K.a.getTop();
                if (bj3Var.s == 0 && cj3Var.w3() && bj3Var.w == 2) {
                    K0 = Math.max(1, K0);
                }
                this.m3 = true;
                bj3Var.c.g1(K0, (int) ((top - this.o3) + cj3Var.A3 + 0.0f));
                this.m3 = false;
            }
        } else if (K0 == -1 && this.l3) {
            bj3Var.c.g1((bj3Var.s == 0 && cj3Var.w3()) ? 1 : 0, (int) cj3Var.O);
        }
        this.m3 = true;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((d) cj3Var).actionBar;
        int i3 = currentActionBarHeight + (aVar.getOccupyStatusBar() ? gl.m : 0);
        if (cj3Var.L && !cj3Var.P) {
            i3 += gl.L(81.0f);
        }
        if (!cj3Var.P) {
            i3 += gl.L(48.0f);
        }
        this.A3 = 0;
        float n3 = cj3Var.n3(false);
        fj3 fj3Var = cj3Var.L1;
        float f = fj3Var != null ? fj3Var.getMetadata().c.a : 0.0f;
        float L = gl.L(50.0f);
        qi3 qi3Var = cj3Var.A0;
        int unreadOnlyBannerHeight = (int) ((L + (qi3Var != null ? qi3Var.getUnreadOnlyBannerHeight() : 0.0f)) * n3);
        int i4 = i3 + unreadOnlyBannerHeight;
        this.A3 += unreadOnlyBannerHeight;
        fj3 fj3Var2 = cj3Var.L1;
        if (fj3Var2 != null) {
            int c = (int) fj3Var2.c(gl.R1(gl.L(14.0f), gl.L(7.0f), n3));
            i4 += c;
            this.A3 += c;
        }
        int L2 = i4 - gl.L(Math.max(n3, f) * 5.0f);
        this.A3 -= gl.L(Math.max(n3, f) * 5.0f);
        int D2 = cj3Var.D2();
        if (L2 != this.g3 || D2 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, D2);
            boolean z = cj3Var.L;
            pi4 pi4Var = bj3Var.x;
            if (z) {
                pi4Var.setPaddingTop(L2 - gl.L(81.0f));
            } else {
                pi4Var.setPaddingTop(L2);
            }
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (getChildAt(i5) instanceof nj3) {
                    getChildAt(i5).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && cj3Var.getMessagesController().R1) {
            if (bj3Var.s == 0 && cj3Var.w3()) {
                this.m3 = true;
                ((t26) getLayoutManager()).g1(1, (int) cj3Var.O);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i, i2);
        if (cj3Var.n2 || L2 == 0 || (bj3VarArr = cj3Var.f0) == null || bj3VarArr.length <= 1 || cj3Var.o3 || (animatorSet = cj3Var.i3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s49 s49Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!this.W1) {
            cj3 cj3Var = this.B3;
            if (!cj3Var.d1 && !cj3Var.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                bj3 bj3Var = this.n3;
                if (action == 1 || action == 3) {
                    is5 is5Var = bj3Var.e;
                    if (is5Var.E != 0) {
                        aj3 aj3Var = bj3Var.f;
                        if (aj3Var.f) {
                            aj3Var.g = true;
                            if (is5Var.i(null, 4) != 0 && (s49Var = bj3Var.f.e) != null) {
                                View view = s49Var.a;
                                if (view instanceof ue3) {
                                    ue3 ue3Var = (ue3) view;
                                    long dialogId = ue3Var.getDialogId();
                                    if (cf3.C(dialogId)) {
                                        C1(false, ue3Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (hc2.Y(cj3Var.getMessagesController().K0(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                cj3Var.G4(arrayList, kk7.v1, true, false, null);
                                            } else {
                                                i = ((d) cj3Var).currentAccount;
                                                if (gba.m(i) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    cj3Var.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    cj3Var.G4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i2 = ((d) cj3Var).currentAccount;
                                                    if (gba.m(i2) != 3) {
                                                        i3 = ((d) cj3Var).currentAccount;
                                                        if (gba.m(i3) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            cj3Var.Q2 = !cj3Var.F3(dialog) ? 1 : 0;
                                                            cj3Var.G4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i4 = ((d) cj3Var).currentAccount;
                                                            if (gba.m(i4) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                cj3Var.G4(arrayList4, kk7.m1, true, false, null);
                                                            }
                                                        }
                                                    } else if (cj3Var.getMessagesController().n2(dialogId, 0L, null)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i5 = ((d) cj3Var).currentAccount;
                                                        cj3Var.R2 = !na7.q1(i5).n2(dialogId, 0L, null) ? 1 : 0;
                                                        cj3Var.S2 = cj3Var.R2 > 0 ? 0 : 1;
                                                        cj3Var.G4(arrayList5, kk7.o1, true, false, null);
                                                    } else {
                                                        im7.n(y6c.t0).T(dialogId, 3, 0L);
                                                        if (u21.a(cj3Var)) {
                                                            u21.z(cj3Var, 3, 0, null).j();
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
                if (bj3Var.s == 0 && ((action == 1 || action == 3) && bj3Var.w == 2 && cj3Var.w3() && ((t26) getLayoutManager()).K0() == 0)) {
                    int paddingTop = getPaddingTop();
                    ue3 l3 = cj3.l3(bj3Var);
                    if (l3 != null) {
                        int L = (int) (gl.L(gba.l1 ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = l3.getMeasuredHeight() + (l3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - cj3Var.f3;
                        if (measuredHeight < L || currentTimeMillis < 200) {
                            cj3Var.g2 = true;
                            x0(0, measuredHeight, s33.h);
                            i6 = 2;
                            bj3Var.w = (byte) 2;
                        } else {
                            if (bj3Var.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    cj3Var.g2 = true;
                                    x0(0, l3.getTop() - paddingTop, s33.h);
                                }
                                if (!cj3Var.h3) {
                                    cj3Var.h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    dh3 dh3Var = bj3Var.n;
                                    if (dh3Var != null) {
                                        dh3Var.a(true);
                                    }
                                }
                                l3.j0();
                                bj3Var.w = (byte) 1;
                                if (gl.A1()) {
                                    gl.g2(k96.M0(2131754923, null));
                                }
                            }
                            i6 = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i6];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new uz1(this, (byte) 16));
                            ofFloat.setDuration(Math.max(100L, (long) de9.x(getViewOffset(), gl.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(s33.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new im2(this, (byte) 10));
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

    @Override // rl0, o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m3) {
            return;
        }
        super.requestLayout();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(w39 w39Var) {
        super.setAdapter(w39Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f) {
        this.p3 = f;
        invalidate();
    }

    public void setViewsOffset(float f) {
        View m;
        cj3.F4 = f;
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

    @Override // o39
    public final boolean w1() {
        return true;
    }

    @Override // rl0
    public final int z1() {
        return gl.L(48.0f);
    }
}
