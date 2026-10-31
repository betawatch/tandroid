package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.bl0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p3 extends FrameLayout {
    public final LinearLayout a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final RectF e;
    public float f;
    public float h;
    public final RectF n;
    public float r;
    public int s;
    public final bl0 w;
    public ValueAnimator x;
    public final /* synthetic */ y3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(y3 y3Var, Context context) {
        super(context);
        this.y = y3Var;
        final int i10 = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        b bVar = y3Var.s;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i12 = 0;
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(cd.L0(2131754286, null));
        int i13 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i13, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(cd.L0(2131751780, null));
        org.telegram.ui.ActionBar.a7.V(textView2, i13, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f));
        linearLayout.addView(textView, w7.b6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(26.0f), org.telegram.ui.ActionBar.t6.w0(i11, bVar));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(linearLayout2, d02, N, null, bVar);
        linearLayout2.setOrientation(0);
        bl0 bl0Var = new bl0(getContext());
        this.w = bl0Var;
        bl0Var.r = true;
        bl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(bl0Var);
        imageView.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
        linearLayout2.addView(imageView, w7.b6.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.b6.o(16, 26));
        addView(linearLayout, w7.b6.c(-2.0f, -2));
        addView(linearLayout2, w7.b6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: th.m3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        y3 y3Var2 = this.b.y;
                        l3 l3Var = y3Var2.O;
                        if (l3Var.b) {
                            l3Var.b = false;
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            break;
                        }
                        break;
                    case 1:
                        y3 y3Var3 = this.b.y;
                        l3 l3Var2 = y3Var3.O;
                        if (!l3Var2.b) {
                            l3Var2.b = true;
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            break;
                        }
                        break;
                    default:
                        p3 p3Var = this.b;
                        y3 y3Var4 = p3Var.y;
                        o3 o3Var = new o3(p3Var, p3Var.getContext(), y3Var4.s);
                        y3Var4.f = o3Var;
                        LinearLayout linearLayout3 = p3Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.i0.L(8.0f);
                        o3Var.a = true;
                        ((org.telegram.ui.ActionBar.k1) o3Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: th.m3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        y3 y3Var2 = this.b.y;
                        l3 l3Var = y3Var2.O;
                        if (l3Var.b) {
                            l3Var.b = false;
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            break;
                        }
                        break;
                    case 1:
                        y3 y3Var3 = this.b.y;
                        l3 l3Var2 = y3Var3.O;
                        if (!l3Var2.b) {
                            l3Var2.b = true;
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            break;
                        }
                        break;
                    default:
                        p3 p3Var = this.b;
                        y3 y3Var4 = p3Var.y;
                        o3 o3Var = new o3(p3Var, p3Var.getContext(), y3Var4.s);
                        y3Var4.f = o3Var;
                        LinearLayout linearLayout3 = p3Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.i0.L(8.0f);
                        o3Var.a = true;
                        ((org.telegram.ui.ActionBar.k1) o3Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        final int i14 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: th.m3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        y3 y3Var2 = this.b.y;
                        l3 l3Var = y3Var2.O;
                        if (l3Var.b) {
                            l3Var.b = false;
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            break;
                        }
                        break;
                    case 1:
                        y3 y3Var3 = this.b.y;
                        l3 l3Var2 = y3Var3.O;
                        if (!l3Var2.b) {
                            l3Var2.b = true;
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            break;
                        }
                        break;
                    default:
                        p3 p3Var = this.b;
                        y3 y3Var4 = p3Var.y;
                        o3 o3Var = new o3(p3Var, p3Var.getContext(), y3Var4.s);
                        y3Var4.f = o3Var;
                        LinearLayout linearLayout3 = p3Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.i0.L(8.0f);
                        o3Var.a = true;
                        ((org.telegram.ui.ActionBar.k1) o3Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.y.T) {
            int i10 = this.s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.c;
            if (i10 == 0) {
                textView2.getHitRect(org.telegram.messenger.i0.Q);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.i0.Q);
                f7 = 1.0f;
            }
            Rect rect = org.telegram.messenger.i0.Q;
            RectF rectF = this.n;
            rectF.set(rect);
            float f11 = this.r;
            if (f11 != 1.0f) {
                f10 = org.telegram.messenger.i0.T1(this.f, f10, f11);
                f7 = org.telegram.messenger.i0.T1(this.h, f7, this.r);
                org.telegram.messenger.i0.Z1(this.e, rectF, this.r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.b);
        }
        super.dispatchDraw(canvas);
    }
}
