package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.z5;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
            int y10 = org.telegram.messenger.camera.q.y(16.0f, getHeight(), 2);
            if (id.a0) {
                this.b.setBounds(org.telegram.messenger.g0.L(7.0f), y10, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(16.0f) + y10);
            } else {
                this.b.setBounds(getWidth() - org.telegram.messenger.g0.L(23.0f), y10, getWidth() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(16.0f) + y10);
            }
            this.b.draw(canvas);
        }
    }

    public void setCurrent(boolean z9) {
        this.a = z9;
        if (z9) {
            setPadding(org.telegram.messenger.g0.L(id.a0 ? 27.0f : 12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(id.a0 ? 12.0f : 27.0f), org.telegram.messenger.g0.L(6.0f));
            setBackground(z5.d(0, z5.b(1090519039), org.telegram.messenger.g0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f));
            setBackground(z5.d(0, z5.b(-14145495), 0.0f));
        }
        if (this.a && this.b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
