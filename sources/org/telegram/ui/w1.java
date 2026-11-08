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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w1 extends FrameLayout implements org.telegram.ui.Cells.h9 {
    public final o50 a;
    public final e4 b;
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

    public w1(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.a = o50Var;
        this.b = e4Var;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
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
        Paint paint = org.telegram.ui.ActionBar.k6.S1;
        int i7 = org.telegram.ui.ActionBar.k6.df;
        o50 o50Var = this.a;
        ((g4) o50Var).getClass();
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i7));
        ImageReceiver imageReceiver = this.f;
        canvas.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), org.telegram.ui.ActionBar.k6.S1);
        float r10 = imageReceiver.r();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.S4;
        int i10 = 0;
        int intrinsicWidth = (int) (r10 - (drawableArr[0].getIntrinsicWidth() / 2));
        int s5 = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s5, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s5);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.x == 2 && imageReceiver.L()) {
            if (this.c == null) {
                this.c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.c.getIntrinsicHeight() * 0.8f);
            int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.M0, intrinsicWidth2, 2.0f, imageReceiver.K0);
            int i11 = (int) (((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0);
            this.c.setAlpha((int) (imageReceiver.h1 * 255.0f));
            this.c.setBounds(A, i11, intrinsicWidth2 + A, intrinsicHeight + i11);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            g4.t(o50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            g4.t(o50Var, canvas, this, i10);
            this.e.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, o50Var, this.y, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131748691, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int L;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockMap pageblockmap = this.y;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i12 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(r0 * 14);
                this.n = i12;
                i13 = org.telegram.messenger.camera.q.w(18.0f, i12, size);
                L = i13;
            } else {
                this.n = org.telegram.messenger.g0.L(18.0f);
                i12 = 0;
                L = size - org.telegram.messenger.g0.L(36.0f);
                i13 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.y;
            int i15 = (int) ((i13 / pageblockmap2.w) * pageblockmap2.h);
            Point point = org.telegram.messenger.g0.q;
            int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.g0.L(56.0f)) * 0.9f);
            if (i15 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.y;
                i13 = (int) ((max / pageblockmap3.h) * pageblockmap3.w);
                i12 += ((size - i12) - i13) / 2;
                i14 = max;
            } else {
                i14 = i15;
            }
            float f10 = i12;
            float L2 = (this.h || this.y.level > 0) ? 0.0f : org.telegram.messenger.g0.L(8.0f);
            float f11 = i13;
            float f12 = i14;
            ImageReceiver imageReceiver = this.f;
            imageReceiver.y0(f10, L2, f11, f12);
            int i16 = ((g4) this.a).X;
            TLRPC.GeoPoint geoPoint = this.y.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            float f13 = org.telegram.messenger.g0.p;
            String e02 = org.telegram.messenger.g0.e0(i16, d, d2, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.y.geo;
            float f14 = org.telegram.messenger.g0.p;
            org.telegram.messenger.m20 b10 = org.telegram.messenger.m20.b(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i17 = org.telegram.messenger.qp.s1(i16).m3;
            this.x = i17;
            e4 e4Var = this.b;
            if (i17 == 2) {
                imageReceiver.q0(org.telegram.messenger.hc.p(b10), null, null, null, e4Var != null ? e4Var.E : null, 0);
            } else {
                imageReceiver.o0(e02, null, null, null, 0L);
            }
            int L3 = (int) (imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.g0.L(8.0f));
            this.r = L3;
            TL_iv.pageBlockMap pageblockmap4 = this.y;
            z2 o4 = g4.o(this.a, this, null, pageblockmap4.caption.text, L, L3, pageblockmap4, this.b);
            this.d = o4;
            if (o4 != null) {
                int height = this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.s = height;
                i14 = org.telegram.messenger.k5.C(4.0f, height, i14);
                z2 z2Var = this.d;
                z2Var.s = this.n;
                z2Var.w = this.r;
            }
            int i18 = i14;
            TL_iv.pageBlockMap pageblockmap5 = this.y;
            z2 n10 = g4.n(this.a, this, null, pageblockmap5.caption.credit, L, 0, pageblockmap5, (e4Var == null || !e4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.mu0.a(), 0, this.b);
            this.e = n10;
            if (n10 != null) {
                i18 += this.e.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                z2 z2Var2 = this.e;
                z2Var2.s = this.n;
                z2Var2.w = this.r + this.s;
            }
            if (!this.h && this.y.level <= 0) {
                i18 += org.telegram.messenger.g0.L(8.0f);
            }
            i11 = org.telegram.messenger.g0.L(8.0f) + i18;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f.O(x10, y10)) {
            this.w = true;
        } else if (motionEvent.getAction() == 1 && this.w) {
            this.w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.y.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.w = false;
        }
        if (!this.w) {
            if (!g4.j(this.a, this.b, motionEvent, this, this.d, this.n, this.r)) {
                if (!g4.j(this.a, this.b, motionEvent, this, this.e, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
