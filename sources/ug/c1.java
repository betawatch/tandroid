package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.y5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 extends TextView {
    public boolean a;
    public Drawable b;

    public c1(Context context) {
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
        canvas.translate(0.0f, org.telegram.messenger.g0.L(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.a) {
            int y9 = org.telegram.messenger.camera.q.y(16.0f, getHeight(), 2);
            if (bd.a0) {
                this.b.setBounds(org.telegram.messenger.g0.L(7.0f), y9, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(16.0f) + y9);
            } else {
                this.b.setBounds(getWidth() - org.telegram.messenger.g0.L(23.0f), y9, getWidth() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(16.0f) + y9);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        this.a = z10;
        if (z10) {
            setPadding(org.telegram.messenger.g0.L(bd.a0 ? 27.0f : 12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(bd.a0 ? 12.0f : 27.0f), org.telegram.messenger.g0.L(6.0f));
            setBackground(y5.d(0, y5.b(1090519039), org.telegram.messenger.g0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f));
            setBackground(y5.d(0, y5.b(-14145495), 0.0f));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
