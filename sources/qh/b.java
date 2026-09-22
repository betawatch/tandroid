package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class b extends View {
    public final le.b a;
    public final Drawable b;
    public final Drawable c;

    public b(Context context) {
        super(context);
        this.a = new le.b(this, qr.h, 320L);
        this.b = context.getResources().getDrawable(R.drawable.outline_poll_emoji_24).mutate();
        this.c = context.getResources().getDrawable(R.drawable.input_keyboard).mutate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f7 = this.a.e;
        yf.p.b(canvas, this.b, 1.0f - f7);
        yf.p.b(canvas, this.c, f7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f7 = i10 / 2.0f;
        float f10 = i11 / 2.0f;
        yf.p.d(this.b, f7, f10, 17);
        yf.p.d(this.c, f7, f10, 17);
    }
}
