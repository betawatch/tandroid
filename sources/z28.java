// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z28 extends View implements vlb {
    public final ylb a;
    public final Paint b;
    public final byte c;
    public final int d;
    public boolean e;
    public y28[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public qac w;
    public y28 x;

    /* JADX WARN: Multi-variable type inference failed */
    public z28(int i, int i2, ylb ylbVar, Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i;
        this.d = i2;
        this.a = ylbVar;
    }

    public final void a(int i, boolean z) {
        this.s = i;
        if (this.f == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            y28[] y28VarArr = this.f;
            if (i2 >= y28VarArr.length) {
                return;
            }
            y28 y28Var = y28VarArr[i2];
            boolean z2 = y28Var.o == i;
            y28Var.m = z2;
            if (!z) {
                y28Var.n.f(z2, true);
            }
            y28Var.r.invalidate();
            i2++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i = 0;
            while (true) {
                y28[] y28VarArr = this.f;
                if (i >= y28VarArr.length) {
                    break;
                }
                y28 y28Var = y28VarArr[i];
                z28 z28Var = y28Var.r;
                Path path = y28Var.e;
                canvas.save();
                float a = y28Var.l.a(0.05f);
                RectF rectF = y28Var.p;
                canvas.scale(a, a, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = y28Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(y28Var.a);
                if (y28Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, y28Var.b);
                }
                canvas.restore();
                if (y28Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = gm.P;
                    float f = width / 2.0f;
                    rectF2.set(rectF.centerX() - f, rectF.centerY() - f, rectF.centerX() + f, rectF.centerY() + f);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, gm.L(2.33f), gm.L(2.33f), y28Var.c);
                    canvas.restore();
                }
                float d = y28Var.n.d(y28Var.m);
                if (d > 0.0f) {
                    Paint paint = z28Var.b;
                    paint.setStrokeWidth(gm.N(2.0f));
                    paint.setColor(cmb.v0(cmb.c6, z28Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (gm.R1(0.5f, -2.0f, d) * paint.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint);
                }
                if (y28Var.h) {
                    if (z28Var.e) {
                        if (y28Var.k == null) {
                            Drawable drawable = z28Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            y28Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        y28Var.k.setBounds((int) hg9.x(y28Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) hg9.x(y28Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) b10.A(y28Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) b10.A(y28Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        y28Var.k.draw(canvas);
                    } else {
                        if (y28Var.i == null) {
                            y28Var.i = new Path();
                        }
                        if (y28Var.j == null) {
                            Paint paint2 = new Paint(1);
                            y28Var.j = paint2;
                            paint2.setColor(-1);
                            y28Var.j.setStyle(Paint.Style.STROKE);
                            y28Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        y28Var.j.setStrokeWidth(gm.L(2.0f));
                        y28Var.i.rewind();
                        float U1 = gm.U1(d, gm.L(5.0f), gm.L(4.0f));
                        y28Var.i.moveTo(rectF.centerX() - U1, rectF.centerY() - U1);
                        y28Var.i.lineTo(rectF.centerX() + U1, rectF.centerY() + U1);
                        y28Var.i.moveTo(rectF.centerX() + U1, rectF.centerY() - U1);
                        y28Var.i.lineTo(rectF.centerX() - U1, rectF.centerY() + U1);
                        canvas.drawPath(y28Var.i, y28Var.j);
                    }
                }
                canvas.restore();
                i++;
            }
        }
        if (this.r) {
            int v0 = cmb.v0(cmb.c7, this.a);
            Paint paint3 = this.n;
            paint3.setColor(v0);
            canvas.drawRect(gm.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - gm.L(21.0f), getMeasuredHeight(), paint3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        y28 y28Var;
        y28 y28Var2;
        qac qacVar;
        qac qacVar2;
        if (this.f != null) {
            int i = 0;
            while (true) {
                y28[] y28VarArr = this.f;
                if (i >= y28VarArr.length) {
                    break;
                }
                if (y28VarArr[i].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    y28Var = this.f[i];
                    break;
                }
                i++;
            }
            if (motionEvent.getAction() != 0) {
                this.x = y28Var;
                if (y28Var != null) {
                    y28Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                y28 y28Var3 = this.x;
                if (y28Var3 != y28Var) {
                    if (y28Var3 != null) {
                        y28Var3.l.c(false);
                    }
                    if (y28Var != null) {
                        y28Var.l.c(true);
                    }
                    if (this.x != null && y28Var != null && (qacVar2 = this.w) != null) {
                        qacVar2.a(Integer.valueOf(y28Var.o));
                    }
                    this.x = y28Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (y28Var2 = this.x) != null && (qacVar = this.w) != null) {
                    qacVar.a(Integer.valueOf(y28Var2.o));
                }
                if (this.f != null) {
                    int i2 = 0;
                    while (true) {
                        y28[] y28VarArr2 = this.f;
                        if (i2 >= y28VarArr2.length) {
                            break;
                        }
                        y28VarArr2[i2].l.c(false);
                        i2++;
                    }
                }
                this.x = null;
                return true;
            }
            return true;
        }
        y28Var = null;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int getColorId() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        oc7 r1 = oc7.r1(this.d);
        byte b = this.c;
        fc7 fc7Var = b == 1 ? r1.E3 : r1.F3;
        int size2 = fc7Var == null ? 0 : fc7Var.c.size();
        int i4 = 8;
        byte b2 = 2;
        if (b == 2) {
            size2 = 8;
        }
        if (b != 2 && b == 1) {
            i4 = 7;
        }
        float f = size;
        float f2 = i4;
        float f3 = i4 + 1;
        float min = Math.min(gm.L(54.0f), f / ((f3 * 0.28947f) + f2));
        float min2 = Math.min(0.28947f * min, gm.L(8.0f));
        float min3 = Math.min(0.31578946f * min, gm.L(11.33f));
        boolean z = true;
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i4) * min)));
        y28[] y28VarArr = this.f;
        if (y28VarArr == null || y28VarArr.length != size2) {
            this.f = new y28[size2];
            int i5 = 0;
            while (i5 < size2) {
                this.f[i5] = new y28(this);
                if (b == b2) {
                    y28 y28Var = this.f[i5];
                    int i6 = this.h[i5];
                    y28Var.o = i6;
                    y28Var.h = i6 < 0;
                    if (i6 < 0) {
                        i3 = cmb.b8;
                    } else {
                        int[] iArr = cmb.q8;
                        i3 = iArr[i6 % iArr.length];
                    }
                    int v0 = cmb.v0(i3, this.a);
                    y28Var.g = false;
                    y28Var.f = false;
                    y28Var.a.setColor(v0);
                } else if (fc7Var != null) {
                    ArrayList arrayList = fc7Var.c;
                    if (i5 >= 0 && i5 < arrayList.size()) {
                        this.f[i5].o = ((ec7) arrayList.get(i5)).c;
                        this.f[i5].a((ec7) arrayList.get(i5));
                    }
                }
                i5++;
                b2 = 2;
            }
        }
        float f4 = ((f - ((f3 * min2) + (f2 * min))) / 2.0f) + min2;
        if (this.f != null) {
            int i7 = 0;
            float f5 = f4;
            float f6 = min3;
            while (i7 < this.f.length) {
                RectF rectF = gm.P;
                rectF.set(f5, f6, f5 + min, f6 + min);
                this.f[i7].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i7].q.set(rectF);
                y28 y28Var2 = this.f[i7];
                boolean z2 = y28Var2.o == this.s ? z : false;
                y28Var2.m = z2;
                boolean z3 = z;
                y28Var2.n.f(z2, z3);
                y28Var2.r.invalidate();
                if (i7 % i4 == i4 - 1) {
                    f6 += min + min3;
                    f5 = f4;
                } else {
                    f5 = min + min2 + f5;
                }
                i7++;
                z = z3;
            }
        }
    }

    public void setCloseAsLock(boolean z) {
        this.e = z;
    }

    public void setDivider(boolean z) {
        this.r = z;
        invalidate();
    }

    public void setOnColorClick(qac qacVar) {
        this.w = qacVar;
    }

    @Override // vlb
    public final void updateColors() {
        int i;
        if (this.f == null) {
            return;
        }
        oc7 r1 = oc7.r1(this.d);
        byte b = this.c;
        fc7 fc7Var = b == 1 ? r1.E3 : r1.F3;
        int i2 = 0;
        while (true) {
            y28[] y28VarArr = this.f;
            if (i2 >= y28VarArr.length) {
                invalidate();
                return;
            }
            ylb ylbVar = this.a;
            int[] iArr = this.h;
            if (b == 2) {
                y28 y28Var = y28VarArr[i2];
                int i3 = iArr[i2];
                y28Var.o = i3;
                y28Var.h = i3 < 0;
                if (i3 < 0) {
                    i = cmb.b8;
                } else {
                    int[] iArr2 = cmb.q8;
                    i = iArr2[i3 % iArr2.length];
                }
                int v0 = cmb.v0(i, ylbVar);
                y28Var.g = false;
                y28Var.f = false;
                y28Var.a.setColor(v0);
            } else if (i2 < 7 && b == 1) {
                y28 y28Var2 = y28VarArr[i2];
                int i4 = iArr[i2];
                y28Var2.o = i4;
                int v02 = cmb.v0(cmb.q8[i4], ylbVar);
                y28Var2.g = false;
                y28Var2.f = false;
                y28Var2.a.setColor(v02);
            } else if (fc7Var != null) {
                ArrayList arrayList = fc7Var.c;
                if (i2 >= 0 && i2 < arrayList.size()) {
                    this.f[i2].o = ((ec7) arrayList.get(i2)).c;
                    this.f[i2].a((ec7) arrayList.get(i2));
                }
            }
            i2++;
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
