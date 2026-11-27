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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qmb extends FrameLayout {
    public byte E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final vnb a;
    public final TextView b;
    public final in c;
    public final e29 d;
    public de0 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final byte s;
    public boolean w;
    public float x;
    public float y;

    public qmb(int i, vnb vnbVar, Context context) {
        super(context);
        boolean z = f11.a;
        this.I = false;
        this.a = vnbVar;
        this.s = (byte) 21;
        TextView textView = new TextView(context);
        this.b = textView;
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        yob.X(textView, aob.G6, vnbVar);
        addView(textView, tre.d(-1, -1.0f, (ob6.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        in inVar = new in(context, true, true, !ob6.a0);
        this.c = inVar;
        inVar.b(0.55f, 320L, k43.h);
        inVar.setTextSize(hl.L(16.0f));
        inVar.setGravity((ob6.a0 ? 3 : 5) | 16);
        yob.U(inVar, aob.I6, vnbVar);
        addView(inVar, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, 17.0f, 0.0f, 17.0f, 0.0f));
        e29 e29Var = new e29(context);
        this.d = e29Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e29Var.setScaleType(scaleType);
        int i2 = aob.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(e29Var, i2, vnbVar, mode);
        e29Var.setVisibility(8);
        addView(e29Var, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        yob.s(imageView, i2, vnbVar, mode);
        addView(imageView, tre.d(-2, -2.0f, (ob6.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        setEnabled(z);
        ImageView imageView = this.f;
        in inVar = this.c;
        TextView textView = this.b;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z ? 1.0f : 0.5f));
            if (inVar.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(inVar, "alpha", z ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z ? 1.0f : 0.5f);
        if (inVar.getVisibility() == 0) {
            inVar.setAlpha(z ? 1.0f : 0.5f);
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
        in inVar = this.c;
        if (charSequence2 != null) {
            inVar.c(charSequence2, z, true);
            inVar.setVisibility(0);
        } else {
            inVar.setVisibility(4);
        }
        this.h = z2;
        setWillNotDraw(!z2);
        requestLayout();
    }

    public final void d() {
        int i = ob6.a0 ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i | 16);
        removeView(textView);
        int i2 = (ob6.a0 ? 5 : 3) | 48;
        float f = this.s;
        addView(textView, tre.d(-1, -1.0f, i2, f, 0.0f, f, 0.0f));
        int i3 = ob6.a0 ? 3 : 5;
        in inVar = this.c;
        inVar.setGravity(i3 | 16);
        removeView(inVar);
        addView(inVar, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, tre.d(-2, -2.0f, (ob6.a0 ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (this.r || this.y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(aob.v0(aob.O5, this.a));
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
            RectF rectF = hl.P;
            int measuredWidth = getMeasuredWidth();
            float f6 = this.s;
            rectF.set((measuredWidth - hl.L(f6)) - hl.L(this.E), measuredHeight - hl.L(3.0f), getMeasuredWidth() - hl.L(f6), hl.L(3.0f) + measuredHeight);
            if (ob6.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), this.H);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? r0 : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public de0 getValueBackupImageView() {
        if (this.e == null) {
            de0 de0Var = new de0(getContext());
            this.e = de0Var;
            float f = this.s - 4;
            addView(de0Var, tre.d(24, 24.0f, (ob6.a0 ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public in getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        de0 de0Var = this.e;
        if (de0Var == null || de0Var.getImageReceiver() == null || !(this.e.getImageReceiver().t() instanceof wl)) {
            return;
        }
        ((wl) this.e.getImageReceiver().t()).o(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.getText());
        in inVar = this.c;
        if (inVar == null || inVar.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) inVar.getText());
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
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - hl.L(34.0f);
        int i3 = this.I ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        e29 e29Var = this.d;
        if (e29Var.getVisibility() == 0) {
            e29Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.I) {
                i3 = ik8.B(8.0f, e29Var.getMeasuredWidth(), i3);
            }
        }
        de0 de0Var = this.e;
        if (de0Var != null) {
            de0Var.measure(View.MeasureSpec.makeMeasureSpec(de0Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.I) {
                i3 = ik8.B(8.0f, this.e.getMeasuredWidth(), i3);
            }
        }
        in inVar = this.c;
        if (inVar.getVisibility() == 0) {
            inVar.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.I ? ik8.B(8.0f, inVar.getMeasuredWidth(), i3) : (measuredWidth - inVar.getMeasuredWidth()) - hl.L(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z = ob6.a0;
                int i4 = this.s + 4;
                if (z) {
                    marginLayoutParams.leftMargin = inVar.getMeasuredWidth() + hl.L(i4);
                } else {
                    marginLayoutParams.rightMargin = inVar.getMeasuredWidth() + hl.L(i4);
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
        in inVar = this.c;
        if (inVar.getVisibility() == 0) {
            inVar.setAlpha((z || !this.n) ? 1.0f : 0.5f);
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
        e29 e29Var = this.d;
        if (i == 0) {
            e29Var.setVisibility(8);
            boolean z = ob6.a0;
            float f = this.s;
            if (z) {
                marginLayoutParams.rightMargin = hl.L(f);
                return;
            } else {
                marginLayoutParams.leftMargin = hl.L(f);
                return;
            }
        }
        e29Var.setImageResource(i);
        yob.s(e29Var, aob.m6, this.a, PorterDuff.Mode.MULTIPLY);
        e29Var.setBackground(null);
        e29Var.setVisibility(0);
        if (ob6.a0) {
            marginLayoutParams.rightMargin = hl.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = hl.L(58.0f);
        }
    }

    public void setTextColor(int i) {
        TextView textView = this.b;
        yob.q(textView);
        textView.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        in inVar = this.c;
        yob.q(inVar);
        inVar.setTextColor(i);
    }

    public qmb(Context context) {
        this(0, null, context);
    }

    public qmb(Context context, vnb vnbVar) {
        this(0, vnbVar, context);
    }
}
