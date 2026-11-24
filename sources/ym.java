// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ym extends View {
    public final byte a;
    public final byte b;
    public final byte c;
    public int d;
    public final ArrayList e;
    public float f;
    public float h;
    public Integer n;

    public ym(Context context) {
        super(context);
        this.e = new ArrayList();
        this.a = (byte) 20;
        this.b = (byte) 60;
        this.c = (byte) 60;
    }

    public final void a(h19 h19Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        vl l;
        String V;
        TLRPC.TL_availableReaction tL_availableReaction2 = h19Var.f != null ? (TLRPC.TL_availableReaction) hq6.d0(y6c.t0).r.get(h19Var.f) : null;
        if (tL_availableReaction2 == null) {
            document = vl.e(y6c.t0, h19Var.g);
            if (document != null && (V = k27.V(document, null, null)) != null) {
                tL_availableReaction2 = (TLRPC.TL_availableReaction) hq6.d0(y6c.t0).r.get(V);
            }
            tL_availableReaction = tL_availableReaction2;
        } else {
            tL_availableReaction = tL_availableReaction2;
            document = null;
        }
        ArrayList arrayList = this.e;
        if (document != null) {
            l = vl.l(2, y6c.t0, document);
        } else {
            if (tL_availableReaction != null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.p0(this);
                int i = this.d;
                this.d = i + 1;
                imageReceiver.w1 = Integer.toString(i);
                gl5 b = gl5.b(tL_availableReaction.around_animation);
                StringBuilder sb = new StringBuilder();
                byte b2 = this.b;
                sb.append((int) b2);
                sb.append("_");
                sb.append((int) b2);
                sb.append("_nolimit");
                imageReceiver.d0(b, sb.toString(), null, "tgs", tL_availableReaction, 1);
                imageReceiver.M(0);
                imageReceiver.I();
                arrayList.add(imageReceiver);
                invalidate();
                return;
            }
            l = vl.m(2, h19Var.g, null, y6c.t0);
        }
        if (this.n != null) {
            l.setColorFilter(new PorterDuffColorFilter(this.n.intValue(), PorterDuff.Mode.MULTIPLY));
        }
        xl a = xl.a(l, false, !l.c());
        a.f(this);
        arrayList.add(a);
        invalidate();
    }

    public final void b(float f, float f2) {
        setTranslationX(f - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f2 - (getMeasuredHeight() / 2.0f);
        this.f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = gl.L(this.c);
        int L2 = gl.L(this.b);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i);
            if (obj instanceof ImageReceiver) {
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                float f = L2;
                imageReceiver.i0((getMeasuredWidth() - L2) / 2.0f, (getMeasuredHeight() - L2) / 2.0f, f, f);
                imageReceiver.h(canvas, null);
            } else if (obj instanceof xl) {
                xl xlVar = (xl) obj;
                xlVar.e((int) ((getMeasuredWidth() - L) / 2.0f), (int) ((getMeasuredHeight() - L) / 2.0f), (int) ((getMeasuredWidth() + L) / 2.0f), (int) ((getMeasuredHeight() + L) / 2.0f));
                xlVar.b(canvas);
                if (xlVar.c()) {
                    xlVar.d(this);
                    arrayList.remove(xlVar);
                }
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).K();
                } else if (obj instanceof xl) {
                    ((xl) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int max = Math.max((int) this.a, (int) this.b);
        byte b = this.c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(Math.max((int) b, max)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(Math.max((int) b, Math.max((int) r4, (int) r5))), TLObject.FLAG_30));
    }

    public void setColor(int i) {
        this.n = Integer.valueOf(i);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i2);
            if (obj instanceof ImageReceiver) {
                ((ImageReceiver) obj).p1 = porterDuffColorFilter;
            } else if (obj instanceof xl) {
                ((xl) obj).a.setColorFilter(porterDuffColorFilter2);
            }
            i2++;
        }
    }
}
