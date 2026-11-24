// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class wa extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new wa());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        xa xaVar = (xa) view;
        if (c6cVar.H == null) {
            xaVar.setAsShowMore((eb) c6cVar.I);
            return;
        }
        int i = c6cVar.A;
        String charSequence = c6cVar.m.toString();
        View.OnClickListener onClickListener = c6cVar.E;
        eb ebVar = (eb) c6cVar.I;
        ImageView imageView = xaVar.a;
        imageView.setVisibility(0);
        int i2 = ebVar.G;
        int i3 = ebVar.I;
        TextView textView = xaVar.b;
        textView.setTextColor(i3);
        int p1 = cmb.p1(0.6f, i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(p1, mode));
        ImageView imageView2 = xaVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(cmb.p1(0.6f, i3), mode));
        imageView2.setBackground(cmb.Z(0, cmb.p1(0.15f, i3), gm.L(4.0f), gm.L(4.0f)));
        imageView.setImageResource(i == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        xaVar.d.setColor(cmb.p1(0.1f, ebVar.I));
        xaVar.e = z;
        xaVar.setWillNotDraw(!z);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new xa(context);
    }
}
