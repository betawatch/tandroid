package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d extends View {
    public final Drawable a;
    public final td.a b;
    public final int c;
    public e d;

    public d(Context context, int i9) {
        super(context);
        this.b = new td.a(this, gr.h, 380L);
        this.c = i9;
        Drawable mutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.a = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.o7, false), PorterDuff.Mode.SRC_IN));
    }

    public final void a(e eVar, boolean z10) {
        e eVar2;
        e eVar3;
        this.b.a(eVar != null, z10);
        if (isAttachedToWindow() && (eVar3 = this.d) != null) {
            eVar3.b();
        }
        this.d = eVar;
        if (!isAttachedToWindow() || (eVar2 = this.d) == null) {
            return;
        }
        eVar2.a(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.d;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.d;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.b.e;
        if (f10 < 1.0f) {
            canvas.save();
            float f11 = 1.0f - f10;
            canvas.scale(f11, f11, width, height);
            this.a.draw(canvas);
            canvas.restore();
        }
        if (f10 > 0.0f) {
            float f12 = this.c;
            int dp = AndroidUtilities.dp(f12);
            int width2 = (getWidth() - dp) / 2;
            int height2 = (getHeight() - dp) / 2;
            canvas.save();
            canvas.translate(width2, height2);
            canvas.scale(f10, f10, AndroidUtilities.dp(f12) / 2.0f, AndroidUtilities.dp(f12) / 2.0f);
            e eVar = this.d;
            if (eVar != null) {
                eVar.c(canvas, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12));
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(24.0f);
        int i13 = (i9 - dp) / 2;
        int i14 = (i10 - dp) / 2;
        this.a.setBounds(i13, i14, i13 + dp, dp + i14);
    }
}
