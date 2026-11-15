package pg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public qm0 a;
    public float b;
    public float c;
    public float d;
    public j6 e;
    public String f;
    public TextPaint h;
    public int n;

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
        canvas.drawText(this.f, g0.L(24.0f), g0.L(24.0f), textPaint);
        textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - g0.L(8.0f)) - textPaint.measureText(format), this.a.getY() + g0.L(23.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.n != size) {
            qm0 qm0Var = this.a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f10 = this.b;
            qm0Var.setProgress((floatValue - f10) / (this.c - f10));
            this.n = size;
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return super.performAccessibilityAction(i7, bundle) || this.a.getSeekBarAccessibilityDelegate().g(this, i7, bundle);
    }
}
