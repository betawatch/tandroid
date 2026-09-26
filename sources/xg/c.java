package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.voip.o;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public class c extends FrameLayout {
    public final d6 a;
    public final ImageView b;
    public final TextView c;
    public Runnable d;
    public final f2 e;
    public final Paint f;

    public c(Context context, d6 d6Var) {
        super(context);
        this.f = new Paint(1);
        this.a = d6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        ok.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = h6.j5;
        textView.setTextColor(h6.v0(i10, d6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, y5.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        f2 f2Var = new f2(false);
        this.e = f2Var;
        imageView.setImageDrawable(f2Var);
        f2Var.a(h6.v0(i10, d6Var));
        f2Var.b(h6.v0(i10, d6Var));
        f2Var.k = 220.0f;
        addView(imageView, y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new o(this, 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = h6.v0(h6.d7, this.a);
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
        this.c.setLayoutParams(y5.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
