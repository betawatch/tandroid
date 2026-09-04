package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class d extends View {
    public final Drawable a;
    public final le.b b;
    public final int c;
    public e d;

    public d(Context context, int i10) {
        super(context);
        this.b = new le.b(this, pr.h, 380L);
        this.c = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.a = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.o7, false), PorterDuff.Mode.SRC_IN));
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
        float f7 = this.b.e;
        if (f7 < 1.0f) {
            canvas.save();
            float f10 = 1.0f - f7;
            canvas.scale(f10, f10, width, height);
            this.a.draw(canvas);
            canvas.restore();
        }
        if (f7 > 0.0f) {
            float f11 = this.c;
            int dp = AndroidUtilities.dp(f11);
            int width2 = (getWidth() - dp) / 2;
            int height2 = (getHeight() - dp) / 2;
            canvas.save();
            canvas.translate(width2, height2);
            canvas.scale(f7, f7, AndroidUtilities.dp(f11) / 2.0f, AndroidUtilities.dp(f11) / 2.0f);
            e eVar = this.d;
            if (eVar != null) {
                eVar.c(canvas, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(24.0f);
        int i14 = (i10 - dp) / 2;
        int i15 = (i11 - dp) / 2;
        this.a.setBounds(i14, i15, i14 + dp, dp + i15);
    }
}
