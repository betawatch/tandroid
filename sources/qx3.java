// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qx3 extends View {
    public final ylb E;
    public jac F;
    public int G;
    public boolean H;
    public long I;
    public boolean J;
    public final int a;
    public final Drawable[] b;
    public final Drawable c;
    public final Drawable d;
    public String e;
    public boolean f;
    public int h;
    public final int[] n;
    public final int[] r;
    public final Paint s;
    public final RectF w;
    public final ln x;
    public final ln y;

    public qx3(Context context, ylb ylbVar) {
        super(context);
        this.a = gm.L(gm.O1() ? 40.0f : 32.0f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.w = new RectF();
        d53 d53Var = d53.h;
        this.x = new ln(125L, this, d53Var);
        this.y = new ln(125L, this, d53Var);
        this.G = -1;
        this.H = true;
        this.E = ylbVar;
        this.c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i = cmb.g5;
        ylb ylbVar = this.E;
        cmb.A1(cmb.v0(i, ylbVar), this.c);
        cmb.A1(cmb.v0(i, ylbVar), this.d);
        bs2.b.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.Df, ylbVar), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        qx3 qx3Var = this;
        int measuredWidth = qx3Var.getMeasuredWidth();
        int measuredHeight = qx3Var.getMeasuredHeight() - gm.L(2.0f);
        Drawable drawable = qx3Var.c;
        boolean z = 0;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L = qx3Var.h - gm.L(9.0f);
        int measuredHeight2 = qx3Var.getMeasuredHeight() - gm.L(6.34f);
        int L2 = gm.L(9.0f) + qx3Var.h;
        int measuredHeight3 = qx3Var.getMeasuredHeight();
        Drawable drawable2 = qx3Var.d;
        drawable2.setBounds(L, measuredHeight2, L2, measuredHeight3);
        drawable2.draw(canvas);
        if (qx3Var.e != null) {
            boolean z2 = qx3Var.f;
            ylb ylbVar = qx3Var.E;
            int[] iArr = qx3Var.n;
            ln lnVar = qx3Var.x;
            Paint paint = qx3Var.s;
            Drawable[] drawableArr = qx3Var.b;
            RectF rectF = qx3Var.w;
            float f = 1.0f;
            int i = qx3Var.a;
            if (!z2) {
                float e = lnVar.e(false, iArr[0]);
                float f2 = i;
                int L3 = gm.L(5.0f);
                float f3 = L3;
                int i2 = L3 + i;
                rectF.set((int) ((f2 * e) + gm.L((e * 4.0f) + 5.0f)), f3, r4 + i, i2);
                rectF.inset(gm.L(-2.0f), gm.L(-2.0f));
                paint.setColor(cmb.v0(cmb.h6, ylbVar));
                canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
                for (int i3 = 0; i3 < 6; i3++) {
                    Drawable drawable3 = drawableArr[i3];
                    if (drawable3 != null) {
                        int L4 = gm.L((i3 << 2) + 5) + (i * i3);
                        float min = ((1.0f - (Math.min(0.5f, Math.abs(i3 - e)) * 2.0f)) * 0.1f) + 0.9f;
                        canvas.save();
                        float f4 = f2 / 2.0f;
                        canvas.scale(min, min, L4 + f4, f4 + f3);
                        drawable3.setBounds(L4, L3, L4 + i, i2);
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                }
                return;
            }
            int i4 = 0;
            while (i4 < 2) {
                float e2 = (i4 == 0 ? lnVar : qx3Var.y).e(z, iArr[i4]);
                int i5 = z;
                float max = Math.max(0.0f, Math.min(f, -e2));
                rectF.set((int) ((i * (e2 + f)) + gm.L((r6 * 4.0f) + (Math.max(0.0f, Math.min(f, r6)) * 3.0f) + 5.0f)), gm.U1(max, ((gm.L(f) + i) * i4) + gm.L(3.0f), (qx3Var.getMeasuredHeight() - i) / 2), r6 + i, r9 + i);
                rectF.inset(gm.L(-2.0f), gm.L(max * (-2.0f)));
                paint.setColor(cmb.p1(gm.R1(f, 0.5f, max), cmb.v0(cmb.h6, ylbVar)));
                canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
                int i6 = i5;
                while (i6 < 5) {
                    i6++;
                    int i7 = (i4 * 5) + i6;
                    int L5 = gm.L((i6 << 2) + 8) + (i * i6);
                    int L6 = ((gm.L(f) + i) * i4) + gm.L(3.0f);
                    drawableArr[i7].setBounds(L5, L6, L5 + i, L6 + i);
                    drawableArr[i7].draw(canvas);
                    f = f;
                }
                i4++;
                qx3Var = this;
                z = i5;
            }
            char c = z;
            drawableArr[c].setBounds(gm.L(5.0f), (getMeasuredHeight() - i) / 2, gm.L(5.0f) + i, (getMeasuredHeight() + i) / 2);
            drawableArr[c].draw(canvas);
            canvas.drawRect(gm.L(8.45f) + i, gm.L(2.0f), hg9.v(8.45f, i, 1), getMeasuredHeight() - gm.L(6.0f), cmb.j0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        if (this.J) {
            this.J = false;
            return false;
        }
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.b;
            if (i4 >= drawableArr.length) {
                i4 = -1;
                break;
            }
            if (drawableArr[i4].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i3 = this.G) != -1 && ((i4 == 0 || ((i3 == 0 && i4 >= 1 && i4 <= 5) || (i3 == 1 && i4 >= 6 && i4 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i4].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i4].getBounds().right))) {
                break;
            }
            i4++;
        }
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
            return false;
        }
        int action = motionEvent.getAction();
        int[] iArr = this.n;
        if (action == 0) {
            this.G = -1;
            this.I = System.currentTimeMillis();
            this.H = iArr[0] == iArr[1];
        }
        int i5 = iArr[0];
        int[] iArr2 = this.r;
        iArr2[0] = i5;
        iArr2[1] = iArr[1];
        boolean z = System.currentTimeMillis() - this.I > 300 && motionEvent.getAction() == 2;
        if (i4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
        } else if (i4 >= 1 && i4 <= 5 && ((i2 = this.G) == -1 || i2 == 0)) {
            this.G = 0;
            int i6 = i4 - 1;
            iArr[0] = i6;
            if (iArr[1] == -1 || (this.H && z)) {
                iArr[1] = i6;
            }
        } else if (i4 >= 6 && i4 <= 10 && ((i = this.G) == -1 || i == 1)) {
            this.G = 1;
            int i7 = i4 - 6;
            iArr[1] = i7;
            if (iArr[0] == -1 || (this.H && z)) {
                iArr[0] = i7;
            }
        }
        if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
            gm.W3(this);
            jac jacVar = this.F;
            if (jacVar != null) {
                jacVar.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            }
        }
        invalidate();
        if (motionEvent.getAction() == 1) {
            this.G = -1;
        }
        return true;
    }

    public void setArrowX(int i) {
        this.h = i;
        invalidate();
    }

    public void setOnSelectionUpdateListener(jac jacVar) {
        this.F = jacVar;
    }
}
