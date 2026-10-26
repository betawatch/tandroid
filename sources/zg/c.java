package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ig.d0;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class c extends FrameLayout implements p6 {
    public int a;
    public final u6 b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final j2 f;
    public final Paint h;

    public c(Context context, u6 u6Var) {
        super(context);
        this.h = new Paint(1);
        this.b = u6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        vh.j(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = y6.j5;
        f7.V(textView, i10, u6Var);
        boolean z10 = LocaleController.isRTL;
        addView(textView, gb1.h(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        j2 j2Var = new j2(false);
        this.f = j2Var;
        imageView.setImageDrawable(j2Var);
        int w02 = y6.w0(i10, u6Var);
        this.a = w02;
        j2Var.a(w02);
        j2Var.b(y6.w0(i10, u6Var));
        j2Var.k = 220.0f;
        addView(imageView, gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new d0(this, 26));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = y6.w0(y6.d7, this.b);
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
        this.d.setLayoutParams(gb1.h(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        j2 j2Var = this.f;
        if (j2Var == null) {
            return;
        }
        try {
            int w02 = y6.w0(y6.j5, this.b);
            if (w02 != this.a) {
                this.a = w02;
                j2Var.a(w02);
                j2Var.b(w02);
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
