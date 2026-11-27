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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zh5 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final vnb a;
    public final mm b;
    public final mm c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public zh5(Context context, vnb vnbVar) {
        super(context);
        final byte b = 1;
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = vnbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        final byte b2 = 0;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.x(-1, -1, 8388611));
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setTypeface(hl.o());
        mm mmVar = new mm(new Runnable(this) { // from class: yh5
            public final /* synthetic */ zh5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                int i = 0;
                zh5 zh5Var = this.b;
                switch (b3) {
                    case 0:
                        zh5Var.invalidate();
                        LinearLayout linearLayout2 = zh5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                    default:
                        zh5Var.invalidate();
                        LinearLayout linearLayout3 = zh5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                }
            }
        });
        this.b = mmVar;
        mmVar.g = 180L;
        mm mmVar2 = new mm(new Runnable(this) { // from class: yh5
            public final /* synthetic */ zh5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                int i = 0;
                zh5 zh5Var = this.b;
                switch (b3) {
                    case 0:
                        zh5Var.invalidate();
                        LinearLayout linearLayout2 = zh5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                    default:
                        zh5Var.invalidate();
                        LinearLayout linearLayout3 = zh5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                }
            }
        });
        this.c = mmVar2;
        mmVar2.g = 180L;
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

    public final void b(ArrayList arrayList, df7 df7Var) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i);
            tb tbVar = new tb(getContext(), (byte) 16);
            tbVar.setDrawingCacheEnabled(false);
            tbVar.setOnClickListener(new ae((Object) this, i, (Object) df7Var, (byte) 8));
            tbVar.setPadding(hl.L(12.0f), hl.L(5.0f), hl.L(12.0f), hl.L(5.0f));
            LinearLayout.LayoutParams o = tre.o(-2, -2);
            if (i < arrayList.size() - 1) {
                o.rightMargin = hl.L(4.0f);
            }
            tbVar.b = new pkb(charSequence, this.f);
            linearLayout.addView(tbVar, o);
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
        float L = hl.L(13.0f);
        float L2 = hl.L(13.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, L, L2, direction);
        path.close();
        Path path2 = this.s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z = this.h;
        vnb vnbVar = this.a;
        int p1 = z ? aob.p1(0.1f, aob.v0(aob.Fi, vnbVar)) : aob.v0(aob.y6, vnbVar) & 520093695;
        Paint paint = this.e;
        paint.setColor(p1);
        canvas.drawPath(path, paint);
        int v0 = aob.v0(aob.y6, vnbVar);
        TextPaint textPaint = this.f;
        textPaint.setColor(v0);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? aob.v0(aob.Fi, vnbVar) : aob.v0(aob.Y8, vnbVar));
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
