package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import gf.s;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements ud.b, x5 {
    public ShapeDrawable a;
    public final c6 b;
    public final a8 c;
    public final TextView d;
    public final ud.a e;

    public c(Context context, c6 c6Var) {
        super(context);
        this.e = new ud.a(0, this, er.h, 380L, false);
        this.b = c6Var;
        a8 a8Var = new a8(context, c6Var, false);
        this.c = a8Var;
        addView(a8Var, z5.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        d();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = g6.b0(AndroidUtilities.dp(10.0f), i0.b.k(g6.v0(g6.Wk, this.b), 25));
        }
        ud.a aVar = this.e;
        if (aVar.f != z10 || z11) {
            aVar.a(z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        ShapeDrawable shapeDrawable = this.a;
        c6 c6Var = this.b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = g6.b0(AndroidUtilities.dp(10.0f), i0.b.k(g6.v0(g6.Wk, c6Var), 25));
            this.a = b02;
            b02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.b.k(g6.v0(g6.Wk, c6Var), TLRPC.LAYER));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            ud.a aVar = this.e;
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

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d.setText(tL_messages_stickerSet.set.short_name);
        this.c.d(!tL_messages_stickerSet.documents.isEmpty() ? tL_messages_stickerSet.documents.get(0) : null, null, null, null, false, false);
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
