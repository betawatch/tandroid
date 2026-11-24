// default package

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x18 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final bf0 d;

    public x18(Context context) {
        super(context);
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.getImageReceiver().q0(gm.L(8.0f));
        addView(bf0Var, qoe.d(100, 100.0f, jb6.a0 ? 5 : 3, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        int i = cmb.F6;
        anb.X(textView, i, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(gm.o());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 10.0f : 123.0f, 9.0f, z ? 123.0f : 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, i, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z2 = jb6.a0;
        addView(textView2, qoe.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 10.0f : 123.0f, 33.0f, z2 ? 123.0f : 10.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        anb.X(textView3, cmb.y6, null);
        wi8.w(textView3, 1, 14.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z3 = jb6.a0;
        addView(textView3, qoe.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 10.0f : 123.0f, 90.0f, z3 ? 123.0f : 10.0f, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        TextView textView3 = this.c;
        textView3.setText(str3);
        if (gm.O1()) {
            min = gm.P0();
        } else {
            Point point = gm.q;
            min = Math.min(point.x, point.y);
        }
        float L = 640.0f / (((int) (min * 0.7f)) - gm.L(2.0f));
        int i = (int) (640.0f / L);
        int i2 = (int) (360.0f / L);
        bf0 bf0Var = this.d;
        if (webDocument == null || !webDocument.mime_type.startsWith("image/")) {
            textView.setLayoutParams(qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, 17.0f, 9.0f, 17.0f, 0.0f));
            textView2.setLayoutParams(qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, 17.0f, 33.0f, 17.0f, 0.0f));
            textView3.setLayoutParams(qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, 17.0f, 90.0f, 17.0f, 9.0f));
            bf0Var.setVisibility(8);
            return;
        }
        boolean z = jb6.a0;
        textView.setLayoutParams(qoe.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 10.0f : 123.0f, 9.0f, z ? 123.0f : 10.0f, 0.0f));
        boolean z2 = jb6.a0;
        textView2.setLayoutParams(qoe.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 10.0f : 123.0f, 33.0f, z2 ? 123.0f : 10.0f, 0.0f));
        boolean z3 = jb6.a0;
        textView3.setLayoutParams(qoe.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 10.0f : 123.0f, 90.0f, z3 ? 123.0f : 10.0f, 0.0f));
        bf0Var.setVisibility(0);
        Locale locale = Locale.US;
        bf0Var.getImageReceiver().Z(gn5.p(vuc.c(webDocument)), td4.n(i, i2, "_"), null, null, null, -1L, null, obj, 1);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        x18 x18Var;
        int i3;
        int i4;
        if (this.d.getVisibility() != 8) {
            i4 = View.MeasureSpec.makeMeasureSpec(gm.L(120.0f), TLObject.FLAG_30);
            x18Var = this;
            i3 = i;
        } else {
            TextView textView = this.b;
            x18Var = this;
            i3 = i;
            x18Var.measureChildWithMargins(textView, i3, 0, i2, 0);
            ((FrameLayout.LayoutParams) x18Var.c.getLayoutParams()).topMargin = gm.L(3.0f) + textView.getMeasuredHeight() + gm.L(33.0f);
            i4 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i4);
    }
}
