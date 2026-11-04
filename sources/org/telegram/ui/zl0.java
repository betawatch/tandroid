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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zl0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Paint b;
    public final int c;
    public final int d;
    public boolean e;
    public yl0[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public org.telegram.messenger.u10 w;
    public yl0 x;

    public zl0(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i3;
        this.d = i10;
        this.a = e6Var;
    }

    public final void a(int i3, boolean z10) {
        this.s = i3;
        if (this.f == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            yl0[] yl0VarArr = this.f;
            if (i10 >= yl0VarArr.length) {
                return;
            }
            yl0 yl0Var = yl0VarArr[i10];
            boolean z11 = yl0Var.o == i3;
            yl0Var.m = z11;
            if (!z10) {
                yl0Var.n.f(z11, true);
            }
            yl0Var.r.invalidate();
            i10++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i3 = 0;
            while (true) {
                yl0[] yl0VarArr = this.f;
                if (i3 >= yl0VarArr.length) {
                    break;
                }
                yl0 yl0Var = yl0VarArr[i3];
                zl0 zl0Var = yl0Var.r;
                Path path = yl0Var.e;
                canvas.save();
                float a10 = yl0Var.l.a(0.05f);
                RectF rectF = yl0Var.p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = yl0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(yl0Var.a);
                if (yl0Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, yl0Var.b);
                }
                canvas.restore();
                if (yl0Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f10 = width / 2.0f;
                    rectF2.set(rectF.centerX() - f10, rectF.centerY() - f10, rectF.centerX() + f10, rectF.centerY() + f10);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), yl0Var.c);
                    canvas.restore();
                }
                float d = yl0Var.n.d(yl0Var.m);
                if (d > 0.0f) {
                    Paint paint = zl0Var.b;
                    Paint paint2 = zl0Var.b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, zl0Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (yl0Var.h) {
                    if (zl0Var.e) {
                        if (yl0Var.k == null) {
                            Drawable drawable = zl0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            yl0Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        yl0Var.k.setBounds((int) org.telegram.messenger.camera.q.v(yl0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.camera.q.v(yl0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.A(yl0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.A(yl0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        yl0Var.k.draw(canvas);
                    } else {
                        if (yl0Var.i == null) {
                            yl0Var.i = new Path();
                        }
                        if (yl0Var.j == null) {
                            Paint paint3 = new Paint(1);
                            yl0Var.j = paint3;
                            paint3.setColor(-1);
                            yl0Var.j.setStyle(Paint.Style.STROKE);
                            yl0Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        yl0Var.j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        yl0Var.i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        yl0Var.i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        yl0Var.i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        yl0Var.i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        yl0Var.i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(yl0Var.i, yl0Var.j);
                    }
                }
                canvas.restore();
                i3++;
            }
        }
        if (this.r) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.a);
            Paint paint4 = this.n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.g0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yl0 yl0Var;
        yl0 yl0Var2;
        org.telegram.messenger.u10 u10Var;
        org.telegram.messenger.u10 u10Var2;
        if (this.f != null) {
            int i3 = 0;
            while (true) {
                yl0[] yl0VarArr = this.f;
                if (i3 >= yl0VarArr.length) {
                    break;
                }
                if (yl0VarArr[i3].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    yl0Var = this.f[i3];
                    break;
                }
                i3++;
            }
            if (motionEvent.getAction() != 0) {
                this.x = yl0Var;
                if (yl0Var != null) {
                    yl0Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                yl0 yl0Var3 = this.x;
                if (yl0Var3 != yl0Var) {
                    if (yl0Var3 != null) {
                        yl0Var3.l.c(false);
                    }
                    if (yl0Var != null) {
                        yl0Var.l.c(true);
                    }
                    if (this.x != null && yl0Var != null && (u10Var2 = this.w) != null) {
                        u10Var2.a(Integer.valueOf(yl0Var.o));
                    }
                    this.x = yl0Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (yl0Var2 = this.x) != null && (u10Var = this.w) != null) {
                    u10Var.a(Integer.valueOf(yl0Var2.o));
                }
                if (this.f != null) {
                    int i10 = 0;
                    while (true) {
                        yl0[] yl0VarArr2 = this.f;
                        if (i10 >= yl0VarArr2.length) {
                            break;
                        }
                        yl0VarArr2[i10].l.c(false);
                        i10++;
                    }
                }
                this.x = null;
                return true;
            }
            return true;
        }
        yl0Var = null;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int getColorId() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.d);
        int i12 = this.c;
        org.telegram.messenger.xo xoVar = i12 == 1 ? s12.q4 : s12.r4;
        int size2 = xoVar == null ? 0 : xoVar.c.size();
        int i13 = 8;
        int i14 = 2;
        if (i12 == 2) {
            size2 = 8;
        }
        if (i12 != 2 && i12 == 1) {
            i13 = 7;
        }
        float f10 = size;
        float f11 = i13;
        float f12 = i13 + 1;
        float min = Math.min(org.telegram.messenger.g0.L(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float min2 = Math.min(0.28947f * min, org.telegram.messenger.g0.L(8.0f));
        float min3 = Math.min(0.31578946f * min, org.telegram.messenger.g0.L(11.33f));
        boolean z10 = true;
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i13) * min)));
        yl0[] yl0VarArr = this.f;
        if (yl0VarArr == null || yl0VarArr.length != size2) {
            this.f = new yl0[size2];
            int i15 = 0;
            while (i15 < size2) {
                this.f[i15] = new yl0(this);
                if (i12 == i14) {
                    yl0 yl0Var = this.f[i15];
                    int i16 = this.h[i15];
                    yl0Var.o = i16;
                    yl0Var.h = i16 < 0;
                    if (i16 < 0) {
                        i11 = org.telegram.ui.ActionBar.k6.c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.k6.r8;
                        i11 = iArr[i16 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.a);
                    yl0Var.g = false;
                    yl0Var.f = false;
                    yl0Var.a.setColor(w02);
                } else if (xoVar != null) {
                    ArrayList arrayList = xoVar.c;
                    if (i15 >= 0 && i15 < arrayList.size()) {
                        this.f[i15].o = ((org.telegram.messenger.wo) arrayList.get(i15)).c;
                        this.f[i15].a((org.telegram.messenger.wo) arrayList.get(i15));
                    }
                }
                i15++;
                i14 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f != null) {
            int i17 = 0;
            float f14 = f13;
            float f15 = min3;
            while (i17 < this.f.length) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f[i17].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i17].q.set(rectF);
                yl0 yl0Var2 = this.f[i17];
                boolean z11 = yl0Var2.o == this.s ? z10 : false;
                yl0Var2.m = z11;
                boolean z12 = z10;
                yl0Var2.n.f(z11, z12);
                yl0Var2.r.invalidate();
                if (i17 % i13 == i13 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
                i17++;
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

    public void setOnColorClick(org.telegram.messenger.u10 u10Var) {
        this.w = u10Var;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3;
        if (this.f == null) {
            return;
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.d);
        int i10 = this.c;
        org.telegram.messenger.xo xoVar = i10 == 1 ? s12.q4 : s12.r4;
        int i11 = 0;
        while (true) {
            yl0[] yl0VarArr = this.f;
            if (i11 >= yl0VarArr.length) {
                invalidate();
                return;
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            int[] iArr = this.h;
            if (i10 == 2) {
                yl0 yl0Var = yl0VarArr[i11];
                int i12 = iArr[i11];
                yl0Var.o = i12;
                yl0Var.h = i12 < 0;
                if (i12 < 0) {
                    i3 = org.telegram.ui.ActionBar.k6.c8;
                } else {
                    int[] iArr2 = org.telegram.ui.ActionBar.k6.r8;
                    i3 = iArr2[i12 % iArr2.length];
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
                yl0Var.g = false;
                yl0Var.f = false;
                yl0Var.a.setColor(w02);
            } else if (i11 < 7 && i10 == 1) {
                yl0 yl0Var2 = yl0VarArr[i11];
                int i13 = iArr[i11];
                yl0Var2.o = i13;
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r8[i13], e6Var);
                yl0Var2.g = false;
                yl0Var2.f = false;
                yl0Var2.a.setColor(w03);
            } else if (xoVar != null) {
                ArrayList arrayList = xoVar.c;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f[i11].o = ((org.telegram.messenger.wo) arrayList.get(i11)).c;
                    this.f[i11].a((org.telegram.messenger.wo) arrayList.get(i11));
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
