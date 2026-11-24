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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uz7 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final be0 d;

    public uz7(Context context) {
        super(context);
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.getImageReceiver().q0(gl.L(8.0f));
        addView(be0Var, nme.d(100, 100.0f, k96.a0 ? 5 : 3, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        int i = bkb.F6;
        zkb.X(textView, i, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(gl.o());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z = k96.a0;
        addView(textView, nme.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 10.0f : 123.0f, 9.0f, z ? 123.0f : 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.X(textView2, i, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z2 = k96.a0;
        addView(textView2, nme.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 10.0f : 123.0f, 33.0f, z2 ? 123.0f : 10.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        zkb.X(textView3, bkb.y6, null);
        ug8.w(textView3, 1, 14.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z3 = k96.a0;
        addView(textView3, nme.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 10.0f : 123.0f, 90.0f, z3 ? 123.0f : 10.0f, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        TextView textView3 = this.c;
        textView3.setText(str3);
        if (gl.O1()) {
            min = gl.P0();
        } else {
            Point point = gl.q;
            min = Math.min(point.x, point.y);
        }
        float L = 640.0f / (((int) (min * 0.7f)) - gl.L(2.0f));
        int i = (int) (640.0f / L);
        int i2 = (int) (360.0f / L);
        be0 be0Var = this.d;
        if (webDocument == null || !webDocument.mime_type.startsWith("image/")) {
            textView.setLayoutParams(nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, 17.0f, 9.0f, 17.0f, 0.0f));
            textView2.setLayoutParams(nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, 17.0f, 33.0f, 17.0f, 0.0f));
            textView3.setLayoutParams(nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, 17.0f, 90.0f, 17.0f, 9.0f));
            be0Var.setVisibility(8);
            return;
        }
        boolean z = k96.a0;
        textView.setLayoutParams(nme.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 10.0f : 123.0f, 9.0f, z ? 123.0f : 10.0f, 0.0f));
        boolean z2 = k96.a0;
        textView2.setLayoutParams(nme.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 10.0f : 123.0f, 33.0f, z2 ? 123.0f : 10.0f, 0.0f));
        boolean z3 = k96.a0;
        textView3.setLayoutParams(nme.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 10.0f : 123.0f, 90.0f, z3 ? 123.0f : 10.0f, 0.0f));
        be0Var.setVisibility(0);
        Locale locale = Locale.US;
        be0Var.getImageReceiver().Z(gl5.p(usc.c(webDocument)), tb4.m(i, i2, "_"), null, null, null, -1L, null, obj, 1);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        uz7 uz7Var;
        int i3;
        int i4;
        if (this.d.getVisibility() != 8) {
            i4 = View.MeasureSpec.makeMeasureSpec(gl.L(120.0f), TLObject.FLAG_30);
            uz7Var = this;
            i3 = i;
        } else {
            TextView textView = this.b;
            uz7Var = this;
            i3 = i;
            uz7Var.measureChildWithMargins(textView, i3, 0, i2, 0);
            ((FrameLayout.LayoutParams) uz7Var.c.getLayoutParams()).topMargin = gl.L(3.0f) + textView.getMeasuredHeight() + gl.L(33.0f);
            i4 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i4);
    }
}
