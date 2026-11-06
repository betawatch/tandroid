package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class c extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new c());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        d dVar = (d) view;
        if (r31Var.G == null) {
            dVar.setAsShowMore((j) r31Var.H);
            return;
        }
        int i7 = r31Var.z;
        String charSequence = r31Var.l.toString();
        View.OnClickListener onClickListener = r31Var.D;
        j jVar = (j) r31Var.H;
        ImageView imageView = dVar.a;
        imageView.setVisibility(0);
        int i10 = jVar.F;
        int i11 = jVar.H;
        TextView textView = dVar.b;
        textView.setTextColor(i11);
        int r12 = k6.r1(0.6f, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.r1(0.6f, i11), mode));
        imageView2.setBackground(k6.b0(0, k6.r1(0.15f, i11), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        imageView.setImageResource(i7 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        dVar.d.setColor(k6.r1(0.1f, jVar.H));
        dVar.e = z9;
        dVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new d(context);
    }
}
