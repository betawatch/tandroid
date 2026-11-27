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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class r3a extends FrameLayout {
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
    public final ya9 w;
    public ValueAnimator x;
    public final /* synthetic */ z3a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3a(z3a z3aVar, Context context) {
        super(context);
        this.y = z3aVar;
        final byte b = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i = aob.i6;
        x53 x53Var = z3aVar.s;
        paint.setColor(aob.v0(i, x53Var));
        LinearLayout linearLayout = new LinearLayout(context);
        final byte b2 = 0;
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(ob6.M0(2131754279, null));
        int i2 = aob.j5;
        yob.X(textView, i2, x53Var);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setPadding(hl.L(12.0f), hl.L(4.0f), hl.L(12.0f), hl.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(ob6.M0(2131751745, null));
        yob.X(textView2, i2, x53Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setPadding(hl.L(12.0f), hl.L(4.0f), hl.L(12.0f), hl.L(4.0f));
        linearLayout.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        linearLayout.addView(textView, tre.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, tre.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
        ShapeDrawable b0 = aob.b0(hl.L(26.0f), aob.v0(i, x53Var));
        uob M = yob.M(i);
        linearLayout2.setBackground(b0);
        yob.j(linearLayout2, b0, M, null, x53Var);
        linearLayout2.setOrientation(0);
        ya9 ya9Var = new ya9(getContext());
        this.w = ya9Var;
        ya9Var.r = true;
        ya9Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(ya9Var);
        imageView.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
        linearLayout2.addView(imageView, tre.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, tre.o(16, 26));
        addView(linearLayout, tre.c(-2.0f, -2));
        addView(linearLayout2, tre.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: o3a
            public final /* synthetic */ r3a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                r3a r3aVar = this.b;
                switch (b3) {
                    case 0:
                        z3a z3aVar2 = r3aVar.y;
                        n3a n3aVar = z3aVar2.P;
                        if (n3aVar.b) {
                            n3aVar.b = false;
                            z3aVar2.g(true);
                            z3aVar2.e();
                            break;
                        }
                        break;
                    case 1:
                        z3a z3aVar3 = r3aVar.y;
                        n3a n3aVar2 = z3aVar3.P;
                        if (!n3aVar2.b) {
                            n3aVar2.b = true;
                            z3aVar3.g(true);
                            z3aVar3.e();
                            break;
                        }
                        break;
                    default:
                        z3a z3aVar4 = r3aVar.y;
                        q3a q3aVar = new q3a(r3aVar, r3aVar.getContext(), z3aVar4.s);
                        z3aVar4.f = q3aVar;
                        LinearLayout linearLayout3 = r3aVar.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - hl.L(8.0f);
                        q3aVar.a = true;
                        ((n8) q3aVar.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: o3a
            public final /* synthetic */ r3a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                r3a r3aVar = this.b;
                switch (b3) {
                    case 0:
                        z3a z3aVar2 = r3aVar.y;
                        n3a n3aVar = z3aVar2.P;
                        if (n3aVar.b) {
                            n3aVar.b = false;
                            z3aVar2.g(true);
                            z3aVar2.e();
                            break;
                        }
                        break;
                    case 1:
                        z3a z3aVar3 = r3aVar.y;
                        n3a n3aVar2 = z3aVar3.P;
                        if (!n3aVar2.b) {
                            n3aVar2.b = true;
                            z3aVar3.g(true);
                            z3aVar3.e();
                            break;
                        }
                        break;
                    default:
                        z3a z3aVar4 = r3aVar.y;
                        q3a q3aVar = new q3a(r3aVar, r3aVar.getContext(), z3aVar4.s);
                        z3aVar4.f = q3aVar;
                        LinearLayout linearLayout3 = r3aVar.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - hl.L(8.0f);
                        q3aVar.a = true;
                        ((n8) q3aVar.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        final byte b3 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: o3a
            public final /* synthetic */ r3a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                r3a r3aVar = this.b;
                switch (b32) {
                    case 0:
                        z3a z3aVar2 = r3aVar.y;
                        n3a n3aVar = z3aVar2.P;
                        if (n3aVar.b) {
                            n3aVar.b = false;
                            z3aVar2.g(true);
                            z3aVar2.e();
                            break;
                        }
                        break;
                    case 1:
                        z3a z3aVar3 = r3aVar.y;
                        n3a n3aVar2 = z3aVar3.P;
                        if (!n3aVar2.b) {
                            n3aVar2.b = true;
                            z3aVar3.g(true);
                            z3aVar3.e();
                            break;
                        }
                        break;
                    default:
                        z3a z3aVar4 = r3aVar.y;
                        q3a q3aVar = new q3a(r3aVar, r3aVar.getContext(), z3aVar4.s);
                        z3aVar4.f = q3aVar;
                        LinearLayout linearLayout3 = r3aVar.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - hl.L(8.0f);
                        q3aVar.a = true;
                        ((n8) q3aVar.b).showAsDropDown(linearLayout3, 0, L);
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
                rect = hl.Q;
                textView.getHitRect(rect);
                f = 1.0f;
            } else {
                rect = hl.Q;
                textView2.getHitRect(rect);
                f = 0.5f;
                f2 = 1.0f;
            }
            RectF rectF = this.n;
            rectF.set(rect);
            float f3 = this.r;
            if (f3 != 1.0f) {
                f2 = hl.R1(this.f, f2, f3);
                f = hl.R1(this.h, f, this.r);
                hl.X1(this.e, rectF, this.r, rectF);
            }
            textView2.setAlpha(f2);
            textView.setAlpha(f);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.b);
        }
        super.dispatchDraw(canvas);
    }
}
