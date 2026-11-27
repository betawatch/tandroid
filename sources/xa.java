// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class xa extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new xa());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ya yaVar = (ya) view;
        if (b8cVar.H == null) {
            yaVar.setAsShowMore((fb) b8cVar.I);
            return;
        }
        int i = b8cVar.A;
        String charSequence = b8cVar.m.toString();
        View.OnClickListener onClickListener = b8cVar.E;
        fb fbVar = (fb) b8cVar.I;
        ImageView imageView = yaVar.a;
        imageView.setVisibility(0);
        int i2 = fbVar.G;
        int i3 = fbVar.I;
        TextView textView = yaVar.b;
        textView.setTextColor(i3);
        int p1 = aob.p1(0.6f, i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(p1, mode));
        ImageView imageView2 = yaVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(aob.p1(0.6f, i3), mode));
        imageView2.setBackground(aob.Z(0, aob.p1(0.15f, i3), hl.L(4.0f), hl.L(4.0f)));
        imageView.setImageResource(i == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        yaVar.d.setColor(aob.p1(0.1f, fbVar.I));
        yaVar.e = z;
        yaVar.setWillNotDraw(!z);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ya(context);
    }
}
