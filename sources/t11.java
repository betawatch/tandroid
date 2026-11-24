// default package

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class t11 extends h11 {
    public final ry8 a;
    public TextView b;
    public int c;

    public t11(Context context, wjb wjbVar) {
        super(context, wjbVar);
        ry8 ry8Var = new ry8(context);
        this.a = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ry8Var, nme.h(56.0f, 48.0f, 8388627));
        s11 s11Var = new s11(context, null, (byte) 0);
        s11Var.setDisablePaddingsOffset(true);
        this.b = s11Var;
        kk7.i(s11Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        addView(this.b, nme.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        zkb.G(this.b, bkb.wj, wjbVar);
        setTextColor(getThemedColor(bkb.xj));
        setBackground(getThemedColor(bkb.vj));
    }

    public final void c(int i, int i2, int i3, String... strArr) {
        ry8 ry8Var = this.a;
        ry8Var.f(i, i2, i3, null);
        for (String str : strArr) {
            ry8Var.h(this.c, str);
        }
    }

    public final void d(int i, String... strArr) {
        c(i, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ry8 ry8Var = this.a;
        ry8Var.setAutoRepeat(true);
        ry8Var.g(36, 36, document);
        for (String str : strArr) {
            ry8Var.h(this.c, str);
        }
    }

    @Override // q11
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // q11
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i) {
        this.a.setLayoutParams(nme.i(56.0f, 48 - i, 8388627, 0.0f, 0.0f, 0.0f, i));
    }

    public void setTextColor(int i) {
        this.c = i;
        this.b.setTextColor(i);
    }

    public t11(int i, int i2, wjb wjbVar, Context context) {
        this(context, wjbVar);
        setBackground(i);
        setTextColor(i2);
    }
}
