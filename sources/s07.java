// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s07 extends FrameLayout {
    public final rb0 a;
    public final de0 b;
    public final ema c;
    public final ema d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public s07(Context context, final r07 r07Var, boolean z) {
        super(context);
        int i;
        float f;
        this.a = new rb0((vnb) null);
        de0 de0Var = new de0(getContext());
        this.b = de0Var;
        ema emaVar = new ema(getContext());
        this.c = emaVar;
        ema emaVar2 = new ema(getContext());
        this.d = emaVar2;
        de0Var.setRoundRadius(hl.L(23.0f));
        addView(de0Var, tre.d(46, 46.0f, ob6.a0 ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        final byte b = 1;
        emaVar.setMaxLines(1);
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(17);
        emaVar.setTypeface(hl.o());
        boolean z2 = ob6.a0;
        addView(emaVar, tre.d(-1, -2.0f, 48, z2 ? 12.0f : 74.0f, 12.0f, z2 ? 74.0f : 12.0f, 0.0f));
        emaVar2.setGravity(ob6.a0 ? 5 : 3);
        emaVar2.setMaxLines(1);
        yob.W(emaVar2, aob.y6, null);
        emaVar2.setTextSize(14);
        boolean z3 = ob6.a0;
        addView(emaVar2, tre.d(-1, -2.0f, 48, z3 ? 12.0f : 74.0f, 36.0f, z3 ? 74.0f : 12.0f, 0.0f));
        int L = hl.L(17.0f);
        TextView textView = new TextView(getContext());
        Object[] objArr = 0;
        textView.setBackground(rnb.f(aob.Fi, 16.0f));
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(L, 0, L, 0);
        textView.setText(ob6.M0(z ? 2131754371 : 2131754366, null));
        yob.X(textView, aob.Ji, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(hl.o());
        final Object[] objArr2 = objArr == true ? 1 : 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: q07
            public final /* synthetic */ s07 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr2;
                r07 r07Var2 = r07Var;
                s07 s07Var = this.b;
                switch (b2) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = s07Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((e17) r07Var2).d(tL_chatInviteImporter, true);
                            break;
                        }
                        break;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = s07Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((e17) r07Var2).d(tL_chatInviteImporter2, false);
                            break;
                        }
                        break;
                }
            }
        });
        boolean z4 = ob6.a0;
        if (z4) {
            i = 5;
            f = 0.0f;
        } else {
            i = 3;
            f = 73.0f;
        }
        addView(textView, tre.d(-2, 32.0f, i, f, 62.0f, z4 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L << 1);
        TextView textView2 = new TextView(getContext());
        int L2 = hl.L(16.0f);
        textView2.setBackground(aob.i0(L2, L2, L2, L2, 0, aob.w0(null, aob.i6, false), -16777216));
        textView2.setGravity((ob6.a0 ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L, 0, L, 0);
        textView2.setText(ob6.M0(2131751334, null));
        yob.X(textView2, aob.n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(hl.o());
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: q07
            public final /* synthetic */ s07 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                r07 r07Var2 = r07Var;
                s07 s07Var = this.b;
                switch (b2) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = s07Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((e17) r07Var2).d(tL_chatInviteImporter, true);
                            break;
                        }
                        break;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = s07Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((e17) r07Var2).d(tL_chatInviteImporter2, false);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, hl.L(32.0f), ob6.a0 ? 5 : 3);
        layoutParams.topMargin = hl.L(62.0f);
        layoutParams.leftMargin = ob6.a0 ? 0 : (int) (hl.L(79.0f) + measureText);
        layoutParams.rightMargin = ob6.a0 ? (int) (measureText + hl.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public de0 getAvatarImageView() {
        return this.b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(72.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(107.0f), TLObject.FLAG_30));
    }
}
