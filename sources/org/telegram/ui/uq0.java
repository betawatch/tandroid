package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uq0 extends FrameLayout {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uq0(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 12:
                org.telegram.ui.ActionBar.l6.i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.l6.i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.l6.i3.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 14:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 14:
                return false;
            case 16:
                return super.drawChild(canvas, view, j3);
            case 20:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 15:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int intrinsicHeight = org.telegram.ui.ActionBar.l6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.l6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.l6.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.l6.j2);
                break;
            case 11:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.l6.k0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 8:
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getMeasuredWidth() + i13 > getMeasuredWidth()) {
                        i14 += getChildAt(i15).getMeasuredHeight();
                        i13 = 0;
                    }
                    getChildAt(i15).layout(i13, i14, getChildAt(i15).getMeasuredWidth() + i13, getChildAt(i15).getMeasuredHeight() + i14);
                    i13 += getChildAt(i15).getMeasuredWidth();
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, i10);
                setPivotY(getMeasuredHeight());
                break;
            case 5:
                super.onMeasure(i7, org.telegram.messenger.camera.q.B(36.0f, View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            case 6:
                super.onMeasure(i7, i10);
                break;
            case 8:
                int size = View.MeasureSpec.getSize(i7);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
                int childCount = getChildCount();
                int measuredHeight = childCount > 0 ? getChildAt(0).getMeasuredHeight() : 0;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (getChildAt(i13).getMeasuredWidth() + i11 > size) {
                        i12 += getChildAt(i13).getMeasuredHeight();
                        i11 = 0;
                    }
                    i11 += getChildAt(i13).getMeasuredWidth();
                }
                setMeasuredDimension(getMeasuredWidth(), getChildCount() != 0 ? org.telegram.messenger.g0.L(16.0f) + measuredHeight + i12 : 0);
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(500.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(500.0f), TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 14:
                return false;
            case 17:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(org.telegram.ui.Components.n20 n20Var, Context context, int i7, String str, CharSequence charSequence) {
        super(context);
        this.a = 4;
        boolean z9 = org.telegram.messenger.id.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.x(this, mutate, i10, n20Var.I0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, c8.ha.d(24, 24.0f, z9 ? 5 : 3, z9 ? 0.0f : 27.0f, 6.0f, z9 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.messenger.k5.n(textView, i10, n20Var.I0, 1, 14.0f);
        addView(textView, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, z9 ? 27.0f : 68.0f, 0.0f, z9 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(getContext(), null);
        x70Var.setText(charSequence);
        x70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.Dj, n20Var.I0);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, n20Var.I0);
        x70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        x70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(x70Var, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, (z9 ? 27 : 68) - 4, 18.0f, (z9 ? 68 : 27) - 4, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(vy0 vy0Var, Context context, int i7, String str, CharSequence charSequence) {
        super(context);
        this.a = 3;
        boolean z9 = org.telegram.messenger.id.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.x(this, mutate, i10, vy0Var.I0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, c8.ha.d(24, 24.0f, z9 ? 5 : 3, z9 ? 0.0f : 27.0f, 6.0f, z9 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.messenger.k5.n(textView, i10, vy0Var.I0, 1, 14.0f);
        addView(textView, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, z9 ? 27.0f : 68.0f, 0.0f, z9 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(getContext(), null);
        x70Var.setText(charSequence);
        x70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.Dj, vy0Var.I0);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, vy0Var.I0);
        x70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(x70Var, c8.ha.d(-2, -2.0f, z9 ? 5 : 3, z9 ? 27.0f : 68.0f, 18.0f, z9 ? 68.0f : 27.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(Context context, zh.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = 22;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.e(-1, -2, 23));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setImageDrawable(new org.telegram.ui.Components.ah0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        f10.addView(l9Var, c8.ha.r(org.telegram.messenger.qs.O1, org.telegram.messenger.qs.O1, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.id.M0(2131750011, null));
        f10.addView(textView, c8.ha.t(-2, -2, 17, 32, 12, 32, 9));
        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(context, null);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.A6, g6Var);
        x70Var.setTextSize(1, 14.0f);
        x70Var.setGravity(17);
        x70Var.setText(org.telegram.messenger.id.M0(2131750012, null));
        x70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        f10.addView(x70Var, c8.ha.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i7 = org.telegram.ui.ActionBar.l6.Ci;
        org.telegram.ui.ActionBar.s6.U(textView2, i7, g6Var);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)), 6, 6);
        org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.1f, i7);
        textView2.setBackground(a02);
        org.telegram.ui.ActionBar.s6.j(textView2, a02, null, K, g6Var);
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.id.M0(2131750013, null));
        textView2.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        c8.ka.a(textView2);
        f10.addView(textView2, c8.ha.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(f2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(Context context) {
        super(context);
        this.a = 2;
        setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
    }
}
