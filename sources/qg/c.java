package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class c extends FrameLayout implements k6 {
    public int a;
    public final p6 b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final c2 f;
    public final Paint h;

    public c(Context context, p6 p6Var) {
        super(context);
        this.h = new Paint(1);
        this.b = p6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        z20.n(textView, 1, 20.0f);
        textView.setGravity(cd.X ? 5 : 3);
        int i10 = t6.j5;
        a7.V(textView, i10, p6Var);
        boolean z10 = cd.X;
        addView(textView, b6.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        c2 c2Var = new c2(false);
        this.f = c2Var;
        imageView.setImageDrawable(c2Var);
        int w02 = t6.w0(i10, p6Var);
        this.a = w02;
        c2Var.a(w02);
        c2Var.b(t6.w0(i10, p6Var));
        c2Var.k = 220.0f;
        addView(imageView, b6.d(24, 24.0f, (cd.X ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ag.g(this, 28));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = t6.w0(t6.d7, this.b);
        Paint paint = this.h;
        paint.setColor(w02);
        canvas.drawRect(0.0f, getHeight() - i0.f1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return i0.L(56.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), TLObject.FLAG_30));
    }

    public void setBackImage(int i10) {
        this.c.setImageResource(i10);
    }

    public void setCloseImageVisible(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 8);
        boolean z11 = cd.X;
        this.d.setLayoutParams(b6.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        c2 c2Var = this.f;
        if (c2Var == null) {
            return;
        }
        try {
            int w02 = t6.w0(t6.j5, this.b);
            if (w02 != this.a) {
                this.a = w02;
                c2Var.a(w02);
                c2Var.b(w02);
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
