// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wh5 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final ylb a;
    public final ln b;
    public final ln c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public wh5(Context context, ylb ylbVar) {
        super(context);
        final byte b = 1;
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = ylbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        final byte b2 = 0;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, qoe.x(-1, -1, 8388611));
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setTypeface(gm.o());
        ln lnVar = new ln(new Runnable(this) { // from class: vh5
            public final /* synthetic */ wh5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                int i = 0;
                wh5 wh5Var = this.b;
                switch (b3) {
                    case 0:
                        wh5Var.invalidate();
                        LinearLayout linearLayout2 = wh5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                    default:
                        wh5Var.invalidate();
                        LinearLayout linearLayout3 = wh5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                }
            }
        });
        this.b = lnVar;
        lnVar.g = 180L;
        ln lnVar2 = new ln(new Runnable(this) { // from class: vh5
            public final /* synthetic */ wh5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                int i = 0;
                wh5 wh5Var = this.b;
                switch (b3) {
                    case 0:
                        wh5Var.invalidate();
                        LinearLayout linearLayout2 = wh5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                    default:
                        wh5Var.invalidate();
                        LinearLayout linearLayout3 = wh5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                }
            }
        });
        this.c = lnVar2;
        lnVar2.g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i, boolean z) {
        this.n = i;
        LinearLayout linearLayout = this.d;
        boolean z2 = !z;
        this.b.e(z2, linearLayout.getChildAt(i).getLeft());
        this.c.e(z2, linearLayout.getChildAt(i).getRight());
    }

    public final void b(ArrayList arrayList, we7 we7Var) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i);
            sb sbVar = new sb(getContext(), (byte) 16);
            sbVar.setDrawingCacheEnabled(false);
            sbVar.setOnClickListener(new wh((Object) this, i, (Object) we7Var, (byte) 8));
            sbVar.setPadding(gm.L(12.0f), gm.L(5.0f), gm.L(12.0f), gm.L(5.0f));
            LinearLayout.LayoutParams o = qoe.o(-2, -2);
            if (i < arrayList.size() - 1) {
                o.rightMargin = gm.L(4.0f);
            }
            sbVar.b = new uib(charSequence, this.f);
            linearLayout.addView(sbVar, o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float c = this.b.c();
        float c2 = this.c.c();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = w;
        rectF.set(c, 0.0f, c2, measuredHeight);
        Path path = this.r;
        path.rewind();
        float L = gm.L(13.0f);
        float L2 = gm.L(13.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, L, L2, direction);
        path.close();
        Path path2 = this.s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z = this.h;
        ylb ylbVar = this.a;
        int p1 = z ? cmb.p1(0.1f, cmb.v0(cmb.Ei, ylbVar)) : cmb.v0(cmb.x6, ylbVar) & 520093695;
        Paint paint = this.e;
        paint.setColor(p1);
        canvas.drawPath(path, paint);
        int v0 = cmb.v0(cmb.x6, ylbVar);
        TextPaint textPaint = this.f;
        textPaint.setColor(v0);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? cmb.v0(cmb.Ei, ylbVar) : cmb.v0(cmb.X8, ylbVar));
        canvas.save();
        canvas.clipPath(path);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (rectF.right >= childAt.getLeft() && rectF.left <= childAt.getRight()) {
                canvas.save();
                canvas.translate(childAt.getLeft(), childAt.getTop());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(this.n, false);
    }

    public void setAccent(boolean z) {
        this.h = z;
    }
}
