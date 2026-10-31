package rh;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n2 extends View {
    public final TextPaint a;
    public final k80 b;
    public final Paint c;
    public final Paint d;
    public StaticLayout e;
    public boolean f;
    public int h;
    public int n;
    public BitmapShader r;
    public Matrix s;
    public Matrix w;
    public CharSequence x;

    public n2(Context context) {
        super(context);
        this.h = org.telegram.messenger.i0.L(6.0f);
        this.n = org.telegram.messenger.i0.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(9.66f)));
        this.b = new k80(0);
    }

    public final void a(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            this.x = charSequence;
            return;
        }
        this.e = new StaticLayout(charSequence, this.a, i10 - org.telegram.messenger.i0.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        k80 k80Var = this.b;
        k80Var.rewind();
        int i11 = this.h;
        int i12 = this.n;
        k80Var.e = i11;
        k80Var.f = i12;
        if (this.f) {
            k80Var.e(null, 0, 0.0f, 0.0f);
            float f7 = Float.MAX_VALUE;
            float width = this.e.getWidth();
            float f10 = Float.MIN_VALUE;
            float f11 = 0.0f;
            for (int i13 = 0; i13 < this.e.getLineCount(); i13++) {
                width = Math.min(width, this.e.getLineLeft(i13));
                f10 = Math.min(f10, this.e.getLineTop(i13));
                f11 = Math.max(f11, this.e.getLineRight(i13));
                f7 = Math.max(f7, this.e.getLineBottom(i13));
            }
            this.b.addRect(width, f10, f11, this.e.getHeight(), Path.Direction.CW);
        } else {
            k80Var.e(this.e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), k80Var);
            k80Var.a();
        }
        invalidate();
    }

    public final void b(int i10, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null || savedStarGift.from_id == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        long e = d20.i(i10).e();
        long o10 = org.telegram.messenger.o5.o(savedStarGift.from_id);
        long o11 = org.telegram.messenger.o5.o(savedStarGift.gift.owner_id);
        if (e == o10) {
            set(org.telegram.messenger.i0.W2(cd.a0(null, null, savedStarGift.gift.crafted ? 2131749620 : 2131749621, cd.r(savedStarGift.date, false))));
        } else if (e == o11) {
            set(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749602, org.telegram.messenger.o5.s(i10, o10), cd.r(savedStarGift.date, false))));
        } else {
            set(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749601, org.telegram.messenger.o5.s(i10, o10), org.telegram.messenger.o5.s(i10, o11), cd.r(savedStarGift.date, false))));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.e.getWidth()) / 2.0f, org.telegram.messenger.i0.L(16.0f));
            Matrix matrix = this.s;
            if (matrix != null) {
                matrix.reset();
                this.w.reset();
                View view = this;
                while (view != null) {
                    this.w.postConcat(view.getMatrix());
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                }
                this.w.invert(this.s);
                this.s.preTranslate((-this.h) / 2, -org.telegram.messenger.i0.L(16.0f));
                this.s.preScale(12.0f, 12.0f);
                this.r.setLocalMatrix(this.s);
            }
            Paint paint = this.c;
            k80 k80Var = this.b;
            canvas.drawPath(k80Var, paint);
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(r12);
            canvas.drawPath(k80Var, paint2);
            this.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        CharSequence charSequence = this.x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        StaticLayout staticLayout = this.e;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(staticLayout == null ? 0 : staticLayout.getHeight() + org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(jj jjVar) {
        TLRPC.Message message;
        if (jjVar == null || (message = jjVar.k) == null || message.action == null) {
            setVisibility(8);
            return;
        }
        int i10 = jjVar.I1;
        long e = d20.i(i10).e();
        TLRPC.MessageAction messageAction = jjVar.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            setVisibility(8);
            return;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            setVisibility(8);
            return;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer == null) {
            setVisibility(8);
            return;
        }
        long o10 = org.telegram.messenger.o5.o(peer);
        long o11 = org.telegram.messenger.o5.o(tL_messageActionStarGiftUnique.peer);
        if (e == o10) {
            set(org.telegram.messenger.i0.W2(cd.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749620 : 2131749621, cd.r(jjVar.k.date, false))));
        } else if (e == o11) {
            set(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749602, org.telegram.messenger.o5.s(i10, o10), cd.r(jjVar.k.date, false))));
        } else {
            set(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749601, org.telegram.messenger.o5.s(i10, o10), org.telegram.messenger.o5.s(i10, o11), cd.r(jjVar.k.date, false))));
        }
        setVisibility(0);
    }

    public void setFullRect(boolean z10) {
        this.f = z10;
    }

    public void setRoundRadius(float f7) {
        this.c.setPathEffect(new CornerPathEffect(f7));
        this.d.setPathEffect(new CornerPathEffect(f7));
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}
