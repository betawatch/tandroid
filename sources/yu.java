// default package

import android.app.Activity;
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
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yu extends FrameLayout implements eib {
    public final vg5 a;
    public final dx b;
    public Drawable c;
    public bw d;
    public bw e;
    public final ImageReceiver f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public TL_iv.pageBlockMap y;

    public yu(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.d;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.d;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.d;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y == null) {
            return;
        }
        Paint paint = bkb.R1;
        int i = bkb.ff;
        vg5 vg5Var = this.a;
        ((o) vg5Var).getClass();
        paint.setColor(bkb.u0(i));
        ImageReceiver imageReceiver = this.f;
        canvas.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x(), bkb.R1);
        float r = imageReceiver.r();
        Drawable[] drawableArr = bkb.R4;
        int i2 = 0;
        int intrinsicWidth = (int) (r - (drawableArr[0].getIntrinsicWidth() / 2));
        int s = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.x == 2 && imageReceiver.E()) {
            Drawable drawable2 = this.c;
            if (drawable2 == null) {
                drawable2 = getContext().getDrawable(R.drawable.map_pin).mutate();
                this.c = drawable2;
            }
            int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.c.getIntrinsicHeight() * 0.8f);
            int z = (int) oo1.z(imageReceiver.N0, intrinsicWidth2, 2.0f, imageReceiver.L0);
            int i3 = (int) (((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0);
            this.c.setAlpha((int) (imageReceiver.i1 * 255.0f));
            this.c.setBounds(z, i3, intrinsicWidth2 + z, intrinsicHeight + i3);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            o.s(vg5Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i2 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            o.s(vg5Var, canvas, this, i2);
            this.e.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, vg5Var, this.y, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131748498, null));
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int L;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockMap pageblockmap = this.y;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i4 = gl.L(18.0f) + gl.L(r0 * 14);
                this.n = i4;
                i5 = ug8.B(18.0f, i4, size);
                L = i5;
            } else {
                this.n = gl.L(18.0f);
                i4 = 0;
                L = size - gl.L(36.0f);
                i5 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.y;
            int i7 = (int) ((i5 / pageblockmap2.w) * pageblockmap2.h);
            Point point = gl.q;
            int max = (int) ((Math.max(point.x, point.y) - gl.L(56.0f)) * 0.9f);
            if (i7 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.y;
                i5 = (int) ((max / pageblockmap3.h) * pageblockmap3.w);
                i4 += ((size - i4) - i5) / 2;
                i6 = max;
            } else {
                i6 = i7;
            }
            float f = i4;
            float L2 = (this.h || this.y.level > 0) ? 0.0f : gl.L(8.0f);
            float f2 = i5;
            float f3 = i6;
            ImageReceiver imageReceiver = this.f;
            imageReceiver.i0(f, L2, f2, f3);
            int i8 = ((o) this.a).Y;
            TLRPC.GeoPoint geoPoint = this.y.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            float f4 = gl.p;
            String e0 = gl.e0(i8, d, d2, (int) (f2 / f4), (int) (f3 / f4), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.y.geo;
            float f5 = gl.p;
            usc b = usc.b(geoPoint2, (int) (f2 / f5), (int) (f3 / f5), 15, Math.min(2, (int) Math.ceil(f5)));
            int i9 = na7.q1(i8).f3;
            this.x = i9;
            dx dxVar = this.b;
            if (i9 == 2) {
                imageReceiver.d0(gl5.p(b), null, null, null, dxVar != null ? dxVar.F : null, 0);
            } else {
                imageReceiver.e0(e0, null, null, null, 0L);
            }
            int L3 = (int) (imageReceiver.M0 + imageReceiver.O0 + gl.L(8.0f));
            this.r = L3;
            TL_iv.pageBlockMap pageblockmap4 = this.y;
            bw m = o.m(this.a, this, null, pageblockmap4.caption.text, L, L3, pageblockmap4, this.b);
            this.d = m;
            if (m != null) {
                int height = this.d.d.getHeight() + gl.L(4.0f);
                this.s = height;
                i6 = de9.w(4.0f, height, i6);
                bw bwVar = this.d;
                bwVar.s = this.n;
                bwVar.w = this.r;
            }
            int i10 = i6;
            TL_iv.pageBlockMap pageblockmap5 = this.y;
            bw n = o.n(this.a, this, null, pageblockmap5.caption.credit, L, 0, pageblockmap5, (dxVar == null || !dxVar.H) ? Layout.Alignment.ALIGN_NORMAL : lwa.a(), 0, this.b);
            this.e = n;
            if (n != null) {
                i10 += this.e.d.getHeight() + gl.L(4.0f);
                bw bwVar2 = this.e;
                bwVar2.s = this.n;
                bwVar2.w = this.r + this.s;
            }
            if (!this.h && this.y.level <= 0) {
                i10 += gl.L(8.0f);
            }
            i3 = gl.L(8.0f) + i10;
        } else {
            i3 = 1;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f.H(x, y)) {
            this.w = true;
        } else if (motionEvent.getAction() == 1 && this.w) {
            this.w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.y.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.w = false;
        }
        if (!this.w) {
            if (!o.i(this.a, this.b, motionEvent, this, this.d, this.n, this.r)) {
                if (!o.i(this.a, this.b, motionEvent, this, this.e, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
