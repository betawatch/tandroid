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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uib extends FrameLayout {
    public byte E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final wjb a;
    public final TextView b;
    public final hn c;
    public final ry8 d;
    public be0 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final byte s;
    public boolean w;
    public float x;
    public float y;

    public uib(int i, wjb wjbVar, Context context) {
        super(context);
        boolean z = w01.a;
        this.I = false;
        this.a = wjbVar;
        this.s = (byte) 21;
        TextView textView = new TextView(context);
        this.b = textView;
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        zkb.X(textView, bkb.F6, wjbVar);
        addView(textView, nme.d(-1, -1.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        hn hnVar = new hn(context, true, true, !k96.a0);
        this.c = hnVar;
        hnVar.b(0.55f, 320L, s33.h);
        hnVar.setTextSize(gl.L(16.0f));
        hnVar.setGravity((k96.a0 ? 3 : 5) | 16);
        zkb.U(hnVar, bkb.H6, wjbVar);
        addView(hnVar, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, 17.0f, 0.0f, 17.0f, 0.0f));
        ry8 ry8Var = new ry8(context);
        this.d = ry8Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ry8Var.setScaleType(scaleType);
        int i2 = bkb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(ry8Var, i2, wjbVar, mode);
        ry8Var.setVisibility(8);
        addView(ry8Var, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        zkb.s(imageView, i2, wjbVar, mode);
        addView(imageView, nme.d(-2, -2.0f, (k96.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        setEnabled(z);
        ImageView imageView = this.f;
        hn hnVar = this.c;
        TextView textView = this.b;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z ? 1.0f : 0.5f));
            if (hnVar.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(hnVar, "alpha", z ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z ? 1.0f : 0.5f);
        if (hnVar.getVisibility() == 0) {
            hnVar.setAlpha(z ? 1.0f : 0.5f);
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
        hn hnVar = this.c;
        if (charSequence2 != null) {
            hnVar.c(charSequence2, z, true);
            hnVar.setVisibility(0);
        } else {
            hnVar.setVisibility(4);
        }
        this.h = z2;
        setWillNotDraw(!z2);
        requestLayout();
    }

    public final void d() {
        int i = k96.a0 ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i | 16);
        removeView(textView);
        int i2 = (k96.a0 ? 5 : 3) | 48;
        float f = this.s;
        addView(textView, nme.d(-1, -1.0f, i2, f, 0.0f, f, 0.0f));
        int i3 = k96.a0 ? 3 : 5;
        hn hnVar = this.c;
        hnVar.setGravity(i3 | 16);
        removeView(hnVar);
        addView(hnVar, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, nme.d(-2, -2.0f, (k96.a0 ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (this.r || this.y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(bkb.v0(bkb.N5, this.a));
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
            RectF rectF = gl.P;
            int measuredWidth = getMeasuredWidth();
            float f6 = this.s;
            rectF.set((measuredWidth - gl.L(f6)) - gl.L(this.E), measuredHeight - gl.L(3.0f), getMeasuredWidth() - gl.L(f6), gl.L(3.0f) + measuredHeight);
            if (k96.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), this.H);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? r0 : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public be0 getValueBackupImageView() {
        if (this.e == null) {
            be0 be0Var = new be0(getContext());
            this.e = be0Var;
            float f = this.s - 4;
            addView(be0Var, nme.d(24, 24.0f, (k96.a0 ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public hn getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        be0 be0Var = this.e;
        if (be0Var == null || be0Var.getImageReceiver() == null || !(this.e.getImageReceiver().t() instanceof vl)) {
            return;
        }
        ((vl) this.e.getImageReceiver().t()).o(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.getText());
        hn hnVar = this.c;
        if (hnVar == null || hnVar.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) hnVar.getText());
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
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gl.L(34.0f);
        int i3 = this.I ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        ry8 ry8Var = this.d;
        if (ry8Var.getVisibility() == 0) {
            ry8Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.I) {
                i3 = ug8.B(8.0f, ry8Var.getMeasuredWidth(), i3);
            }
        }
        be0 be0Var = this.e;
        if (be0Var != null) {
            be0Var.measure(View.MeasureSpec.makeMeasureSpec(be0Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.I) {
                i3 = ug8.B(8.0f, this.e.getMeasuredWidth(), i3);
            }
        }
        hn hnVar = this.c;
        if (hnVar.getVisibility() == 0) {
            hnVar.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.I ? ug8.B(8.0f, hnVar.getMeasuredWidth(), i3) : (measuredWidth - hnVar.getMeasuredWidth()) - gl.L(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z = k96.a0;
                int i4 = this.s + 4;
                if (z) {
                    marginLayoutParams.leftMargin = hnVar.getMeasuredWidth() + gl.L(i4);
                } else {
                    marginLayoutParams.rightMargin = hnVar.getMeasuredWidth() + gl.L(i4);
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
        hn hnVar = this.c;
        if (hnVar.getVisibility() == 0) {
            hnVar.setAlpha((z || !this.n) ? 1.0f : 0.5f);
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
        ry8 ry8Var = this.d;
        if (i == 0) {
            ry8Var.setVisibility(8);
            boolean z = k96.a0;
            float f = this.s;
            if (z) {
                marginLayoutParams.rightMargin = gl.L(f);
                return;
            } else {
                marginLayoutParams.leftMargin = gl.L(f);
                return;
            }
        }
        ry8Var.setImageResource(i);
        zkb.s(ry8Var, bkb.l6, this.a, PorterDuff.Mode.MULTIPLY);
        ry8Var.setBackground(null);
        ry8Var.setVisibility(0);
        if (k96.a0) {
            marginLayoutParams.rightMargin = gl.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = gl.L(58.0f);
        }
    }

    public void setTextColor(int i) {
        TextView textView = this.b;
        zkb.q(textView);
        textView.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        hn hnVar = this.c;
        zkb.q(hnVar);
        hnVar.setTextColor(i);
    }

    public uib(Context context) {
        this(0, null, context);
    }

    public uib(Context context, wjb wjbVar) {
        this(0, wjbVar, context);
    }
}
