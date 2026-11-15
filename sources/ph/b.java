package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.s;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements te.b, z5 {
    public ShapeDrawable a;
    public final e6 b;
    public final y7 c;
    public final TextView d;
    public final te.a e;

    public b(Context context, e6 e6Var) {
        super(context);
        this.e = new te.a(0, this, er.h, 380L, false);
        this.b = e6Var;
        y7 y7Var = new y7(context, e6Var, false);
        this.c = y7Var;
        addView(y7Var, ja.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, ja.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = j6.d0(g0.L(10.0f), i0.a.o(j6.w0(j6.Nl, this.b), 25));
        }
        te.a aVar = this.e;
        if (aVar.f != z10 || z11) {
            aVar.a(z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Nl));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            te.a aVar = this.e;
            if (aVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                s.b(canvas, this.a, g0.T1(0.9f, 1.0f, aVar.e));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.a;
        e6 e6Var = this.b;
        if (shapeDrawable != null) {
            j6.C1(i0.a.o(j6.w0(j6.Nl, e6Var), 25), shapeDrawable);
            this.a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(j6.w0(j6.Nl, e6Var), ns.F3));
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
