package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qn0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final Paint b;
    public final int c;
    public final int d;
    public boolean e;
    public pn0[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public org.telegram.messenger.q20 w;
    public pn0 x;

    public qn0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i10;
        this.d = i11;
        this.a = p6Var;
    }

    public final void a(int i10, boolean z10) {
        this.s = i10;
        if (this.f == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            pn0[] pn0VarArr = this.f;
            if (i11 >= pn0VarArr.length) {
                return;
            }
            pn0 pn0Var = pn0VarArr[i11];
            boolean z11 = pn0Var.o == i10;
            pn0Var.m = z11;
            if (!z10) {
                pn0Var.n.f(z11, true);
            }
            pn0Var.r.invalidate();
            i11++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                pn0[] pn0VarArr = this.f;
                if (i10 >= pn0VarArr.length) {
                    break;
                }
                pn0 pn0Var = pn0VarArr[i10];
                qn0 qn0Var = pn0Var.r;
                Path path = pn0Var.e;
                canvas.save();
                float a2 = pn0Var.l.a(0.05f);
                RectF rectF = pn0Var.p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = pn0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(pn0Var.a);
                if (pn0Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, pn0Var.b);
                }
                canvas.restore();
                if (pn0Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float f7 = width / 2.0f;
                    rectF2.set(rectF.centerX() - f7, rectF.centerY() - f7, rectF.centerX() + f7, rectF.centerY() + f7);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), pn0Var.c);
                    canvas.restore();
                }
                float d = pn0Var.n.d(pn0Var.m);
                if (d > 0.0f) {
                    Paint paint = qn0Var.b;
                    Paint paint2 = qn0Var.b;
                    paint.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, qn0Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.i0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (pn0Var.h) {
                    if (qn0Var.e) {
                        if (pn0Var.k == null) {
                            Drawable drawable = qn0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            pn0Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        pn0Var.k.setBounds((int) org.telegram.messenger.z20.v(pn0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.z20.v(pn0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.c(pn0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.c(pn0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        pn0Var.k.draw(canvas);
                    } else {
                        if (pn0Var.i == null) {
                            pn0Var.i = new Path();
                        }
                        if (pn0Var.j == null) {
                            Paint paint3 = new Paint(1);
                            pn0Var.j = paint3;
                            paint3.setColor(-1);
                            pn0Var.j.setStyle(Paint.Style.STROKE);
                            pn0Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        pn0Var.j.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                        pn0Var.i.rewind();
                        float W1 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(4.0f));
                        pn0Var.i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        pn0Var.i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        pn0Var.i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        pn0Var.i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(pn0Var.i, pn0Var.j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.r) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, this.a);
            Paint paint4 = this.n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.i0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pn0 pn0Var;
        pn0 pn0Var2;
        org.telegram.messenger.q20 q20Var;
        org.telegram.messenger.q20 q20Var2;
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                pn0[] pn0VarArr = this.f;
                if (i10 >= pn0VarArr.length) {
                    break;
                }
                if (pn0VarArr[i10].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    pn0Var = this.f[i10];
                    break;
                }
                i10++;
            }
            if (motionEvent.getAction() != 0) {
                this.x = pn0Var;
                if (pn0Var != null) {
                    pn0Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                pn0 pn0Var3 = this.x;
                if (pn0Var3 != pn0Var) {
                    if (pn0Var3 != null) {
                        pn0Var3.l.c(false);
                    }
                    if (pn0Var != null) {
                        pn0Var.l.c(true);
                    }
                    if (this.x != null && pn0Var != null && (q20Var2 = this.w) != null) {
                        q20Var2.a(Integer.valueOf(pn0Var.o));
                    }
                    this.x = pn0Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (pn0Var2 = this.x) != null && (q20Var = this.w) != null) {
                    q20Var.a(Integer.valueOf(pn0Var2.o));
                }
                if (this.f != null) {
                    int i11 = 0;
                    while (true) {
                        pn0[] pn0VarArr2 = this.f;
                        if (i11 >= pn0VarArr2.length) {
                            break;
                        }
                        pn0VarArr2[i11].l.c(false);
                        i11++;
                    }
                }
                this.x = null;
                return true;
            }
            return true;
        }
        pn0Var = null;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int getColorId() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.d);
        int i13 = this.c;
        org.telegram.messenger.lp lpVar = i13 == 1 ? r12.r4 : r12.s4;
        int size2 = lpVar == null ? 0 : lpVar.c.size();
        int i14 = 8;
        int i15 = 2;
        if (i13 == 2) {
            size2 = 8;
        }
        if (i13 != 2 && i13 == 1) {
            i14 = 7;
        }
        float f7 = size;
        float f10 = i14;
        float f11 = i14 + 1;
        float min = Math.min(org.telegram.messenger.i0.L(54.0f), f7 / ((f11 * 0.28947f) + f10));
        float min2 = Math.min(0.28947f * min, org.telegram.messenger.i0.L(8.0f));
        float min3 = Math.min(0.31578946f * min, org.telegram.messenger.i0.L(11.33f));
        boolean z10 = true;
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i14) * min)));
        pn0[] pn0VarArr = this.f;
        if (pn0VarArr == null || pn0VarArr.length != size2) {
            this.f = new pn0[size2];
            int i16 = 0;
            while (i16 < size2) {
                this.f[i16] = new pn0(this);
                if (i13 == i15) {
                    pn0 pn0Var = this.f[i16];
                    int i17 = this.h[i16];
                    pn0Var.o = i17;
                    pn0Var.h = i17 < 0;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.t6.c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.t6.r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i12, this.a);
                    pn0Var.g = false;
                    pn0Var.f = false;
                    pn0Var.a.setColor(w02);
                } else if (lpVar != null) {
                    ArrayList arrayList = lpVar.c;
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        this.f[i16].o = ((org.telegram.messenger.kp) arrayList.get(i16)).c;
                        this.f[i16].a((org.telegram.messenger.kp) arrayList.get(i16));
                    }
                }
                i16++;
                i15 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f != null) {
            int i18 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i18 < this.f.length) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f[i18].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i18].q.set(rectF);
                pn0 pn0Var2 = this.f[i18];
                boolean z11 = pn0Var2.o == this.s ? z10 : false;
                pn0Var2.m = z11;
                boolean z12 = z10;
                pn0Var2.n.f(z11, z12);
                pn0Var2.r.invalidate();
                if (i18 % i14 == i14 - 1) {
                    f14 += min + min3;
                    f13 = f12;
                } else {
                    f13 = min + min2 + f13;
                }
                i18++;
                z10 = z12;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.r = z10;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.q20 q20Var) {
        this.w = q20Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10;
        if (this.f == null) {
            return;
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.d);
        int i11 = this.c;
        org.telegram.messenger.lp lpVar = i11 == 1 ? r12.r4 : r12.s4;
        int i12 = 0;
        while (true) {
            pn0[] pn0VarArr = this.f;
            if (i12 >= pn0VarArr.length) {
                invalidate();
                return;
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.a;
            int[] iArr = this.h;
            if (i11 == 2) {
                pn0 pn0Var = pn0VarArr[i12];
                int i13 = iArr[i12];
                pn0Var.o = i13;
                pn0Var.h = i13 < 0;
                if (i13 < 0) {
                    i10 = org.telegram.ui.ActionBar.t6.c8;
                } else {
                    int[] iArr2 = org.telegram.ui.ActionBar.t6.r8;
                    i10 = iArr2[i13 % iArr2.length];
                }
                int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                pn0Var.g = false;
                pn0Var.f = false;
                pn0Var.a.setColor(w02);
            } else if (i12 < 7 && i11 == 1) {
                pn0 pn0Var2 = pn0VarArr[i12];
                int i14 = iArr[i12];
                pn0Var2.o = i14;
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.r8[i14], p6Var);
                pn0Var2.g = false;
                pn0Var2.f = false;
                pn0Var2.a.setColor(w03);
            } else if (lpVar != null) {
                ArrayList arrayList = lpVar.c;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    this.f[i12].o = ((org.telegram.messenger.kp) arrayList.get(i12)).c;
                    this.f[i12].a((org.telegram.messenger.kp) arrayList.get(i12));
                }
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
