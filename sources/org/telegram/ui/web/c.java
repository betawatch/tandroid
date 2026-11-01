package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class c extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new c());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        d dVar = (d) view;
        if (b51Var.G == null) {
            dVar.setAsShowMore((j) b51Var.H);
            return;
        }
        int i10 = b51Var.z;
        String charSequence = b51Var.l.toString();
        View.OnClickListener onClickListener = b51Var.D;
        j jVar = (j) b51Var.H;
        ImageView imageView = dVar.a;
        imageView.setVisibility(0);
        int i11 = jVar.F;
        int i12 = jVar.H;
        TextView textView = dVar.b;
        textView.setTextColor(i12);
        int r12 = t6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(t6.r1(0.6f, i12), mode));
        imageView2.setBackground(t6.b0(0, t6.r1(0.15f, i12), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        dVar.d.setColor(t6.r1(0.1f, jVar.H));
        dVar.e = z10;
        dVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new d(context);
    }
}
