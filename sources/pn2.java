// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class pn2 extends FrameLayout implements snb {
    public final de0 a;
    public final vnb b;
    public final TextView c;
    public final TextView d;

    public pn2(Context context, vnb vnbVar) {
        super(context);
        this.b = vnbVar;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(20.0f));
        addView(de0Var, tre.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, tre.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView2, tre.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        updateColors();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.z6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = aob.R0;
        de0 de0Var = this.a;
        br3.a(canvas, drawable, (de0Var.getWidth() / 2.0f) + de0Var.getLeft(), (de0Var.getHeight() / 2.0f) + de0Var.getTop(), de0Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(218.0f), TLObject.FLAG_30));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // snb
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.b;
        this.c.setTextColor(aob.v0(i, vnbVar));
        this.d.setTextColor(aob.v0(aob.z6, vnbVar));
    }
}
