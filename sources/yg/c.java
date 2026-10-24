package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import hg.r0;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class c extends FrameLayout implements b6 {
    public int a;
    public final g6 b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final h2 f;
    public final Paint h;

    public c(Context context, g6 g6Var) {
        super(context);
        this.h = new Paint(1);
        this.b = g6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        sl.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = k6.j5;
        r6.W(textView, i10, g6Var);
        boolean z10 = LocaleController.isRTL;
        addView(textView, z5.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        h2 h2Var = new h2(false);
        this.f = h2Var;
        imageView.setImageDrawable(h2Var);
        int w02 = k6.w0(i10, g6Var);
        this.a = w02;
        h2Var.a(w02);
        h2Var.b(k6.w0(i10, g6Var));
        h2Var.k = 220.0f;
        addView(imageView, z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new r0(this, 25));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = k6.w0(k6.d7, this.b);
        Paint paint = this.h;
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
        this.c.setImageResource(i10);
    }

    public void setCloseImageVisible(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 8);
        boolean z11 = LocaleController.isRTL;
        this.d.setLayoutParams(z5.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        h2 h2Var = this.f;
        if (h2Var == null) {
            return;
        }
        try {
            int w02 = k6.w0(k6.j5, this.b);
            if (w02 != this.a) {
                this.a = w02;
                h2Var.a(w02);
                h2Var.b(w02);
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
