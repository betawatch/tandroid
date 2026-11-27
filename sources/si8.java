// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class si8 extends FrameLayout {
    public final gm a;
    public final TextView b;
    public final qg2 c;
    public final /* synthetic */ ui8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si8(ui8 ui8Var, Context context) {
        super(context);
        this.d = ui8Var;
        yob.h(aob.i5, null, this);
        gm gmVar = new gm(getContext());
        this.a = gmVar;
        gmVar.setTextSize(1, 14.0f);
        gmVar.setTypeface(hl.o());
        int i = aob.f7;
        yob.X(gmVar, i, null);
        gmVar.setSingleLine(true);
        gmVar.setEllipsize(TextUtils.TruncateAt.END);
        gmVar.setGravity((ob6.a0 ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        yob.X(textView, i, null);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        qg2 qg2Var = new qg2(this, getContext(), r7);
        this.c = qg2Var;
        qg2Var.setTextSize(hl.L(14.0f));
        yob.U(qg2Var, i, null);
        qg2Var.setGravity(ob6.a0 ? 3 : 5);
        qg2Var.setOnClickListener(new am7(this, (byte) 24));
        boolean z = ob6.a0;
        addView(gmVar, tre.d(-2, -1.0f, (z ? 5 : 3) | 48, z ? 0 : 16, 0.0f, z ? 16 : 0, 0.0f));
        addView(textView, tre.d(-2, -1.0f, (ob6.a0 ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(qg2Var, tre.d(-2, -1.0f, (ob6.a0 ? (byte) 3 : (byte) 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        gm gmVar = this.a;
        if (arrayList != null) {
            jn7.i(gmVar);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            ls6.h(arrayList, str, spannableStringBuilder, -1);
            CharSequence m = pv3.m(spannableStringBuilder, gmVar.getPaint().getFontMetricsInt(), false, null, 0);
            r47.A5(m, arrayList, gmVar.getPaint().getFontMetricsInt(), false);
            gmVar.setText(m);
        } else {
            gmVar.setText(pv3.m(str, gmVar.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i));
        SpannableStringBuilder spannableStringBuilder2 = ob6.a0 ? new SpannableStringBuilder(bp1.n(i, "% – ")) : new SpannableStringBuilder(qd4.n(i, " – ", "%"));
        spannableStringBuilder2.setSpan(new y7c(hl.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        qg2 qg2Var = this.c;
        if (i3 == 0) {
            if (this.d.s1.quiz) {
                qg2Var.c(ob6.G(i2, "Answer", new Object[0]), z, true);
                return;
            } else {
                qg2Var.c(ob6.G(i2, "Vote", new Object[0]), z, true);
                return;
            }
        }
        if (i3 == 1) {
            qg2Var.c(ob6.M0(2131746898, null), z, true);
        } else {
            qg2Var.c(ob6.M0(2131746902, null), z, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = ob6.a0;
        TextView textView = this.b;
        gm gmVar = this.a;
        if (z2) {
            int left = gmVar.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = gmVar.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i, 0, makeMeasureSpec, 0);
        qg2 qg2Var = this.c;
        measureChildWithMargins(qg2Var, i, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i, hl.L(32.0f) + qg2Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(32.0f));
    }
}
