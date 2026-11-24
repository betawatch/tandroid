// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yz1 extends FrameLayout {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final View c;
    public final Object d;
    public final Object e;
    public final Object f;

    public yz1(Activity activity, boolean z) {
        super(activity);
        this.b = false;
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        anb.X(textView, cmb.F6, null);
        linearLayout.addView(textView, qoe.t(-1, -2, 0, 0, 0, z ? 64 : 0, 0));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        anb.X(textView2, cmb.x6, null);
        linearLayout.addView(textView2, qoe.t(-1, -2, 0, 0, 4, z ? 64 : 0, 0));
        setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        if (z) {
            Switch r3 = new Switch(activity, null);
            this.f = r3;
            r3.setDrawIconType(1);
            addView(r3, qoe.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                if (this.b) {
                    canvas.drawRect(gm.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), cmb.j0);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                if (!(view instanceof lka) || !this.b) {
                    return super.drawChild(canvas, view, j);
                }
                lka lkaVar = (lka) view;
                canvas.save();
                canvas.scale(0.8f, 0.8f);
                canvas.translate(-gm.L(12.0f), gm.L(6.0f));
                int color = lkaVar.getTextPaint().getColor();
                lkaVar.getTextPaint().setColor(-1);
                boolean drawChild = super.drawChild(canvas, view, j);
                lkaVar.getTextPaint().setColor(color);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.f;
                RectF rectF = (RectF) this.d;
                if (this.b) {
                    canvas.save();
                    int L = gm.L(26.0f);
                    canvas.translate(gm.L(5.0f), (getMeasuredHeight() - L) / 2.0f);
                    float f = L;
                    rectF.set(-gm.L(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f);
                    float f2 = f / 2.0f;
                    canvas.drawRoundRect(rectF, f2, f2, (Paint) this.e);
                    canvas.translate(((getMeasuredWidth() - getPaddingEnd()) - gm.L(6.0f)) - drawable.getIntrinsicWidth(), gm.L(5.0f));
                    drawable.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Switch r0 = (Switch) this.f;
                if (r0 != null) {
                    accessibilityNodeInfo.setClassName("android.widget.Switch");
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(r0.h);
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) ((TextView) this.d).getText());
                    sb.append("\n");
                    sb.append((Object) ((TextView) this.e).getText());
                    sb.append("\n");
                    sb.append(jb6.M0(r0.h ? 2131747625 : 2131747627, null));
                    accessibilityNodeInfo.setText(sb.toString());
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                ((Paint) this.e).setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    public yz1(Activity activity) {
        super(activity);
        this.d = new RectF();
        this.e = new Paint(1);
        this.b = false;
        lka lkaVar = new lka(activity);
        this.c = lkaVar;
        addView(lkaVar, qoe.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        rve.a(this);
    }
}
