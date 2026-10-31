package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k7;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sg.b0 b0Var, Context context) {
        super(context);
        this.a = 4;
        this.c = b0Var;
        this.b = new k7(this, 7);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.b;
        if (z10) {
            org.telegram.messenger.i0.Q3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.c).setText(charSequence);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 4:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                sg.b0 b0Var = (sg.b0) this.c;
                if (!b0Var.k) {
                    return true;
                }
                b0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z10) {
        switch (this.a) {
            case 4:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.a) {
            case 5:
                Path path = (Path) this.b;
                vh.z3 z3Var = (vh.z3) this.c;
                if (z3Var.h == null || (!((z10 = z3Var.f) && view == z3Var.d) && (z10 || view != z3Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? z3Var.e : 1.0f - z3Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 4:
                sg.b0 b0Var = (sg.b0) this.c;
                float f7 = b0Var.u;
                float f10 = rect.bottom;
                if (f7 != f10 && b0Var.v) {
                    b0Var.u = f10;
                    k kVar = b0Var.c;
                    sg.a0 a0Var = b0Var.a;
                    if (!b0Var.q) {
                        float f11 = b0Var.t;
                        int L = org.telegram.messenger.i0.L(32.0f);
                        int i10 = b0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            L = org.telegram.messenger.i0.L(24.0f);
                        }
                        float f12 = L;
                        if (a0Var.getMeasuredHeight() + f11 > (kVar.getMeasuredHeight() - b0Var.u) - f12) {
                            f11 = ((kVar.getMeasuredHeight() - b0Var.u) - a0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        a0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new sg.u(b0Var, 1)).setInterpolator(gr.f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 3:
                super.onAttachedToWindow();
                ((sg.k) this.b).c();
                break;
            case 4:
                super.onAttachedToWindow();
                setTag(R.id.bulletin_delegate_tag, (k7) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 3:
                super.onDetachedFromWindow();
                ((sg.k) this.b).d();
                break;
            case 4:
                super.onDetachedFromWindow();
                setTag(R.id.bulletin_delegate_tag, null);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        float f7;
        StaticLayout staticLayout;
        float f10;
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(8.0f);
                TextView textView = (TextView) this.c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f11 = size;
                    if (measureText > f11) {
                        textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                f10 = 12.0f;
                                z10 = true;
                                i12 = 2;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            } else if (textPaint.measureText(split[i14]) > f11) {
                                staticLayout = null;
                                z10 = true;
                                f10 = 12.0f;
                                i12 = 2;
                            } else {
                                i14++;
                            }
                        }
                        if (staticLayout == null || staticLayout.getLineCount() > i12) {
                            f7 = Math.max(8.0f, (f11 * f10) / measureText);
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i12;
                            f7 = 11.0f;
                        }
                    } else {
                        z10 = true;
                        i12 = 2;
                        i13 = 1;
                        f7 = 12.0f;
                    }
                    textView.setTextSize(z10 ? 1 : 0, f7);
                    textView.setMaxLines(i13);
                    textView.setSingleLine(i13 == z10 ? z10 ? 1 : 0 : false);
                    textView.setLineSpacing(0.0f, i13 == i12 ? 0.85f : 1.0f);
                    if (i13 == i12) {
                        z10 = false;
                    }
                    textView.setIncludeFontPadding(z10);
                    layoutParams.topMargin = org.telegram.messenger.i0.L(i13 == i12 ? 29.0f : 35.0f);
                    ((FrameLayout.LayoutParams) ((ImageView) this.b).getLayoutParams()).topMargin = org.telegram.messenger.i0.L(i13 == i12 ? 4.0f : 8.0f);
                }
                super.onMeasure(i10, i11);
                break;
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.b;
                zf.d dVar = (zf.d) this.c;
                if (!dVar.K || !dVar.J) {
                    int size2 = View.MeasureSpec.getSize(i11);
                    if (size2 == 0) {
                        size2 = viewGroup.getMeasuredHeight();
                    }
                    if (size2 == 0) {
                        size2 = (org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m;
                    }
                    int L = org.telegram.messenger.i0.L(50.0f);
                    int L2 = dVar.w != 0 ? 0 : org.telegram.messenger.i0.L(30.0f) + L;
                    if (!dVar.E && !dVar.x) {
                        L2 += L;
                    }
                    int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L2 < paddingTop ? paddingTop - L2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sg.o oVar, Context context) {
        super(context);
        this.a = 3;
        this.c = oVar;
        this.b = new sg.k(this, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zf.d dVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.a = 6;
        this.c = dVar;
        this.b = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, p6 p6Var) {
        super(context);
        this.a = 0;
        LinearLayout f7 = m5.f(context, 1);
        f6 f6Var = new f6(context, false, false, false);
        this.b = f6Var;
        int i10 = t6.G6;
        a7.Z(f6Var, i10, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(17.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(f6Var, b6.r(-2, 23, 1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 11.0f);
        a7.V(textView, i10, p6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7.addView(textView, b6.r(-2, -2, 1));
        addView(f7, b6.e(-2, -2, 17));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 2:
                super(context);
                ImageView imageView = new ImageView(context);
                this.b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, b6.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, b6.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                break;
            default:
                break;
        }
    }

    private final void a(boolean z10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vh.z3 z3Var, Context context) {
        super(context);
        this.a = 5;
        this.c = z3Var;
        this.b = new Path();
    }
}
