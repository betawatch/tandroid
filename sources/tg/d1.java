package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d1 extends TextView {
    public boolean a;
    public Drawable b;

    public d1(Context context) {
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
            int z10 = n10.z(16.0f, getHeight(), 2);
            if (gd.a0) {
                this.b.setBounds(org.telegram.messenger.g0.L(7.0f), z10, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(16.0f) + z10);
            } else {
                this.b.setBounds(getWidth() - org.telegram.messenger.g0.L(23.0f), z10, getWidth() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(16.0f) + z10);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        this.a = z10;
        if (z10) {
            setPadding(org.telegram.messenger.g0.L(gd.a0 ? 27.0f : 12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(gd.a0 ? 12.0f : 27.0f), org.telegram.messenger.g0.L(6.0f));
            setBackground(b6.d(0, b6.b(1090519039), org.telegram.messenger.g0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f));
            setBackground(b6.d(0, b6.b(-14145495), 0.0f));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
