package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements vd.b, x5 {
    public ShapeDrawable a;
    public final c6 b;
    public final b8 c;
    public final TextView d;
    public final vd.a e;

    public c(Context context, c6 c6Var) {
        super(context);
        this.e = new vd.a(0, this, jr.h, 380L, false);
        this.b = c6Var;
        b8 b8Var = new b8(context, c6Var, false);
        this.c = b8Var;
        addView(b8Var, f6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, f6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f9 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = g6.b0(AndroidUtilities.dp(10.0f), i0.a.k(g6.v0(g6.Wk, this.b), 25));
        }
        vd.a aVar = this.e;
        if (aVar.f != z10 || z11) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            vd.a aVar = this.e;
            if (aVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                r.b(canvas, this.a, AndroidUtilities.lerp(0.9f, 1.0f, aVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        ShapeDrawable shapeDrawable = this.a;
        c6 c6Var = this.b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = g6.b0(AndroidUtilities.dp(10.0f), i0.a.k(g6.v0(g6.Wk, c6Var), 25));
            this.a = b02;
            b02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(g6.v0(g6.Wk, c6Var), TLRPC.LAYER));
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

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
