// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class vl7 extends FrameLayout {
    public final TextView a;
    public final hn b;
    public final TextView c;
    public final ImageView d;
    public final ul7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final byte r;
    public boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    public vl7(Context context, int i, int i2, boolean z, wjb wjbVar) {
        super(context);
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        this.h = true;
        setWillNotDraw(false);
        this.r = i2;
        if (z) {
            ImageView imageView = new ImageView(context);
            this.d = imageView;
            imageView.setFocusable(false);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, nme.d(48, 48.0f, (k96.a0 ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, wjbVar);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = k96.a0;
        int i3 = (z2 ? 5 : 3) | 48;
        if (z2) {
            f = 80.0f;
        } else {
            f = z ? 64 : i;
        }
        int i4 = (i2 - 70) / 2;
        float f7 = i4 + 13;
        if (z2) {
            f2 = z ? 64 : i;
        } else {
            f2 = 80.0f;
        }
        addView(textView, nme.d(-1, -2.0f, i3, f, f7, f2, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.b = hnVar;
        hnVar.b(0.55f, 320L, s33.h);
        int i5 = bkb.y6;
        zkb.U(hnVar, i5, wjbVar);
        hnVar.setTextSize(gl.L(13.0f));
        hnVar.setGravity(k96.a0 ? 5 : 3);
        hnVar.setPadding(0, 0, 0, 0);
        hnVar.setEllipsizeByGradient(true);
        boolean z3 = k96.a0;
        int i6 = (z3 ? 5 : 3) | 48;
        if (z3) {
            f3 = 80.0f;
        } else {
            f3 = z ? 64 : i;
        }
        float f8 = (29 - (z ? 2 : 0)) + i4;
        if (z3) {
            f4 = z ? 64 : i;
        } else {
            f4 = 80.0f;
        }
        addView(hnVar, nme.d(-1, -2.0f, i6, f3, f8, f4, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, i5, wjbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(k96.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z4 = k96.a0;
        int i7 = (z4 ? 5 : 3) | 48;
        if (z4) {
            f5 = 80.0f;
        } else {
            f5 = z ? 64 : i;
        }
        float f9 = (38 - (z ? 2 : 0)) + i4;
        if (z4) {
            f6 = z ? 64 : i;
        } else {
            f6 = 80.0f;
        }
        addView(textView2, nme.d(-2, -2.0f, i7, f5, f9, f6, 0.0f));
        ul7 ul7Var = new ul7(this, context, wjbVar);
        this.e = ul7Var;
        int i8 = bkb.L6;
        int i9 = bkb.M6;
        int i10 = bkb.c6;
        ul7Var.d(i8, i9, i10, i10);
        addView(ul7Var, nme.d(37, 40.0f, (k96.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        ul7Var.setFocusable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
        this.a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i);
            zkb.s(imageView, bkb.I5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z5 = this.s;
        ul7 ul7Var = this.e;
        ul7Var.b(i2, z, z5);
        setMultiline(z2);
        boolean z6 = this.n;
        hn hnVar = this.b;
        TextView textView = this.c;
        if (z6) {
            textView.setText(charSequence2);
        } else {
            hnVar.c(charSequence2, z4, true);
        }
        if (this.n) {
            hnVar = textView;
        }
        hnVar.setVisibility(0);
        ul7Var.setContentDescription(charSequence);
        this.f = z3;
    }

    public Switch getCheckBox() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.f) {
            boolean z = k96.a0;
            ImageView imageView = this.d;
            if (z) {
                L = 0.0f;
            } else {
                L = gl.L(imageView != null ? 64.0f : 20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(imageView != null ? 64.0f : 20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
        if (this.h) {
            int L2 = k96.a0 ? gl.L(76.0f) : ls6.x(76.0f, getMeasuredWidth(), 1);
            canvas.drawRect(L2, ug8.D(22.0f, getMeasuredHeight(), 2), L2 + 2, gl.L(22.0f) + r0, bkb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        if (this.n) {
            TextView textView = this.c;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                sb.append("\n");
                sb.append(textView.getText());
            }
        } else {
            hn hnVar = this.b;
            if (hnVar != null && !TextUtils.isEmpty(hnVar.getText())) {
                sb.append("\n");
                sb.append(hnVar.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.n) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(this.r), TLObject.FLAG_30));
        }
    }

    public void setAnimationsEnabled(boolean z) {
        this.s = z;
    }

    public void setChecked(boolean z) {
        this.e.c(z, true);
    }

    public void setDrawLine(boolean z) {
        this.h = z;
    }

    public void setMultiline(boolean z) {
        this.n = z;
        hn hnVar = this.b;
        TextView textView = this.c;
        if (z) {
            textView.setVisibility(0);
            hnVar.setVisibility(8);
            textView.setPadding(0, 0, 0, gl.L(14.0f));
        } else {
            textView.setVisibility(8);
            hnVar.setVisibility(0);
            hnVar.setPadding(0, 0, 0, 0);
        }
    }

    public void setValue(CharSequence charSequence) {
        if (this.n) {
            this.c.setText(charSequence);
        } else {
            this.b.c(charSequence, true, true);
        }
    }

    public int a(int i) {
        return i;
    }

    public vl7(Context context) {
        this(context, 21, 70, false, null);
    }
}
