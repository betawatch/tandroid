// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vm4 extends FrameLayout implements x74, tjb {
    public ShapeDrawable a;
    public final wjb b;
    public final xya c;
    public final TextView d;
    public final fm0 e;

    public vm4(Context context, wjb wjbVar) {
        super(context);
        this.e = new fm0(0, this, s33.h, 380L, false);
        this.b = wjbVar;
        xya xyaVar = new xya(wjbVar, context, false);
        this.c = xyaVar;
        addView(xyaVar, nme.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, nme.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    public final void a(boolean z, boolean z2) {
        if (z && this.a == null) {
            this.a = bkb.b0(gl.L(10.0f), bm2.o(bkb.v0(bkb.Ml, this.b), 25));
        }
        fm0 fm0Var = this.e;
        if (fm0Var.f != z || z2) {
            fm0Var.a(z, z2);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ml));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            fm0 fm0Var = this.e;
            if (fm0Var.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                kq3.b(canvas, this.a, gl.R1(0.9f, 1.0f, fm0Var.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.e.f;
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f * 255.0f));
        }
        invalidate();
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d.setText(tL_messages_stickerSet.set.short_name);
        this.c.d(!tL_messages_stickerSet.documents.isEmpty() ? tL_messages_stickerSet.documents.get(0) : null, null, null, null, false, false);
    }

    @Override // tjb
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.a;
        wjb wjbVar = this.b;
        if (shapeDrawable != null) {
            bkb.A1(bm2.o(bkb.v0(bkb.Ml, wjbVar), 25), shapeDrawable);
            this.a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(bm2.o(bkb.v0(bkb.Ml, wjbVar), 229));
    }

    @Override // x74
    public final void D(float f, int i) {
    }
}
