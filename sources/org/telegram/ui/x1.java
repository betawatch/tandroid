package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final m60 a;
    public final f4 b;
    public Drawable c;
    public z2 d;
    public z2 e;
    public final ImageReceiver f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public TL_iv.pageBlockMap y;

    public x1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.t6.S1;
        int i10 = org.telegram.ui.ActionBar.t6.df;
        m60 m60Var = this.a;
        ((h4) m60Var).getClass();
        paint.setColor(org.telegram.ui.ActionBar.t6.v0(i10));
        ImageReceiver imageReceiver = this.f;
        canvas.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), org.telegram.ui.ActionBar.t6.S1);
        float r10 = imageReceiver.r();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.t6.S4;
        int i11 = 0;
        int intrinsicWidth = (int) (r10 - (drawableArr[0].getIntrinsicWidth() / 2));
        int s10 = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s10, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s10);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.x == 2 && imageReceiver.L()) {
            if (this.c == null) {
                this.c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.c.getIntrinsicHeight() * 0.8f);
            int B = (int) c3.i0.B(imageReceiver.M0, intrinsicWidth2, 2.0f, imageReceiver.K0);
            int i12 = (int) (((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0);
            this.c.setAlpha((int) (imageReceiver.h1 * 255.0f));
            this.c.setBounds(B, i12, intrinsicWidth2 + B, intrinsicHeight + i12);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            h4.t(m60Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            h4.t(m60Var, canvas, this, i11);
            this.e.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, m60Var, this.y, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131748705, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int L;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockMap pageblockmap = this.y;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i13 = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(r0 * 14);
                this.n = i13;
                i14 = org.telegram.messenger.z20.w(18.0f, i13, size);
                L = i14;
            } else {
                this.n = org.telegram.messenger.i0.L(18.0f);
                i13 = 0;
                L = size - org.telegram.messenger.i0.L(36.0f);
                i14 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.y;
            int i16 = (int) ((i14 / pageblockmap2.w) * pageblockmap2.h);
            Point point = org.telegram.messenger.i0.q;
            int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.i0.L(56.0f)) * 0.9f);
            if (i16 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.y;
                i14 = (int) ((max / pageblockmap3.h) * pageblockmap3.w);
                i13 += ((size - i13) - i14) / 2;
                i15 = max;
            } else {
                i15 = i16;
            }
            float f7 = i13;
            float L2 = (this.h || this.y.level > 0) ? 0.0f : org.telegram.messenger.i0.L(8.0f);
            float f10 = i14;
            float f11 = i15;
            ImageReceiver imageReceiver = this.f;
            imageReceiver.y0(f7, L2, f10, f11);
            int i17 = ((h4) this.a).X;
            TLRPC.GeoPoint geoPoint = this.y.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f12 = org.telegram.messenger.i0.p;
            String e02 = org.telegram.messenger.i0.e0(i17, d, d10, (int) (f10 / f12), (int) (f11 / f12), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.y.geo;
            float f13 = org.telegram.messenger.i0.p;
            org.telegram.messenger.b30 b10 = org.telegram.messenger.b30.b(geoPoint2, (int) (f10 / f13), (int) (f11 / f13), 15, Math.min(2, (int) Math.ceil(f13)));
            int i18 = org.telegram.messenger.vp.r1(i17).m3;
            this.x = i18;
            f4 f4Var = this.b;
            if (i18 == 2) {
                imageReceiver.q0(org.telegram.messenger.ic.p(b10), null, null, null, f4Var != null ? f4Var.E : null, 0);
            } else {
                imageReceiver.o0(e02, null, null, null, 0L);
            }
            int L3 = (int) (imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.i0.L(8.0f));
            this.r = L3;
            TL_iv.pageBlockMap pageblockmap4 = this.y;
            z2 o10 = h4.o(this.a, this, null, pageblockmap4.caption.text, L, L3, pageblockmap4, this.b);
            this.d = o10;
            if (o10 != null) {
                int height = this.d.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                this.s = height;
                i15 = org.telegram.messenger.m5.C(4.0f, height, i15);
                z2 z2Var = this.d;
                z2Var.s = this.n;
                z2Var.w = this.r;
            }
            int i19 = i15;
            TL_iv.pageBlockMap pageblockmap5 = this.y;
            z2 n10 = h4.n(this.a, this, null, pageblockmap5.caption.credit, L, 0, pageblockmap5, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), 0, this.b);
            this.e = n10;
            if (n10 != null) {
                i19 += this.e.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                z2 z2Var2 = this.e;
                z2Var2.s = this.n;
                z2Var2.w = this.r + this.s;
            }
            if (!this.h && this.y.level <= 0) {
                i19 += org.telegram.messenger.i0.L(8.0f);
            }
            i12 = org.telegram.messenger.i0.L(8.0f) + i19;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f.O(x10, y3)) {
            this.w = true;
        } else if (motionEvent.getAction() == 1 && this.w) {
            this.w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.y.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.w = false;
        }
        if (!this.w) {
            if (!h4.j(this.a, this.b, motionEvent, this, this.d, this.n, this.r)) {
                if (!h4.j(this.a, this.b, motionEvent, this, this.e, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
