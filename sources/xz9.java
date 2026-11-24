// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class xz9 extends FrameLayout {
    public final LinearLayout a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final RectF e;
    public float f;
    public float h;
    public final RectF n;
    public float r;
    public boolean s;
    public final l79 w;
    public ValueAnimator x;
    public final /* synthetic */ g0a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz9(g0a g0aVar, Context context) {
        super(context);
        this.y = g0aVar;
        final byte b = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i = bkb.h6;
        f53 f53Var = g0aVar.s;
        paint.setColor(bkb.v0(i, f53Var));
        LinearLayout linearLayout = new LinearLayout(context);
        final byte b2 = 0;
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(k96.M0(2131754283, null));
        int i2 = bkb.i5;
        zkb.X(textView, i2, f53Var);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setPadding(gl.L(12.0f), gl.L(4.0f), gl.L(12.0f), gl.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(k96.M0(2131751768, null));
        zkb.X(textView2, i2, f53Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setPadding(gl.L(12.0f), gl.L(4.0f), gl.L(12.0f), gl.L(4.0f));
        linearLayout.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        linearLayout.addView(textView, nme.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, nme.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
        ShapeDrawable b0 = bkb.b0(gl.L(26.0f), bkb.v0(i, f53Var));
        vkb M = zkb.M(i);
        linearLayout2.setBackground(b0);
        zkb.j(linearLayout2, b0, M, null, f53Var);
        linearLayout2.setOrientation(0);
        l79 l79Var = new l79(getContext());
        this.w = l79Var;
        l79Var.r = true;
        l79Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(l79Var);
        imageView.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
        linearLayout2.addView(imageView, nme.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, nme.o(16, 26));
        addView(linearLayout, nme.c(-2.0f, -2));
        addView(linearLayout2, nme.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: uz9
            public final /* synthetic */ xz9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                xz9 xz9Var = this.b;
                switch (b3) {
                    case 0:
                        g0a g0aVar2 = xz9Var.y;
                        tz9 tz9Var = g0aVar2.P;
                        if (tz9Var.b) {
                            tz9Var.b = false;
                            g0aVar2.g(true);
                            g0aVar2.e();
                            break;
                        }
                        break;
                    case 1:
                        g0a g0aVar3 = xz9Var.y;
                        tz9 tz9Var2 = g0aVar3.P;
                        if (!tz9Var2.b) {
                            tz9Var2.b = true;
                            g0aVar3.g(true);
                            g0aVar3.e();
                            break;
                        }
                        break;
                    default:
                        g0a g0aVar4 = xz9Var.y;
                        wz9 wz9Var = new wz9(xz9Var, xz9Var.getContext(), g0aVar4.s);
                        g0aVar4.f = wz9Var;
                        LinearLayout linearLayout3 = xz9Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - gl.L(8.0f);
                        wz9Var.a = true;
                        ((m8) wz9Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: uz9
            public final /* synthetic */ xz9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                xz9 xz9Var = this.b;
                switch (b3) {
                    case 0:
                        g0a g0aVar2 = xz9Var.y;
                        tz9 tz9Var = g0aVar2.P;
                        if (tz9Var.b) {
                            tz9Var.b = false;
                            g0aVar2.g(true);
                            g0aVar2.e();
                            break;
                        }
                        break;
                    case 1:
                        g0a g0aVar3 = xz9Var.y;
                        tz9 tz9Var2 = g0aVar3.P;
                        if (!tz9Var2.b) {
                            tz9Var2.b = true;
                            g0aVar3.g(true);
                            g0aVar3.e();
                            break;
                        }
                        break;
                    default:
                        g0a g0aVar4 = xz9Var.y;
                        wz9 wz9Var = new wz9(xz9Var, xz9Var.getContext(), g0aVar4.s);
                        g0aVar4.f = wz9Var;
                        LinearLayout linearLayout3 = xz9Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - gl.L(8.0f);
                        wz9Var.a = true;
                        ((m8) wz9Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        final byte b3 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: uz9
            public final /* synthetic */ xz9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                xz9 xz9Var = this.b;
                switch (b32) {
                    case 0:
                        g0a g0aVar2 = xz9Var.y;
                        tz9 tz9Var = g0aVar2.P;
                        if (tz9Var.b) {
                            tz9Var.b = false;
                            g0aVar2.g(true);
                            g0aVar2.e();
                            break;
                        }
                        break;
                    case 1:
                        g0a g0aVar3 = xz9Var.y;
                        tz9 tz9Var2 = g0aVar3.P;
                        if (!tz9Var2.b) {
                            tz9Var2.b = true;
                            g0aVar3.g(true);
                            g0aVar3.e();
                            break;
                        }
                        break;
                    default:
                        g0a g0aVar4 = xz9Var.y;
                        wz9 wz9Var = new wz9(xz9Var, xz9Var.getContext(), g0aVar4.s);
                        g0aVar4.f = wz9Var;
                        LinearLayout linearLayout3 = xz9Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - gl.L(8.0f);
                        wz9Var.a = true;
                        ((m8) wz9Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Rect rect;
        float f;
        if (this.y.U) {
            boolean z = this.s;
            TextView textView = this.d;
            float f2 = 0.5f;
            TextView textView2 = this.c;
            if (z) {
                rect = gl.Q;
                textView.getHitRect(rect);
                f = 1.0f;
            } else {
                rect = gl.Q;
                textView2.getHitRect(rect);
                f = 0.5f;
                f2 = 1.0f;
            }
            RectF rectF = this.n;
            rectF.set(rect);
            float f3 = this.r;
            if (f3 != 1.0f) {
                f2 = gl.R1(this.f, f2, f3);
                f = gl.R1(this.h, f, this.r);
                gl.X1(this.e, rectF, this.r, rectF);
            }
            textView2.setAlpha(f2);
            textView.setAlpha(f);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.b);
        }
        super.dispatchDraw(canvas);
    }
}
