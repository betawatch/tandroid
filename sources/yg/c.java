package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ji.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class c extends FrameLayout {
    public final c6 a;
    public final ImageView b;
    public final TextView c;
    public Runnable d;
    public final f2 e;
    public final Paint f;

    public c(Context context, c6 c6Var) {
        super(context);
        this.f = new Paint(1);
        this.a = c6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        yh.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = g6.j5;
        textView.setTextColor(g6.w0(i10, c6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, a6.a(-2.0f, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f, -1, 23));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        f2 f2Var = new f2(false);
        this.e = f2Var;
        imageView.setImageDrawable(f2Var);
        f2Var.a(g6.w0(i10, c6Var));
        f2Var.b(g6.w0(i10, c6Var));
        f2Var.k = 220.0f;
        addView(imageView, a6.a(24.0f, 16.0f, 0.0f, 16.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
        imageView.setOnClickListener(new o4(this, 15));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = g6.w0(g6.d7, this.a);
        Paint paint = this.f;
        paint.setColor(w02);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), TLObject.FLAG_30));
    }

    public void setBackImage(int i10) {
        this.b.setImageResource(i10);
    }

    public void setCloseImageVisible(boolean z10) {
        this.b.setVisibility(z10 ? 0 : 8);
        boolean z11 = LocaleController.isRTL;
        this.c.setLayoutParams(a6.a(-2.0f, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f, -1, 23));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
