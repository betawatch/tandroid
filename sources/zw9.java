// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zw9 extends FrameLayout {
    public final TextView a;
    public final ry8 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ tx9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw9(tx9 tx9Var, Context context, boolean z) {
        super(context);
        this.f = tx9Var;
        LinearLayout j = de9.j(context, 0);
        addView(j, nme.e(-2, -2, z ? 3 : 17));
        ry8 ry8Var = new ry8(context);
        this.b = ry8Var;
        ry8Var.f(R.raw.unlock_icon, 20, 20, null);
        int i = bkb.Kf;
        wjb wjbVar = tx9Var.a1;
        zkb.s(ry8Var, i, wjbVar, PorterDuff.Mode.SRC_ATOP);
        j.addView(ry8Var, nme.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, i, wjbVar);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        j.addView(textView, nme.r(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.Mf, wjbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.e(24, 24, 21));
    }

    public final void a(String str, boolean z) {
        this.a.setText(str);
        b(z);
    }

    public final void b(boolean z) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        this.d = z ? 1.0f : 0.0f;
        float L = (1.0f - this.d) * gl.L(-8.0f);
        ry8 ry8Var = this.b;
        ry8Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * gl.L(-8.0f));
        ry8Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), TLObject.FLAG_30));
    }
}
