package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class d extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new d());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        e eVar = (e) view;
        if (o41Var.H == null) {
            eVar.setAsShowMore((k) o41Var.I);
            return;
        }
        int i7 = o41Var.A;
        String charSequence = o41Var.m.toString();
        View.OnClickListener onClickListener = o41Var.E;
        k kVar = (k) o41Var.I;
        ImageView imageView = eVar.a;
        imageView.setVisibility(0);
        int i10 = kVar.G;
        int i11 = kVar.I;
        TextView textView = eVar.b;
        textView.setTextColor(i11);
        int r12 = m6.r1(0.6f, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = eVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(m6.r1(0.6f, i11), mode));
        imageView2.setBackground(m6.b0(0, m6.r1(0.15f, i11), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        imageView.setImageResource(i7 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(m6.r1(0.1f, kVar.I));
        eVar.e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new e(context);
    }
}
