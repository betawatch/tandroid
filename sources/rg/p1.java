package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.y5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p1 extends TextView {
    public boolean a;
    public Drawable b;

    public p1(Context context) {
        super(context);
        setTextColor(-1);
        setTextSize(1, 14.0f);
        setCurrent(false);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.a) {
            int y3 = wl.y(16.0f, getHeight(), 2);
            if (LocaleController.isRTL) {
                this.b.setBounds(AndroidUtilities.dp(7.0f), y3, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + y3);
            } else {
                this.b.setBounds(getWidth() - AndroidUtilities.dp(23.0f), y3, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + y3);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        this.a = z10;
        if (z10) {
            setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 27.0f : 12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 27.0f), AndroidUtilities.dp(6.0f));
            setBackground(y5.d(new float[]{AndroidUtilities.dp(32.0f)}, 0, y5.b(1090519039)));
        } else {
            setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
            setBackground(y5.d(new float[]{0.0f}, 0, y5.b(-14145495)));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
