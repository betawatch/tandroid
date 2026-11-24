// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class wa extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new wa());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        xa xaVar = (xa) view;
        if (c4cVar.H == null) {
            xaVar.setAsShowMore((eb) c4cVar.I);
            return;
        }
        int i = c4cVar.A;
        String charSequence = c4cVar.m.toString();
        View.OnClickListener onClickListener = c4cVar.E;
        eb ebVar = (eb) c4cVar.I;
        ImageView imageView = xaVar.a;
        imageView.setVisibility(0);
        int i2 = ebVar.G;
        int i3 = ebVar.I;
        TextView textView = xaVar.b;
        textView.setTextColor(i3);
        int p1 = bkb.p1(0.6f, i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(p1, mode));
        ImageView imageView2 = xaVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(bkb.p1(0.6f, i3), mode));
        imageView2.setBackground(bkb.Z(0, bkb.p1(0.15f, i3), gl.L(4.0f), gl.L(4.0f)));
        imageView.setImageResource(i == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        xaVar.d.setColor(bkb.p1(0.1f, ebVar.I));
        xaVar.e = z;
        xaVar.setWillNotDraw(!z);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new xa(context);
    }
}
