// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class pqc extends FrameLayout implements snb {
    public final vnb a;
    public final x0 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final mm f;
    public final Paint h;

    public pqc(Context context, CharSequence[] charSequenceArr, sh9 sh9Var, vnb vnbVar) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = vnbVar;
        x0 x0Var = new x0(this, context, vnbVar);
        this.b = x0Var;
        this.f = new mm(new oqc(this, (byte) 0), 420L, k43.h);
        x0Var.setOrientation(0);
        x0Var.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i = 0;
        while (i < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(6.0f));
            textView.setTypeface(hl.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i]);
            textView.setOnClickListener(new ae((Object) this, (Object) sh9Var, i, (byte) 20));
            iye.a(textView);
            this.b.addView(textView, tre.q(-2, -2, 0.0f, 19, i == 0 ? 0 : 3, 0, 0, 0));
            this.c[i] = textView;
            i++;
        }
        addView(this.b, tre.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i = 0;
        float e = this.f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.c;
            if (i >= textViewArr.length) {
                this.b.invalidate();
                return;
            }
            float l = Utilities.l(1.0f - Math.abs(e - i));
            TextView textView = textViewArr[i];
            int i2 = aob.z6;
            vnb vnbVar = this.a;
            textView.setTextColor(vm2.f(l, aob.v0(i2, vnbVar), aob.v0(aob.Fi, vnbVar)));
            i++;
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        x0 x0Var;
        if (this.e && view == (x0Var = this.b)) {
            float N = hl.N(1.67f);
            float N2 = hl.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(aob.v0(aob.d6, this.a));
            RectF rectF = hl.P;
            rectF.set(x0Var.getX(), x0Var.getY(), x0Var.getX() + x0Var.getWidth(), x0Var.getY() + x0Var.getHeight());
            canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), paint);
        }
        return super.drawChild(canvas, view, j);
    }

    public void setSelected(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        a();
    }

    @Override // snb
    public final void updateColors() {
        a();
        this.b.setBackground(this.e ? null : aob.b0(hl.L(18.0f), aob.v0(aob.d6, this.a)));
    }
}
