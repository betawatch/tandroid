// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vkb extends FrameLayout {
    public byte E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final ylb a;
    public final TextView b;
    public final io c;
    public final s09 d;
    public bf0 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final byte s;
    public boolean w;
    public float x;
    public float y;

    public vkb(int i, ylb ylbVar, Context context) {
        super(context);
        boolean z = e21.a;
        this.I = false;
        this.a = ylbVar;
        this.s = (byte) 21;
        TextView textView = new TextView(context);
        this.b = textView;
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        anb.X(textView, cmb.F6, ylbVar);
        addView(textView, qoe.d(-1, -1.0f, (jb6.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        io ioVar = new io(context, true, true, !jb6.a0);
        this.c = ioVar;
        ioVar.b(0.55f, 320L, d53.h);
        ioVar.setTextSize(gm.L(16.0f));
        ioVar.setGravity((jb6.a0 ? 3 : 5) | 16);
        anb.U(ioVar, cmb.H6, ylbVar);
        addView(ioVar, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 17.0f, 0.0f, 17.0f, 0.0f));
        s09 s09Var = new s09(context);
        this.d = s09Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        s09Var.setScaleType(scaleType);
        int i2 = cmb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(s09Var, i2, ylbVar, mode);
        s09Var.setVisibility(8);
        addView(s09Var, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        anb.s(imageView, i2, ylbVar, mode);
        addView(imageView, qoe.d(-2, -2.0f, (jb6.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        setEnabled(z);
        ImageView imageView = this.f;
        io ioVar = this.c;
        TextView textView = this.b;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z ? 1.0f : 0.5f));
            if (ioVar.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(ioVar, "alpha", z ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z ? 1.0f : 0.5f);
        if (ioVar.getVisibility() == 0) {
            ioVar.setAlpha(z ? 1.0f : 0.5f);
        }
        if (imageView.getVisibility() == 0) {
            imageView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public final void b(CharSequence charSequence, boolean z) {
        this.b.setText(charSequence);
        this.c.setVisibility(4);
        this.f.setVisibility(4);
        this.h = z;
        setWillNotDraw(!z);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.b.setText(charSequence);
        this.f.setVisibility(4);
        io ioVar = this.c;
        if (charSequence2 != null) {
            ioVar.c(charSequence2, z, true);
            ioVar.setVisibility(0);
        } else {
            ioVar.setVisibility(4);
        }
        this.h = z2;
        setWillNotDraw(!z2);
        requestLayout();
    }

    public final void d() {
        int i = jb6.a0 ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i | 16);
        removeView(textView);
        int i2 = (jb6.a0 ? 5 : 3) | 48;
        float f = this.s;
        addView(textView, qoe.d(-1, -1.0f, i2, f, 0.0f, f, 0.0f));
        int i3 = jb6.a0 ? 3 : 5;
        io ioVar = this.c;
        ioVar.setGravity(i3 | 16);
        removeView(ioVar);
        addView(ioVar, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, qoe.d(-2, -2.0f, (jb6.a0 ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (this.r || this.y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(cmb.v0(cmb.N5, this.a));
            }
            boolean z = this.w;
            float f2 = this.x;
            if (z) {
                f = f2 + 0.016f;
                this.x = f;
                if (f > 1.0f) {
                    this.x = 1.0f;
                    this.w = false;
                    f = 1.0f;
                }
            } else {
                f = f2 - 0.016f;
                this.x = f;
                if (f < 0.0f) {
                    this.x = 0.0f;
                    this.w = true;
                    f = 0.0f;
                }
            }
            int i = this.G;
            if (i > 0) {
                this.G = i - 15;
            } else {
                boolean z2 = this.r;
                float f3 = this.y;
                if (z2) {
                    if (f3 != 1.0f) {
                        float f4 = f3 + 0.10666667f;
                        this.y = f4;
                        if (f4 > 1.0f) {
                            this.y = 1.0f;
                        }
                    }
                } else if (f3 != 0.0f) {
                    float f5 = f3 - 0.10666667f;
                    this.y = f5;
                    if (f5 < 0.0f) {
                        this.y = 0.0f;
                    }
                }
            }
            this.H.setAlpha((int) (((f * 0.4f) + 0.6f) * this.y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = gm.P;
            int measuredWidth = getMeasuredWidth();
            float f6 = this.s;
            rectF.set((measuredWidth - gm.L(f6)) - gm.L(this.E), measuredHeight - gm.L(3.0f), getMeasuredWidth() - gm.L(f6), gm.L(3.0f) + measuredHeight);
            if (jb6.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), this.H);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? r0 : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public bf0 getValueBackupImageView() {
        if (this.e == null) {
            bf0 bf0Var = new bf0(getContext());
            this.e = bf0Var;
            float f = this.s - 4;
            addView(bf0Var, qoe.d(24, 24.0f, (jb6.a0 ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public io getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bf0 bf0Var = this.e;
        if (bf0Var == null || bf0Var.getImageReceiver() == null || !(this.e.getImageReceiver().t() instanceof vm)) {
            return;
        }
        ((vm) this.e.getImageReceiver().t()).o(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.getText());
        io ioVar = this.c;
        if (ioVar == null || ioVar.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) ioVar.getText());
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.F || getParent() == null) {
            return;
        }
        this.G = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gm.L(34.0f);
        int i3 = this.I ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        s09 s09Var = this.d;
        if (s09Var.getVisibility() == 0) {
            s09Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.I) {
                i3 = wi8.B(8.0f, s09Var.getMeasuredWidth(), i3);
            }
        }
        bf0 bf0Var = this.e;
        if (bf0Var != null) {
            bf0Var.measure(View.MeasureSpec.makeMeasureSpec(bf0Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.I) {
                i3 = wi8.B(8.0f, this.e.getMeasuredWidth(), i3);
            }
        }
        io ioVar = this.c;
        if (ioVar.getVisibility() == 0) {
            ioVar.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.I ? wi8.B(8.0f, ioVar.getMeasuredWidth(), i3) : (measuredWidth - ioVar.getMeasuredWidth()) - gm.L(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z = jb6.a0;
                int i4 = this.s + 4;
                if (z) {
                    marginLayoutParams.leftMargin = ioVar.getMeasuredWidth() + gm.L(i4);
                } else {
                    marginLayoutParams.rightMargin = ioVar.getMeasuredWidth() + gm.L(i4);
                }
            }
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setBetterLayout(boolean z) {
        this.I = z;
    }

    public void setCanDisable(boolean z) {
        this.n = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        float f = 1.0f;
        this.b.setAlpha((z || !this.n) ? 1.0f : 0.5f);
        io ioVar = this.c;
        if (ioVar.getVisibility() == 0) {
            ioVar.setAlpha((z || !this.n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z && this.n) {
                f = 0.5f;
            }
            imageView.setAlpha(f);
        }
    }

    public void setIcon(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        s09 s09Var = this.d;
        if (i == 0) {
            s09Var.setVisibility(8);
            boolean z = jb6.a0;
            float f = this.s;
            if (z) {
                marginLayoutParams.rightMargin = gm.L(f);
                return;
            } else {
                marginLayoutParams.leftMargin = gm.L(f);
                return;
            }
        }
        s09Var.setImageResource(i);
        anb.s(s09Var, cmb.l6, this.a, PorterDuff.Mode.MULTIPLY);
        s09Var.setBackground(null);
        s09Var.setVisibility(0);
        if (jb6.a0) {
            marginLayoutParams.rightMargin = gm.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = gm.L(58.0f);
        }
    }

    public void setTextColor(int i) {
        TextView textView = this.b;
        anb.q(textView);
        textView.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        io ioVar = this.c;
        anb.q(ioVar);
        ioVar.setTextColor(i);
    }

    public vkb(Context context) {
        this(0, null, context);
    }

    public vkb(Context context, ylb ylbVar) {
        this(0, ylbVar, context);
    }
}
