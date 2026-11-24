// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vpa extends View {
    public final jqa a;
    public final ImageReceiver b;
    public final Drawable c;

    public vpa(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        jqa jqaVar = new jqa(this, starGift, 60, 0.27f);
        this.a = jqaVar;
        jqaVar.L = (byte) 3;
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(gl.L(30.0f));
        imageReceiver.U(tLObject, pb0Var, null);
        Drawable mutate = context.getDrawable(R.drawable.chats_undo).mutate();
        this.c = mutate;
        zkb.x(this, mutate, bkb.y6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(gl.L(-12.0f), gl.L(-12.0f), gl.L(12.0f), gl.L(12.0f));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (gl.L(156.0f) / 2);
        int height = (getHeight() / 2) - gl.L(30.0f);
        int L = gl.L(60.0f) + width;
        int L2 = gl.L(60.0f) + height;
        jqa jqaVar = this.a;
        jqaVar.setBounds(width, height, L, L2);
        jqaVar.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.c.draw(canvas);
        canvas.restore();
        float L3 = gl.L(60.0f);
        float L4 = gl.L(60.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(gl.L(96.0f) + width, height, L3, L4);
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), TLObject.FLAG_30));
    }
}
