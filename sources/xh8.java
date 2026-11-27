// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xh8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final vnb h;

    public xh8(Context context, vnb vnbVar) {
        super(context);
        this.h = vnbVar;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.d(28, 28.0f, (ob6.a0 ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.G6, vnbVar);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = ob6.a0;
        addView(textView, tre.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 66.0f : 64.0f, 8.0f, z ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, aob.z6, vnbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(hl.L(1.66f), 1.0f);
        boolean z2 = ob6.a0;
        addView(textView2, tre.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 66.0f : 64.0f, 31.0f, z2 ? 64.0f : 66.0f, 10.0f));
        Switch r3 = new Switch(context, vnbVar);
        this.d = r3;
        int i = aob.M6;
        int i2 = aob.N6;
        int i3 = aob.d6;
        r3.d(i, i2, i3, i3);
        addView(r3, tre.d(37, 40.0f, (ob6.a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r3.setFocusable(false);
    }

    public final void a(String str, String str2, ol5 ol5Var, int i, boolean z) {
        this.a.setText(str);
        vnb vnbVar = this.h;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        n57 n57Var = new n57((byte) 1);
        n57Var.b(ol5Var.a, ol5Var.b);
        n57Var.b = a;
        ImageView imageView = this.c;
        imageView.setBackground(n57Var);
        imageView.setImageResource(i);
        boolean z2 = this.e;
        Switch r0 = this.d;
        r0.b(0, z, z2);
        this.b.setText(str2);
        r0.setContentDescription(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            vnb vnbVar = this.h;
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : aob.j0;
            if (d == null) {
                d = aob.j0;
            }
            Paint paint = d;
            if (paint != null) {
                canvas.drawLine(ob6.a0 ? 0.0f : hl.L(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(19.0f) : 0), getMeasuredHeight() - 1, paint);
            }
        }
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        TextView textView = this.b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z) {
        this.e = z;
    }

    public void setChecked(boolean z) {
        this.d.b(0, z, true);
    }

    public void setDivider(boolean z) {
        this.f = z;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
