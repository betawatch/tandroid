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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wta extends View {
    public final kua a;
    public final ImageReceiver b;
    public final Drawable c;

    public wta(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        kua kuaVar = new kua(this, starGift, 60, 0.27f);
        this.a = kuaVar;
        kuaVar.L = (byte) 3;
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(hl.L(30.0f));
        imageReceiver.U(tLObject, rb0Var, null);
        Drawable mutate = context.getDrawable(R.drawable.chats_undo).mutate();
        this.c = mutate;
        yob.x(this, mutate, aob.z6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(hl.L(-12.0f), hl.L(-12.0f), hl.L(12.0f), hl.L(12.0f));
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
        int width = (getWidth() / 2) - (hl.L(156.0f) / 2);
        int height = (getHeight() / 2) - hl.L(30.0f);
        int L = hl.L(60.0f) + width;
        int L2 = hl.L(60.0f) + height;
        kua kuaVar = this.a;
        kuaVar.setBounds(width, height, L, L2);
        kuaVar.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.c.draw(canvas);
        canvas.restore();
        float L3 = hl.L(60.0f);
        float L4 = hl.L(60.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(hl.L(96.0f) + width, height, L3, L4);
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_30));
    }
}
