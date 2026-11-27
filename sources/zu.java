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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zu extends FrameLayout implements zlb {
    public final xi5 a;
    public final ex b;
    public Drawable c;
    public cw d;
    public cw e;
    public final ImageReceiver f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public TL_iv.pageBlockMap y;

    public zu(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        cw cwVar = this.d;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.d;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.d;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y == null) {
            return;
        }
        Paint paint = aob.S1;
        int i = aob.gf;
        xi5 xi5Var = this.a;
        ((o) xi5Var).getClass();
        paint.setColor(aob.u0(i));
        ImageReceiver imageReceiver = this.f;
        canvas.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x(), aob.S1);
        float r = imageReceiver.r();
        Drawable[] drawableArr = aob.S4;
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
            int z = (int) bp1.z(imageReceiver.N0, intrinsicWidth2, 2.0f, imageReceiver.L0);
            int i3 = (int) (((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0);
            this.c.setAlpha((int) (imageReceiver.i1 * 255.0f));
            this.c.setBounds(z, i3, intrinsicWidth2 + z, intrinsicHeight + i3);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            o.s(xi5Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i2 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            o.s(xi5Var, canvas, this, i2);
            this.e.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, xi5Var, this.y, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(ob6.M0(2131748444, null));
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
                i4 = hl.L(18.0f) + hl.L(r0 * 14);
                this.n = i4;
                i5 = ik8.B(18.0f, i4, size);
                L = i5;
            } else {
                this.n = hl.L(18.0f);
                i4 = 0;
                L = size - hl.L(36.0f);
                i5 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.y;
            int i7 = (int) ((i5 / pageblockmap2.w) * pageblockmap2.h);
            Point point = hl.q;
            int max = (int) ((Math.max(point.x, point.y) - hl.L(56.0f)) * 0.9f);
            if (i7 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.y;
                i5 = (int) ((max / pageblockmap3.h) * pageblockmap3.w);
                i4 += ((size - i4) - i5) / 2;
                i6 = max;
            } else {
                i6 = i7;
            }
            float f = i4;
            float L2 = (this.h || this.y.level > 0) ? 0.0f : hl.L(8.0f);
            float f2 = i5;
            float f3 = i6;
            ImageReceiver imageReceiver = this.f;
            imageReceiver.i0(f, L2, f2, f3);
            int i8 = ((o) this.a).Y;
            TLRPC.GeoPoint geoPoint = this.y.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            float f4 = hl.p;
            String e0 = hl.e0(i8, d, d2, (int) (f2 / f4), (int) (f3 / f4), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.y.geo;
            float f5 = hl.p;
            jxc b = jxc.b(geoPoint2, (int) (f2 / f5), (int) (f3 / f5), 15, Math.min(2, (int) Math.ceil(f5)));
            int i9 = uc7.s1(i8).f3;
            this.x = i9;
            ex exVar = this.b;
            if (i9 == 2) {
                imageReceiver.d0(jn5.p(b), null, null, null, exVar != null ? exVar.F : null, 0);
            } else {
                imageReceiver.e0(e0, null, null, null, 0L);
            }
            int L3 = (int) (imageReceiver.M0 + imageReceiver.O0 + hl.L(8.0f));
            this.r = L3;
            TL_iv.pageBlockMap pageblockmap4 = this.y;
            cw m = o.m(this.a, this, null, pageblockmap4.caption.text, L, L3, pageblockmap4, this.b);
            this.d = m;
            if (m != null) {
                int height = this.d.d.getHeight() + hl.L(4.0f);
                this.s = height;
                i6 = uh9.w(4.0f, height, i6);
                cw cwVar = this.d;
                cwVar.s = this.n;
                cwVar.w = this.r;
            }
            int i10 = i6;
            TL_iv.pageBlockMap pageblockmap5 = this.y;
            cw n = o.n(this.a, this, null, pageblockmap5.caption.credit, L, 0, pageblockmap5, (exVar == null || !exVar.H) ? Layout.Alignment.ALIGN_NORMAL : o0b.a(), 0, this.b);
            this.e = n;
            if (n != null) {
                i10 += this.e.d.getHeight() + hl.L(4.0f);
                cw cwVar2 = this.e;
                cwVar2.s = this.n;
                cwVar2.w = this.r + this.s;
            }
            if (!this.h && this.y.level <= 0) {
                i10 += hl.L(8.0f);
            }
            i3 = hl.L(8.0f) + i10;
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
                cc4.g(e, true);
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
