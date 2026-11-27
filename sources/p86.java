// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class p86 extends FrameLayout {
    public final /* synthetic */ q86 E;
    public final ImageView a;
    public final LinearLayout b;
    public final xb c;
    public final in d;
    public final ImageView e;
    public final Switch f;
    public final og2 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p86(q86 q86Var, Context context) {
        super(context);
        this.E = q86Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i = aob.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i, null, mode);
        imageView.setVisibility(8);
        addView(imageView, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        xb xbVar = new xb(context, (byte) 23);
        this.c = xbVar;
        xbVar.setLines(1);
        xbVar.setSingleLine(true);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setTextSize(1, 16.0f);
        int i2 = aob.G6;
        yob.X(xbVar, i2, null);
        xbVar.setGravity(ob6.a0 ? 5 : 3);
        xbVar.setImportantForAccessibility(2);
        in inVar = new in(context, false, true, true);
        this.d = inVar;
        inVar.b(0.35f, 200L, k43.h);
        inVar.setTypeface(hl.o());
        inVar.setTextSize(hl.L(14.0f));
        yob.U(inVar, i2, null);
        inVar.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        yob.s(imageView2, i2, null, mode);
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(ob6.a0 ? 5 : 3);
        if (ob6.a0) {
            linearLayout.addView(imageView2, tre.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(inVar, tre.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(xbVar, tre.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(xbVar, tre.p(-2, -2, 1.0f, 16));
            linearLayout.addView(inVar, tre.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, tre.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        addView(linearLayout, tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r3 = new Switch(context, null);
        this.f = r3;
        r3.setVisibility(8);
        int i3 = aob.M6;
        int i4 = aob.N6;
        int i5 = aob.d6;
        r3.d(i3, i4, i5, i5);
        r3.setImportantForAccessibility(2);
        addView(r3, tre.d(37, 50.0f, (ob6.a0 ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        og2 og2Var = new og2(21, null, context);
        this.h = og2Var;
        og2Var.b(aob.h7, aob.j7, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(true, false);
        og2Var.setDrawBackgroundAsArc(10);
        og2Var.setVisibility(8);
        og2Var.setImportantForAccessibility(2);
        boolean z = ob6.a0;
        addView(og2Var, tre.d(21, 21.0f, (z ? 5 : 3) | 16, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
        setFocusable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r4 & org.telegram.tgnet.TLObject.FLAG_14) > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002f, code lost:
    
        if ((r4 & 4) > 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i) {
        boolean p = this.E.getUserConfig().p();
        int bitCount = Integer.bitCount(i);
        if (p) {
            if ((i & TLObject.FLAG_12) > 0) {
                bitCount--;
            }
            if ((i & TLObject.FLAG_13) > 0) {
                bitCount--;
            }
        } else {
            if ((i & 16) > 0) {
                bitCount--;
            }
            if ((i & 8) > 0) {
                bitCount--;
            }
        }
        if (xea.o() < 1 && (i & 256) > 0) {
            bitCount--;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (xea.o() < 1) {
                boolean z = f11.a;
            }
            return (hnb.c() || (i & 65536) <= 0) ? bitCount : bitCount - 1;
        }
        if ((262144 & i) > 0) {
            bitCount--;
        }
        if (hnb.c()) {
            return bitCount;
        }
    }

    public final void b(boolean z, boolean z2) {
        if (this.s != z) {
            this.s = z;
            og2 og2Var = this.h;
            Switch r1 = this.f;
            LinearLayout linearLayout = this.b;
            ImageView imageView = this.a;
            if (z2) {
                imageView.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                linearLayout.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                r1.animate().alpha(z ? 0.5f : 1.0f).setDuration(220L).start();
                ik8.s(og2Var.animate(), z ? 0.5f : 1.0f, 220L);
            } else {
                imageView.setAlpha(z ? 0.5f : 1.0f);
                linearLayout.setAlpha(z ? 0.5f : 1.0f);
                r1.setAlpha(z ? 0.5f : 1.0f);
                og2Var.setAlpha(z ? 0.5f : 1.0f);
            }
            setEnabled(!z);
        }
    }

    public final void c(k86 k86Var, boolean z) {
        int d = i86.d(true);
        int i = k86Var.e;
        this.x = a(d & i);
        this.y = a(i);
        boolean z2 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.x), Integer.valueOf(this.y));
        if (z && !ob6.a0) {
            z2 = true;
        }
        this.d.c(format, z2, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = ob6.a0;
        boolean z2 = this.r;
        xb xbVar = this.c;
        if (z) {
            if (z2) {
                float L = hl.L(75.0f);
                canvas.drawRect(L - hl.L(0.66f), (getMeasuredHeight() - hl.L(20.0f)) / 2.0f, L, (hl.L(20.0f) + getMeasuredHeight()) / 2.0f, aob.j0);
            }
            if (this.n) {
                canvas.drawLine((getMeasuredWidth() - hl.L(64.0f)) + (xbVar.getTranslationX() < 0.0f ? hl.L(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, aob.j0);
                return;
            }
            return;
        }
        if (z2) {
            float measuredWidth = getMeasuredWidth() - hl.L(75.0f);
            canvas.drawRect(measuredWidth - hl.L(0.66f), (getMeasuredHeight() - hl.L(20.0f)) / 2.0f, measuredWidth, (hl.L(20.0f) + getMeasuredHeight()) / 2.0f, aob.j0);
        }
        if (this.n) {
            canvas.drawLine(xbVar.getTranslationX() + hl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        og2 og2Var = this.h;
        accessibilityNodeInfo.setClassName(og2Var.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (og2Var.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(og2Var.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getText());
        if (this.w) {
            sb.append('\n');
            sb.append(ob6.a0("Of", null, 2131747556, Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }
}
