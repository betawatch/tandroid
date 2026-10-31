package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b3 extends View {
    public final p3 a;
    public final ImageReceiver b;
    public final Drawable c;

    public b3(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        p3 p3Var = new p3(this, starGift, 60, 0.27f);
        this.a = p3Var;
        p3Var.K = 3;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(30.0f));
        imageReceiver.i0(tLObject, r8Var, null);
        Drawable mutate = context.getDrawable(R.drawable.chats_undo).mutate();
        this.c = mutate;
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.z6, null, PorterDuff.Mode.MULTIPLY);
        mutate.setBounds(org.telegram.messenger.i0.L(-12.0f), org.telegram.messenger.i0.L(-12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.i0.L(156.0f) / 2);
        int height = (getHeight() / 2) - org.telegram.messenger.i0.L(30.0f);
        int L = org.telegram.messenger.i0.L(60.0f) + width;
        int L2 = org.telegram.messenger.i0.L(60.0f) + height;
        p3 p3Var = this.a;
        p3Var.setBounds(width, height, L, L2);
        p3Var.draw(canvas);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        this.c.draw(canvas);
        canvas.restore();
        float L3 = org.telegram.messenger.i0.L(60.0f);
        float L4 = org.telegram.messenger.i0.L(60.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(org.telegram.messenger.i0.L(96.0f) + width, height, L3, L4);
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_30));
    }
}
