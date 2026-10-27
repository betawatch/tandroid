package sh;

import ag.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends View {
    public final oe.b a;
    public final Drawable b;
    public final Drawable c;

    public b(Context context) {
        super(context);
        this.a = new oe.b(this, ds.h, 320L);
        this.b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.a.e;
        v.b(canvas, this.b, 1.0f - f7);
        v.b(canvas, this.c, f7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        v.d(this.b, f7, f10, 17);
        v.d(this.c, f7, f10, 17);
    }
}
