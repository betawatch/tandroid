package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import ff.s;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d extends FrameLayout implements td.b, w5 {
    public ShapeDrawable a;
    public final b6 b;
    public final d8 c;
    public final TextView d;
    public final td.a e;

    public d(Context context, b6 b6Var) {
        super(context);
        this.e = new td.a(0, this, gr.h, 380L, false);
        this.b = b6Var;
        d8 d8Var = new d8(context, b6Var, false);
        this.c = d8Var;
        addView(d8Var, e6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, e6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        d();
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = f6.b0(AndroidUtilities.dp(10.0f), i0.a.k(f6.v0(f6.Wk, this.b), 25));
        }
        td.a aVar = this.e;
        if (aVar.f != z10 || z11) {
            aVar.a(z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        ShapeDrawable shapeDrawable = this.a;
        b6 b6Var = this.b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = f6.b0(AndroidUtilities.dp(10.0f), i0.a.k(f6.v0(f6.Wk, b6Var), 25));
            this.a = b02;
            b02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(f6.v0(f6.Wk, b6Var), TLRPC.LAYER));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            td.a aVar = this.e;
            if (aVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                s.b(canvas, this.a, AndroidUtilities.lerp(0.9f, 1.0f, aVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.e.f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d.setText(tL_messages_stickerSet.set.short_name);
        this.c.d(!tL_messages_stickerSet.documents.isEmpty() ? tL_messages_stickerSet.documents.get(0) : null, null, null, null, false, false);
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
