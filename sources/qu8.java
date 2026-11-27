// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qu8 extends LinearLayout implements snb {
    public final vnb a;
    public final va6 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public qu8(Context context, vnb vnbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = vnbVar;
        setOrientation(1);
        va6 va6Var = new va6();
        this.b = va6Var;
        int i = aob.G6;
        int v0 = aob.v0(i, vnbVar);
        va6Var.g(aob.p1(0.05f, v0), aob.p1(0.15f, v0), aob.p1(0.1f, v0), aob.p1(0.3f, v0));
        va6Var.j(4.0f);
        va6Var.x.setStrokeWidth(hl.L(1.0f));
        imageReceiver.q0(hl.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(ob6.a0 ? 5 : 3);
        yob.X(textView, i, vnbVar);
        textView.setTextSize(1, 16.0f);
        boolean z = ob6.a0;
        addView(textView, tre.t(-1, -2, 55, z ? 70 : 18, 10, z ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        ik8.x(textView2, aob.z6, vnbVar, null, 2131752670);
        textView2.setTextSize(1, 13.0f);
        boolean z2 = ob6.a0;
        addView(textView2, tre.t(-1, -2, 55, z2 ? 70 : 18, 0, z2 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            TLRPC.GeoPoint geoPoint = tL_businessLocation.geo_point;
            ImageReceiver imageReceiver = this.c;
            if (geoPoint != null) {
                imageReceiver.c0(jn5.p(jxc.b(tL_businessLocation.geo_point, hl.L(44.0f), hl.L(44.0f), 15, Math.min(2, (int) Math.ceil(hl.p)))), "44_44", this.b, 0L, null, null, 0);
            } else {
                imageReceiver.g0(null);
            }
        }
        this.e = z;
        setPadding(0, 0, 0, z ? 1 : 0);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float L = ob6.a0 ? hl.L(16.0f) : getWidth() - hl.L(60.0f);
        float L2 = hl.L(8.0f);
        float L3 = hl.L(44.0f);
        float L4 = hl.L(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = aob.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = aob.j0;
            }
            canvas.drawRect(hl.L(ob6.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - hl.L(ob6.a0 ? 21.33f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // snb
    public final void updateColors() {
        va6 va6Var = this.b;
        if (va6Var != null) {
            try {
                int v0 = aob.v0(aob.G6, this.a);
                va6Var.g(aob.p1(0.05f, v0), aob.p1(0.15f, v0), aob.p1(0.1f, v0), aob.p1(0.3f, v0));
                invalidate();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
