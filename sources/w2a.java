// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class w2a extends FrameLayout implements snb {
    public int a;
    public final vnb b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final gd0 f;
    public final Paint h;

    public w2a(Context context, vnb vnbVar) {
        super(context);
        this.h = new Paint(1);
        this.b = vnbVar;
        TextView textView = new TextView(context);
        this.d = textView;
        ik8.v(textView, 1, 20.0f);
        textView.setGravity(ob6.a0 ? 5 : 3);
        int i = aob.j5;
        yob.X(textView, i, vnbVar);
        boolean z = ob6.a0;
        addView(textView, tre.d(-1, -2.0f, 23, z ? 16.0f : 53.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        gd0 gd0Var = new gd0(false);
        this.f = gd0Var;
        imageView.setImageDrawable(gd0Var);
        int v0 = aob.v0(i, vnbVar);
        this.a = v0;
        gd0Var.a(v0);
        gd0Var.b(aob.v0(i, vnbVar));
        gd0Var.k = 220.0f;
        addView(imageView, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new jn8(this, (byte) 23));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v0 = aob.v0(aob.d7, this.b);
        Paint paint = this.h;
        paint.setColor(v0);
        canvas.drawRect(0.0f, getHeight() - hl.e1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return hl.L(56.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), TLObject.FLAG_30));
    }

    public void setBackImage(int i) {
        this.c.setImageResource(i);
    }

    public void setCloseImageVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
        boolean z2 = ob6.a0;
        this.d.setLayoutParams(tre.d(-1, -2.0f, 23, (z2 || !z) ? 22.0f : 53.0f, 0.0f, (z2 && z) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // snb
    public final void updateColors() {
        gd0 gd0Var = this.f;
        if (gd0Var != null) {
            try {
                int v0 = aob.v0(aob.j5, this.b);
                if (v0 != this.a) {
                    this.a = v0;
                    gd0Var.a(v0);
                    gd0Var.b(v0);
                    ImageView imageView = this.c;
                    if (imageView != null) {
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
