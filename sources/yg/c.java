package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ji.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.j6;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class c extends FrameLayout {
    public final f6 a;
    public final ImageView b;
    public final TextView c;
    public Runnable d;
    public final g2 e;
    public final Paint f;

    public c(Context context, f6 f6Var) {
        super(context);
        this.f = new Paint(1);
        this.a = f6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        wl.j(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = j6.j5;
        textView.setTextColor(j6.v0(i10, f6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, x5.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        g2 g2Var = new g2(false);
        this.e = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(j6.v0(i10, f6Var));
        g2Var.b(j6.v0(i10, f6Var));
        g2Var.k = 220.0f;
        addView(imageView, x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new m4(this, 15));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = j6.v0(j6.d7, this.a);
        Paint paint = this.f;
        paint.setColor(v02);
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
        this.c.setLayoutParams(x5.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
