// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class po0 extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final vnb c;
    public final pkb d;
    public final pkb e;
    public final Drawable f;
    public final Drawable g;
    public int h;
    public int i;
    public final Paint j;
    public int k;

    public po0(int i, vnb vnbVar, Context context) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.b = i;
        this.c = vnbVar;
        pkb pkbVar = new pkb(ob6.M0(2131753061, null), 14.0f, hl.o());
        this.d = pkbVar;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pkbVar.a();
        pkb pkbVar2 = new pkb("", 13.0f, null);
        this.e = pkbVar2;
        pkbVar2.l(4);
        pkbVar2.a();
        this.f = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        Drawable e = c00.e(context, R.drawable.arrow_more);
        this.g = e;
        e.setAlpha(jn7.i2);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        vnb vnbVar = this.c;
        if (aob.g1(vnbVar)) {
            int v0 = aob.v0(aob.Fa, vnbVar);
            i = aob.v0(aob.Ga, vnbVar);
            i2 = v0;
        } else {
            i = -1;
            i2 = -1;
        }
        int i3 = this.k;
        Drawable drawable = this.g;
        Drawable drawable2 = this.f;
        if (i3 != i || drawable2.getColorFilter() == null) {
            this.k = i;
            int i4 = this.k;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable2.setColorFilter(new PorterDuffColorFilter(i4, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(this.k, mode));
        }
        Paint U0 = aob.U0("paintChatActionBackground", vnbVar);
        float L = hl.L(16.0f);
        float L2 = hl.L(16.0f);
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, L, L2, U0);
        if (vnbVar != null ? vnbVar.g() : aob.b1()) {
            canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), aob.U0("paintChatActionBackgroundDarken", vnbVar));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + hl.L(17.0f));
        canvas.drawCircle(rectF.centerX(), hl.L(35.0f), hl.L(35.0f), this.j);
        int centerX = (int) (rectF.centerX() - hl.L(20.0f));
        int L3 = hl.L(15.0f);
        drawable2.setBounds(centerX, L3, hl.L(40.0f) + centerX, hl.L(40.0f) + L3);
        drawable2.draw(canvas);
        canvas.translate(0.0f, hl.L(70.0f));
        canvas.translate(0.0f, hl.L(14.0f));
        float centerX2 = rectF.centerX();
        pkb pkbVar = this.d;
        this.d.c(centerX2 - (pkbVar.j() / 2.0f), pkbVar.h() / 2.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, pkbVar.h());
        canvas.translate(0.0f, hl.L(4.0f));
        float centerX3 = rectF.centerX();
        pkb pkbVar2 = this.e;
        this.e.c(centerX3 - (pkbVar2.j() / 2.0f), 0.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, pkbVar2.h());
        canvas.translate(0.0f, hl.L(2.0f));
        drawable.setBounds((int) (rectF.centerX() - hl.L(10.0f)), 0, (int) (rectF.centerX() + hl.L(10.0f)), hl.L(20.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
