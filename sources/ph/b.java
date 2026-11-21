package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.t;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements te.b, b6 {
    public ShapeDrawable a;
    public final h6 b;
    public final a8 c;
    public final TextView d;
    public final te.a e;

    public b(Context context, h6 h6Var) {
        super(context);
        this.e = new te.a(0, this, nr.h, 380L, false);
        this.b = h6Var;
        a8 a8Var = new a8(context, h6Var, false);
        this.c = a8Var;
        addView(a8Var, ma.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, ma.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = m6.d0(g0.L(10.0f), i0.a.o(m6.w0(m6.Nl, this.b), 25));
        }
        te.a aVar = this.e;
        if (aVar.f != z10 || z11) {
            aVar.a(z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Nl));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            te.a aVar = this.e;
            if (aVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                t.b(canvas, this.a, g0.T1(0.9f, 1.0f, aVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.e.f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d.setText(tL_messages_stickerSet.set.short_name);
        this.c.d(!tL_messages_stickerSet.documents.isEmpty() ? tL_messages_stickerSet.documents.get(0) : null, null, null, null, false, false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.a;
        h6 h6Var = this.b;
        if (shapeDrawable != null) {
            m6.C1(i0.a.o(m6.w0(m6.Nl, h6Var), 25), shapeDrawable);
            this.a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(m6.w0(m6.Nl, h6Var), 229));
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
