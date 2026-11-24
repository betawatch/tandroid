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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class yn7 extends FrameLayout {
    public final TextView a;
    public final io b;
    public final TextView c;
    public final ImageView d;
    public final xn7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final byte r;
    public boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    public yn7(Context context, int i, int i2, boolean z, ylb ylbVar) {
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
            addView(imageView, qoe.d(48, 48.0f, (jb6.a0 ? 5 : 3) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, ylbVar);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = jb6.a0;
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
        addView(textView, qoe.d(-1, -2.0f, i3, f, f7, f2, 0.0f));
        io ioVar = new io(context, false, false, false);
        this.b = ioVar;
        ioVar.b(0.55f, 320L, d53.h);
        int i5 = cmb.y6;
        anb.U(ioVar, i5, ylbVar);
        ioVar.setTextSize(gm.L(13.0f));
        ioVar.setGravity(jb6.a0 ? 5 : 3);
        ioVar.setPadding(0, 0, 0, 0);
        ioVar.setEllipsizeByGradient(true);
        boolean z3 = jb6.a0;
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
        addView(ioVar, qoe.d(-1, -2.0f, i6, f3, f8, f4, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, i5, ylbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setVisibility(8);
        boolean z4 = jb6.a0;
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
        addView(textView2, qoe.d(-2, -2.0f, i7, f5, f9, f6, 0.0f));
        xn7 xn7Var = new xn7(this, context, ylbVar);
        this.e = xn7Var;
        int i8 = cmb.L6;
        int i9 = cmb.M6;
        int i10 = cmb.c6;
        xn7Var.d(i8, i9, i10, i10);
        addView(xn7Var, qoe.d(37, 40.0f, (jb6.a0 ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        xn7Var.setFocusable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
        this.a.setText(charSequence);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i);
            anb.s(imageView, cmb.I5, null, PorterDuff.Mode.MULTIPLY);
        }
        boolean z5 = this.s;
        xn7 xn7Var = this.e;
        xn7Var.b(i2, z, z5);
        setMultiline(z2);
        boolean z6 = this.n;
        io ioVar = this.b;
        TextView textView = this.c;
        if (z6) {
            textView.setText(charSequence2);
        } else {
            ioVar.c(charSequence2, z4, true);
        }
        if (this.n) {
            ioVar = textView;
        }
        ioVar.setVisibility(0);
        xn7Var.setContentDescription(charSequence);
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
            boolean z = jb6.a0;
            ImageView imageView = this.d;
            if (z) {
                L = 0.0f;
            } else {
                L = gm.L(imageView != null ? 64.0f : 20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(imageView != null ? 64.0f : 20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
        if (this.h) {
            int L2 = jb6.a0 ? gm.L(76.0f) : kt6.y(76.0f, getMeasuredWidth(), 1);
            canvas.drawRect(L2, wi8.D(22.0f, getMeasuredHeight(), 2), L2 + 2, gm.L(22.0f) + r0, cmb.j0);
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
            io ioVar = this.b;
            if (ioVar != null && !TextUtils.isEmpty(ioVar.getText())) {
                sb.append("\n");
                sb.append(ioVar.getText());
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.r), TLObject.FLAG_30));
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
        io ioVar = this.b;
        TextView textView = this.c;
        if (z) {
            textView.setVisibility(0);
            ioVar.setVisibility(8);
            textView.setPadding(0, 0, 0, gm.L(14.0f));
        } else {
            textView.setVisibility(8);
            ioVar.setVisibility(0);
            ioVar.setPadding(0, 0, 0, 0);
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

    public yn7(Context context) {
        this(context, 21, 70, false, null);
    }
}
