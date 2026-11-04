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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x1 extends FrameLayout implements org.telegram.ui.Cells.g9 {
    public final i50 a;
    public final g4 b;
    public Drawable c;
    public a3 d;
    public a3 e;
    public final ImageReceiver f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public TL_iv.pageBlockMap y;

    public x1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.a = i50Var;
        this.b = g4Var;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.d;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.k6.S1;
        int i3 = org.telegram.ui.ActionBar.k6.df;
        i50 i50Var = this.a;
        ((i4) i50Var).getClass();
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i3));
        ImageReceiver imageReceiver = this.f;
        canvas.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), org.telegram.ui.ActionBar.k6.S1);
        float r5 = imageReceiver.r();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.S4;
        int i10 = 0;
        int intrinsicWidth = (int) (r5 - (drawableArr[0].getIntrinsicWidth() / 2));
        int s6 = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s6, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s6);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.x == 2 && imageReceiver.L()) {
            if (this.c == null) {
                this.c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.c.getIntrinsicHeight() * 0.8f);
            int z10 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, intrinsicWidth2, 2.0f, imageReceiver.L0);
            int i11 = (int) (((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0);
            this.c.setAlpha((int) (imageReceiver.i1 * 255.0f));
            this.c.setBounds(z10, i11, intrinsicWidth2 + z10, intrinsicHeight + i11);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            i4.t(i50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            i4.t(i50Var, canvas, this, i10);
            this.e.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.y, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131748698, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int L;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i3);
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
            int i16 = ((i4) this.a).Y;
            TLRPC.GeoPoint geoPoint = this.y.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = org.telegram.messenger.g0.p;
            String e02 = org.telegram.messenger.g0.e0(i16, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.y.geo;
            float f14 = org.telegram.messenger.g0.p;
            org.telegram.messenger.e20 b10 = org.telegram.messenger.e20.b(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i17 = org.telegram.messenger.hp.s1(i16).n3;
            this.x = i17;
            g4 g4Var = this.b;
            if (i17 == 2) {
                imageReceiver.q0(org.telegram.messenger.ac.p(b10), null, null, null, g4Var != null ? g4Var.F : null, 0);
            } else {
                imageReceiver.o0(e02, null, null, null, 0L);
            }
            int L3 = (int) (imageReceiver.M0 + imageReceiver.O0 + org.telegram.messenger.g0.L(8.0f));
            this.r = L3;
            TL_iv.pageBlockMap pageblockmap4 = this.y;
            a3 o10 = i4.o(this.a, this, null, pageblockmap4.caption.text, L, L3, pageblockmap4, this.b);
            this.d = o10;
            if (o10 != null) {
                int height = this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.s = height;
                i14 = org.telegram.messenger.k5.C(4.0f, height, i14);
                a3 a3Var = this.d;
                a3Var.s = this.n;
                a3Var.w = this.r;
            }
            int i18 = i14;
            TL_iv.pageBlockMap pageblockmap5 = this.y;
            a3 n4 = i4.n(this.a, this, null, pageblockmap5.caption.credit, L, 0, pageblockmap5, (g4Var == null || !g4Var.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), 0, this.b);
            this.e = n4;
            if (n4 != null) {
                i18 += this.e.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                a3 a3Var2 = this.e;
                a3Var2.s = this.n;
                a3Var2.w = this.r + this.s;
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
        float y9 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f.O(x10, y9)) {
            this.w = true;
        } else if (motionEvent.getAction() == 1 && this.w) {
            this.w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.y.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.w = false;
        }
        if (!this.w) {
            if (!i4.j(this.a, this.b, motionEvent, this, this.d, this.n, this.r)) {
                if (!i4.j(this.a, this.b, motionEvent, this, this.e, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
