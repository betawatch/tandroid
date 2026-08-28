package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import ff.s;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends View {
    public final td.a a;
    public final Drawable b;
    public final Drawable c;

    public b(Context context) {
        super(context);
        this.a = new td.a(this, gr.h, 320L);
        this.b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.a.e;
        s.b(canvas, this.b, 1.0f - f10);
        s.b(canvas, this.c, f10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        float f10 = i9 / 2.0f;
        float f11 = i10 / 2.0f;
        s.d(this.b, f10, f11, 17);
        s.d(this.c, f10, f11, 17);
    }
}
